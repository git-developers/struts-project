package com.efact.dao.oracle;

import java.sql.CallableStatement;
import java.sql.ResultSet;
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
	public List<AccruedConciliation> conciliationSearch(
		    Date from,    
		    Date to
    ) throws Exception {
		
        List<AccruedConciliation> list = new ArrayList<>();

        try{
    		
            String sql = "{ call FIN_PKG_REGISTRODEVENGADOS.PREVIEW_CONCILIA_CONSOLIDA(?, ?, ?, ?, ?) } "; 
            
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);       
            st.setDate(1, from);
            st.setDate(2, to);
            st.setString(3, "efact");
            st.registerOutParameter(4, OracleTypes.VARCHAR);
            st.registerOutParameter(5, OracleTypes.CURSOR);
            st.execute();
        	
            ResultSet rs = (ResultSet) st.getObject(5);
            
            while (rs.next()){
            	
            	AccruedConciliation obj = new AccruedConciliation();
                obj.setComprobante1(rs.getString("COMPROBANTE"));
                obj.setComprobante2(rs.getString("COMPROBANTE2"));
                obj.setRecaudo(rs.getString("rvs_recaudo"));
                obj.setDescripcion(rs.getString("rvb_descripcion"));
                obj.setAfecto(rs.getString("rvb_afecto"));
                obj.setNoafecto(rs.getString("rvb_noafecto"));
                obj.setIgv(rs.getFloat("rvb_igv"));
                obj.setTotal(rs.getFloat("rvb_total"));
                obj.setReaId(rs.getString("rea_id"));
                obj.setSistema(rs.getString("sistema"));
                
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
    public AccruedConciliation generateAccruedConciliation(String data) throws Exception {

    	AccruedConciliation obj = new AccruedConciliation();

//        try{
        	
            String sql = "{ call FIN_PKG_REGISTRODEVENGADOS.EJECUTA_CONCILIA_CONSOLIDA(?, ?, ?) }";
            
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);             
            st.setString(1, data);
            st.setString(2, "EFACT");
            st.registerOutParameter(3, OracleTypes.VARCHAR);
            st.execute();
            
            System.out.println(":::: generateAccrued MENSAJE OUT :::: " + st.getString(3));
            
            obj.setResultado(st.getString(3));

            st.close();
        
//        } catch (Exception e){
//            System.out.println(":::: generateAccrued :::: " + e.getMessage());
//            throw e;
//        } finally {
//            this.closeConnection();
//        }
        
        return obj;
    }
    
    @Override
    public List<AccruedIssueDropdown> listAccruedIssueDropdown(int programId, int groupId) throws Exception {

    	List<AccruedIssueDropdown> list = new ArrayList<>();

        try{
        	
            System.out.print("listAccruedIssueDropdown ::::: " + programId + " --- DEADLINE ::: " + groupId);
        	
            String sql = "{ ? = call FIN_PKG_REGISTRODEVENGADOS.F_LISTADO_FECHAS_CIE_DEVEN(?, ?) }"; 
            
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);  
            st.registerOutParameter(1, OracleTypes.CURSOR);
            st.setInt(2, programId);
            st.setInt(3, groupId);
            st.execute();
            
            ResultSet rs = (ResultSet) st.getObject(1);
            
            while (rs.next()){
            	
            	AccruedIssueDropdown obj = new AccruedIssueDropdown();
                obj.setDeadline(rs.getString("CIE_FCIERRE"));
                obj.setCieId(rs.getString("CIE_ID"));
            	
                list.add(obj);
            }
        
        } catch (Exception e){
            System.out.println(":::: listAccruedIssueDropdown :::: " + e.getMessage());
            throw e;
        } finally {
            this.closeConnection();
        }
        
        return list;
    }

	@Override
	public List<AccruedIssue> issueSearch(
			int programId, 
			int groupId, 
			int queryDateTo
	) throws Exception {

        List<AccruedIssue> list = new ArrayList<>();

        try{
        	
        	System.out.println("queryDateTo ::: " + queryDateTo);
	        	
	        String sql = "{ ? = call FIN_PKG_REGISTRODEVENGADOS.F_PREVIEW_EMITE_DEVENGADO(?, ?, ?) } "; 
	        
	        Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);       
	        st.registerOutParameter(1, OracleTypes.CURSOR);
	        st.setInt(2, programId);
	        st.setInt(3, groupId);
	        st.setInt(4, queryDateTo);

	        st.execute();
	    	
	        ResultSet rs = (ResultSet) st.getObject(1);
	        
	        while (rs.next()){
	        	
	        	AccruedIssue obj = new AccruedIssue();
	            obj.setRecaudoId(rs.getInt("REC_ID"));
	            obj.setDatosAsociados(rs.getString("DATOS"));
	            obj.setNumeroCuota(rs.getInt("REC_NCUOTA"));
	            obj.setPosicion(rs.getInt("CIE_NPOSICION"));
	            obj.setDescripcion(rs.getString("DESCRIPCION"));
	            obj.setAfecto(rs.getString("AFECTO"));
	            obj.setNoAfecto(rs.getString("NOAFECTO"));
	            obj.setIgv(rs.getFloat("IGV"));
	            obj.setTotal(rs.getFloat("TOTAL"));

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

}
