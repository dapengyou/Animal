<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="/struts-tags" prefix="s"%>

<s:form action="stationLine" namespace="/stationLine" method="post" >
<table width="70%" height="400" border="0" align="center" cellpadding="1" cellspacing="1">
 <s:select name="sv.stationName" key="stationLine.stationName"
 	list="#{'Dalian':'Dalian','JinShiTan':'JinShiTan',
 	'HeiShiJiao':'HeiShiJiao','KaiFaQu':'KaiFaQu',
 	'JinJiaJie':'JinJiaJie','QuanShui':'QuanShui'}">
 </s:select>
 <s:select name="sv.startStation" key="stationLine.startStation"
 	list="#{'Dalian':'Dalian','JinShiTan':'JinShiTan',
 	'HeiShiJiao':'HeiShiJiao','KaiFaQu':'KaiFaQu',
 	'JinJiaJie':'JinJiaJie','QuanShui':'QuanShui'}" value="'QuanShui'">
 </s:select>
 <s:select name="sv.endStation" key="stationLine.endStation"
 	list="#{'Dalian':'Dalian','JinShiTan':'JinShiTan',
 	'HeiShiJiao':'HeiShiJiao','KaiFaQu':'KaiFaQu',
 	'JinJiaJie':'JinJiaJie','QuanShui':'QuanShui'}" value="'JinShiTan'">
 </s:select>
 <s:textfield  name="sv.arriveTime" key="stationLine.arriveTime"></s:textfield>
 <s:textfield  name="sv.moveTime" key="stationLine.moveTime"></s:textfield>
 <s:submit key="regsiter.submit" align="center"></s:submit>
 </table>
 </s:form>