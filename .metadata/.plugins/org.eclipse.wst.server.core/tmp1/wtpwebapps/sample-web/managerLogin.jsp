<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>管理者ログイン画面</title>
<%-- <script> --%>
<!-- // function goLoginAction(){ -->
<!-- // 	document.getElementById("form").action="LoginAction"; -->
<!-- // } -->
<%-- </script> --%>
</head>
<body>
<jsp:include page="header.jsp" />
<div id="contents">
<h1>管理者ログイン画面</h1>
<s:form id="form" action="ManagerLoginAction">+

<!--
	SAVED:<s:property value="%{#session.savedLoginId}"/>
	LOGINID:<s:property value="%{#session.loginId}"/>
-->
	<table class="vertical-list-table">
		<tr>
			<th scope="row"><s:label value="ログインID:"/></th>
			<td><s:textfield name="loginManagerId" class="txt" placeholder="ログインID" autocomplete="off"/></td>
		</tr>
		<tr>
			<th scope="row"><s:label value="パスワード:"/></th>
			<td><s:password name="loginPassword" class="txt" placeholder="パスワード" autocomplete="off"/></td>
		</tr>
	</table>

	<div class="submit_btn_box">
		<s:submit value="ログイン" class="submit_btn" onclick="ManagerLoginAction();"/>
	</div>
</s:form>
<br>

</div>


<s:include value="footer.jsp"/>

</body>
</html>