
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'add.jsp' starting page</title>
    <script type="text/javascript" src="<%=path %>/js/jquery-1.8.3.js"></script>
    <script type="text/javascript">
    
    </script>
    <link rel="stylesheet" href="<%=path %>/css/index_work.css" type="text/css"></link>
  </head>
  
  <body>
    <c:forEach items="${list }" var="i">
    	${i.id },${i.name }
    </c:forEach>
  </body>
</html>
