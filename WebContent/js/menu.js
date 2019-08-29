$(function(){
	$('#menu a').css('marginLeft','-85px');
	 $('#menu > li').hover(
			 function(){
				 $('a',$(this)).stop().animate({'marginLeft':'-1px'},300);
			 },
			 function(){
				 $('a',$(this)).stop().animate({'marginLeft':'-85px'},300); 
			 }
			 );
});  