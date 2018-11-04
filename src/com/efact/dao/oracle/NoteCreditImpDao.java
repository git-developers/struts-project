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
    		
            String sql = "{ call FIN_PKG_NOTACREDITO.LISTAR_CABECERA(?, ?, ?, ?) } "; 
            
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);
			st.setInt(1, object.getQueryVoucher());
            st.setInt(2, object.getQuerySerie());
            st.setInt(3, object.getQueryNumber());
            st.registerOutParameter(4, OracleTypes.CURSOR);
            st.execute();
        	
            ResultSet rs = (ResultSet) st.getObject(4);
            
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
    		
            String sql = "{ call FIN_PKG_NOTACREDITO.LISTAR_DETALLE(?, ?, ?, ?) } "; 
            
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);
			st.setInt(1, object.getQueryVoucher());
            st.setInt(2, object.getQuerySerie());
            st.setInt(3, object.getQueryNumber());
            st.registerOutParameter(4, OracleTypes.CURSOR);
            st.execute();
        	
            ResultSet rs = (ResultSet) st.getObject(4);
            
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
            
        } catch (Exception e){
        	System.out.print("detail -- Exception ::::: " + e.getMessage());
            throw e;
        } finally {
            this.closeConnection();
        }
        
        return list;
	}

    @Override
    public List<NoteCreditType> listNoteCreditType() throws Exception {
       
        List<NoteCreditType> list = new ArrayList<>();

        try{

            String sql = "{ call FIN_PKG_NOTACREDITO.LISTAR_TIPO_NOTACREDITO(?) } ";
            
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);
            st.registerOutParameter(1, OracleTypes.CURSOR);
            st.execute();
            
            ResultSet rs = (ResultSet) st.getObject(1);

            while (rs.next()) {
            	NoteCreditType obj = new NoteCreditType();
            	obj.setId(rs.getString("TNC_COD"));
            	obj.setName(rs.getString("TNC_DESCRIPCION"));
            	
            	list.add(obj);
            }
            
            rs.close();
            st.close();
            
        } catch (Exception e){
            System.out.println("listNoteCreditType -- Exception  :::: " + e.getMessage());
            throw e;
        } finally {
            this.closeConnection();
        }
        
        return list;
    }

	@Override
	public NoteCredit process(NoteCredit object) throws Exception {
		
		NoteCredit objectOut = new NoteCredit();

        try{
    		
            String sql = "{ call FIN_PKG_NOTACREDITO.EMISION_NOTACREDITO("
            		+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
            		+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
            		+ "?, ?, ?, ?, ?, ?, ?, ? "
            		+ ") } "; 
            
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);
			
			st.setInt(1, object.getQueryVoucher());
            st.setInt(2, object.getId());
            st.setString(3, object.getBd());
            st.setInt(4, object.getFechaEmisionInt());
            st.setInt(5, object.getFechaVencimientoInt());
            st.setInt(6, object.getQueryTotal());
            st.setString(7, object.getQueryNoteCreditType());
            
            st.setInt(8, object.getAfecto_1());
            st.setInt(9, object.getNoAfecto_1());
            
            st.setInt(10, object.getAfecto_2());
            st.setInt(11, object.getNoAfecto_2());
            
            st.setInt(12, object.getAfecto_3());
            st.setInt(13, object.getNoAfecto_3());
            
            st.setInt(14, object.getAfecto_4());
            st.setInt(15, object.getNoAfecto_4());
            
            st.setInt(16, object.getAfecto_5());
            st.setInt(17, object.getNoAfecto_5());
            
            st.setInt(18, object.getAfecto_6());
            st.setInt(19, object.getNoAfecto_6());
            
            st.setInt(20, object.getAfecto_7());
            st.setInt(21, object.getNoAfecto_7());

            st.setInt(22, object.getAfecto_8());
            st.setInt(23, object.getNoAfecto_8());
            
            st.setInt(24, 0);
            st.setString(25, object.getQueryNoteCreditType());
            st.setString(26, "EFACT");
            
            st.execute();
            
            objectOut.setNumeroOut(st.getString(27));
            objectOut.setSerieOut(st.getString(28));
            
        	System.out.print("PROCESS OUT ::::: " + st.getString(27) + "" + st.getString(28));

            st.close();
            
            
        } catch (Exception e){
        	System.out.print("process -- Exception ::::: " + e.getMessage());
            throw e;
        } finally {
            this.closeConnection();
        }
        
        return objectOut;
	}

	@Override
	public List<VoucherDropdown> listVoucherDropdown() throws Exception {
		
		List<VoucherDropdown> list = new ArrayList<>();

        try{
        	
            String sql = "{ call FIN_PKG_NOTACREDITO.P_LISTAR_COMPOBANTES(?, ?) }"; 
            
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);  
            st.setInt(1, 4);
            st.registerOutParameter(2, OracleTypes.CURSOR);
            st.execute();
            
            ResultSet rs = (ResultSet) st.getObject(1);
            
            while (rs.next()){
            	
            	VoucherDropdown obj = new VoucherDropdown();
                obj.setId(rs.getInt("CSC_TIPO"));
                obj.setName(rs.getString("CSC_TIPO_NOMBRE"));
                obj.setShortName(rs.getString("CSC_TIPO_NOMBRE_CORTO"));
                
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
	public List<Series> listSeries() throws Exception {
		
		List<Series> list = new ArrayList<>();

        try{
        	
            String sql = "{ call FIN_PKG_NOTACREDITO.P_LISTAR_SERIE_COMPRO(?, ?) }"; 
            
            Connection connection = OracleDaoFactory.getMainConnection();
			CallableStatement st = connection.prepareCall(sql);  
            st.setInt(1, 4);
            st.registerOutParameter(2, OracleTypes.CURSOR);
            st.execute();
            
            
            ResultSet rs = (ResultSet) st.getObject(1);
            
            while (rs.next()){
            	
            	Series obj = new Series();
                obj.setId(rs.getInt("csc_serie"));
                obj.setName(rs.getString("SERIE"));
                obj.setVoucherId(rs.getInt("csc_tipo"));
                
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
    
}
