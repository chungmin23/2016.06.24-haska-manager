package kr.co.juhun;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/professorDelete")
public class ProfessorDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected String nameDelete;
	protected String sql;
	protected int cnt;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doPost(request, response);
	}
	
	protected void ProfessorDeletesql(){
		sql="delete from subject where name ='"+nameDelete+"'";
	}
	
	protected int ProfessorDeleteExecter()throws Exception{
		 cnt=StudentServlet.stmt.executeUpdate(sql);
		return cnt;
	}
	
	protected void ProfessorDeleteDisp(){
		StudentServlet.out.print("<h1>교수삭제</h1>");
		StudentServlet.out.print(cnt+"건 교수삭제됨");
		StudentServlet.out.print("<br><a href='index.jsp'>메인페이지</a>");
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
		   response.setContentType("text/html;charset=utf-8");
		   StudentServlet.out=response.getWriter();
		   nameDelete =request.getParameter("irum");
		   if(StudentServlet.conn==null){//스튜던트 서블릿에서 가져와서 연결 확인 -1
				StudentServlet.out.println("연결실패");
			}else{
				StudentServlet.out.println("연결성공");
				try {
					StudentServlet.studentStmt();
					ProfessorDeletesql();
					cnt = ProfessorDeleteExecter();
					ProfessorDeleteDisp();
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		}

}
