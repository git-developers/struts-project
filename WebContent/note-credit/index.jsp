<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@include file="../themes/adminLTE/header.jsp" %>

    <section class="content-header">
      <h1>
        <i class="fa fa-cc-visa"></i> Nota de cr&eacute;dito
        <small>grid</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active">Dashboard</li>
      </ol>
    </section>


    <section class="content">
    
        <div class="row">
        <div class="col-md-12">
		<div class="box box-solid">
			<%-- 
            <div class="box-header with-border">
              <h3 class="box-title">Quick Example</h3>
            </div>
            --%>
            <form role="form" name="form-note-credit">
              <div class="box-body">
              
                <div class="row">
                
	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="">Comprobante</label>
            		      <select class="form-control" id="select-voucher" name="queryVoucher" required="required">
		                  	<s:iterator value="listVoucherDropdown" var="voucher">
		                  		<option value="<s:property value = "#voucher.id"/>">
		                  			<s:property value = "#voucher.name"/>
	                 			</option>
	                 		</s:iterator>
		                  </select>
		                </div>
	        		</div>
	        		
    			    <div class="col-md-2">
		                <div class="form-group">
		                  <label for="">Serie</label>
				         <select class="form-control" id="select-series" name="querySerie" required="required">
				         	<option value="">[seleccione]</option>
		                  	<s:iterator value="listSeries" var="series">
		                  		<option 
		                  			value="<s:property value = "#series.id"/>"
		                  			class="select-series voucher-<s:property value = "#series.voucherId"/>">
		                  			<s:property value = "#series.name"/>
	                 			</option>
	                 		</s:iterator>
		                  </select>
		                </div>
	        		</div>
	        		
	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="">Numero</label>
		                  <input type="number" class="form-control" name="queryNumber" required="required">
		                </div>
	        		</div>
	        		
	        		<div class="col-md-2">
		                <div class="form-group pull-right">
		                  <label for="">&nbsp;</label>
							<div class="input-group">
			                  <button type="submit" class="btn btn-default note-credit-search">Buscar</button>
			                </div>
		                </div>
	        		</div>

	        		<div class="col-md-2">
		                <div class="form-group pull-right">
		                  <label for="">&nbsp;</label>
							<div class="input-group">
			                  <button type="button" class="btn btn-default note-credit-process" disabled="disabled">Procesar</button>
			                </div>
		                </div>
	        		</div>

        		</div>

              </div>

				<%--
              <div class="box-footer text-right">
              </div>
               --%>
            </form>
          </div>
          </div>
          </div>
    
		<!-- MAIN DIV -->
		 <div id="main-box-body" class="row">
		
		</div>
		<!-- MAIN DIV -->
     
     
     </section>
     
<%@include file="../modal/process.jsp" %>
     
<%@include file="../themes/adminLTE/footer.jsp" %>



        