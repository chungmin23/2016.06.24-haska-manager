<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=Edge">
		<meta http-equiv="Pragma" content="no-cache">
		<meta http-equiv="Expires" content="-1">
		<meta name="viewport" content="width=1020, maximum-scale=1.0">
		<meta name="keywords" content="컴퓨터인문과정,주현컴퓨터학원,">
		<meta name="description" content="컴퓨터인문과정 - 주현컴퓨터학원">
		<title>컴퓨터인문과정 - 주현컴퓨터학원</title>
		<!-- <link rel="stylesheet" type="text/css" href="./css/google_webfont.css" /> -->
		<link rel="stylesheet" type="text/css" href="./css/common.css?uniq=1464938582">
		<link rel="stylesheet" type="text/css" href="./css/pc.css?uniq=1464938582">
		<link rel="stylesheet" type="text/css" href="./css/member.css?uniq=1464938582">
		<link rel="stylesheet" type="text/css" href="./css/board.css?uniq=1464938582">
		<link rel="stylesheet" type="text/css" href="./css/form.css?uniq=1464938582">
		<link rel="stylesheet" type="text/css" href="./css/diary.css?uniq=1464938582">
		<link rel="stylesheet" type="text/css" href="./SmartEditor2/css/smart_editor2_out.css?uniq=1464938582">
		<link rel="shortcut icon" href="./favicon/pc_favicon.ico">
		<style type="text/css">
			 #top { background:URL('./upload_design/20160304112852-b6bcc8ea00.png') center top repeat-x; }  #menu3 { background:URL('./upload_design/20151016131426-20cfb69068.png') center bottom; } 		</style>
		<!--
		<script src="//ajax.googleapis.com/ajax/libs/webfont/1.4.10/webfont.js"></script>
		<script type="text/javascript">
		  WebFont.load({
			google: { families: ['Nanum Gothic'] }
		  });
		</script>
		<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
		<script type="text/javascript" src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
		//-->
		<script type="text/javascript" src="./js/jquery-latest.js"></script>
		<script type="text/javascript" src="./js/jquery-ui.js"></script>
		<script type="text/javascript" src="./js/js.js?uniq=1464938582"></script>
		<script type="text/javascript">
			//<![CDATA[
				copyright_position_reset_first_check="Y";
				function copyright_position_reset()
				{
					var html_height = parseInt($("html").css("height"));
					var wrap_height = parseInt($("#wrap").css("height"));
					var bottom_height = parseInt($("#bottom").css("height"));
					if( html_height > (wrap_height + bottom_height+100) )
					{
						copyright_position_reset_first_check="N";
						$("#bottom").css({"position":"absolute","bottom":"0px"});
					}
					else
					{
						if(copyright_position_reset_first_check=="Y"){clearInterval(copyright_position);}
						else{$("#bottom").css({"position":"relative","bottom":"0px"});}
					}
				}

				$(document).ready(function(){

					// 브라우져 홀수해상도에 따른 가운데 정렬
													var html_width = parseInt($("html").css("width"));
							if(html_width/2!=parseInt(html_width/2))
							{
								$("#wrap").css({"border-right":"1px solid #F1F1F1"});
								$("#bottom").css({"background-image":"url('./img/copyright_right_bg.gif')","background-repeat":"repeat-y","background-position":"right top"});
							}
						
					// 로딩화면
						$("#loading_display").css({"display":"none","width":"0px","height":"0px","zIndex":"0"});
						$("#wrap").css({"display":"block"});

					// 메인메뉴 영역 벗어남 체크
						
					// 메인메뉴
													var size_h_open = $("#menu2").css("height");
							$("#menu2").css("height","46px");
							$(".m2_ul").css("opacity",0);
							$("#menu2").mouseenter(function() {
								$("#menu2").stop();
								$(".m2_ul").stop();
								$("#menu2").clearQueue();
								$(".m2_ul").clearQueue();
								$("#menu2").animate({height:size_h_open},"fast",function(){$(".m2_ul").animate({opacity:1},"fast");});
							});
							$("#menu2").mouseleave(function() {
								$("#menu2").stop();
								$(".m2_ul").stop();
								$("#menu2").clearQueue();
								$(".m2_ul").clearQueue();
								$(".m2_ul").animate({opacity:0},"fast",function(){$("#menu2").animate({height:"40px"},"fast");});
							});
						
					// 카피라이트
						copyright_position = setInterval("copyright_position_reset()",100);

					// 퀵메뉴
													$(window).scroll(function(){
								if($(window).scrollTop()>parseInt($("#top").css("height"))+40)
								{
									var move_px = parseInt($(window).scrollTop()) - parseInt($("#top").css("height")) - 40;
									$("#quick_left_area").stop().clearQueue().animate({top:move_px});
									$("#quick_right_area").stop().clearQueue().animate({top:move_px});
								}
								else
								{
									$("#quick_left_area").stop().clearQueue().animate({top:0});
									$("#quick_right_area").stop().clearQueue().animate({top:0});
								}
							});
										});
			//]]>
		</script>
	</head>
<body>
	<div class="se2_outputarea" style="text-align:justify;"><table class="__se_tbl" style="border-width: 1px 1px 0px 0px; border-style: solid solid none none; border-color: rgb(204, 204, 204) rgb(204, 204, 204) currentColor currentColor; border-image: none;" border="0" cellspacing="0" cellpadding="0"><tbody>
<tr><td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 81px; height: 482px; background-color: rgb(201, 224, 240);" rowspan="9" colspan="1"><p>&nbsp;교육계획</p></td>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 59px; height: 34px; background-color: rgb(255, 255, 255);"><p align="center">&nbsp;회차</p></td>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 96px; height: 34px; background-color: rgb(255, 255, 255);"><p align="center">&nbsp;교육시간</p></td>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 762px; height: 34px; background-color: rgb(255, 255, 255);"><p align="center" style="text-align: center;">&nbsp;내 용</p></td>
</tr>
<tr>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 59px; height: 57px; background-color: rgb(255, 255, 255);"><p align="center">&nbsp;1</p></td>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 96px; height: 57px; background-color: rgb(255, 255, 255);"><p align="center">&nbsp;3시간</p></td>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 762px; height: 57px; background-color: rgb(255, 255, 255);"><p>&nbsp;컴퓨터 입문<br>(컴퓨터 켜기, 컴퓨터 끄기, 키보드 익히기, 마우스 사용법)</p></td>
</tr>
<tr>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 59px; height: 57px; background-color: rgb(255, 255, 255);"><p align="center">&nbsp;2</p></td>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 96px; height: 57px; background-color: rgb(255, 255, 255);"><p align="center">&nbsp;3시간</p></td>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 762px; height: 57px; background-color: rgb(255, 255, 255);"><p>&nbsp;한글 윈도우 XP<br>(키보드 연습, WIN창, 바로가기 아이콘 만들기)</p></td>
</tr>
<tr>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 59px; height: 60px; background-color: rgb(255, 255, 255);"><p align="center">&nbsp;3</p></td>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 96px; height: 60px; background-color: rgb(255, 255, 255);"><p align="center">&nbsp;3시간</p></td>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 762px; height: 60px; background-color: rgb(255, 255, 255);"><p>&nbsp;한글 윈도우 XP<br>(키보드 연습, WIN창, 바로가기 아이콘 만들기)</p></td>
</tr>
<tr>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 59px; height: 56px; background-color: rgb(255, 255, 255);"><p align="center">&nbsp;4</p></td>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 96px; height: 56px; background-color: rgb(255, 255, 255);"><p align="center">&nbsp;3시간</p></td>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 762px; height: 56px; background-color: rgb(255, 255, 255);"><p>&nbsp;인터넷 기초<br>(인터넷 개요, 용어설명 시작페이지 등록하기)</p></td>
</tr>
<tr>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 59px; height: 59px; background-color: rgb(255, 255, 255);"><p align="center">&nbsp;5</p></td>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 96px; height: 59px; background-color: rgb(255, 255, 255);"><p align="center">&nbsp;3시간</p></td>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 762px; height: 59px; background-color: rgb(255, 255, 255);"><p>&nbsp;인터넷 기초<br>즐겨찾기, 이미지 바탕화면 꾸미기, 인터넷 그림파일 저장</p></td>
</tr>
<tr>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 59px; height: 54px; background-color: rgb(255, 255, 255);"><p align="center">&nbsp;6</p></td>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 96px; height: 54px; background-color: rgb(255, 255, 255);"><p align="center">&nbsp;3시간</p></td>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 762px; height: 54px; background-color: rgb(255, 255, 255);"><p>&nbsp;네비게이션 지하철노선, 버스노선, 이메일 가입하기</p></td>
</tr>
<tr>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 59px; height: 53px; background-color: rgb(255, 255, 255);"><p align="center">&nbsp;7</p></td>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 96px; height: 53px; background-color: rgb(255, 255, 255);"><p align="center">&nbsp;3시간</p></td>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 762px; height: 53px; background-color: rgb(255, 255, 255);"><p>&nbsp;전자우편 및 활용<br>주소형식, 메일보내기, 메일읽기, 주소록 활용</p></td>
</tr>
<tr>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 59px; height: 44px; background-color: rgb(255, 255, 255);"><p align="center">&nbsp;8</p></td>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 96px; height: 44px; background-color: rgb(255, 255, 255);"><p align="center" style="text-align: center;">&nbsp;3시간</p></td>
<td style="border-width: 0px 0px 1px 1px; border-style: none none solid solid; border-color: currentColor currentColor rgb(204, 204, 204) rgb(204, 204, 204); border-image: none; width: 762px; height: 44px; background-color: rgb(255, 255, 255);"><p>&nbsp;전자우편 및 활용<br>편지지 사용하기, 첨부파일 열어보기 보내기등</p></td>
</tr>
</tbody>
</table><br></div>
</body>
</html>