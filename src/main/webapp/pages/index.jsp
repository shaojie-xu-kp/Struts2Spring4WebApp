<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ page import="java.util.Date" %>
<%@ page info="Home Page JSP" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Index JSP Page</title>
</head>
<body>
<%-- out object example --%>
<h4>Hi There</h4>
<strong>Current Time is</strong>: <% out.print(new Date()); %><br><br>

<%! static int count=0; %>
<strong>local static variable</strong>: <%= count++ %><br><br>
 
<strong>Servlet Info: </strong>: <%= getServletInfo() %><br><br>
 
<%-- request object example --%>
<strong>Request User-Agent</strong>: <%=request.getHeader("User-Agent") %><br><br>
 
<%-- response object example --%>
<% response.addCookie(new Cookie("Test","Value")); %>
 
<%-- config object example --%>
<strong>User init param value</strong>:<%=config.getInitParameter("User") %><br><br>
 
<% application.setAttribute("init","Xu"); %>
<%-- application object example --%>
<strong>User context param value</strong>:<%= application.getAttribute("init") %><br><br>
 
<%-- session object example --%>
<strong>User Session ID</strong>:<%=session.getId() %><br><br>
 
<%-- pageContext object example --%>
<% pageContext.setAttribute("Test", "Test Value"); %>
<strong>PageContext attribute</strong>: {Name="Test",Value="<%=pageContext.getAttribute("Test") %>"}<br><br>
 
<%-- page object example --%>
<strong>Generated Servlet Name</strong>:<%=page.getClass().getName() %>

<br><br>
<strong>tutorial action value</strong>:<s:property value="actionValue"/>

<br><br>
<strong>tutorial language</strong>:<s:property value="language"/>


</body>
</html>