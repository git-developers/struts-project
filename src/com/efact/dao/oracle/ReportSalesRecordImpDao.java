package com.efact.dao.oracle;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.Date;

import com.efact.bean.*;
import com.efact.dao.interfaces.*;
import com.efact.dao.factory.OracleDaoFactory;
import oracle.jdbc.OracleTypes;

public class ReportSalesRecordImpDao extends OracleDaoFactory implements ReportSalesRecordDao  {

	@Override
	public List<ReportSalesRecord> salesRecordSearch(
		int sequence, 
		Date from,    
		Date to
	) throws Exception {
		
        List<ReportSalesRecord> list = new ArrayList<>();
        
    	System.out.print("sequence ::: " + sequence);
    	System.out.print("from ::: " + from.getYear());
    	System.out.print("to ::: " + to.getYear());

        try{

            String sql = "{ ? = call FIN_PKG_REPORTES.F_REPORTE_VENTAS(?, ?, ?, ?) }"; 
            
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);
            st.registerOutParameter(1, OracleTypes.CURSOR);
            st.setInt(2, sequence);
            st.setDate(3, from);
            st.setDate(4, to);
            st.setString(5, "EFACT");
            st.execute();
            
            ResultSet rs = (ResultSet) st.getObject(1);
            
            while (rs.next()){
            	ReportSalesRecord object = new ReportSalesRecord();
            	
            	object.setFuente(rs.getString("FUENTE"));
            	object.setTipoemision(rs.getString("TIPOEMISION")); 
            	object.setRvb_tmoneda(rs.getString("RVB_TMONEDA"));  
            	object.setRvb_femision(rs.getInt("RVB_FEMISION")); 
            	object.setRvb_fvencimiento(rs.getInt("RVB_FVENCIMIENTO")); 
            	object.setComprobante(rs.getString("COMPROBANTE")); 
            	object.setRvb_serie(rs.getString("RVB_SERIE")); 
            	object.setRvb_tipo(rs.getInt("RVB_TIPO")); 
            	object.setRvb_numero(rs.getInt("RVB_NUMERO")); 
            	object.setRvb_documento(rs.getString("RVB_DOCUMENTO")); 
            	object.setRvb_datos(rs.getString("RVB_DATOS")); 
            	object.setRvb_valorfacturado(rs.getInt("RVB_VALORFACTURADO")); 
            	object.setRvb_baseimponible(rs.getInt("RVB_BASEIMPONIBLE")); 
            	object.setExonerada(rs.getInt("EXONERADA")); 
            	object.setRvb_impinafecta(rs.getInt("RVB_IMPINAFECTA")); 
            	object.setIsc(rs.getInt("ISC")); 
            	object.setRvb_igv(rs.getInt("RVB_IGV")); 
            	object.setOtros(rs.getInt("OTROS")); 
            	object.setRvb_imptotal(rs.getInt("RVB_IMPTOTAL")); 
            	object.setTcd_venta(rs.getInt("TCD_VENTA")); 
            	object.setRvb_tipo(rs.getInt("RVB_TIPODEV")); 
            	object.setRvb_seriedev(rs.getInt("RVB_SERIEDEV")); 
            	object.setRvb_numerodev(rs.getInt("RVB_NUMERODEV")); 
            	object.setRvb_tipocambiodev(rs.getInt("RVB_TIPOCAMBIODEV")); 
            	object.setTotalafectas_sol(rs.getInt("TOTALAFECTAS_SOL")); 
            	object.setTotalnoafectas_sol(rs.getInt("TOTALNOAFECTAS_SOL")); 
            	object.setTotaligv_sol(rs.getInt("TOTALIGV_SOL")); 
            	object.setTotaltotal_sol(rs.getInt("TOTALTOTAL_SOL")); 
            	object.setRvb_documento(rs.getString("RVB_TDOCUMENTO")); 
            	object.setRvb_id(rs.getInt("RVB_ID")); 

                list.add(object);
            }
            
            rs.close();
            st.close();
            
        } catch (Exception e){
        	System.out.print("salesRecordSearch ::: Exception ::: " + e.getMessage());
            throw e;
        } finally {
            this.closeConnection();
        }
        
        return list;
	}

	@Override
	public ReportSalesRecord findOneById(String id) throws Exception {
		return null;
	}



}
