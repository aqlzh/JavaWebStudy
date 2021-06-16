<%@ page language="java" contentType="text/html; charset=GB18030" pageEncoding="GB18030" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>ตวยผาณรๆ</title>
</head>
<body>
<h1 align="center">ตวยผ</h1>
<div style="width:100%;text-align:center">
<form action = "login.do" method="get">
ีหบล:<input type = "text" name = "uesrid"/><br/><br/>
รÜย๋:<input type = "password" name = "password"/><br/><br/>
<input type = "submit" value = "ฬแฝป"/>
</form>
</div>
<%
String loginMsg = (String)session.getAttribute("loginMsg");
if(loginMsg != null) {
%>
<script type="text/javascript" language="javascript">
alert("<%=loginMsg%>");
</script> 
<%
}
%>
</body>
</html>