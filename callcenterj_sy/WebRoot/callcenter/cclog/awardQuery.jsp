<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=GBK" pageEncoding="GBK"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles"%>
<%@ taglib uri="/WEB-INF/page.tld" prefix="page"%>
<%@ include file="../../style.jsp"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html locale="true">
<head>
	<html:base />

	<title>抽奖</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<%--    <link href="../../images/css/styleA.css" rel="stylesheet" type="text/css" />--%>
	<%--    <script language="JavaScript" src="../../js/calendar.js"></script>--%>
	<link href="../../style/<%=styleLocation%>/style.css" rel="stylesheet"
		type="text/css" />

	<SCRIPT language=javascript src="../../js/form.js" type=text/javascript></SCRIPT>
	<SCRIPT language=javascript src="../../js/calendar.js"
		type=text/javascript>
</SCRIPT>
	<script language="javascript" src="../../js/calendar3.js"></script>
	<script language="javascript" src="../../js/common.js"></script>

	<script language="javascript" src="../../js/clock.js"></script>
	<script language="javascript">
		function checkForm(addstaffer){
        	if (!checkNumber(addstaffer.beginNum,"开始顺序号")) return false;
        	
        	if (!checkNumber(addstaffer.endNum,"结束顺序号")) return false;
        	
			if (!checkNumber(addstaffer.spaceNum,"间隔数")) return false;
			if(addstaffer.spaceNum.value==0){
    	  		alert("间隔数必须大于零！")
    	  		return false;
    	  	}
           return true;
        }
    	function query(){  
        
    	 var f =document.forms[0];
    	  if(checkForm(f)){    	  	
    		document.forms[0].action = "../award.do?method=toAwardList";
    		document.forms[0].target = "bottomm";
    		document.forms[0].submit();
    		}
    	}
    	function onload()
		{
			document.getElementById('btnSearch').click();
		}
    </script>


</head>

<body class="conditionBody" onload="onload()">

	<html:form action="/callcenter/award" method="post">
		<table width="100%" border="0" align="center" cellpadding="0"
			cellspacing="0" class="nivagateTable">
			<tr>
				<td class="navigateStyle">
					当前位置&ndash;&gt;幸运用户
				</td>
			</tr>
		</table>
		<table width="100%" border="0" align="center" cellpadding="1"
			cellspacing="1" class="conditionTable">
			<tr>
				<td class="queryLabelStyle">
					开始顺序号
				</td>
				<td class=valueStyle colspan="5">
					<html:text property="beginNum" styleClass="writeTextStyle" />
				</td>
				<td class="queryLabelStyle">
					结束顺序号
				</td>
				<td class=valueStyle colspan="5">
					<html:text property="endNum" styleClass="writeTextStyle" />
				</td>
				<td class="queryLabelStyle">
					间隔数
				</td>
				<td class=valueStyle colspan="5">
					<html:text property="spaceNum" styleClass="writeTextStyle" value="1"/>
				</td>
				<td align="center" class="queryLabelStyle">
					<input id="btnSearch" name="btnSearch" type="button"   class="buttonStyle"
						value="查询" onclick="query()" />
					<input type="reset" value="刷新"   onClick="parent.bottomm.document.location=parent.bottomm.document.location;" class="buttonStyle"/>
				</td>
			</tr>					 
			<tr height="1px">
				<td colspan="20" class="buttonAreaStyle">
					<%--		    <input name="btnAdd" type="button" class="bottom" value="<bean:message bundle='pccye' key='sys.add'/>" onclick="popUp('windows','../pcc/callinFirewall.do?method=toCallinFireWallLoad&type=insert',680,400)"/>--%>
				</td>
			</tr>
		</table>
	</html:form>
</body>
</html:html>
 