<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>

<s:form action="regsiter" namespace="/bus" method="post" enctype="multipart/form-data" >

<table width="319" height="204" border="0" align="center" cellpadding="1" cellspacing="1" bgcolor="#66CCFF">
  <tr>
    <s:textfield  name="uv.username" key="regsiter.username"></s:textfield>
  </tr>
  <tr>
    <s:password name="uv.password" key="regsiter.password"></s:password>
  </tr>
 <tr>
    <s:select name="uv.power" list="#{'user':'user','manage':'manage'}" key="regsiter.power"></s:select>
  </tr>
  <tr>
    <s:textfield name="uv.age" key="regsiter.age"></s:textfield>
  </tr>
  <tr>
    <s:radio name="uv.sex" list="#{'man':'man','woman':'woman'}" key="regsiter.sex" ></s:radio>
  </tr>
  <tr>
  <s:file name="photo" key="regsiter.photo"></s:file>
  </tr>
  <tr>
	<s:submit key="regsiter.submit"></s:submit>
   
    <s:reset key="regsiter.reset"></s:reset>
  </tr>
</table>
</s:form>
</body>
</html>