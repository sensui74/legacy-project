<%@ page language="java" import="java.util.*" pageEncoding="GBK"
	contentType="text/html; charset=gb2312"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="/WEB-INF/page.tld" prefix="page"%>
<%@ include file="../style.jsp"%>

<html:html lang="true">
<head>
	<html:base />

	<title></title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link href="../style/<%=styleLocation%>/style.css" rel="stylesheet"
		type="text/css" />

	<script language="javascript">
    	//查询
    	function query(){
    		document.forms[0].action = "question.do?method=toQuestionList";
    		document.forms[0].target = "bottomm";
    		document.forms[0].submit();
    	}
    	
    	function popUp( win_name,loc, w, h, menubar,center ) {
		var NS = (document.layers) ? 1 : 0;
		var editorWin;
		if( w == null ) { w = 500; }
		if( h == null ) { h = 350; }
		if( menubar == null || menubar == false ) {
			menubar = "";
		} else {
			menubar = "menubar,";
		}
		if( center == 0 || center == false ) {
			center = "";
		} else {
			center = true;
		}
		if( NS ) { w += 50; }
		if(center==true){
			var sw=screen.width;
			var sh=screen.height;
			if (w>sw){w=sw;}
			if(h>sh){h=sh;}
			var curleft=(sw -w)/2;
			var curtop=(sh-h-100)/2;
			if (curtop<0)
			{ 
			curtop=(sh-h)/2;
			}
	
			editorWin = window.open(loc,win_name, 'resizable=no,scrollbars,width=' + w + ',height=' + h+',left=' +curleft+',top=' +curtop );
		}
		else{
			editorWin = window.open(loc,win_name, menubar + 'resizable=no,scrollbars,width=' + w + ',height=' + h );
		}
	
		editorWin.focus(); //causing intermittent errors
	}

	function openwin(param)
		{
		   var aResult = showCalDialog(param);
		   if (aResult != null)
		   {
		     param.value  = aResult;
		   }
		}
		
		function showCalDialog(param)
		{
		   var url="<%=request.getContextPath()%>/html/calendar.html";
		   var aRetVal = showModalDialog(url,"status=no","dialogWidth:225px;dialogHeight:225px;status:no;");
		   if (aRetVal != null)
		   {
		      return aRetVal;
		   }
		   return null;
		}
		
		//咨询内容中，凡是有“024007009”的服务记录均需要导出来（带电话的服务记录）
    	function outputExcel(){
    		document.forms[0].action = "question.do?method=toOutputFile";
    		document.forms[0].target = "bottomm";
    		document.forms[0].submit();
    	}
   	</script>

</head>

<body class="listBody">
	<html:form action="/question/question" method="post">
		<table width="100%" border="0" align="center" cellpadding="0" cellspacing="1" class="listTable">
			<tr>
				<td class="listTitleStyle" width="5%" align="center">
					来电号码
				</td>
				<td class="listTitleStyle" width="15%" align="center">
					问题
				</td>
				<td class="listTitleStyle" width="15%" align="center">
					答案
				</td>
				<td class="listTitleStyle" width="5%" align="center">
					栏目
				</td>
				<td class="listTitleStyle" width="5%" align="center">
					状态
				</td>
				<td class="listTitleStyle" width="5%" align="center">
					时间
				</td>
				<td class="listTitleStyle" width="5%" align="center">
					受理工号
				</td>
				<td class="listTitleStyle" width="5%" align="center">
					受理专家
				</td>
				<td class="listTitleStyle" width="6%" align="center">
					操作
				</td>
			</tr>
			<logic:iterate id="q" name="list" indexId="i">
				<%
		String style = i.intValue() % 2 == 0 ? "oddStyle" : "evenStyle";
				%>
				<tr>
					<td >
						<bean:write name="q" property="telNum" filter="true" />
					</td>
					<td >
						<bean:write name="q" property="question_content" filter="true" />
					</td>
					<td >
						<bean:write name="q" property="answer_content" filter="true" />
					</td>
					<td >
						<bean:write name="q" property="dict_question_type1" filter="true" />
					</td>
					<td >
						<bean:write name="q" property="dict_is_answer_succeed"
							filter="true" />
					</td>
					<td >
						<bean:write name="q" property="addtime" filter="true" />
					</td>
					<td >
						<bean:write name="q" property="answer_agent" filter="true" />
					</td>
					<td >
						<bean:write name="q" property="expert_name" filter="true" />
					</td>
					<td >

						<img alt="详细" src="../style/<%=styleLocation%>/images/detail.gif"
							onclick="popUp('1<bean:write name='q' property='id'/>','question.do?method=toQuestionLoad&type=detail&id=<bean:write name='q' property='id'/>',800,310)" />
						<img alt="修改" src="../style/<%=styleLocation%>/images/update.gif"
							onclick="popUp('2<bean:write name='q' property='id'/>','question.do?method=toQuestionLoad&type=update&id=<bean:write name='q' property='id'/>',800,310)" />
						<img alt="删除" src="../style/<%=styleLocation%>/images/del.gif"
							onclick="popUp('win<bean:write name='q' property='id'/>dows','question.do?method=toQuestionLoad&type=delete&id=<bean:write name='q' property='id'/>',800,310)" />
					</td>
				</tr>
			</logic:iterate>
			<tr>
				<td colspan="7" class="pageTable">
					<page:page name="userpageTurning" style="second" />
				</td>
				<td class="pageTable" style="text-align:right">
					&nbsp;&nbsp;&nbsp;
					<input name="btnAdd" type="button"   value="添加" class="buttonStyle"
						onclick="popUp('windows','question.do?method=toQuestionLoad&type=insert',800,310)" />
				</td>
				<td><input name="Submit4" type="button" id="Submit4" onClick="outputExcel()" class="buttonStyle" value="导出excel" /></td>
			</tr>
		</table>
	</html:form>
</body>
</html:html>
 