<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>eFACT | Dashboard</title>
  <link rel="shortcut icon" href="${pageContext.request.contextPath}/images/icono.png">
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <link rel="stylesheet" href="themes/adminLTE/bower_components/bootstrap/dist/css/bootstrap.min.css">
  <link rel="stylesheet" href="themes/adminLTE/bower_components/font-awesome/css/font-awesome.min.css">
  <link rel="stylesheet" href="themes/adminLTE/bower_components/Ionicons/css/ionicons.min.css">
  <link rel="stylesheet" href="themes/adminLTE/dist/css/AdminLTE.min.css">
  <link rel="stylesheet" href="themes/adminLTE/dist/css/skins/_all-skins.min.css">
  <link rel="stylesheet" href="themes/adminLTE/bower_components/morris.js/morris.css">
  <link rel="stylesheet" href="themes/adminLTE/bower_components/jvectormap/jquery-jvectormap.css">
  <link rel="stylesheet" href="themes/adminLTE/bower_components/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css">
  <link rel="stylesheet" href="themes/adminLTE/bower_components/bootstrap-daterangepicker/daterangepicker.css">
  <link rel="stylesheet" href="themes/adminLTE/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
  <link rel="stylesheet" href="themes/adminLTE/plugins/pace/pace.min.css">


  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->

  <%-- Google Font --%>
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <header class="main-header">
    <a href="index2.html" class="logo">
      <span class="logo-mini"><b>e</b>Fact</span>
      <span class="logo-lg"><b>e</b>FACTURA</span>
    </a>
    
    <%@include file="navbar.jsp" %>
  </header>
  
	<%@include file="main-sidebar.jsp" %>

<%-- CONTENT DIV --%>
<div class="content-wrapper">
  