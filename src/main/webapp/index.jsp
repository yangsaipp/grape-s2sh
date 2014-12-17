<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    <script type="text/javascript" src="javascript/jquery.js"></script>
    <script type="text/javascript" src="javascript/jquery.form.js"></script>
    <script type="text/javascript" src="javascript/jquery-ui-1.8.23.custom.min.js"></script>
 	<link rel="stylesheet" href="css/jquery-ui-1.8.23.custom.css">
 	<link rel="stylesheet" href="css/jquery.ui.tabs.css">
 	<link rel="stylesheet" href="css/demos.css">
 	<script> 
        // wait for the DOM to be loaded 
        $(document).ready(function() { 
            // bind 'myForm' and provide a simple callback function 
            $('#myForm').ajaxForm(function() { 
                alert("Thank you for your comment!"); 
            }); 
            $( "#tabs" ).tabs({ cache: true,selected: 2 }); 
        });
       
    </script> 
  </head>
  <body>
    <div class="demo">
		<div id="tabs">
			<ul>
				<li><a href="#tabs-1">Nunc tincidunt-yangsai</a></li>
				<li><a href="userList.do">Proin dolor-yangsai</a></li>
				<li><a href="#tabs-3">Aenean lacinia-yangsai</a></li>
			</ul>
			<div id="tabs-1">
					<s:form id="myForm" action="/userList.do" method="post" validate="true" enctype="multipart/form-data">
				   		<s:file name="file" label="请选择" cssClass="text file" required="true"/>
				   		<s:submit value="上传" name="upload" cssClass="button"/>
				    </s:form>
			</div>
			<%--<div id="tabs-2">
				<jsp:include page="index2.jsp"></jsp:include>
			</div>
			--%><div id="tabs-3">
				<p>Mauris eleifend est et turpis. Duis id erat. Suspendisse potenti. Aliquam vulputate, pede vel vehicula accumsan, mi neque rutrum erat, eu congue orci lorem eget lorem. Vestibulum non ante. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Fusce sodales. Quisque eu urna vel enim commodo pellentesque. Praesent eu risus hendrerit ligula tempus pretium. Curabitur lorem enim, pretium nec, feugiat nec, luctus a, lacus.</p>
				<p>Duis cursus. Maecenas ligula eros, blandit nec, pharetra at, semper at, magna. Nullam ac lacus. Nulla facilisi. Praesent viverra justo vitae neque. Praesent blandit adipiscing velit. Suspendisse potenti. Donec mattis, pede vel pharetra blandit, magna ligula faucibus eros, id euismod lacus dolor eget odio. Nam scelerisque. Donec non libero sed nulla mattis commodo. Ut sagittis. Donec nisi lectus, feugiat porttitor, tempor ac, tempor vitae, pede. Aenean vehicula velit eu tellus interdum rutrum. Maecenas commodo. Pellentesque nec elit. Fusce in lacus. Vivamus a libero vitae lectus hendrerit hendrerit.</p>
			</div>
		</div>
	</div>
  </body>
</html>
