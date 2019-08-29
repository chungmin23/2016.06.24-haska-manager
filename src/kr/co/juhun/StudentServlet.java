package kr.co.juhun;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected int age1;
	protected String age;
	protected static String driver;
	protected static String url;
	protected static String id;
	protected static String pw;
	protected static PrintWriter out;
	protected static Connection conn;
	protected static Statement stmt;
	protected String sql;
	protected int cnt;
	static{
		driver="com.mysql.jdbc.Driver";
		url="jdbc:mysql://localhost/ho5854";
		id="ho5854";
		pw="jhc2788-*";
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,id,pw);
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void studentProcess(){
		age1=Integer.parseInt(age);
	}
	
	protected int studentExecter()throws Exception{
		 cnt=stmt.executeUpdate(sql);
		return cnt;
	}
	public void studentSql(String name,String hakbun){
		sql = "insert into student(age,name,hakbun,gubuncode) values("+age1+",'"+name+"','"+hakbun+"',1)";
	}
    protected static void studentStmt() throws Exception{//공간준비
    	stmt = conn.createStatement();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		out=response.getWriter();
		age = request.getParameter("age");
		String irum =request.getParameter("irum");
		String hakbun = request.getParameter("hakbun");
		out.print("나이"+age);
		out.print("이름"+irum);
		out.print("학번"+hakbun);
		studentProcess();
		if(conn==null){
			out.print("연결실패");
		}else{
			try {
				out.print("연결성공");
				studentStmt();
				studentSql(irum,hakbun);
				cnt=studentExecter();
				out.print(cnt+"건 학생이 저장됨..");
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
