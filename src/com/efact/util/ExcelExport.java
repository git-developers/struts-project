package com.efact.util;

import java.util.List;

import com.efact.bean.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

// https://www.callicoder.com/java-write-excel-file-apache-poi/

public class ExcelExport {

	
	public static InputStream salesRecordExport(List<ReportSalesRecord> list) throws Exception {
		
		String[] columns = {
				"Emision", "Tipo moneda", "Fecha Emision", "Comprobante", "Serie", "Numero",
				"Documento", "Datos", "Valor facturado", "Base imponible", "impin afecta", "IGV %",
				"Importe total", "Venta", "Total afectas", "Total no afectas", "Total igv", "Total", "ID"
		};
		
        Workbook workbook = new XSSFWorkbook();
        CreationHelper createHelper = workbook.getCreationHelper();

        // Create a Sheet
        Sheet sheet = workbook.createSheet("Employee");

        // Create a Font for styling header cells
        Font headerFont = workbook.createFont();
        //headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.RED.getIndex());

        // Create a CellStyle with the font
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        // Create a Row
        Row headerRow = sheet.createRow(0);

        // Create cells
        for(int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
        }

        // Create Cell Style for formatting Date
        CellStyle dateCellStyle = workbook.createCellStyle();
        dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));
        
        // Create Other rows and cells with employees data
        int rowNum = 1;
        for(ReportSalesRecord object: list) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0).setCellValue(object.getTipoemision());
            row.createCell(1).setCellValue(object.getRvb_tmoneda());
            row.createCell(1).setCellValue(object.getRvb_femision());
            row.createCell(1).setCellValue(object.getComprobante());
            row.createCell(1).setCellValue(object.getRvb_serie());
            row.createCell(1).setCellValue(object.getRvb_numero());
            row.createCell(1).setCellValue(object.getRvb_documento());
            row.createCell(1).setCellValue(object.getRvb_datos());
            row.createCell(1).setCellValue(object.getRvb_valorfacturado());
            row.createCell(1).setCellValue(object.getRvb_baseimponible());
            row.createCell(1).setCellValue(object.getRvb_impinafecta());
            row.createCell(1).setCellValue(object.getRvb_igv());
            row.createCell(1).setCellValue(object.getRvb_imptotal());
            row.createCell(1).setCellValue(object.getTcd_venta());
            row.createCell(1).setCellValue(object.getTotalafectas_sol());
            row.createCell(1).setCellValue(object.getTotalnoafectas_sol());
            row.createCell(1).setCellValue(object.getTotaligv_sol());
            row.createCell(1).setCellValue(object.getTotaltotal_sol());
            row.createCell(1).setCellValue(object.getRvb_id());
        }

		// Resize all columns to fit the content size
        for(int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }
        
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		workbook.write(baos);
		
		return new ByteArrayInputStream(baos.toByteArray());
    }

}
