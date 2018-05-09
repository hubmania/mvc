<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ct" tagdir="/WEB-INF/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>

	<table border = "">
		<tr>
			<td>아이디</td>
			<td>${data.id }</td>
		</tr>
		<tr>
			<td>제목</td>
			<td>${data.title }</td>
		</tr>
		<tr>
			<td>조회수</td>
			<td>${data.cnt }</td>
		</tr>		
		<tr>
			<td>작성자</td>
			<td>${data.pname }</td>
		</tr>
		<tr>
			<td>작성일</td>
			<td><fmt:formatDate value="${data.reg_date }" pattern = "yyyy-MM-dd HH:mm:ss"/></td>
		</tr>
		
		<c:if test ="${data.upfile!=''}">
		<tr>
			<td>파일</td>
			<td>
			<c:choose>
				<c:when test="${data.img }">
					<img src="../up/${data.upfile }">
				</c:when>
				<c:otherwise>
					<a href="FileDown?file=${data.upfile }">${data.upfile }</a>
				</c:otherwise>
			</c:choose>
			</td>
		</tr>
		</c:if>
		<tr>
			<td>내용</td>
			<td><ct:conBr>${data.content }</ct:conBr></td>
		</tr>
		<tr>
			<td colspan="2" align="right">
			<a href ="List?page=${param.page }"> 목록으로</a>
			<a href="DeleteForm?page=${param.page }&id=${data.id }">삭제</a>
			<a href="ModifyForm?page=${param.page }&id=${data.id }">수정</a>
			<a href="ReplyForm?page=${param.page }&id=${data.id }">답변</a>
		</td>							
		</tr>										
	</table>
</body>
</html>