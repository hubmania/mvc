<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border ="">
		<tr>
			<td colspan="3"><jsp:include page ="inc/top.jsp" /></td>
		</tr>
		<tr>
			<td colspan="2"><jsp:include page ="inc/menu.jsp" /></td>
			<td colspan="2"><jsp:include page ="bb/${main }" /></td>
		</tr>
		<tr>
			<td colspan="3"><jsp:include page ="inc/bottom.jsp" /></td>
		</tr>		
	</table>
</body>
</html>