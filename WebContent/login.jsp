<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style >
 ul{list-style: none;}
</style>
</head>

<body>
<h1>로그인</h1>
<form action="login" method="post">
<fieldset>
   <legend>로그인</legend>
   <ul>
          <li><label for="아이디">아 이 디&nbsp;</label>
              <input type="text" name="id" placeholder="아이디입력" required="required">         
          </li>
          <li>
              <label for="패스워드">패스워드</label>
              <input type="password" name="pw" required="required" placeholder="패스워드 입력">
          </li>
          <li>
              <input type="image" src="img/submit.jpg">
          </li>
   </ul>

</fieldset>
</form>
</body>
</html>