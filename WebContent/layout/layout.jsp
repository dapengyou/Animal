<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OA管理系统</title>
<link rel="stylesheet" type="text/css" href="../css/main.css">
</head>
<body>
<div id="top">
  <tiles:insertAttribute name="top"></tiles:insertAttribute>
</div>
<div id="footer"><tiles:insertAttribute name="footer"></tiles:insertAttribute></div>
<div id="middle">
	<div id="left"><tiles:insertAttribute name="left"></tiles:insertAttribute></div>
	<div id="body"><tiles:insertAttribute name="body"></tiles:insertAttribute></div>
	<div id="right"><tiles:insertAttribute name="right"></tiles:insertAttribute></div>

</div>


</body>
</html>