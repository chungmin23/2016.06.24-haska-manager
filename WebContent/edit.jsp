<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
ul {
	list-style: none;
}

h3 {
	color: green;
}
</style>
</head>
<body>
	<%	
	    String no=request.getParameter("no");
	    int cnt=Integer.parseInt(no);
		Context ctx = new InitialContext();
	    DataSource dataFactory = (DataSource) ctx.lookup("java:comp/env/jdbc/ho5854");
	    Connection conn = dataFactory.getConnection();
	    conn = dataFactory.getConnection();
		String sql="select no,title,author,content,nal,readcount from board where no=?";
		PreparedStatement  pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, cnt);
		ResultSet rs=pstmt.executeQuery();
	    String author=null;
	    String title=null;
	    String content=null;
	    String nal=null;
	    while(rs.next()){
	    	author=rs.getString("author");
	    	title=rs.getString("title");
	    	content=rs.getString("content");
	    	nal=rs.getString("nal");
	    	
	    }
	%>
	<h1>게시판 글수정 화면</h1>
	<form action="edit.do" method="post">
		<fieldset>
			<legend>게시판 글수정 화면</legend>
			<ul>
				<li><label for="작성자입력">작 성&nbsp;&nbsp;자</label> <input
					type="text" name="author" required="required" placeholder="작성자입력" value="<%=author%>">
				</li>
				
				<li><label for="제목입력">제목입력</label> 
				<input type="text"name="title" required="required" placeholder="제목입력" value="<%=title%>"></li>
				<li><h3>내용입력</h3></li>
				
				<li><label for="내용입력"></label> 
				<textarea row="20" cols="80"placeholder="내용입력" name="content" > <%=content%></textarea></li>
				
				<li>
				   <input type="hidden" value=<%= cnt %>   name="cnt">
				</li>
				<li>
				   <input type="hidden" value=<%= nal %>   name="nal">
				</li>
				
				<li><input type="image" src="img/submit.jpg"></li>

			</ul>

		</fieldset>


	</form>
</body>
</html>