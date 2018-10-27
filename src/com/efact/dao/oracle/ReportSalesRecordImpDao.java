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
	public List<ReportSalesRecord> search(
		int sequence, 
		float from,    
		float to
	) throws Exception {
		
        List<ReportSalesRecord> list = new ArrayList<>();

        try{
        
        	
        	System.out.print("sequence ::: " + sequence);
        	System.out.print("from ::: " + from);
        	System.out.print("to ::: " + to);
        	
            String sql = "{ ? = call FIN_PKG_REPORTES.F_REPORTE_VENTAS(?, ?, ?, ?, ?, ?) }"; 
            
            /*
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);
            st.registerOutParameter(1, OracleTypes.CURSOR);
            st.setInt(2, 0);
            st.setInt(3, sequence);
            st.setFloat(4, from);
            st.setFloat(5, to);
            st.setString(5, "EFACT");
            st.execute();
            
            ResultSet rs = (ResultSet) st.getObject(1);
            
            while (rs.next()){
            	ReportSalesRecord object = new ReportSalesRecord();
            	object.setId(rs.getInt("GRU_ID"));
            	object.setName(rs.getString("NOM_GRUPO")); 

                list.add(object);
            }
            
            rs.close();
            st.close();
            */
            
        } catch (Exception e){
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
