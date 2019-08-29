<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style >
 ul{list-style: none;}
 .btn1{height:30px; vertical-align: middle;}
 .btn2{height:50px; float:left; margin-top:20px;}
 .btn3{width:110px; height:48px; background-color:gray; float:left; margin-top:20px;
       color:white; font-size:18px; margin-left:10px;}
 .box{height:24px; margin-bottom:10px;}
 .pw{height:24px; margin-bottom:10px;}
 .pwch{height:24px; margin-bottom:10px;}
</style>
</head>
<body>
<script type="text/javascript">

	function openId(joinform){
		var id= joinform.id.value;
		var url="./idcheck.do?id="+joinform.id.value;
		if(id.length==0){
			alert("아이디를 입력하세요.");
			joinform.id.focus();
			return false;
		}
		open(url,"win01","width=400,height=400");
	}
	function openNick(joinform){
		var nickname= joinform.nickname.value;
		var url="./nickcheck.do?nickname="+joinform.nickname.value;
		if(nickname.length==0){
			alert("닉네임을 입력하세요.");
			joinform.nickname.focus();
			return false;
		}
		open(url,"win02","width=400,height=400");
	}
	function openEmail(joinform){
		var email= joinform.email.value;
		var url="./emailcheck.do?email="+joinform.email.value;
		if(email.length==0){
			alert("이메일을 입력하세요.");
			joinform.email.focus();
			return false;
		}
		open(url,"win03","width=400,height=400");
	}
	$(document).ready(function(){
		$('.pwch').blur(function(){
	    	if($(this).val() != $('.pw').val()){
	        	alert("비밀번호가 같지 않습니다.")
	    	}else if($(this).val().length < 8){
	        	alert("비밀번호는 8자 이상이어야 합니다.")
	    	}
		})
	})
</script>
<h1>회원가입</h1>
<form action="memberinsert.do" method="post">
<fieldset>
   <legend>회원가입</legend>
   <ul>
          <li>
              <label for="아이디">아 이 디&nbsp;</label>              
              <input type="text" name="id" placeholder="아이디입력" required="required" size="16" class="box">
			  <input type="button" value="아이디 중복체크" onclick="openId(this.form)" class="btn1">            
          </li>          
          <li>
              <label for="패스워드">패스워드</label>
              <input type="password" name="pw" required="required" placeholder="패스워드 입력" size="16" class="pw">
          </li>
          <li>
              <label for="패스워드">패스워드</label>
              <input type="password" name="pwch" required="required" placeholder="패스워드 다시입력" size="16" class="pwch">
          </li>
          <li>
              <label for="이름">이 름&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
              <input type="text" name="irum" required="required" placeholder="이름 입력" size="16" class="box">
          </li>
          <li> 
              <label for="닉네임">닉 네 임&nbsp;&nbsp;</label>
              <input type="text" name="nickname" required="required" placeholder="영어로 입력하세요" size="16" class="box">
              <input type="button"  value="닉네임 중복체크 "  class="btn1" onclick="openNick(this.form)"> 
          </li>
          <li>
              <label for="이메일">이 메 일&nbsp;&nbsp;</label>
              <input type="email" name="email" required="required" placeholder="aaa@naver.com" size="16" class="box">
              <input type="button"  value="이메일 중복체크 "class="btn1" onclick="openEmail(this.form)"> 
          </li>
          <li>
              <label for="정보수신허용">정보수신허용</label>
               &nbsp;e-mail 수신허용
              <select name="emailcheck">
                 <option value="yes" >예</option>
                 <option value="no" >아니오</option>
              </select>
              <label for="sms수신허용">SMS수신허용</label>
              <select name="smscheck">
                 <option value="yes" >예</option>
                 <option value="no" >아니오</option>
              </select>
             
          </li>
          <li>
              <input type="image" src="img/icon_join.png" class="btn2">
              <input type="reset" value="다시작성" class="btn3" >
          </li>
   </ul>

</fieldset>
</form>
</body>
</html>