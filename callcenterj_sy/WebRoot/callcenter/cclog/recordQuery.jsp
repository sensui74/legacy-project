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

	<title>座席员当日录音查询</title>

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
    	//查询
     function isInBag(s,bag){
      var i;
      for (i = 0; i < s.length; i++){
      var c = s.charAt(i);
      if (bag.indexOf(c) == -1) return false;
       }
      return true;
      }
      
      function isLetterNumber(content2){
         if (isInBag(content2,"0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ")) return true;
        else return false;
          }

      function isTel(content2){
          if (isInBag(content2,",;/()-0123456789 ")) return true;
            else return  false;
         }
      
    	function query(){
    	
         var telNum = document.forms[0].telNum.value;
        
    	 if(!isTel(telNum)){
            alert("请输入正确电话格式！");
            document.forms[0].telNum.focus();
          	return false;
          }

    		document.forms[0].action = "../cclog.do?method=toRecordList";
    		document.forms[0].target = "bottomm";
    		document.forms[0].submit();
    	}
    	
    	    	function changetwo(){

			var info_group=document.forms[0].tagAllInfo.value;
			
			document.forms[0].action="../cclog.do?method=toCclogGroupSort"
			document.forms[0].target = "topp";
			document.forms[0].submit();
		}
		function changethree(){

			var info_sort=document.forms[0].tagBigInfo.value;
			
			document.forms[0].action="../cclog.do?method=toCclogGroupDivision"
			document.forms[0].target = "topp";
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
		   var aRetVal = showModalDialog(url,"status=no","dialogWidth:215px;dialogHeight:238px;status:no;");
		   if (aRetVal != null)
		   {
		      return aRetVal;
		   }
		   return null;
		}
		function onload()
		{
			document.getElementById('btnSearch').click();
		}
    </script>


</head>

<body class="conditionBody" onload="onload()">

	<html:form action="/callcenter/cclog" method="post">
		<table width="100%" border="0" align="center" cellpadding="0"
			cellspacing="0" class="nivagateTable">
			<tr>
				<td class="navigateStyle">
					当前位置&ndash;&gt;录音查询
				</td>
			</tr>
		</table>
		<table width="100%" border="0" align="center" cellpadding="1"
			cellspacing="1" class="conditionTable">
			<tr>
			    <td class="queryLabelStyle">
						开始时间 
					</td>
					<td class="valueStyle">
						<html:text property="beginTime" styleClass="writeTextStyle"/>
						<img alt="选择时间" src="../../html/img/cal.gif"
						onclick="openCal('cclogMainBean','beginTime',false);">
					</td>
					<td class="queryLabelStyle">
						结束时间
					</td>
					<td class="valueStyle">
						<html:text property="endTime" styleClass="writeTextStyle"/>
						<img alt="选择时间" src="../../html/img/cal.gif"
						onclick="openCal('cclogMainBean','endTime',false);">
					</td>
				<td class="queryLabelStyle">
					来电号码
				</td>
				<td class=valueStyle colspan="5">
					<html:text property="telNum" styleClass="writeTextStyle" />
				</td>
				
				<td align="center" class="queryLabelStyle">
					<input id="btnSearch" name="btnSearch" type="button"   class="buttonStyle"
						value="查询" onclick="query()" />
					<input type="reset" value="刷新"   onClick="parent.bottomm.document.location=parent.bottomm.document.location;" class="buttonStyle"/>
				</td>
			</tr>
			<%--		  <tr>--%>
			<%----%>
			<%--		    <td class="tdbgcolorqueryright">问题类型</td>--%>
			<%--		    <td class="tdbgcolorqueryleft">--%>
			<%--				<html:select property="tagAllInfo">--%>
			<%--						<html:option value="">请选择</html:option>--%>
			<%--						<html:options collection="grouplist" property="value" labelProperty="label"/>--%>
			<%--				</html:select>--%>
			<%--            </td>--%>
			<%--		    <td class="tdbgcolorqueryright">查询问题</td>--%>
			<%--		    <td class="tdbgcolorqueryleft">--%>
			<%--				<html:text property="question" styleClass="input"/>--%>
			<%--            </td>--%>
			<%--            <td class="tdbgcolorqueryright">--%>
			<%--				部门--%>
			<%--		    </td>--%>
			<%--		    <td class="tdbgcolorqueryleft" colspan="3">--%>
			<%--				<html:select property="department">		--%>
			<%--        			<html:option value="" ><bean:message bundle="pcc" key="sys.pleaseselect"/></html:option>--%>
			<%--        			<html:options collection="departlist" property="value" labelProperty="label"/>--%>
			<%--        		</html:select>--%>
			<%--		    </td>--%>
			<%--		  </tr>--%>
			<%--		  <tr>--%>
			<%--		    --%>
			<%--		    <td class="tdbgcolorqueryleft">--%>
			<%--            </td>--%>
			<%--		    <td class="tdbgcolorqueryright"></td>--%>
			<%--		    <td class="tdbgcolorqueryleft">--%>
			<%--            </td>--%>
			<%--		  </tr>--%>
			<tr height="1px">
				<td colspan="11" class="buttonAreaStyle">
					<%--		    <input name="btnAdd" type="button" class="bottom" value="<bean:message bundle='pccye' key='sys.add'/>" onclick="popUp('windows','../pcc/callinFirewall.do?method=toCallinFireWallLoad&type=insert',680,400)"/>--%>
				</td>
			</tr>
		</table>
	</html:form>
</body>
</html:html>
 