<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<%@include file="themes/adminLTE/header.jsp" %>

    <section class="content-header">
      <h1>
        <i class="fa fa-hand-peace-o"></i> Conciliaciones
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
            <form role="form" name="form-reconciliations">
              <div class="box-body">
              
                <div class="row">
                
	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="exampleInputEmail1">Programa</label>
		                  <select class="form-control" name="product" required="required">
		                  	<option value="">[seleccione]</option>
		                  	<option value="1">111</option>
		                  	<option value="2">222</option>
		                  </select>
		                </div>
	        		</div>

	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="exampleInputEmail1">Grupos</label>
		                  <select class="form-control" name="group">
		                  	<option value="">[seleccione]</option>
		                  	<option value="3">333</option>
		                  	<option value="4">444</option>
		                  </select>
		                </div>
	        		</div>
	        		
	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="exampleInputEmail1">Fecha de deposito</label>
							<div class="input-group">
			                  <div class="input-group-addon">
			                    <i class="fa fa-calendar"></i>
			                  </div>
			                  <input type="date" class="form-control">
			                </div>
		                </div>
	        		</div>
	        		
	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="exampleInputEmail1">Hasta</label>
							<div class="input-group">
			                  <div class="input-group-addon">
			                    <i class="fa fa-calendar"></i>
			                  </div>
			                  <input type="date" class="form-control">
			                </div>
		                </div>
	        		</div>

	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="exampleInputEmail1">Revisado</label>
		                  <select class="form-control">
		                  	<option>Si</option>
		                  	<option>No</option>
		                  </select>
		                </div>
	        		</div>
	        		
	        		
	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="exampleInputEmail1">Tipo de comprobante</label>
		                  <select class="form-control">
		                  	<option>[seleccione]</option>
		                  	<option>Si</option>
		                  	<option>No</option>
		                  </select>
		                </div>
	        		</div>
	        		
        		</div>

              </div>

              <div class="box-footer text-right">
                <button type="submit" class="btn btn-sm btn-primary ">Filtro</button>
                <button type="button" class="btn btn-sm btn-success ">Por defecto</button>
              </div>
            </form>
          </div>
          </div>
          </div>
    
    
    
      <div class="row">
        <div class="col-md-12">
		<div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Recaudados conciliados</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <table class="table table-bordered">
	              <thead>
					<tr>
					   <th style="width: 10px">#</th>
					   <th>Task</th>
					   <th>Progress</th>
					   <th style="width: 40px">Label</th>
					 </tr>
	              </thead>
		            <tbody>
			            <tr>
						   	<td colspan="5">
				   				No hay datos que mostrar.
				   			</td>
						 </tr>
		          	</tbody>
              </table>
            </div>
            <!-- /.box-body -->
            <div class="box-footer clearfix">
              <ul class="pagination pagination-sm no-margin pull-right">
                <li><a href="#">«</a></li>
                <li><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">»</a></li>
              </ul>
            </div>
          </div>
       	</div>
     </div>
     </section>
     
<%@include file="themes/adminLTE/footer.jsp" %>

<script src="js/reconciliations.js"></script>
