<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("utf-8");
    response.setContentType("text/html;charset=utf-8");
    String next = request.getParameter("nextpage");
    if(next==null){
    	next="info";
    }

%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/index.css" type="text/css" rel="stylesheet">
</head>
<body>
<div id = "d1">
<%@ include file="top.jsp" %>
</div>
<div id = "d2">
<%@ include file="left.jsp" %>
</div>
<div id="dcenter">
<jsp:include page='<%=next+".jsp" %>'/>
</div>
<div id = "d3">
<%@ include file="bottom.jsp" %>
</div>
</body>
</html>