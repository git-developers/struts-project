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

public class ProgramImpDao extends OracleDaoFactory implements ProgramDao  {

	@Override
	public List<Program> findAll() throws Exception {
		
        List<Program> list = new ArrayList<>();
        
        try{
        	
            String sql = "{ ? = call fin_pkg_registroventaslote.F_LISTA_PROGRAMAS() }"; 
        	
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);
            st.registerOutParameter(1, OracleTypes.CURSOR);   
            st.execute();
            
            ResultSet rs = (ResultSet) st.getObject(1);
            
            while (rs.next()){
                Program object = new Program();
                object.setId(rs.getInt("PRO_ID"));
                object.setName(rs.getString("NOM_PROGRAMA")); 

                list.add(object);
            }
            
            rs.close();
            st.close();
			
        } catch (Exception e){
        	System.out.print("PROGRAMA findAll -- Exception ::::: " + e.getMessage());
//            throw e;
        } finally {
            this.closeConnection();
        }
        
        return list;
	}

	@Override
	public Program findOneById(String id) throws Exception {
		return null;
	}



}
