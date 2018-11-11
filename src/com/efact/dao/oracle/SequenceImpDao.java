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

public class SequenceImpDao extends OracleDaoFactory implements SequenceDao  {

	@Override
	public List<Sequence> findAll() throws Exception {
		
        List<Sequence> list = new ArrayList<>();

        try{
        
            String sql = "{ ? = call fin_pkg_registroventaslote.F_LISTA_LOTES() }"; 
        	
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);
            st.registerOutParameter(1, OracleTypes.CURSOR);   
            st.execute();
            
            ResultSet rs = (ResultSet) st.getObject(1);
            
            while (rs.next()){
            	Sequence object = new Sequence();
            	object.setId(rs.getInt("LOTE"));
            	object.setName(rs.getString("NOM_LOTE")); 

                list.add(object);
            }
            
            rs.close();
            st.close();
            
        } catch (Exception e){
        	System.out.print("findAll -- Exception ::::: " + e.getMessage());
//            throw e;
        } finally {
            this.closeConnection();
        }
        
        return list;
	}

	@Override
	public Sequence findOneById(String id) throws Exception {
		return null;
	}

}
