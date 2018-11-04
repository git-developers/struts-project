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

public class GroupImpDao extends OracleDaoFactory implements GroupDao  {

	@Override
	public List<Group> findAll() throws Exception {
		
        List<Group> list = new ArrayList<>();

        try{
        	
            String sql = "{ ? = call fin_pkg_registroventaslote.F_LISTA_GRUPOS() }"; 
        	
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);
            st.registerOutParameter(1, OracleTypes.CURSOR);   
            st.execute();
            
            ResultSet rs = (ResultSet) st.getObject(1);
            
            while (rs.next()){
            	Group object = new Group();
            	object.setId(rs.getInt("GRU_ID"));
            	object.setProdId(rs.getInt("PRO_ID"));
            	object.setName(rs.getString("NOM_GRUPO")); 

                list.add(object);
            }
            
            rs.close();
            st.close();
            
            
        } catch (Exception e){
        	System.out.print("GRUPO findAll -- Exception ::::: " + e.getMessage());
            //throw e;
        } finally {
            this.closeConnection();
        }
        
        return list;
	}

	@Override
	public Group findOneById(String id) throws Exception {
		return null;
	}



}
