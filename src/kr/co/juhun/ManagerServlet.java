package kr.co.juhun;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/manager")
public class ManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected int age1;
	protected String age;
	protected String sql;//문장준비(1) -3
	protected int cnt;
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doPost(request,response);
	}
	
	public void managerSql(String name,String part,int deptcode){//문장준비(2) 
		sql = "insert into manager(age,name,part,deptcode,gubuncode) values("+age1+",'"+name+"','"+part+"',"+deptcode+",3)";
	}
	public void managerProcess(String age){//형변환 -4
		age1=Integer.parseInt(age);
	}
	protected int managerExecter()throws Exception{
		 cnt=StudentServlet.stmt.executeUpdate(sql);
		return cnt;
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		StudentServlet.out=response.getWriter();
		age = request.getParameter("age");
		String name =request.getParameter("irum");
		String part = request.getParameter("part");
		managerProcess(age);
		StudentServlet.out.print("나이"+age);
		StudentServlet.out.print("이름"+name);
		StudentServlet.out.print("부서"+part); 
		int deptcode=0;
		if(part.equals("교무부")){
			   deptcode=1;
		   }else{
			   deptcode=2;
		   }
		if(StudentServlet.conn==null){//스튜던트 서블릿에서 가져와서 연결 확인 -1
			StudentServlet.out.println("연결실패");
		}else{
			StudentServlet.out.println("연결성공");
			try {
				StudentServlet.studentStmt();//공간준비 -2 	
				managerSql(name, part, deptcode);//쿼리 실행 -5
				cnt=managerExecter();//실행
				StudentServlet.out.print(cnt+"건 교수님저장..");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
