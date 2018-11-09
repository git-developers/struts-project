package com.efact.bean;

import java.io.Serializable;
import java.sql.Date;

import com.efact.util.Util;

public class Voucher implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private long   lcs_id;
    private String lcs_check;
    private String lcs_banco;
    private String lcs_ncuenta;
    private String lcs_fecha;
    private String lcs_operacion;
    private String lcs_descripcion;  
    private String lcs_subtipo;
    private String lcs_subtipo2;
    private String lcs_cod_id;
    private String lcs_lab_id;
    private String lcs_abo_id;
    private String lcs_importe;
    private String lcs_monto;
    private String lcs_saldo;
    private String lcs_documento;
    private int    lcs_rea_id;
    private String lcs_capital_r;
    private String lcs_aso_datos;
    private String lcs_con_cod;
    private String lcs_aso_cod;
    private String lcs_dev_id;
    private String lcs_rvs_id;
    private String lcs_rvs_extid;
    private String lcs_cie_id;
    private String lcs_devengado;
    private String lcs_link;    
    private String lcs_aso_docfacturacion;
    private long   lcs_aso_doctfacturacion;
    private String lcs_aso_direccion1;
    private long   lcs_con_id;
    private String lcs_pro_cod;
    private String lcs_pro_nombre;
    private long   lcs_aso_id;   
    private Date   lcs_fdeposito;
    private String lcs_moneda;
    private int    lcs_pro_tmoneda;
    private long   lcs_rec_id;
    private long   lcs_tipodoc;
    private long   lcs_seriedoc;
    private long   lcs_numerodoc;
    private String lcs_sistema;
    private long   lcs_nlote;
    private long   lcs_aso_tasociado;
    private String isselecitem;
    private String isvisiblecheckbox;
    private String lote;
    private String tipo;
    private String total;
    
    private String resultado;
	private boolean status;
    
    private String queryProgram;
    private String queryGroup;
    private String queryBank;
    private String queryVoucher;
    private String queryStatus; 
    private String queryFrom;    
    private String queryTo;
    
	public long getLcs_id() {
		return lcs_id;
	}
	public void setLcs_id(long lcs_id) {
		this.lcs_id = lcs_id;
	}
	public String getLcs_check() {
		return lcs_check;
	}
	public void setLcs_check(String lcs_check) {
		this.lcs_check = lcs_check;
	}
	public String getLcs_banco() {
		return lcs_banco;
	}
	public void setLcs_banco(String lcs_banco) {
		this.lcs_banco = lcs_banco;
	}
	public String getLcs_ncuenta() {
		return lcs_ncuenta;
	}
	public void setLcs_ncuenta(String lcs_ncuenta) {
		this.lcs_ncuenta = lcs_ncuenta;
	}
	public String getLcs_fecha() {
		return lcs_fecha;
	}
	public int getLcs_fecha_int() {
		return Util.strToInt(lcs_fecha);
	}
	public void setLcs_fecha(String lcs_fecha) {
		this.lcs_fecha = lcs_fecha;
	}
	public String getLcs_operacion() {
		return lcs_operacion;
	}
	public void setLcs_operacion(String lcs_operacion) {
		this.lcs_operacion = lcs_operacion;
	}
	public String getLcs_descripcion() {
		return lcs_descripcion;
	}
	public void setLcs_descripcion(String lcs_descripcion) {
		this.lcs_descripcion = lcs_descripcion;
	}
	public String getLcs_subtipo() {
		return lcs_subtipo;
	}
	public void setLcs_subtipo(String lcs_subtipo) {
		this.lcs_subtipo = lcs_subtipo;
	}
	public String getLcs_subtipo2() {
		return lcs_subtipo2;
	}
	public void setLcs_subtipo2(String lcs_subtipo2) {
		this.lcs_subtipo2 = lcs_subtipo2;
	}
	public String getLcs_cod_id() {
		return lcs_cod_id;
	}
	public void setLcs_cod_id(String lcs_cod_id) {
		this.lcs_cod_id = lcs_cod_id;
	}
	public String getLcs_lab_id() {
		return lcs_lab_id;
	}
	public void setLcs_lab_id(String lcs_lab_id) {
		this.lcs_lab_id = lcs_lab_id;
	}
	public String getLcs_abo_id() {
		return lcs_abo_id;
	}
	public void setLcs_abo_id(String lcs_abo_id) {
		this.lcs_abo_id = lcs_abo_id;
	}
	public String getLcs_importe() {
		return lcs_importe;
	}
	public void setLcs_importe(String lcs_importe) {
		this.lcs_importe = lcs_importe;
	}
	public String getLcs_monto() {
		return lcs_monto;
	}
	public void setLcs_monto(String lcs_monto) {
		this.lcs_monto = lcs_monto;
	}
	public String getLcs_saldo() {
		return lcs_saldo;
	}
	public void setLcs_saldo(String lcs_saldo) {
		this.lcs_saldo = lcs_saldo;
	}
	public String getLcs_documento() {
		return lcs_documento;
	}
	public void setLcs_documento(String lcs_documento) {
		this.lcs_documento = lcs_documento;
	}
	public int getLcs_rea_id() {
		return lcs_rea_id;
	}
	public void setLcs_rea_id(int lcs_rea_id) {
		this.lcs_rea_id = lcs_rea_id;
	}
	public String getLcs_capital_r() {
		return lcs_capital_r;
	}
	public void setLcs_capital_r(String lcs_capital_r) {
		this.lcs_capital_r = lcs_capital_r;
	}
	public String getLcs_aso_datos() {
		return lcs_aso_datos;
	}
	public void setLcs_aso_datos(String lcs_aso_datos) {
		this.lcs_aso_datos = lcs_aso_datos;
	}
	public String getLcs_con_cod() {
		return lcs_con_cod;
	}
	public void setLcs_con_cod(String lcs_con_cod) {
		this.lcs_con_cod = lcs_con_cod;
	}
	public String getLcs_pro_nombre() {
		return lcs_pro_nombre;
	}
	public void setLcs_pro_nombre(String lcs_pro_nombre) {
		this.lcs_pro_nombre = lcs_pro_nombre;
	}
	public String getLcs_aso_cod() {
		return lcs_aso_cod;
	}
	public void setLcs_aso_cod(String lcs_aso_cod) {
		this.lcs_aso_cod = lcs_aso_cod;
	}
	public String getLcs_dev_id() {
		return lcs_dev_id;
	}
	public void setLcs_dev_id(String lcs_dev_id) {
		this.lcs_dev_id = lcs_dev_id;
	}
	public String getLcs_rvs_id() {
		return lcs_rvs_id;
	}
	public void setLcs_rvs_id(String lcs_rvs_id) {
		this.lcs_rvs_id = lcs_rvs_id;
	}
	public String getLcs_rvs_extid() {
		return lcs_rvs_extid;
	}
	public void setLcs_rvs_extid(String lcs_rvs_extid) {
		this.lcs_rvs_extid = lcs_rvs_extid;
	}
	public String getLcs_cie_id() {
		return lcs_cie_id;
	}
	public void setLcs_cie_id(String lcs_cie_id) {
		this.lcs_cie_id = lcs_cie_id;
	}
	public String getLcs_devengado() {
		return lcs_devengado;
	}
	public void setLcs_devengado(String lcs_devengado) {
		this.lcs_devengado = lcs_devengado;
	}
	public String getLcs_link() {
		return lcs_link;
	}
	public void setLcs_link(String lcs_link) {
		this.lcs_link = lcs_link;
	}
	public String getLcs_aso_docfacturacion() {
		return lcs_aso_docfacturacion;
	}
	public void setLcs_aso_docfacturacion(String lcs_aso_docfacturacion) {
		this.lcs_aso_docfacturacion = lcs_aso_docfacturacion;
	}
	public long getLcs_aso_doctfacturacion() {
		return lcs_aso_doctfacturacion;
	}
	public void setLcs_aso_doctfacturacion(long lcs_aso_doctfacturacion) {
		this.lcs_aso_doctfacturacion = lcs_aso_doctfacturacion;
	}
	public String getLcs_aso_direccion1() {
		return lcs_aso_direccion1;
	}
	public void setLcs_aso_direccion1(String lcs_aso_direccion1) {
		this.lcs_aso_direccion1 = lcs_aso_direccion1;
	}
	public long getLcs_con_id() {
		return lcs_con_id;
	}
	public void setLcs_con_id(long lcs_con_id) {
		this.lcs_con_id = lcs_con_id;
	}
	public String getLcs_pro_cod() {
		return lcs_pro_cod;
	}
	public void setLcs_pro_cod(String lcs_pro_cod) {
		this.lcs_pro_cod = lcs_pro_cod;
	}
	public long getLcs_aso_id() {
		return lcs_aso_id;
	}
	public void setLcs_aso_id(long lcs_aso_id) {
		this.lcs_aso_id = lcs_aso_id;
	}
	public Date getLcs_fdeposito() {
		return lcs_fdeposito;
	}
	public void setLcs_fdeposito(Date lcs_fdeposito) {
		this.lcs_fdeposito = lcs_fdeposito;
	}
	public String getLcs_moneda() {
		return lcs_moneda;
	}
	public void setLcs_moneda(String lcs_moneda) {
		this.lcs_moneda = lcs_moneda;
	}
	public int getLcs_pro_tmoneda() {
		return lcs_pro_tmoneda;
	}
	public void setLcs_pro_tmoneda(int lcs_pro_tmoneda) {
		this.lcs_pro_tmoneda = lcs_pro_tmoneda;
	}
	public long getLcs_rec_id() {
		return lcs_rec_id;
	}
	public void setLcs_rec_id(long lcs_rec_id) {
		this.lcs_rec_id = lcs_rec_id;
	}
	public long getLcs_tipodoc() {
		return lcs_tipodoc;
	}
	public void setLcs_tipodoc(long lcs_tipodoc) {
		this.lcs_tipodoc = lcs_tipodoc;
	}
	public long getLcs_seriedoc() {
		return lcs_seriedoc;
	}
	public void setLcs_seriedoc(long lcs_seriedoc) {
		this.lcs_seriedoc = lcs_seriedoc;
	}
	public long getLcs_numerodoc() {
		return lcs_numerodoc;
	}
	public void setLcs_numerodoc(long lcs_numerodoc) {
		this.lcs_numerodoc = lcs_numerodoc;
	}
	public String getLcs_sistema() {
		return lcs_sistema;
	}
	public void setLcs_sistema(String lcs_sistema) {
		this.lcs_sistema = lcs_sistema;
	}
	public long getLcs_nlote() {
		return lcs_nlote;
	}
	public void setLcs_nlote(long lcs_nlote) {
		this.lcs_nlote = lcs_nlote;
	}
	public long getLcs_aso_tasociado() {
		return lcs_aso_tasociado;
	}
	public void setLcs_aso_tasociado(long lcs_aso_tasociado) {
		this.lcs_aso_tasociado = lcs_aso_tasociado;
	}
	public String getIsselecitem() {
		return isselecitem;
	}
	public void setIsselecitem(String isselecitem) {
		this.isselecitem = isselecitem;
	}

	public String getIsvisiblecheckbox() {
		return isvisiblecheckbox;
	}
	public void setIsvisiblecheckbox(String isvisiblecheckbox) {
		this.isvisiblecheckbox = isvisiblecheckbox;
	}	
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public int getQueryProgram() {
		return Util.strToInt(queryProgram);
	}
	public void setProgram(String program) {
		this.queryProgram = program;
	}
	public int getQueryGroup() {
		return Util.strToInt(queryGroup);
	}
	
	public void setGroup(String group) {
		this.queryGroup = group;
	}
	
	public int getQueryBank() {
		return Util.strToInt(queryBank);
	}
	
	public void setBank(String bank) {
		this.queryBank = bank;
	}
	public String getVoucher() {
		return queryVoucher;
	}
	public void setVoucher(String voucher) {
		this.queryVoucher = voucher;
	}
	
	public int getQueryStatus() {
		return Util.strToInt(queryStatus);
	}
	
	public void setStatus(String status) {
		this.queryStatus = status;
	}
	
	public Date getQueryFrom() {
		return Util.strToDate(queryFrom);
	}
	public void setFrom(String from) {
		this.queryFrom = from;
	}
	public Date getQueryTo() {
		return Util.strToDate(queryTo);
	}
	
	public void setTo(String to) {
		this.queryTo = to;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
