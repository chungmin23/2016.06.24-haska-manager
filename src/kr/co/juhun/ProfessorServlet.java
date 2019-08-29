package kr.co.juhun;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
   

@WebServlet("/professor")
public class ProfessorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected int age1;
	protected String age;
	protected String sql;//문장준비(1) -3
	protected int cnt;
	
	
		
	public void professorSql(String name,String subject){//문장준비(2) 
		sql = "insert into subject(age,name,subject,gubuncode) values("+age1+",'"+name+"','"+subject+"',2)";
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   doPost(request,response);
	}
	
	public void professorProcess(String age){//형변환 -4
		age1=Integer.parseInt(age);
	}
	protected int professorExecter()throws Exception{//실행 -6
		 cnt=StudentServlet.stmt.executeUpdate(sql);//스튜던트 서블릿에서 받아옴
		return cnt;
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		StudentServlet.out=response.getWriter();
		age = request.getParameter("age");
		String irum =request.getParameter("irum");
		String subject = request.getParameter("subject");
		StudentServlet.out.print("나이"+age);
		StudentServlet.out.print("이름"+irum);
		StudentServlet.out.print("과목"+subject);
		if(StudentServlet.conn==null){//스튜던트 서블릿에서 가져와서 연결 확인 -1
			StudentServlet.out.println("연결실패");
		}else{
			StudentServlet.out.println("연결성공");
			try {
				StudentServlet.studentStmt();//공간준비 -2 
				professorProcess(age);//형변환
				professorSql(irum,subject);//쿼리 실행 -5
				cnt=professorExecter();//실행
				StudentServlet.out.print(cnt+"건 교수님저장..");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
