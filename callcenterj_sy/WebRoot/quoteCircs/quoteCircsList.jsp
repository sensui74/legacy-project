<%@ page language="java" import="java.util.*" pageEncoding="GBK" contentType="text/html; charset=gbk"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
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

<link href="../style/<%=styleLocation%>/style.css" rel="stylesheet" type="text/css" />
	<script language="javascript" src="../js/Table.js" ></script>
	<script language="javascript">
	    function AllAreaExcel()
		{
		  try{
		  var oXL = new ActiveXObject("Excel.Application");
		  var oWB = oXL.Workbooks.Add();
		  var oSheet = oWB.ActiveSheet;
		  var sel=document.body.createTextRange();
		  sel.moveToElementText(DivAll); //容器id
		  sel.select();
		  sel.execCommand("Copy");
		  oSheet.Paste();
		  oXL.Visible = true;
		  }catch(mye){
		 
		    alert(mye.message+"\n[注] 如无法导出数据请执行如下 操作:"+
		          "第一步：在系统的 开始-->运行里执行 regsvr32.exe scrrun.dll\n"+
		          "第二步：依次打开IE的菜单栏里的工具--->Internet选项---->安全----->Internet--->自定义级别 ---->ActiveX 控件和 插件: 把 '对没有标记为安全的ActiveX控件进行' 改成 '启用' \n"+
		          "第三步：刷新当前页面"
		        );
		  }
		}
		
		function sumTblRowCol(tblId)
		{
			var oTbl = document.getElementById(tblId);
			var arrs = new Array(100);
			//init
			for(var i=0; i<100; i++)
			{
				arrs[i]=0;
			}
			if(oTbl)
			{
				var sumRowNum = 0; //行汇总
				var allSumNum = 0; //所有值
				var rows = oTbl.rows;
				if(rows.length>1)
				{	
					//最后一行做汇总
					for(var i=1; i<(rows.length-2); i++)
					{
						var row = rows[i];
						var cols = row.cells;
						var sumRowNum = 0;
						//最后一列做汇总
						for(var j=0; j<(cols.length-1);j++)
						{
							arrs[j] = arrs[j]+cols[j].innerText*1;
							sumRowNum=sumRowNum*1+cols[j].innerText*1;
						}
						cols[cols.length-1].innerText=sumRowNum;
						allSumNum+=sumRowNum;
					}
					var lastCols = rows[rows.length-2].cells;
					for(var j=0; j<(lastCols.length-1);j++)
					{
						lastCols[j].innerText=arrs[j];
					}
					lastCols[lastCols.length-1].innerText=allSumNum;
				}
		
			}
		}
		
	</script>
	
  </head>

<style>
<!--
	.div{
	 position: absolute;
	 line-height:90px;
	 font-size:12px;
	 z-index:1000;
	}
-->
</style>
<style>
<!--
.td{border-bottom: 1px solid #EAFFD0;border-right: 1px solid #EAFFD0}
-->
</style>

<body class="listBody" onload="sumTblRowCol('tab1')">

  <div id="DivAll">
	<div id="Div1" class="div" align="center">
	  	<table border="0" align="left" cellpadding="0" cellspacing="0"class="listTable" >
			<tr class="listTitleStyle">
				<td width="60" class="td">联络员</td>
				<td width="190" class="td">用户地址</td>
				<td width="140" class="td">用户电话</td>
				<td width="60" class="td">报价次数</td>
				<td width="70" class="td">应报价次数</td>
				<logic:iterate id="pagelist" name="list" indexId="i">
				<%
					String style = i.intValue() % 2 == 0 ? "oddStyle" : "evenStyle";
			 	%>
					<tr style="line-height: 21px;">
						<td class="td"><bean:write name="pagelist" property="custName" filter="true"/></td>
			    		<td class="td"><bean:write name="pagelist" property="custAddr" filter="true"/></td>
			    		<td class="td"><bean:write name="pagelist" property="custTel" filter="true"/></td>
			    		<td class="td"><bean:write name="pagelist" property="succeed" filter="true"/></td>
			    		<td class="td"><bean:write name="pagelist" property="must" filter="true"/></td>
					</tr>
				</logic:iterate>
				
				<tr class="oddStyle" style="line-height: 21px;">
				  <td class="td" colspan="5" align="center">
				      当天报送价格总数
				  </td>
				</tr>
				
					<tr style="line-height: 21px;">
						<td colspan="5" class="listTitleStyle" >
							&nbsp;
						</td>
					</tr>
			</tr>
			
		</table>
	</div>

	<div style="width:100%;height:94%;overflow-x:scroll;">
		<div style="width:1000%;height:100%;">
		<table border="0" align="left" cellpadding="0" cellspacing="0" class="listTable" >
			<tr class="listTitleStyle">
				<td width="60" class="td">联络员</td>
				<td width="190" class="td">用户地址</td>
				<td width="140"class="td">用户电话</td>
				<td width="60"class="td">报价次数</td>
				<td width="70" class="td">应报价次数</td>
				<logic:iterate id="pagelist" name="list" indexId="i">
				<%
					String style = i.intValue() % 2 == 0 ? "oddStyle" : "evenStyle";
			  	%>
					 <tr style="line-height: 21px;">
					 	<td class="td"><bean:write name="pagelist" property="custName" filter="true"/></td>
			    		<td class="td"><bean:write name="pagelist" property="custAddr" filter="true"/></td>
			    		<td class="td"><bean:write name="pagelist" property="custTel" filter="true"/></td>
			    		<td class="td"><bean:write name="pagelist" property="succeed" filter="true"/></td>
			    		<td class="td"><bean:write name="pagelist" property="must" filter="true"/></td>
					 </tr>
				</logic:iterate>
				<tr style="line-height: 21px;">
				  <td class="td" colspan="5">&nbsp;
				  </td>
				</tr>
				
					<tr style="line-height: 21px;">
						<td colspan="5" class="listTitleStyle" >
							&nbsp;
						</td>
					</tr>
			</tr>
		</table>
		<div>
				<table id="tab1" border="0" align="left" cellpadding="0" cellspacing="0" class="listTable" >
					<tr class="listTitleStyle">
						<logic:iterate id="title" name="titleList">
							<td nowrap="nowrap" class="td"><bean:write name="title"/></td>
						</logic:iterate>
						<td class="td">合计</td>
					</tr>
					<logic:iterate id="pagelist" name="list" indexId="i">
					<%
						String style = i.intValue() % 2 == 0 ? "oddStyle" : "evenStyle";
					%>
						<tr style="line-height: 21px;">
							<logic:iterate id="count" name="pagelist" property="countList">
								<td class="td"><bean:write name="count"/></td>
							</logic:iterate>
							
							<td class="td"></td>
							
						</tr>
					</logic:iterate>
					<tr class="oddStyle" style="line-height: 21px;">
						<logic:iterate id="count" name="pagelist" property="countList">
							<td class="td">&nbsp;</td>
						</logic:iterate>
						<td class="td"></td>
					</tr>
					
					<tr>
						<td colspan="100" class="listTitleStyle" align="right" style="margin:0px;padding-right:0px;">
						<div style="text-align:right;">
							<input type="button" class="buttonStyle" value="导出Excel" onclick="AllAreaExcel()" />
						</div>
						</td>
					</tr>
					
				</table>
		</div>
	</div>
</div>
<%--		<table width="100%" border="0" align="center" cellpadding="0" cellspacing="1" class="listTable">--%>
<%--			<tr>--%>
<%--				<td class="pageTable" width="100%">--%>
<%--					<page:page name="CircsQueryTurning" style="second" />--%>
<%--				</td>--%>
<%--			</tr>--%>
<%--		</table>--%>
   </div>
  </body>
</html:html>
 