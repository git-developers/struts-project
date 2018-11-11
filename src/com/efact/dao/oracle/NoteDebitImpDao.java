package com.efact.dao.oracle;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import com.efact.bean.*;
import com.efact.dao.interfaces.*;
import com.efact.util.ExcelExport;
import com.efact.dao.factory.OracleDaoFactory;
import oracle.jdbc.OracleTypes;

public class NoteDebitImpDao extends OracleDaoFactory implements NoteDebitDao  {

	
    @Override
    public List<NoteDebitDropdown> listNoteDebitDropdown(int programId, int groupId) throws Exception {

    	List<NoteDebitDropdown> list = new ArrayList<>();

        try{
        	
            String sql = "{ call FIN_PKG_NOTADEBITO.USP_LISTA_FECHAS(?, ?, ?) }"; 
            
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);  
            st.setInt(1, programId);
            st.setInt(2, groupId);
            st.registerOutParameter(3, OracleTypes.CURSOR);
            st.execute();
            
            ResultSet rs = (ResultSet) st.getObject(3);
            
            while (rs.next()){
            	
            	NoteDebitDropdown obj = new NoteDebitDropdown();
                obj.setId(rs.getString("CIE_ID"));
                obj.setName(rs.getString("CIE_FCIERRE"));
            	
                list.add(obj);
            }
        
        } catch (Exception e){
            System.out.println(":::: listNoteDebitDropdown ::::Exception:: " + e.getMessage());
//            throw e;
        } finally {
            this.closeConnection();
        }
        
        return list;
    }

	@Override
	public List<NoteDebit> search(NoteDebit object) throws Exception {
		
        List<NoteDebit> list = new ArrayList<>();

        try{
    		
            String sql = "{ call FIN_PKG_NOTADEBITO.USP_LISTA_DETALLE(?, ?, ?) } "; 
            
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);
			st.setInt(1, object.getQueryGroup());
			st.setInt(2, object.getQueryCieId());
            st.registerOutParameter(3, OracleTypes.CURSOR);
            st.execute();
        	
            ResultSet rs = (ResultSet) st.getObject(3);
            
            while (rs.next()){
            	
            	NoteDebit obj = new NoteDebit();
            	
                obj.setContrato(rs.getString("CONTRATO"));
                obj.setGrupo(rs.getString("GRUPO"));
                obj.setCupo(rs.getString("CUPO"));
                obj.setNombreAsociado(rs.getString("NOMBRE_ASOCIADO"));
                obj.setCuota(rs.getString("CUOTA"));
                obj.setMesGrupo(rs.getString("CIE_NPOSICION"));
                obj.setDescripcion(rs.getString("DESCRIPCION"));
                obj.setNoAfecto(rs.getString("NOAFECTO"));
                obj.setAfecto(rs.getString("AFECTO"));
                obj.setIgv(rs.getString("IGV"));
                obj.setSubTotal(rs.getString("TOTAL"));
                obj.setPenalidad(rs.getString("PENALIDAD"));
                obj.setOrigen(rs.getString("ORIGEN"));
                
                list.add(obj);
            }
            
            rs.close();
            st.close();
            
            
        } catch (Exception e){
        	System.out.print("NoteDebit search -- Exception ::::: " + e.getMessage());
//            throw e;
        } finally {
            this.closeConnection();
        }
        
        return list;
	}

	@Override
	public NoteDebit process(NoteDebit object) throws Exception {
		
		NoteDebit objectOut = new NoteDebit();

        try{
    		
            String sql = "{ call FIN_PKG_NOTADEBITO.USP_PROCESO_MORA(?, ?, ?, ?, ?) } "; 
            
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);
			
			st.setInt(1, object.getQueryGroup());
            st.setInt(2, object.getQueryCieId());
            st.setString(3, "EFACT");
            st.setString(4, object.getOrigen());
            st.registerOutParameter(5, OracleTypes.VARCHAR);
            st.execute();
            
            System.out.print("PROCESS -- DEBIT ::::: " + st.getString(5));
            
            objectOut.setResultado(st.getString(5));

            st.close();

        } catch (Exception e){
        	System.out.print("process -- Exception ::::: " + e.getMessage());
//            throw e;
        } finally {
            this.closeConnection();
        }
        
        return objectOut;
	}
    
}
