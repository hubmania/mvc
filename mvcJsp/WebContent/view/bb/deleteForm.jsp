<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form action="DeleteReg" method="post">
<input type ="hidden" name="id" value="${param.id }"/>
<input type ="hidden" name="page" value="${param.page }"/>
	<table border="">
		<tr>
			<td>암호</td>
			<td><input type="text" name="pw"/></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="삭제"/>
				<a href="Detail?page=${param.page }&id=${param.id }">뒤로가기</a>
			</td>
		</tr>
	</table>
</form>