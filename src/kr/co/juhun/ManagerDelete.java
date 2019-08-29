package kr.co.juhun;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/managerDelete")
public class ManagerDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected String nameDelete;
	protected String sql;
	protected int cnt;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void managerDeletesql(){
		sql="delete from manager where name ='"+nameDelete+"'";
	}
	
	protected int managerDeleteExecter()throws Exception{
		 cnt=StudentServlet.stmt.executeUpdate(sql);
		return cnt;
	}
	
	protected void managerDeleteDisp(){
		StudentServlet.out.print("<h1>관리자삭제</h1>");
		StudentServlet.out.print(cnt+"건 관리자삭제됨");
		StudentServlet.out.print("<br><a href='index.jsp'>메인페이지</a>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		   response.setContentType("text/html;charset=utf-8");
		   StudentServlet.out=response.getWriter();
		   nameDelete =request.getParameter("irum");
		   if(StudentServlet.conn==null){
				StudentServlet.out.println("연결실패");
			}else{
				StudentServlet.out.println("연결성공");
				try {
					StudentServlet.studentStmt();
					 managerDeletesql();
					 cnt =  managerDeleteExecter();
					 managerDeleteDisp();
					 
				} catch (Exception e) {
					e.printStackTrace();
				}
		}

		}
	}


