<%@ page language="java" contentType="text/html; charset=GBK"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ include file="../style.jsp" %>
<html>
	<head>
	<html:base />
		<title></title>
		<link href="../style/<%=styleLocation %>/style.css" rel="stylesheet" type="text/css" />
		<script language=javascript src="../js/calendar3.js"></script>
		<script>
		function dodisplay(){
		setSameDateTime(document.forms[0].beginTime,document.forms[0].endTime);
			document.forms[0].action="../stat/focusCaseInfo.do?method=toDisplay"
			document.forms[0].submit();
		}
		function dodisplay3d(){
			if(document.forms[0].chartType!=""){
			setSameDateTime(document.forms[0].beginTime,document.forms[0].endTime);
				document.forms[0].action="../stat/focusCaseInfo.do?method=toDisplay";
				document.forms[0].submit();
			}
		}
		function time(){
				var time=new Date();
				document.forms[0].endTime.value=time.format('yyyy-MM-dd');//time.getYear()+"-"+(time.getMonth()+1)+"-"+time.getDate()
				time.setYear(time.getYear()-1)
				document.forms[0].beginTime.value=time.format('yyyy-MM-dd');//time.getYear()+"-"+(time.getMonth()+1)+"-"+time.getDate()
				
			}
		</script>
	</head>
	<body class="conditionBody" onload="time()">
		<html:form action="/stat/focusCaseInfo" method="post" target="bottomm">

			<table width="100%" border="0" align="center" cellpadding="0"
				cellspacing="0" class="nivagateTable">
				<tr>
					<td class="navigateStyle">
						��ǰλ��&ndash;&gt;����������ͳ��
					</td>
				</tr>
			</table>

			<table width="100%" border="0" align="center" cellpadding="0"
				cellspacing="1" class="conditionTable">

				<tr class="conditionoddstyle">
					<td class="LabelStyle">
						��ʼʱ��
					</td>
					<td class="valueStyle">
						<html:text property="beginTime" styleClass="writeTextStyle2"
							onclick="openCal('focusCaseInfoForm','beginTime',false);" />
						<img alt="ѡ��ʱ��" src="../html/img/cal.gif"
					onclick="openCal('focusCaseInfoForm','beginTime',false);">
					</td>
					
<%--					<td class="LabelStyle">--%>
<%--						ͳ������--%>
<%--					</td>--%>
<%--					<td class="valueStyle">--%>
<%--						<html:select property="condition" styleClass="selectStyle">--%>
<%--							<html:option value="count">�绰����</html:option>--%>
<%--							<html:option value="periodtime">ʱ��</html:option>--%>
<%--						</html:select>--%>
<%--					</td>--%>
					<td class="LabelStyle">
<%--						��ϯ����--%>
						��������
					</td>
					<td class="valueStyle">
						<html:select property="agentNum" styleClass="selectStyle">
							<option value="">��ѡ��</option>
							<logic:iterate id="u" name="user">
								<html:option value="${u.userId}">${u.userId}</html:option>						
							</logic:iterate>
						</html:select>
					</td>
					<td class="LabelStyle">
						����
					</td>
					<td class="valueStyle">
						<html:select property="chartType" styleClass="selectStyle">
							<html:option value="">����</html:option>
							<html:option value="bar">��ͼ</html:option>
							<html:option value="pie">��ͼ</html:option>
							<html:option value="line">����ͼ</html:option>
						</html:select>
						<html:checkbox property="is3d" onclick="dodisplay3d()" styleClass="checkBoxStyle">3Dͼ��</html:checkbox>
					</td>
					
				</tr>
				<tr>
					<td class="LabelStyle">
						��ֹʱ��
					</td>
					<td class="valueStyle">
						<html:text property="endTime" styleClass="writeTextStyle2"
							onclick="openCal('focusCaseInfoForm','endTime',false);"/>
						<img alt="ѡ��ʱ��" src="../html/img/cal.gif"
					onclick="openCal('focusCaseInfoForm','endTime',false);">
					</td>
					<td class="LabelStyle">
						��������
					</td>
					<td class="valueStyle">
						<html:select property="caseAttr4" styleClass="selectStyle">
							<html:option value="">��ѡ��</html:option>
							<html:option value="�����ֺ�">�����ֺ�</html:option>
							<html:option value="���߾���">���߾���</html:option>
							<html:option value="�г�����">�г�����</html:option>
							<html:option value="��������">��������</html:option>
							<html:option value="ҽ������">ҽ������</html:option>
							<html:option value="ʳƷ��ȫ">ʳƷ��ȫ</html:option>
							<html:option value="�������">�������</html:option>
						</html:select>
					</td>
					<td class="LabelStyle" align="center" colspan="2">
						<input type="button" name="btnSearch" value="ͳ��"  
							onclick="dodisplay()" class="buttonStyle"/>
							<input type="reset" value="ˢ��"  class="buttonStyle"/>
					</td>
				</tr>				
				<tr height="1px">
					<td colspan="9" class="buttonAreaStyle">
					</td>				
				</tr>
			</table>
		</html:form>
	</body>
</html>