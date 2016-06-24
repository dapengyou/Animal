<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
<s:form action="login" namespace="/bus" method="post" enctype="multipart/form-data" >
<table width="319" height="204" border="0" align="center" cellpadding="1" cellspacing="1" bgcolor="#66FF99">
  <tr>
   <s:textfield name="uv.username" key="login.username"></s:textfield>
  </tr>
  <tr>
    
    <s:textfield key="login.password"></s:textfield>
  </tr>
  <tr>
  	<td align="right"><s:a href = "toregsiter" >注册</s:a></td>
    <s:submit key="login.ok" ></s:submit>
    <td align="right"><s:a href = "tologin" >取消</s:a></td>
  
  </tr>
</table>
</s:form>
</body>
</html>