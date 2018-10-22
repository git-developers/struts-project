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
			int programId,
			int groupId,
			int bankId,
			String voucher,
			int status, 
		    Date from,    
		    Date to
    ) throws Exception {
		
        List<Accrued> list = new ArrayList<>();

        try{
    		
            String sql = "{ ? = call FIN_PKG_REGISTROVENTASLOTE.F_LISTACONCILIACIONES(?, ?, ?, ?, ?, ?, ?) } "; 
            
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);
            st.registerOutParameter(1, OracleTypes.CURSOR);
            st.setInt(2, programId);
            st.setInt(3, groupId);
            st.setInt(4, bankId);            
            st.setString(5, voucher);
            st.setInt(6, status);
            st.setDate(7, from);
            st.setDate(8,to); 
            st.execute();
        	
            ResultSet rs = (ResultSet) st.getObject(1);
            
            while (rs.next()){
            	
            	Accrued obj = new Accrued();
                obj.setFrom(rs.getString("flag_html"));
                
                /*
                obj.setLcs_banco(rs.getString("banco"));    		    
                obj.setLcs_ncuenta(rs.getString("cue_ncuenta"));  		    
                obj.setLcs_fecha(rs.getString("abo_fecha"));    		    
                obj.setLcs_operacion(rs.getString("abo_operacion"));  		    
                obj.setLcs_descripcion(rs.getString("abo_descripcion")); 		    
                obj.setLcs_subtipo(rs.getString("subtipo"));   		    
                obj.setLcs_subtipo2(rs.getString("subtipo2"));  		    
                obj.setLcs_cod_id(rs.getString("cod_id"));    		    
                obj.setLcs_lab_id(rs.getString("lab_id"));   		    
                obj.setLcs_abo_id(rs.getString("abo_id"));   
                obj.setLcs_monto(rs.getString("monto_cuota"));
                obj.setLcs_importe(rs.getString("abono_cuota"));
                obj.setLcs_saldo(rs.getString("saldo_cuota"));
                obj.setLcs_documento(rs.getString("abo_documento"));  	
                obj.setLcs_rea_id(rs.getInt("rea_id")); 
                obj.setLcs_aso_datos(rs.getString("aso_datos"));
                obj.setLcs_con_cod(rs.getString("con_cod")); 
                obj.setLcs_pro_nombre(rs.getString("pro_nombre"));
                obj.setLcs_aso_cod(rs.getString("aso_cod"));               
                obj.setLcs_cie_id(rs.getString("cie_id")); 
                obj.setLcs_devengado(rs.getString("rec_devengado")); 
                obj.setLcs_aso_tasociado(rs.getLong("aso_tasociado")); 
                obj.setLcs_sistema(rs.getString("sistema")); 
                obj.setLcs_rec_id(rs.getInt("rec_id"));
                */

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
    public int getSequence() throws Exception {
       
        int sequence = 0; 

        try{

            String query = "SELECT SEQ_LOTECONCILIA_LCS_NLOTE.nextval FROM dual";
            
            Connection connection = OracleDaoFactory.getMainConnection();
            Statement stmt = connection.createStatement();
            ResultSet rs =  stmt.executeQuery(query);

            while (rs.next()) {
            	sequence = rs.getInt("NEXTVAL");
               System.out.println("SEQUENCIA NEXTVAL::: " + sequence);
            }
            
            rs.close();
            stmt.close();
            
        } catch (Exception e){
            System.out.println("getSecuencia -- Exception  :::: " + e.getMessage());
            throw e;
        } finally {
            this.closeConnection();
        }
        
        return sequence;
    }
    
    @Override
    public int insertVoucher(Accrued voucher, int nlote) throws Exception {

        int id = 0;

        try{
        	
            String sql = "{ call FIN_PKG_REGISTROVENTASLOTE.P_INSERTALOTESCONCILIACIONES(?, ?, 1, ?, ?) }"; 
            
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);
			
			/*
            st.setInt(1, voucher.getLcs_rea_id());  
            st.setLong(2, voucher.getLcs_rec_id());  
            st.setString(3, voucher.getLcs_sistema());              
            st.setInt(4, nlote);  
            */
            st.execute();
        
        } catch (Exception e){
            System.out.println(":::: insertVoucher :::: " + e.getMessage());
            throw e;
        } finally {
            this.closeConnection();
        }
        
        return id;
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
    
	@Override
	public Accrued findOneById(String id) throws Exception {
		return null;
	}



}