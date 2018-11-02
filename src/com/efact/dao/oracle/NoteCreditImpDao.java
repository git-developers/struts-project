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

public class NoteCreditImpDao extends OracleDaoFactory implements NoteCreditDao  {

	@Override
	public NoteCredit search(NoteCredit object) throws Exception {
		
		NoteCredit objectOut = header(object);
		objectOut.setListNoteCreditDetail(detail(object));

        return objectOut;
	}

	private NoteCredit header(NoteCredit object) throws Exception {
		
		NoteCredit objectOut = new NoteCredit();

        try{
    		
            String sql = "{ call FIN_PKG_NOTACREDITO.LISTAR_CABECERA(?, ?, ?) } "; 
            /*
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);
            st.setInt(1, object.getQuerySerie());
            st.setInt(2, object.getQueryNumber());
            st.registerOutParameter(3, OracleTypes.CURSOR);
            st.execute();
        	
            ResultSet rs = (ResultSet) st.getObject(3);
            
            while (rs.next()){
            	objectOut.setId(rs.getInt("RVB_ID"));
            	objectOut.setNumero(rs.getInt("RVB_NUMERO"));
            	objectOut.setSerie(rs.getInt("RVB_SERIE"));//serie - numero
            	objectOut.setContrato(rs.getString("RVB_CONTRATO"));
            	objectOut.setDatos(rs.getString("RVB_DATOS"));//titular
            	objectOut.setFechaEmision(rs.getInt("RVB_FEMISION"));
            	objectOut.setFechaVencimiento(rs.getInt("RVB_FVENCIMIENTO"));
            	objectOut.setBd(rs.getString("BD"));
            	objectOut.setTipoDocDestino(rs.getInt("TIPO_DOC_DESTINO"));// aqui llega numero 4 - NOTA DE CREDITO
            	objectOut.setFechaEmisionDestino(rs.getDate("FEC_EMISION_DESTINO"));//mismo campo fecha emision - vencimineto - NOTA ORIGEN - Modificable
            }
            
            rs.close();
            st.close();
            */
            
        } catch (Exception e){
        	System.out.print("header -- Exception ::::: " + e.getMessage());
            throw e;
        } finally {
            this.closeConnection();
        }
        
        return objectOut;
	}

	private List<NoteCreditDetail> detail(NoteCredit object) throws Exception {
		
		float afectoSum = 0;
		float igvSum = 0;
		float noAfectoSum = 0;
		float totalSum = 0;
        List<NoteCreditDetail> list = new ArrayList<>();

        try{
    		
            String sql = "{ call FIN_PKG_NOTACREDITO.LISTAR_DETALLE(?, ?, ?) } "; 
            /*
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);
            st.setInt(1, object.getQuerySerie());
            st.setInt(2, object.getQueryNumber());
            st.registerOutParameter(3, OracleTypes.CURSOR);
            st.execute();
        	
            ResultSet rs = (ResultSet) st.getObject(3);
            
            while (rs.next()){
            	
            	NoteCreditDetail obj = new NoteCreditDetail();
            	obj.setDescripcion(rs.getString("RVB_DESCRIPCION"));
            	obj.setSimbolo(rs.getString("SIMBOLO"));// misma moneda
            	obj.setAfecto(rs.getFloat("RVB_AFECTO"));
            	obj.setIgv(rs.getFloat("RVB_IGV"));
            	obj.setNoAfecto(rs.getFloat("RVB_NOAFECTO"));
            	obj.setTotal(rs.getFloat("RVB_TOTAL"));
            	
            	afectoSum += rs.getFloat("RVB_AFECTO");
            	igvSum += rs.getFloat("RVB_IGV");
            	noAfectoSum += rs.getFloat("RVB_NOAFECTO");
            	totalSum += rs.getFloat("RVB_TOTAL");
            	
               	obj.setAfectoSum(afectoSum);
            	obj.setIgvSum(igvSum);
            	obj.setNoAfectoSum(noAfectoSum);
            	obj.setTotalSum(totalSum);
            	
            	list.add(obj);
            }
            
            rs.close();
            st.close();
            */
        } catch (Exception e){
        	System.out.print("detail -- Exception ::::: " + e.getMessage());
            throw e;
        } finally {
            this.closeConnection();
        }
        
        return list;
	}

}
