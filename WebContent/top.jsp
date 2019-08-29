<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>주현 학사관리 프로그램</title>
<script type="text/javascript" src="js/jquery-1.10.2.js"></script>
<style>
    body{background:#ccc; font-family: Arial,sans-seif; fontsize:14px; line-height: 1.6; }
    #ALL{width:880px; margin:30px auto; background: #FFF; padding: 20px; }
    #ALL h1{margin:0; font-size: 40px; font-weight:bold; margin-bottom: 20px;  color:black; font-family: inherit; }
    .menu{height: 45px; background: #000;}
    .menu ul{list-style:none; padding:0; margin:0; } 
    .menu ul li{float:left; overflow: hidden; text-align: center; line-height: 45px;}
    .menu ul li a {position: relative; display: block; width:110px; height: 45px; color:#FFF; font-family: Arial;
                  font-size: 11px; font-weight: blod; letter-spacing: 1px; text-transform: uppercase; text-decoration: none;
                  cursor: pointer;}
    .menu ul li a span{position: absolute; top:0px; left:0px; width:110px; }
    .menu ul li a span.over{top:-45px; }
    .menu ul li a span.over {background: #FFF; color:#000;}
    .img1{width:200px;}
    .login{
      position:absolute;
      top:80px;
      left:600px;
      color:green;
    }
    .logout{
    position:absolute;
      top:80px;
      left:800px;
      color:green;
    }
    .logout img {
       width:100px;
       height:40px;
    }
    a{text-decoration: none;}
</style>
</head>
  <body>
        
        <%
           if(session.getAttribute("id")==null){
        	   out.print("");
        %> 
           <div class="login">  로그인하세요</div>
        <% } else{ %>
        <div class="login"> <%= session.getAttribute("id")%> 님 로그인 되었습니다 </div>
        <div class="logout">
            <a href="logout"><img src="img/logout.png"></a>
        </div>
        <%  } %>    
      <div id="ALL">
        <h1>학사관리 프로젝트</h1>
        <div class="menu">
           <ul>
                <li><a href="index.jsp?nextpage=info">학사소개</a></li>
                <li><a href="index.jsp?nextpage=recu">모집과정</a></li>
                <li><a href="index.jsp?nextpage=untr">실업자훈련</a></li>
                <li><a href="index.jsp?nextpage=intr">재직자훈련</a></li>
                <li><a href="index.jsp?nextpage=edu">구민정보화교육</a></li>
                <li><a href="index.jsp?nextpage=write">커뮤니티</a></li>
                <li><a href="index.jsp?nextpage=login">로그인</a></li>
                <li><a href="index.jsp?nextpage=member">회원가입</a></li>
           </ul>
        </div>
    </div>
    <script type="text/javascript">
     $(function(){
    	$(".menu li a").wrapInner('<span class="out"></span>');
    	
    	$(".menu li a").each(function(){
    		$('<span class="over">' + $(this).text()+ '</span>').appendTo(this);
    	});
    	$(".menu li a").hover(function(){
    		$(".out", this).stop().animate({'top': '45px'}, 200);
    		$(".over", this).stop().animate({'top': '0px'}, 200);
    	}, function(){
    		$(".out", this).stop().animate({'top': '0px'}, 200);
    		$(".over", this).stop().animate({'top': '-45px'}, 200);
    	});
     });
    </script>
  </body>
</html>