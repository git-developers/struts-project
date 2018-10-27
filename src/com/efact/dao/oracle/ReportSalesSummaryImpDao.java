package com.efact.dao.oracle;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;

import com.efact.bean.*;
import com.efact.dao.interfaces.*;
import com.efact.dao.factory.OracleDaoFactory;
import oracle.jdbc.OracleTypes;

public class ReportSalesSummaryImpDao extends OracleDaoFactory implements ReportSalesSummaryDao  {

	@Override
	public List<ReportSalesSummary> salesRecordSearch(int year) throws Exception {
		
        List<ReportSalesSummary> list = new ArrayList<>();
        
    	System.out.print("YEAR ::: " + year);

        try{

            String sql = "{ ? = call FIN_PKG_REPORTES.F_REPORTE_VENTAS_RESUMEN(?, ?) }"; 
            
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);
            st.registerOutParameter(1, OracleTypes.CURSOR);
            st.setInt(2, year);
            st.setString(3, "EFACT");
            st.execute();
            
            ResultSet rs = (ResultSet) st.getObject(1);
            
            while (rs.next()){
            	ReportSalesSummary object = new ReportSalesSummary();
            	
            	object.setYear(rs.getString("ANIO"));
            	object.setTipo(rs.getString("TIPO"));
            	object.setSerie(rs.getString("SERIE"));
            	object.setPrograma(rs.getString("PROGRAMA"));
            	object.setEne(rs.getString("ENE"));
            	object.setFeb(rs.getString("FEB"));
            	object.setMar(rs.getString("MAR"));
            	object.setAbr(rs.getString("ABR"));
            	object.setMay(rs.getString("MAY"));
            	object.setJun(rs.getString("JUN"));
            	object.setJul(rs.getString("JUL"));
            	object.setAgo(rs.getString("AGO"));
            	object.setSet(rs.getString("SET"));
            	object.setOct(rs.getString("OCT"));
            	object.setNov(rs.getString("NOV"));
            	object.setDic(rs.getString("DIC"));

                list.add(object);
            }
            
            rs.close();
            st.close();
            
        } catch (Exception e){
        	System.out.print("Exception ::: " + e.getMessage());
            throw e;
        } finally {
            this.closeConnection();
        }
        
        return list;
	}

	@Override
	public ReportSalesSummary findOneById(String id) throws Exception {
		return null;
	}



}
