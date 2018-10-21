package com.efact.dao.oracle;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import java.sql.Connection;
import com.efact.bean.*;
import com.efact.dao.interfaces.*;
import com.efact.dao.factory.OracleDaoFactory;
import oracle.jdbc.OracleTypes;

public class ProgramImpDao extends OracleDaoFactory implements ProgramDao  {

	@Override
	public List<Program> listAll() throws Exception {
		
		List<Program> list = null;
        Program object = new Program();
        object.setId(11);
        object.setName("XXXXXXXX"); 
        list.add(object);
        Program object2 = new Program();
        object2.setId(22);
        object2.setName("AAAAAAA"); 
        list.add(object2);
		
		
		/*
        List<Program> list = null;
        CallableStatement st = null;
        //ResultSet rs = null;

        try{
            //this.conectar();
        	
            String sql = "{ ? = call fin_pkg_registroventaslote.F_LISTA_PROGRAMAS() }"; 
            
			Connection connection = OracleDaoFactory.getMainConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
            
            st = connection.prepareCall(sql);
            st.registerOutParameter(1, OracleTypes.CURSOR);   
            st.execute();
            
            rs = (ResultSet) st.getObject(1);
            
            list = new ArrayList();
            
            //<PRO_ID=1,PRO_EXTID=884,NOM_PROGRAMA=DERCOBIENES>,
            
            while (rs.next()){
                Program object = new Program();
                object.setId(rs.getInt("PRO_ID"));
                object.setName(rs.getString("NOM_PROGRAMA")); 

                list.add(object);
            }
            
            rs.close();
            st.close();
            
        } catch (Exception e){
            throw e;
        } finally {
            this.closeConnection();
        }
        */
        
        return list;
	}

	@Override
	public Vector<Program> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Program findOneById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProgramDao getProgramDao() {
		// TODO Auto-generated method stub
		return null;
	}


}
