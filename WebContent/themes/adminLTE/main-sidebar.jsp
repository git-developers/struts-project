  <aside class="main-sidebar">
    <section class="sidebar">
      <div class="user-panel">
        <div class="pull-left image">
          <img src="themes/adminLTE/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>Alfredo Yupanqui</p>
          <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
        </div>
      </div>


      <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="Search...">
          <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
        </div>
      </form>


      <ul class="sidebar-menu" data-widget="tree">
        <li class="header">NAVEGACIÓN PRINCIPAL</li>
        <li class="<c:if test="${fn:contains(pageContext.request.requestURI, 'index')}">active</c:if>">
          <s:a href="index" theme="simple">
            <i class="fa fa-dashboard"></i> <span>Inicio</span>
          </s:a>
        </li>
        
        <li class="<c:if test="${fn:contains(pageContext.request.requestURI, 'voucher')}">active</c:if>" >	
          <s:a href="comprobante-por-lote" theme="simple">
            <i class="fa fa-hand-peace-o"></i> <span>Comprobante por Lote</span>
          </s:a>
        </li>
        
		<li class="treeview 
					<c:if test="${fn:contains(pageContext.request.requestURI, 'conciliation-accrued')}">active</c:if>
					<c:if test="${fn:contains(pageContext.request.requestURI, 'conciliation-issue')}">active</c:if>
		  ">
		  <a href="#">
		    <i class="fa fa-exchange"></i>
		    <span>Devengados</span>
		    <span class="pull-right-container">
		      <i class="fa fa-angle-left pull-right"></i>
		    </span>
		  </a>
		  <ul class="treeview-menu">
		    <li class="<c:if test="${fn:contains(pageContext.request.requestURI, 'conciliation-accrued')}">active</c:if>">
		    	<s:a href="devengados-conciliacion" theme="simple">
			    	<i class="fa fa-circle-o text-red"></i> Conciliaci&oacute;n
		    	</s:a>
	    	</li>
		    <li class="<c:if test="${fn:contains(pageContext.request.requestURI, 'conciliation-issue')}">active</c:if>">
		    	<s:a href="emision-conciliacion" theme="simple">
		    		<i class="fa fa-circle-o text-aqua"></i> Emisi&oacute;n
		    	</s:a>
	    	</li>
		  </ul>
		</li>
        
        <li class="<c:if test="${fn:contains(pageContext.request.requestURI, 'credit-note')}">active</c:if>" >	
          <s:a href="nota-de-credito" theme="simple">
            <i class="fa fa-cc-visa"></i> <span>Nota de cr&eacute;dito</span>
            <span class="pull-right-container">
            </span>
          </s:a>
        </li>
        
        <li class="<c:if test="${fn:contains(pageContext.request.requestURI, 'debit-note')}">active</c:if>" >	
          <s:a href="nota-de-debito" theme="simple">
            <i class="fa fa-money"></i> <span>Nota de d&eacute;bito</span>
            <span class="pull-right-container">
              <small class="label pull-right bg-green">new</small>
            </span>
          </s:a>
        </li>

    	<li class="treeview <c:if test="${fn:contains(pageContext.request.requestURI, 'report-sales-record')}">active</c:if>">
		  <a href="#">
		    <i class="fa fa-bar-chart"></i>
		    <span>Consultas y Reportes</span>
		    <span class="pull-right-container">
		      <i class="fa fa-angle-left pull-right"></i>
		    </span>
		  </a>
		  <ul class="treeview-menu">
		    <li class="<c:if test="${fn:contains(pageContext.request.requestURI, 'report-sales-record')}">active</c:if>">
		    	<s:a href="registro-de-ventas" theme="simple">
		    		<i class="fa fa-circle-o text-red"></i> Registro de ventas
		    	</s:a>
	    	</li>
		  </ul>
		</li>

        
      </ul>
    </section>
  </aside>
  
  