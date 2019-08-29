package kr.co.juhun.memb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    MemberDAO memberDAO;
    ResultSet rs;
    public LoginServlet(){
    	memberDAO = new MemberDAO();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String id = request.getParameter("id");
	    String pw= request.getParameter("pw");
	    PrintWriter out = response.getWriter();
	    out.print("아이디="+id+"<br>");
	    out.print("비밀번호="+pw+"<br>");
	    HttpSession session = request.getSession();
	    session.setAttribute("id", id);
	    session.setAttribute("pw", pw);
	    String dbid=null;
	    String dbpw=null;
	    rs=memberDAO.idpwCheck(id,pw);	    
	    try {
			while(rs.next()){
				dbid = rs.getString("id");
				dbpw = rs.getString("pw");
			}
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
	    if(id.equals(dbid)){
	    	out.print("아이디 같음");
	    	if(pw.equals(dbpw)){
	    		out.print("패스워드 같음");
	    		out.print("로그인 성공");
	    	}
	    	else{
	    	out.print("비밀번호가 틀림");
	    	session.invalidate();
	    	}
	    }else{
	    out.print("아이디가 틀림");
	    session.invalidate();
	    }
	    out.print("<br><a href='index.jsp'>메인페이지</a>");
	}
}
