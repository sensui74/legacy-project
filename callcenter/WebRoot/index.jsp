<%@ page 
language="java"
contentType="text/html; charset=gb2312"
pageEncoding="GBK"
%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/struts-nested.tld" prefix="nested" %>
<script>
function RandomPicture(){
	document.write("<img border='0' src='../RandomPicClient.jsp'/>");
}
</script>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html locale="true">
<head>
<meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">    
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
<title>�����й����־�����Ϣ��������</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
-->
</style>
<link href="images/css/styleA.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=gb2312"></head>

<body >
	<html:form action="/login.do?method=login" method="post" focus="username">
		<table width="1000" border="0" cellspacing="0" cellpadding="0">
		  <tr>
		    <td colspan="3"><img src="images/index/logo2_01.jpg" width="1000" height="167" /></td>
		  </tr>
		  <tr>
		    <td><img src="images/index/logo2_02.jpg" width="199" height="91" /></td>
		    <td><img src="images/index/logo2_03.jpg" width="371" height="91" /></td>
		    <td><img src="images/index/logo2_04.jpg" width="430" height="91" /></td>
		  </tr>
		  <tr>
		    <td><img src="images/index/logo2_05.jpg" width="199" height="232" /></td>
		    <td valign="middle" background="images/index/logo2_06.jpg"><table width="90%" border="0" align="right" cellpadding="0" cellspacing="0">
		      <tr>
		        <td>
		        <a href="/callcenter/pcc/policeValid/post.do?method=toValid" target="_blank">
		        <img src="images/newpass.gif" width="100" height="25" align="right" border="0"/>
		        </a>
		        </td>
		      </tr>
		      <tr>
		        <td>
		        <a href="/callcenter/pcc/policeValid/valid.do?method=toValid" target="_blank">
		        <img src="images/modPass.gif" width="100" height="25" align="right" border="0"/>
		        </a>
		        </td>
		      </tr>
		    </table></td>
		    <td><img src="images/index/logo2_07.jpg" width="430" height="232" /></td>
		  </tr>
		</table>
		<table width="1000" border="0" cellspacing="0" cellpadding="0">
		  <tr>
		    <td><img src="images/index/logo2_08.jpg" width="199" height="100" /></td>
		    <td><img src="images/index/logo2_09.jpg" width="371" height="100" /></td>
		    <td><img src="images/index/logo2_10.jpg" width="430" height="100" /></td>
		  </tr>
		</table>
	</html:form>
</body>
</html:html>