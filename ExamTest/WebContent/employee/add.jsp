<%@ page language="java" contentType="text/html; charset=GB18030" pageEncoding="GB18030" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ա���������˵�</title>
<link rel = "stylesheet" type = "text/css" href = "../css/site.css">
</head>
<body>
<jsp:include page="top.jsp"></jsp:include>
<table width = "100%" height = "448" border = "0">
  <tr>
    <td width = "19%" valign = "top" bgcolor = "#99FFFF">
      <jsp:include page="left.jsp"></jsp:include>
    </td>
  <td width = "81%" valign = "top"><table width ="100%" border = "0">
    <tr>
      <td><span class = "style4">��ҳ-&gt;Ա������-&gt;����Ա��</span></td>
      <td></td>
    </tr>
</table>
<div style="width:100%;text-align:center">
<form action = "add.do"method="get">
<br/><br/>
�˺�:<input type = "text" name = "userid"/><br/><br/>
����:<input type = "password" name = "password"/><br/><br/>
����:<input type = "text" name = "name"/><br/><br/>
����:<input type = "text" name = "age"/><br/><br/>
<input type = "submit" value = "�ύ"/>
</form>
</div>
</td>
</tr>
</table>
<jsp:include page="bottom.jsp"></jsp:include>
</body>
</html>