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
      <td><span class = "style4">��ҳ-&gt;Ա������</span></td>
      <td></td>
    </tr>
</table>
<table width = "100%" border = "0">
  <tr bgcolor = "#99FFFF">
    <td width = "25%"><div align = "center">�˺�</div></td>
    <td width = "25%"><div align = "center">����</div></td>
    <td width = "14%"><div align = "center">����</div></td>
    <td width = "14%"><div align = "center">����</div></td>
  </tr>
  <c:forEach var = "emp" items = "${empList}">
  <tr>
    <td><span class = "style2">${emp.id}</span></td>
    <td><span class = "style2">${emp.name}</span></td>
    <td><span class = "style2">${emp.age}</span></td>
    <td><span class = "style2"><a href = "modify.do?userid=${emp.id}">�޸�	/	</a><a href = "delete.do?userid=${emp.id}">ɾ��</a></span></td>
  </tr>
  </c:forEach>
</table>
<span class = "style2"><a href = "add.do">����Ա��</a></span>
</td>
</tr>
</table>
<jsp:include page="bottom.jsp"></jsp:include>
</body>
</html>