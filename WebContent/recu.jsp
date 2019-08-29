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
		<meta name="keywords" content="모집중인과정,주현컴퓨터학원,">
		<meta name="description" content="모집중인과정 - 주현컴퓨터학원">
		<title>모집중인과정 - 주현컴퓨터학원</title>
		<!-- <link rel="stylesheet" type="text/css" href="./css/google_webfont.css" /> -->
		<link rel="stylesheet" type="text/css" href="css/common.css">
		<link rel="stylesheet" type="text/css" href="css/pc.css">
		<link rel="stylesheet" type="text/css" href="css/member.css">
		<link rel="stylesheet" type="text/css" href="css/board.css">
		<link rel="stylesheet" type="text/css" href="css/form.css">
		<link rel="stylesheet" type="text/css" href="css/diary.css">
		<link rel="stylesheet" type="text/css" href="css/smart_editor2_out.css?">
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
		<script type="text/javascript" src="./js/js.js?uniq=1464935273"></script>
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
			<div id="content_area">
						

<div class="title_n_loc">
	<span class="loc">
		<a href="./main.php"><span class="loc1">홈</span></a>
					<a href="./main.php?m1=2" target="_self"><span class="loc2">모집과정</span></a>
			<span class="loc3">모집중인과정</span>
					</span>
	<h2><span class="title">모집중인과정</span></h2>
</div>


<div id="dp_board_pc_area"><script type="text/javascript">
	//<![CDATA[
		function all_check(mode)
		{
			for(k=0;k<10;k++)
			{
				var a = "bbb_" + k;
				if (document.getElementById(a) != null)
				{
					if(mode=="Y"){document.getElementById(a).checked=true;}else{document.getElementById(a).checked=false;}
				}
			}
		}
	//]]>
</script>


<div id="dp_board_pc_list_top_total_record">
	전체 : <span>3</span>
													<span class="board_part_date"></span>
										<span class="board_part_writer"></span>
						</div><div id="dp_board_pc_list_A_type">
	
	<ul>					<li class="first_line">
						
													<span class="no"><a href="/main.php?m1=2&amp;m2=16&amp;m3=&amp;board_mode=list&amp;board_no=&amp;board_search_keyword=&amp;board_page=1&amp;board_search_head_word=&amp;board_mode=view&amp;board_no=23"><img src="./img/board_icon_notice.png" alt="공지사항"></a></span>
						
						
						<span class="file">
														<img src="./img/icon_file_y.png" alt="첨부파일">						</span>

						<a href="/main.php?m1=2&amp;m2=16&amp;m3=&amp;board_mode=list&amp;board_no=&amp;board_search_keyword=&amp;board_page=1&amp;board_search_head_word=&amp;board_mode=view&amp;board_no=23">							<span class="title" style="width:685px;">

								
								<span class="hidden">제목 </span><span class="title2">[실업자] 문서작성&amp;문서관리(한글실무ITQ자격증) [모집중]</span>
															</span>
						</a>
													<span class="name">
								<span class="hidden">작성자 </span>
								관리자							</span>
																			<span class="date">
								<span class="hidden">작성일시 </span>
																	15.10.16															</span>
																	</li>
						<li class="default_line">
						
													<span class="no"><a href="/main.php?m1=2&amp;m2=16&amp;m3=&amp;board_mode=list&amp;board_no=&amp;board_search_keyword=&amp;board_page=1&amp;board_search_head_word=&amp;board_mode=view&amp;board_no=22"><img src="./img/board_icon_notice.png" alt="공지사항"></a></span>
						
						
						<span class="file">
														<span class="file_none"></span>						</span>

						<a href="/main.php?m1=2&amp;m2=16&amp;m3=&amp;board_mode=list&amp;board_no=&amp;board_search_keyword=&amp;board_page=1&amp;board_search_head_word=&amp;board_mode=view&amp;board_no=22">							<span class="title" style="width:685px;">

								
								<span class="hidden">제목 </span><span class="title2">[재직자] [실업자] 컴퓨터활용능력중급 과정(컴활2급) [모집중]</span>
															</span>
						</a>
													<span class="name">
								<span class="hidden">작성자 </span>
								관리자							</span>
																			<span class="date">
								<span class="hidden">작성일시 </span>
																	15.10.16															</span>
																	</li>
	</ul>
	<ul>	
					<li class="default_line">

						
															<a href="/main.php?m1=2&amp;m2=16&amp;m3=&amp;board_mode=list&amp;board_no=&amp;board_search_keyword=&amp;board_page=1&amp;board_search_head_word=&amp;board_mode=view&amp;board_no=23"><span class="no"><span class="hidden">글번호 </span>3</span></a>
							
							
							<span class="file">
																<img src="./img/icon_file_y.png" alt="첨부파일">							</span>

							
							<a href="/main.php?m1=2&amp;m2=16&amp;m3=&amp;board_mode=list&amp;board_no=&amp;board_search_keyword=&amp;board_page=1&amp;board_search_head_word=&amp;board_mode=view&amp;board_no=23">								<span class="title" style="width:685px;">
									
																		<span class="hidden">제목 </span><span class="title2">[실업자] 문서작성&amp;문서관리(한글실무ITQ자격증) [모집중]</span>
																	</span>

																	<span class="name">
										<span class="hidden">작성자 </span>
										관리자									</span>
																									<span class="date">
										<span class="hidden">작성일시 </span>
																					15.10.16																			</span>
																							</a>
					</li>
		
					<li class="default_line">

						
															<a href="/main.php?m1=2&amp;m2=16&amp;m3=&amp;board_mode=list&amp;board_no=&amp;board_search_keyword=&amp;board_page=1&amp;board_search_head_word=&amp;board_mode=view&amp;board_no=22"><span class="no"><span class="hidden">글번호 </span>2</span></a>
							
							
							<span class="file">
																<span class="file_none"></span>							</span>

							
							<a href="/main.php?m1=2&amp;m2=16&amp;m3=&amp;board_mode=list&amp;board_no=&amp;board_search_keyword=&amp;board_page=1&amp;board_search_head_word=&amp;board_mode=view&amp;board_no=22">								<span class="title" style="width:685px;">
									
																		<span class="hidden">제목 </span><span class="title2">[재직자] [실업자] 컴퓨터활용능력중급 과정(컴활2급) [모집중]</span>
																	</span>

																	<span class="name">
										<span class="hidden">작성자 </span>
										관리자									</span>
																									<span class="date">
										<span class="hidden">작성일시 </span>
																					15.10.16																			</span>
																							</a>
					</li>
		
					<li class="default_line">

						
															<a href="/main.php?m1=2&amp;m2=16&amp;m3=&amp;board_mode=list&amp;board_no=&amp;board_search_keyword=&amp;board_page=1&amp;board_search_head_word=&amp;board_mode=view&amp;board_no=21"><span class="no"><span class="hidden">글번호 </span>1</span></a>
							
							
							<span class="file">
																<span class="file_none"></span>							</span>

							
							<a href="/main.php?m1=2&amp;m2=16&amp;m3=&amp;board_mode=list&amp;board_no=&amp;board_search_keyword=&amp;board_page=1&amp;board_search_head_word=&amp;board_mode=view&amp;board_no=21">								<span class="title" style="width:685px;">
									
																		<span class="hidden">제목 </span><span class="title2">[국기과정 실업자] 스마트문화앱개발 [모집중]</span>
																	</span>

																	<span class="name">
										<span class="hidden">작성자 </span>
										관리자									</span>
																									<span class="date">
										<span class="hidden">작성일시 </span>
																					15.10.16																			</span>
																							</a>
					</li>
	</ul>
</div>

		<div id="dp_board_pc_list_bottom">

							<div id="dp_board_pc_list_bottom_paging"><div class="paging_design1"><span class="area"><span class="list_paging_n"></span><span class="list_paging_o">1</span><span class="list_paging_n"></span></span></div></div>
			
			
					</div>

	<div id="dp_board_pc_list_top_search">
		<div id="dp_board_pc_list_top_search_form">
			<form id="search_form" name="search_form" method="get" action="/main.php">
				<fieldset>
					<legend class="hidden">게시판 검색 대상 및 검색어 입력 폼</legend>
					<label for="dp_board_pc_list_top_search_keyword" class="hidden">검색키워드</label>
					<input type="text" id="dp_board_pc_list_top_search_keyword" name="board_search_keyword" value="">
					<button type="button" title="검색" id="dp_board_pc_list_top_search_submit" onclick="document.getElementById('search_form').submit();"><span class="hidden">검색</span></button>
					<input type="hidden" name="board_search_head_word" value="">
					<input type="hidden" name="m1" value="2"><input type="hidden" name="m2" value="16"><input type="hidden" name="m3" value="">				</fieldset>
			</form>
		</div>
	</div>
</div>					</div>
</body>
</html>