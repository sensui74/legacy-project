<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles"%>
<%@ taglib uri="/WEB-INF/page.tld" prefix="page"%>
<%@ include file="../style.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html locale="true">
<head>
	<html:base />

	<title>����ũ���ƽ�</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link href="../style/<%=styleLocation%>/style.css" rel="stylesheet"
		type="text/css" />

	<SCRIPT language=javascript src="../js/form.js" type=text/javascript></SCRIPT>
	<SCRIPT language=javascript src="../js/calendar3.js"
		type=text/javascript>
</SCRIPT>
	<script language="javascript" src="../js/common.js"></script>

	<script type="text/javascript">

 	function add()
 	{
 		document.forms[0].action="../yznztj/yznztj.do?getMethod=toYznztjLoad";
 		document.forms[0].submit();
 	}
 	
 	function query()
 	{
 		document.forms[0].action="../yznztj/yznztj.do?getMethod=toYznztjList";
 		document.forms[0].target="bottomm";
 		document.forms[0].submit();
 	}

 </script>

</head>

<body class="conditionBody" onload="document.forms[0].btnSearch.click()">
	<html:form action="/yznztj/yznztj" method="post">

		<table width="100%" border="0" align="center" cellpadding="0"
			cellspacing="1" class="conditionTable">
			<tr>
				<td class="navigateStyle">
					��ǰλ��&ndash;&gt;����ũ���ƽ�
				</td>
			</tr>
		</table>

		<table width="100%" border="0" align="center" cellpadding="0"
			cellspacing="1" class="conditionTable">
			<tr>
				<td class="LabelStyle">
					��Ʒ���
				</td>
				<td class="valueStyle">
					<html:text property="sort" styleClass="writeTextStyle2"></html:text>
				</td>
				<td class="LabelStyle">
					��Ʒ����
				</td>
				<td class="valueStyle">
					<html:text property="productName" styleClass="writeTextStyle2"></html:text>
				</td>
				<td class="LabelStyle">
					��Ʒ����
				</td>
				<td class="valueStyle">
					<html:text property="trait" styleClass="writeTextStyle2"></html:text>
				</td>
				<td class="LabelStyle">
					ʹ�÷�Χ
				</td>
				<td class="valueStyle">
					<html:text property="scope" styleClass="writeTextStyle2"></html:text>
				</td>
				<td class="LabelStyle" align="center"  width="120">
					<input type="button" name="btnSearch" value="��ѯ"
						class="buttonStyle" onclick="query()" />
					
					<input type="reset" value="ˢ��" class="buttonStyle"
						onClick="parent.bottomm.document.location=parent.bottomm.document.location;" />
				</td>
			</tr>
			<tr height="1px">
				<td colspan="13" class="buttonAreaStyle">
				</td>
			</tr>
		</table>
	</html:form>
</body>
</html:html>