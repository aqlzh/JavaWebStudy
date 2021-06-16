<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主菜单</title>
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
      <td><span class = "style4">首页</span></td>
      <td></td>
  </tr>
</table>
</td>
</tr>
</table>
<jsp:include page="bottom.jsp"></jsp:include>
</body>
</html>