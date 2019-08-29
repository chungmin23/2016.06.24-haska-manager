package kr.co.juhun;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/professorList")
public class ProfessorList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected String sql;
	protected ResultSet rs;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void subjectListSql(){
		sql="select age,name,subject from subject";
		
	}
	protected ResultSet subjectListExecter()throws Exception{//resultset 전체적으로 할때
		 rs =StudentServlet.stmt.executeQuery(sql);
		return rs;
	}
	protected void subjectListDisp()throws Exception{
		StudentServlet.out.print("<h1>교수 전체출력</h1>");
		StudentServlet.out.print("<img src='img/juhun.png'>");
		StudentServlet.out.print("<fieldset>");
		StudentServlet.out.print("<legend>교수전체출력</legend>");
		StudentServlet.out.print("나이 이름 과목<br>");
		while(rs.next()){
			int age = rs.getInt("age");
			String name = rs.getString("name");
			String subject = rs.getString("subject");
			StudentServlet.out.print(age+"&nbsp;"+name+"&nbsp;"+subject+"<br>");
		}
		StudentServlet.out.print("</fieldset>");
		StudentServlet.out.print("<br><a href='index.jsp'>메인페이지</a>");
	}
	

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		StudentServlet.out=response.getWriter();
		if(StudentServlet.conn==null){
			StudentServlet.out.print("연결실패");
		}else {
			try {
				
				StudentServlet.out.print("<script src='js/jquery.js'></script>");
				StudentServlet.out.print("<script src='js/jquery.innerfade.js'></script>");
				StudentServlet.studentStmt();
				subjectListSql();
				rs=subjectListExecter();
				subjectListDisp();
				
				StudentServlet.out.print("<ul id='news'>");
				StudentServlet.out.print("<li>");
				StudentServlet.out.print("<a href='index.jsp'>고객상담전화02-449-3527</a>");
				StudentServlet.out.print("</li>");
				StudentServlet.out.print("<li>");
				StudentServlet.out.print("<a href='index.jsp'>상호 : 주현컴퓨터 학원</a>");
				StudentServlet.out.print("</li>");
				StudentServlet.out.print("<li>");
				StudentServlet.out.print("<a href='index.jsp'>대표 : 민호순</a>");
				StudentServlet.out.print("</li>");
				StudentServlet.out.print("<li>");
				StudentServlet.out.print("<a href='index.jsp'>사업자 등록번호: 215-92-3114</a>");
				StudentServlet.out.print("</li>");
				StudentServlet.out.print("<li>");
				StudentServlet.out.print("<a href='index.jsp'>주소 : 서울특별시 송파구 새말로 167(문정동 이주빌딩 3층) </a>");
				StudentServlet.out.print("</li>");
				StudentServlet.out.print("<li>");
				StudentServlet.out.print("<a href='index.jsp'>평일 AM:09~00 ~ PM:19:00 </a>");
				StudentServlet.out.print("</li>");
				StudentServlet.out.print("<li>");
				StudentServlet.out.print("<a href='index.jsp'>토요일 AM:09~00 ~ PM:16:00 </a>");
				StudentServlet.out.print("</li>");
				StudentServlet.out.print("<li>");
				StudentServlet.out.print("<a href='index.jsp'>공휴일 일요일 휴무</a>");
				StudentServlet.out.print("</li>");
				StudentServlet.out.print("</ul>");
				
				StudentServlet.out.print("<script>");
				StudentServlet.out.print("$('#news').innerfade({");
				StudentServlet.out.print("	animationtype: 'slide',");
				StudentServlet.out.print("	speed: 750,");
				StudentServlet.out.print("	timeout: 2000,");
				StudentServlet.out.print("	type: 'sequence',");
				StudentServlet.out.print("	containerheight: '1em'});");
				StudentServlet.out.print("</script>");
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
