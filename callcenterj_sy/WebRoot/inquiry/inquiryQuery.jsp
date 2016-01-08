<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ include file="../style.jsp"%>
<html>
	<head>
		<html:base />
		<link href="../style/<%=styleLocation%>/style.css" rel="stylesheet"
			type="text/css" />
		<script language="javascript" src="../js/calendar3.js"></script>
<script>
	function doquery(){
		document.forms[0].action="../inquiry.do?method=toList";
		document.forms[0].target="bottomm";
		document.forms[0].submit();
	}

</script>
	</head>
	<body class="conditionBody" onload="document.forms[0].btnSearch.click()">
		<html:form action="/inquiry" method="post">

			<table width="100%" align="center"  cellpadding="0"
				cellspacing="1" class="conditionTable">
				<tr>
					<td class="navigateStyle">
						��ǰλ��&ndash;&gt;�����ʾ���ƿ�
					</td>
				</tr>
			</table>

			<table width="100%" border="0" align="center" cellpadding="0"
				cellspacing="1" class="conditionTable">
				
				<tr class="conditionoddstyle">
					<td class="queryLabelStyle">
						��ʼʱ�� 
					</td>
					<td class="valueStyle">
						<html:text property="beginTime" styleClass="writeTextStyle"/>
						<img alt="ѡ��ʱ��" src="../html/img/cal.gif"
						onclick="openCal('inquiryForm','beginTime',false);">
					</td>
					<td class="queryLabelStyle">
						�ʾ�����
					</td>
					<td class="valueStyle">
						<html:text property="topic" styleClass="writeTextStyle"/>
					</td>
					<td class="queryLabelStyle">
						�������
					</td>
					<td class="valueStyle">
						<html:select property="inquiryType" styleClass="selectStyle" style="width: 130px;">
							<html:option value="">ȫ��</html:option>
							<html:options collection="inquiryTypes" property="value"
								labelProperty="label" />
						</html:select>
					</td>
					<td class="queryLabelStyle">
						���״̬
					</td>
					<td class="valueStyle">
						<select name="state" id="state" class="selectStyle">
					<%
					String str_state = request.getParameter("state");
					if("wait".equals(str_state)){
					%>
					<option value="">ȫ��</option>
						<option>ԭʼ</option>
						<option selected="selected">����</option>
						<option>����</option>
						<option>����</option>
						<option>����</option>
					<%
					}else if("back".equals(str_state)){
					%>
					<option value="">ȫ��</option>
						<option>ԭʼ</option>
						<option>����</option>
						<option selected="selected">����</option>
						<option>����</option>
						<option>����</option>
					<%
					}else if("pass".equals(str_state)){
					%>
					<option value="">ȫ��</option>
						<option>ԭʼ</option>
						<option>����</option>
						<option>����</option>
						<option selected="selected">����</option>
						<option>����</option>
					<%
					}else if("issuance".equals(str_state)){
					%>
					<option value="">ȫ��</option>
						<option>ԭʼ</option>
						<option>����</option>
						<option>����</option>
						<option>����</option>
						<option selected="selected">����</option>
					<%
					}else{
					%>
					<option value="" selected="selected">ȫ��</option>
						<option>ԭʼ</option>
						<option>����</option>
						<option>����</option>
						<option>����</option>
						<option>����</option>
					<%
					}
					 %>

					</select>
					</td>
				</tr>
				<tr class="conditionoddstyle">
					
					<td class="queryLabelStyle">
						����ʱ��
					</td>
					<td class="valueStyle">
						<html:text property="endTime" styleClass="writeTextStyle"/>
						<img alt="ѡ��ʱ��" src="../html/img/cal.gif"
						onclick="openCal('inquiryForm','endTime',false);">
					</td>
					<td class="queryLabelStyle">
						�������
					</td>
					<td class="valueStyle">
						<html:text property="organiztion" styleClass="writeTextStyle"/>
					</td>
					<td class="queryLabelStyle">
						�� ֯ ��
					</td>
					<td class="valueStyle">
						<html:text property="organizers" styleClass="writeTextStyle"/>
					</td>
					<td class="queryLabelStyle" align="center" colspan="2">
						<input type="button" name="btnSearch" value="��ѯ" class="buttonStyle"  onclick="doquery()" />
						<input  type="reset" value="ˢ��" class="buttonStyle"  onClick="parent.bottomm.document.location=parent.bottomm.document.location;">
					</td>
				</tr>
				<tr height="1px">
					<td colspan="8" class="buttonAreaStyle">
						
					</td>
				</tr>
			</table>
		</html:form>
	</body>
</html>