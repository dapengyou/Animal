<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="/struts-tags" prefix="s"%>

<s:form action="driver" namespace="/driver" method="post" >
<table width="70%" height="400" border="0" align="center" cellpadding="1" cellspacing="1">
 <s:textfield  name="dv.driverName" key="driver.driverName"></s:textfield>
 <s:textfield  name="dv.identity" key="driver.identity"></s:textfield>
 <s:textarea name="dv.introduce" key="driver.introduce" value="This is a good Driver"></s:textarea>
 <s:submit key="regsiter.submit" align="center"></s:submit>
 </table>
 </s:form>

