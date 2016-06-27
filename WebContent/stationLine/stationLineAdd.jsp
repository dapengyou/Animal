<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="/struts-tags" prefix="s"%>
 
<s:form action="stationLine" namespace="/stationLine" method="post" >

 <s:textfield  name="sv.stationName" label="站名"></s:textfield>
 <s:textfield  name="sv.startStation" label="始发站"></s:textfield>
 <s:textfield  name="sv.endStation" label="终点站"></s:textfield>
 <s:textfield  name="sv.arriveTime" label="到站时间"></s:textfield>
 <s:textfield  name="sv.moveTime" label="驶离时间"></s:textfield>
 <s:submit value="提交"></s:submit>
 
 </s:form>