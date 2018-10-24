package com.efact.dao.oracle;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import java.sql.Connection;
import com.efact.bean.*;
import com.efact.dao.interfaces.*;
import com.efact.dao.factory.OracleDaoFactory;
import oracle.jdbc.OracleTypes;

public class AccruedImpDao extends OracleDaoFactory implements AccruedDao  {

	@Override
	public List<Accrued> search(
		    Date from,    
		    Date to
    ) throws Exception {
		
        List<Accrued> list = new ArrayList<>();

        try{
    		
            String sql = "{ call FIN_PKG_REGISTRODEVENGADOS.PREVIEW_CONCILIA_CONSOLIDA(?, ?, ?, ?) } "; 
            
            System.out.print("SEARCH :: " + from.getYear() + "--" + to.getYear());
            
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);       
            st.setDate(1, from);
            st.setDate(2, to);
            st.setString(3, "EZANABRIA");
            st.registerOutParameter(4, OracleTypes.CURSOR);   
            st.execute();
        	
            ResultSet rs = (ResultSet) st.getObject(1);
            
            while (rs.next()){
            	
            	Accrued obj = new Accrued();
                obj.setComprobante1(rs.getString("COMPROBANTE"));
                obj.setComprobante1(rs.getString("COMPROBANTE2"));
                obj.setRecaudo(rs.getString("rvs_recaudo"));
                obj.setDescripcion(rs.getString("rvb_descripcion"));
                obj.setAfecto(rs.getString("rvb_afecto"));
                obj.setNoafecto(rs.getString("rvb_noafecto"));
                obj.setIgv(rs.getFloat("rvb_igv"));
                obj.setTotal(rs.getFloat("rvb_total"));

                list.add(obj);
            }
            
            rs.close();
            st.close();
            
            
        } catch (Exception e){
        	System.out.print("search -- Exception ::::: " + e.getMessage());
            throw e;
        } finally {
            this.closeConnection();
        }
        
        return list;
	}

    @Override
    public int generateVoucher(int nlote) throws Exception {

        int id = 0;

        try{
        	
            String sql = "{ call FIN_PKG_REGISTROVENTASLOTE.P_GENERACOMPROBANTES(?, 'efact') }"; 
            
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);             
            st.setInt(1, nlote);  
            st.execute();
        
        } catch (Exception e){
            System.out.println(":::: generateVoucher :::: " + e.getMessage());
            throw e;
        } finally {
            this.closeConnection();
        }
        
        return id;
    }


}
