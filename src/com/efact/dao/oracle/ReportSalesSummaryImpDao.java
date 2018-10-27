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
            	object.setEne(rs.getInt("ENE"));
            	object.setFeb(rs.getInt("FEB"));
            	object.setMar(rs.getInt("MAR"));
            	object.setAbr(rs.getInt("ABR"));
            	object.setMay(rs.getInt("MAY"));
            	object.setJun(rs.getInt("JUN"));
            	object.setJul(rs.getInt("JUL"));
            	object.setAgo(rs.getInt("AGO"));
            	object.setSet(rs.getInt("SET"));
            	object.setOct(rs.getInt("OCT"));
            	object.setNov(rs.getInt("NOV"));
            	object.setDic(rs.getInt("DIC"));

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
