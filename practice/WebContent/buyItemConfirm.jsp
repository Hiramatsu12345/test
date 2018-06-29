<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="no"/>
	<meta http-equiv="description" content=""/>
	<meta http-equiv="keywords" content=""/>
	<title>BuyItemConfirm画面</title>

<style type="text/css">
body{
	margin:0;
	padding:0;
	line-height:1.6;
	letter-spacing:1px;
	font-size:30px;
	background:lightblue;
}
table{
	text-align:center;
	margin:0 auto;
}
#top{
	width:100%;
	margin:30px auto;
	border:3px dashed white;
}
#header{
	width:100%;
	height:70px;
	background-color:skyblue;
}
#main{
	width:100%;
	height:500px;
	text-align:center;
}
#footer{
	width:100%;
	height:80px;
	background-color:skyblue;
	clear:both;
}

</style>

</head>

<body>

	<div id="header">
		<div id="pr">
		</div>
	</div>

	<div id="main">
		<div id="top">
			<p>BuyItem</p>
		</div>
		<div>
			<s:form>
				<tr>
					<td>商品名</td>
					<td><s:property value="session.buyItem_name"/></td>
				</tr>
				<tr>
					<td>値段</td>
					<td><s:property value="session.total_price"/></td>
				</tr>
				<tr>
					<td>購入個数</td>
					<td><s:property value="session.count"/></td>
				</tr>
				<tr>
					<td>支払い方法</td>
					<td><s:property value="session.pay"/></td>
				</tr>
				<tr>
					<td><br></td>
				</tr>
				<tr>
					<td><input type="button" value="戻る" onclick="submitAction('HomeAction')"/></td>
					<td><input type="button" value="完了" onclick="submitAction('BuyItemConfirmAction')"/></td>
				</tr>
			</s:form>
		</div>
	</div>

	<div id="footer">
		<div id="pr">
		</div>
	</div>

</body>
</html>