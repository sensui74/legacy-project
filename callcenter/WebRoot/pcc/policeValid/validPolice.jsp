<%@ page language="java" import="java.util.*" contentType="text/html; charset=GBK" pageEncoding="GBK"%>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/page.tld" prefix="page" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html locale="true">
  <head>
    <html:base />
    
    <title><bean:message bundle="pcc" key="et.pcc.fuzz.fuzzload.title"/></title>
    
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">    
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
	<link href="../../images/css/styleA.css" rel="stylesheet" type="text/css" />
    <SCRIPT language=javascript src="../../js/form.js" type=text/javascript>
    </SCRIPT>
    <SCRIPT language=javascript src="../../js/calendar.js" type=text/javascript>
    </SCRIPT>
    <script language="javascript">
    
    	function checkForm(addstaffer){
        	if (!checkNotNull(addstaffer.fuzzNo,"����")) return false;
        	if (!checkNotNull(addstaffer.name,"����")) return false;
        	if (!checkNotNull(addstaffer.idcard,"����֤")) return false;
        	if (!checkNotNull(addstaffer.unit,"��λ")) return false;
        	if (!checkNotNull(addstaffer.unit,"ԭ����")) return false;
            return true;
        }
    	//�޸�����
    	function search(){
    		var f =document.forms[0];
    	    if(checkForm(f)){
    		document.forms[0].action = "valid.do?method=validInfo";
    		document.forms[0].submit();
    		}
    	}
    	//��֤����
    	function checkFormPass(addstaffer){
    		if (!checkNotNull(addstaffer.department,"����")) return false;
        	if (!checkNotNull(addstaffer.password,"����")) return false;
        	if (!checkNotNull(addstaffer.repassword,"��֤����")) return false;
        	if (addstaffer.password.value !=addstaffer.repassword.value)
            {
            	alert("������������벻һ�£�");
            	return false;
            }
           return true;
        }
    	//�޸�����
    	function update(){
    		var f =document.forms[0];
    	    if(checkFormPass(f)){
    		document.forms[0].action = "valid.do?method=upInfo";
    		document.forms[0].submit();
    		}
    	}

    </script>
  </head>
  
  <body bgcolor="#eeeeee">
  
    <html:form action="/pcc/policeValid/valid.do" method="post">
		<table width="100%" border="0" cellpadding="1" cellspacing="1" class="tablebgcolor">
		  <tr>
		    <td colspan="2" class="tdbgpicload">��һ������������������Ϣ��֤�û����ݡ�</td>
		  </tr>
		  <tr>
		    <td class="tdbgcolorloadright"><bean:message bundle="pcc" key="et.pcc.policeinfo.policevalid.fuzznum"/></td>
		    <td class="tdbgcolorloadleft">
			<html:text property="fuzzNo" styleClass="input"/>
			<font color="red"><bean:message bundle="pcc" key="et.pcc.policeinfo.policevalid.fuzznoexample"/></font>	
		    </td>
		  </tr>
		  <tr>
		    <td class="tdbgcolorloadright"><bean:message bundle="pcc" key="et.pcc.policeinfo.policevalid.name"/></td>
		    <td class="tdbgcolorloadleft">
		    <html:text property="name" styleClass="input"/>
		    <font color="red"><bean:message bundle="pcc" key="et.pcc.policeinfo.policevalid.nameexample"/></font>
		    </td>
		  </tr>
		  <tr>
		    <td class="tdbgcolorloadright"><bean:message bundle="pcc" key="et.pcc.policeinfo.policevalid.idcard"/></td>
		    <td class="tdbgcolorloadleft">
			<html:text property="idcard" styleClass="input"/>
			<font color="red"><bean:message bundle="pcc" key="et.pcc.policeinfo.policevalid.idcardexample"/></font>
		    </td>
		  </tr>
		  <tr>
		    <td  class="tdbgcolorloadright"><bean:message bundle="pcc" key="et.pcc.policeinfo.policevalid.unit"/></td>
		    <td  class="tdbgcolorloadleft">
		    <html:select property="unit">		
        		<html:option value="0" ><bean:message bundle="pcc" key="sys.pleaseselect"/></html:option>
        		<html:optionsCollection name="ctreelist" label="label" value="value"/>
        	</html:select>
		    </td>
		  </tr>
		  <tr>
		    <td class="tdbgcolorloadright"><bean:message bundle="pcc" key="et.pcc.policeinfo.policevalid.beforePwd"/></td>
		    <td class="tdbgcolorloadleft">
			<html:password property="beforePwd" styleClass="input"/>
<%--			<font color="red"><bean:message bundle="pcc" key="et.pcc.policeinfo.policevalid.beforePwdExplain"/></font>--%>
		    </td>
		  </tr>
		  <tr>
		    <td colspan="2" align="center" class="tdbgcolorloadbuttom">
		     <input name="btnAdd" type="button" class="bottom" value="<bean:message bundle='pcc' key='sys.valid'/>" onclick="search()"/>&nbsp;&nbsp;
		    <input name="btnReset" type="reset" class="bottom" value="<bean:message bundle='pcc' key='sys.cancel'/>"/>&nbsp;&nbsp;
		    <input name="btnClose" type="button" class="bottom" value="<bean:message bundle='pcc' key='sys.close'/>" onclick="javascript:window.close();"/>
		    </td>
		  </tr>
		</table>
    </html:form>
  </body>
</html:html>