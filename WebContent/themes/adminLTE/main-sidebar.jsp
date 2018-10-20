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
        
        <li class="<c:if test="${fn:contains(pageContext.request.requestURI, 'conciliaciones')}">active</c:if>" >	
          <s:a href="conciliaciones" theme="simple">
            <i class="fa fa-hand-peace-o"></i> <span>Conciliaciones</span>
            <span class="pull-right-container">
              <small class="label pull-right bg-green">new</small>
            </span>
          </s:a>
        </li>
        
        <li class="<c:if test="${fn:contains(pageContext.request.requestURI, 'transferencia')}">active</c:if>" >	
          <s:a href="transferencia" theme="simple">
            <i class="fa fa-exchange"></i> <span>Transferencia</span>
            <span class="pull-right-container">
            </span>
          </s:a>
        </li>
        
        <li class="<c:if test="${fn:contains(pageContext.request.requestURI, 'mantenimientos')}">active</c:if>" >	
          <s:a href="mantenimientos" theme="simple">
            <i class="fa fa-cube"></i> <span>Mantenimientos</span>
            <span class="pull-right-container">
            </span>
          </s:a>
        </li>
        
        <li class="<c:if test="${fn:contains(pageContext.request.requestURI, 'ventas')}">active</c:if>" >	
          <s:a href="ventas" theme="simple">
            <i class="fa fa-cc-visa"></i> <span>Ventas</span>
            <span class="pull-right-container">
            </span>
          </s:a>
        </li>
        
                
        <li class="<c:if test="${fn:contains(pageContext.request.requestURI, 'interface-contable')}">active</c:if>" >	
          <s:a href="interface-contable" theme="simple">
            <i class="fa fa-expeditedssl"></i> <span>Interface Contable</span>
            <span class="pull-right-container">
            </span>
          </s:a>
        </li>
        
                
        <li class="<c:if test="${fn:contains(pageContext.request.requestURI, 'reportes')}">active</c:if>" >	
          <s:a href="reportes" theme="simple">
            <i class="fa fa-bar-chart"></i> <span>Reportes</span>
            <span class="pull-right-container">
            </span>
          </s:a>
        </li>

        
      </ul>
    </section>
  </aside>
  
  