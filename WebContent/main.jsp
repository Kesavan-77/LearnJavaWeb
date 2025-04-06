<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Scanner" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main file</title>
</head>
<body>
<h1>My file</h1>
<%! int n = 10; %>
<%
for(int i=0;i<n;i++){
	out.println(i);
}
%>
<%= n %>
</body>
</html>