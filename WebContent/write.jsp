<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
 ul{list-style: none;}
 h3{color:green;}
 
</style>
</head>
<body>
<h1>게시판 글쓰기 화면</h1>
<form action="write.do" method="post">
<fieldset>
   <legend>게시판 글쓰기 화면</legend>
   <ul>
       <li>
            <label for="작성자입력">작 성 자 &nbsp;</label> 
            <input type="text" name="author" required="required" placeholder="작성자입력">
       </li>
       <li>
         <label for="제목입력">제목입력</label>
         <input type="text" name="title" required="required" placeholder="제목입력">
       </li>
       
       <li>
          <label for="날짜">&nbsp;&nbsp;날 짜&nbsp;&nbsp;&nbsp;&nbsp; </label>
          <input type="date" name="nal" checked="checked">
       </li>
       <li><h3>내용입력</h3></li>
       <li>
         <label for="내용입력"></label>
         <textarea row="20" cols="80" placeholder="내용입력" name="content"> </textarea>
       </li>
       <li>
           <input type="image" src="img/submit.jpg">
       </li>
       
   </ul> 

</fieldset>


</form>
</body>
</html>