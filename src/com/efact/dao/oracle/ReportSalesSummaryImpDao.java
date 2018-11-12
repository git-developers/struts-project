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
	public List<ReportSalesSummary> salesSummarySearch(ReportSalesSummary object) throws Exception {
		
        List<ReportSalesSummary> list = new ArrayList<>();

        try{

            String sql = "{ ? = call FIN_PKG_REPORTES.F_REPORTE_VENTAS_RESUMEN(?, ?) }"; 
            
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);
            st.registerOutParameter(1, OracleTypes.CURSOR);
            st.setInt(2, object.getQueryYear());
            st.setString(3, "EFACT");
            st.execute();
            
            ResultSet rs = (ResultSet) st.getObject(1);
            
            while (rs.next()){
            	ReportSalesSummary obj = new ReportSalesSummary();
            	
            	obj.setYear(rs.getString("ANIO"));
            	obj.setTipo(rs.getString("TIPO"));
            	obj.setSerie(rs.getString("SERIE"));
            	obj.setPrograma(rs.getString("PROGRAMA"));
            	obj.setEne(rs.getDouble("ENE"));
            	obj.setFeb(rs.getDouble("FEB"));
            	obj.setMar(rs.getDouble("MAR"));
            	obj.setAbr(rs.getDouble("ABR"));
            	obj.setMay(rs.getDouble("MAY"));
            	obj.setJun(rs.getDouble("JUN"));
            	obj.setJul(rs.getDouble("JUL"));
            	obj.setAgo(rs.getDouble("AGO"));
            	obj.setSet(rs.getDouble("SET"));
            	obj.setOct(rs.getDouble("OCT"));
            	obj.setNov(rs.getDouble("NOV"));
            	obj.setDic(rs.getDouble("DIC"));

                list.add(obj);
            }
            
            rs.close();
            st.close();
            
        } catch (Exception e){
        	System.out.print("Exception ::: " + e.getMessage());
//            throw e;
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
