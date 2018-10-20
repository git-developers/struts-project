<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<%@include file="themes/adminLTE/header.jsp" %>

    <section class="content-header">
      <h1>
        <i class="fa fa-exchange"></i> Transferencia
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
            <form role="form">
              <div class="box-body">
              
                <div class="row">
                
	        		
	        		<div class="col-md-2">
		                <div class="form-group">
		                  <label for="exampleInputEmail1">Fecha de emision</label>
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
		                  <label for="exampleInputEmail1">&nbsp;</label>
							<div class="input-group">
			                  <button type="submit" class="btn btn-primary ">Filtro</button>
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
    
    
    
      <div class="row">
        <div class="col-md-12">
		<div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Recaudados conciliados</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <table class="table table-bordered">
                <tbody><tr>
                  <th style="width: 10px">#</th>
                  <th>Task</th>
                  <th>Progress</th>
                  <th style="width: 40px">Label</th>
                </tr>
                <tr>
                  <td>1.</td>
                  <td>Update software</td>
                  <td>
                    <div class="progress progress-xs">
                      <div class="progress-bar progress-bar-danger" style="width: 55%"></div>
                    </div>
                  </td>
                  <td><span class="badge bg-red">55%</span></td>
                </tr>
                <tr>
                  <td>2.</td>
                  <td>Clean database</td>
                  <td>
                    <div class="progress progress-xs">
                      <div class="progress-bar progress-bar-yellow" style="width: 70%"></div>
                    </div>
                  </td>
                  <td><span class="badge bg-yellow">70%</span></td>
                </tr>
                <tr>
                  <td>3.</td>
                  <td>Cron job running</td>
                  <td>
                    <div class="progress progress-xs progress-striped active">
                      <div class="progress-bar progress-bar-primary" style="width: 30%"></div>
                    </div>
                  </td>
                  <td><span class="badge bg-light-blue">30%</span></td>
                </tr>
                <tr>
                  <td>4.</td>
                  <td>Fix and squish bugs</td>
                  <td>
                    <div class="progress progress-xs progress-striped active">
                      <div class="progress-bar progress-bar-success" style="width: 90%"></div>
                    </div>
                  </td>
                  <td><span class="badge bg-green">90%</span></td>
                </tr>
              </tbody></table>
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