<%@ page language="java" import="java.util.*" pageEncoding="GBK" contentType="text/html; charset=gb2312"%>


<html>
  <head>
  
    <title>热线专家团信息管理主页</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <frameset name="dict" rows="10%,*" border="0" frameborder="0"  framespacing="0">
  	<frame name="topp" scrolling="no" src="../screen/expertGroupHL.do?method=toExpertHLQuery" noresize>
	<frame name="bottomm" src="../screen/expertGroupHL.do?method=toExpertGroupHLList" noresize>
  </frameset>
</html>
