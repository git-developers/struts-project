<%@ taglib prefix="s" uri="/struts-tags" %>

<div class="info-box bg-green">
  <span class="info-box-icon"><i class="fa fa-thumbs-o-up"></i></span>

  <div class="info-box-content">
    <span class="info-box-text">Proceso terminado</span>
    <span class="info-box-number"></span>

    <div class="progress">
      <div class="progress-bar" style="width: 70%"></div>
    </div>
        <span class="progress-description"></span>
  </div>
</div>

<table class="table table-condensed">
     <thead>
		<tr>
		   <th><i class="fa fa-fw fa-align-justify"></i> Resultado</th>
		 </tr>
    </thead>
    <tbody>
		<tr>
			<td>
				<s:property value = "#accruedIssue.resultado"/>
			</td>
		</tr>
   </tbody>
</table>