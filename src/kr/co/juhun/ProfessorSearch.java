package kr.co.juhun;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/professorSearch")
public class ProfessorSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected String nameSearch;
	protected String sql;
	protected ResultSet rs;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
    
	protected void professorsearchSql(){
		sql="select age,name,subject from subject where name='"+nameSearch+"'";
		
	}
	protected ResultSet professorSearchExecter()throws Exception{//실행 -6
		 rs =StudentServlet.stmt.executeQuery(sql);//스튜던트 서블릿에서 받아옴
		return rs;
	}
	protected void professorSearchDisp()throws Exception{
		StudentServlet.out.print("<h1>교수검색 </h1>");
		StudentServlet.out.print("나이"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+"이름"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+"과목"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br>");
		while(rs.next()){
			int age=rs.getInt("age");
			String name=rs.getString("name");
			String subject=rs.getString("subject");
			StudentServlet.out.print(age+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
			StudentServlet.out.print(name+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
			StudentServlet.out.print(subject+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
		}
		StudentServlet.out.print("<br><a href='index.jsp'>메인페이지</a>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		nameSearch = request.getParameter("irum");
		StudentServlet.out=response.getWriter();
		if(StudentServlet.conn==null){
			StudentServlet.out.print("연결실패");
		}else {
			StudentServlet.out.println("연결성공");
			try {
				StudentServlet.studentStmt();
				professorsearchSql();
				rs = professorSearchExecter();
				professorSearchDisp();
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	
	}

}
