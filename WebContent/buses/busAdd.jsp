<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="/struts-tags" prefix="s"%>

<s:form action="bus" namespace="/buses" method="post" >
<table width="70%" height="400" border="0" align="center" cellpadding="1" cellspacing="1">
 <s:textfield  name="bv.IdCar" key="buses.IdCar"></s:textfield>
 <s:select name="bv.type" key="buses.type"
 	list="#{'Small Car':'Small Car','Middle Car':'Middle Car','Big Car':'Big Car'}">
 </s:select>
 <s:textfield  name="bv.carNumber" key="buses.carNumber"></s:textfield>
 <s:select name="bv.number" key="buses.carNumber"
 	list="#{'11':'11人','20':'20人','36':'36人'}">
 </s:select>
 <s:radio name="bv.earlyBus" key="buses.earlyBus" 
 		list="#{'06:00':'06:00','06:30':'06:30','06:45':'06:45'}" value="'06:45'"></s:radio>
 <s:radio name="bv.lastBus" key="buses.lastBus"
 		list="#{'18:00':'18:00','20:30':'20:30','20:45':'20:45'}" value="'18:00'"></s:radio>
 <s:submit key="regsiter.submit" align="center"></s:submit>
 </table>
 </s:form>
