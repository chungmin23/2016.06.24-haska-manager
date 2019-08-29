package kr.co.juhun.board;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.juhun.memb.MemberDAO;
import kr.co.juhun.memb.MemberDTO;


@WebServlet("*.do")
public class BoardFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected BoardDAO boardDAO;	
	protected int cnt;
	protected ResultSet rs;
	protected int readcount;
	protected ArrayList<BoardDTO> boardList;
	protected MemberDAO memberDAO;
	protected ArrayList<MemberDTO> memberList;
	protected String iddb;
	protected String nickdb;
	protected String emaildb;
	
	

	public BoardFrontController() {
		boardDAO = new BoardDAO();
		boardList = new ArrayList<BoardDTO>();
		memberDAO = new MemberDAO();
		memberList = new ArrayList<MemberDTO>();		
	}
	
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void searchDisp(int cnt, String title, String author, String content, String nal, int readcount,
			HttpServletResponse response) throws Exception {
		PrintWriter out = response.getWriter();
		
		out.print("<style>");
		out.print("a {text-decoration:none}");				
		out.print("</style>");
		out.print("<table border='1' cellspacing='0' cellpadding='0'>");
		out.print("<tr>");
		out.print("<td>");out.print("번호");out.print("</td>");
		out.print("<td>");out.print("제목");out.print("</td>");
		out.print("<td>");out.print("작성자");out.print("</td>");
		out.print("<td>");out.print("내용");out.print("</td>");
		out.print("<td>");out.print("날짜");out.print("</td>");
		out.print("<td>");out.print("조회수");out.print("</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>");out.print(cnt);out.print("</td>");			
		out.print("<td>");out.print(title);out.print("</td>");
		out.print("<td>");out.print(author);out.print("</td>");
		out.print("<td>");out.print(content);out.print("</td>");
		out.print("<td>");out.print(nal);out.print("</td>");
		out.print("<td>");out.print(readcount);out.print("</td>");
		out.print("</tr>");
		out.print("</table>");
	}
	public void listDisp(HttpServletResponse response,ArrayList<BoardDTO> boardList) throws Exception {
		PrintWriter out = response.getWriter();
		out.print("<table border='1' cellspacing='0' cellpadding='0'>");
		out.print("<tr>");
		out.print("<td class='no' style='color: red'>");out.print("번호");out.print("</td>");
		out.print("<td class='title' style='color: red'>");out.print("제목");out.print("</a></td>");
		out.print("<td class='content' style='color: red'>");out.print("내용");out.print("</td>");
		out.print("<td class='name' style='color: red'>");out.print("작성자");out.print("</td>");
		out.print("<td class='date' style='color: red'>");out.print("날짜");out.print("</td>");
		out.print("<td class='readcount' style='color: red'>");out.print("조회수");out.print("</td>");
		out.print("</tr>");
		for(int indexI=0;indexI<boardList.size();indexI++){
			BoardDTO boardDTO = boardList.get(indexI);
			out.print("<tr>");
			out.print("<td class='no'>");out.print(boardDTO.getNo());out.print("</td>");
			out.print("<td class='title'>");out.print(boardDTO.getTitle());out.print("</td>");
			out.print("<td class='content'>");out.print(boardDTO.getContent());out.print("</td>");
			out.print("<td class='name'>");out.print(boardDTO.getAuthor());out.print("</td>");
			out.print("<td class='date'>");out.print(boardDTO.getNal());out.print("</td>");
			out.print("<td class='readcount'>");out.print(boardDTO.getReadcount());out.print("</td>");
			out.print("</tr>");
		}
		out.print("</table>");
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String protocol = requestURI.substring(contextPath.length());
		out.print("<style>");
		out.print("a{text-decoration: none;}");
		out.print("</style>");
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String content = request.getParameter("content");
		String nal = request.getParameter("nal");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String pwch = request.getParameter("pwch");
		String irum = request.getParameter("irum");
		String nickname =request.getParameter("nickname");
		String email =request.getParameter("email");
		String emailcheck =request.getParameter("emailcheck");
		String smscheck =request.getParameter("smscheck");
	    
		
		
		out.print("<style>");
		out.print("a {text-decoration:none}");
		out.print("table{border-left:0; border-right:0;}");
		out.print("td{border-top: 1px solid gray; border-left: 0; border-right:0; padding: 8px 0;}");
		out.print(".no{text-align:center; width:50px;}");
		out.print(".readcount{text-align:center; width:50px;}");
		out.print(".title{width:500px; padding-left:10px;}");
		out.print(".name{text-align:center; padding-left:5px; padding-right:5px}");
		out.print(".content{width:300px; padding-left:10px;}");
		out.print(".date{text-align:center; width:150px;}");
		out.print("form{margin-bottom:0;}");				
		out.print("</style>");

		if (protocol.equals("/write.do")) {
			// 글쓰기화면
			out.println("<h1>학사관리커뮤니티</h1>");

			cnt = boardDAO.insert(title, author, content, nal, 0);
			out.print(cnt + "건 게시물이 저장됨");
			response.sendRedirect("list.do");
		} else if (protocol.equals("/list.do")) {
			// 전체출력화면
			try {
				out.print("<img src='img/juhun.png'>");
				out.print("<h1>학사관리커뮤니티</h1><br>");
				boardList=boardDAO.list();
				listDisp(response,boardList);
				
				
				
		        out.print("<form action='write.jsp'>");
				out.print("<input type='image' src='img/submit.jpg' style='width:150px; float:left;'></input>");
				out.print("</form>");
				out.print("<form action='search.html'>");
				out.print("<input type='image' src='img/btn_search.png' style='float:left;'></input>");
				out.print("</form>");
				out.print("<form action='delete.html'>");
				out.print("<input type='image' src='img/delete.jpg' style='width:150px;float:left;'></input>");
				out.print("</form>");
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (protocol.equals("/search.do")) {
			// 검색화면
			out.print("<h1>학사관리커뮤니티</h1>");
			rs = boardDAO.search(title);

			try {
				while (rs.next()) {
					cnt = rs.getInt("no");
					title = rs.getString("title");
					author = rs.getString("author");
					content = rs.getString("content");
					nal = rs.getString("nal");
					readcount = rs.getInt("readcount");
					readcount++;
				}
				searchDisp(cnt, title, author, content, nal, readcount, response);
				out.print("<a href=edit.jsp?no="+cnt+">수정</a>");
				out.print("<a href='list.do'>목록</a>");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (protocol.equals("/delete.do")) {
			// 삭제화면
			out.print("<h1>학사관리커뮤니티</h1><br>");
            cnt=boardDAO.delete(title);
            out.print(cnt+"건 게시물이 삭제됨...");
            out.print("<a href='list.do'>목록</a>");
            out.print("<a href='write.jsp'>글쓰기</a>");
            
		} else if (protocol.equals("/edit.do")) {
			// 수정화면
			out.print("<h1>학사관리커뮤니티</h1><br>");
			readcount++;
			cnt= boardDAO.edit(author, title, content, cnt, nal, readcount);			
			out.print(cnt+"건 게시물이 수정됨...");
			out.print("<a href='list.do'>목록</a>");
			out.print("<a href='write.jsp'>글쓰기</a>");
			
		 }else if(protocol.equals("/memberinsert.do")){
				out.print("멤버저장서블릿<br>");					
				out.print("<a href='index.jsp'><img src='img/juhun.png'></a>");
				cnt = memberDAO.insert(id, pw, pwch, irum, nickname, email, emailcheck, smscheck);
			    out.print(irum+"님이 회원가입이 되었습니다...");//ex 누구님이 회원가입 가입되었습니다		    
		 } else if(protocol.equals("/idcheck.do")){
		 	out.print("id중복체크");
		 	out.println("<img src='img/juhun.png'>");
		 	String idtest=request.getParameter("id");//db비교
		 	rs=memberDAO.memberidcheck(idtest);
		 	iddb=null;
		 	try {
				while(rs.next()){
					 iddb=rs.getString("id");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		 	if(iddb==null){
		 		out.print(idtest+"사용가능한아이디입니다");
		 	}else{
		 		out.print(iddb+"중복된 아이디입니다");
		 	}
		 
	  } else if(protocol.equals("/nickcheck.do")){
		out.print("닉네임중복체크");
		out.println("<img src='img/juhun.png'>");
		String nicktest=request.getParameter("nickname");//db비교
		rs=memberDAO.membernickcheck(nicktest);
		nickdb=null;
		try {
			while(rs.next()){
				nickdb=rs.getString("nickname");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(nickdb==null){
			out.print(nicktest+"사용가능한닉네임입니다");
		}else{
			out.print(nickdb+"중복된 닉네임입니다");
		}
	} 
	   else if(protocol.equals("/emailcheck.do")){
		out.print("이메일중복체크");
		out.println("<img src='img/juhun.png'>");
		String emailtest=request.getParameter("email");//db비교
		rs=memberDAO.memberemailcheck(emailtest);
		emaildb=null;
		try {
			while(rs.next()){
				emaildb=rs.getString("email");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(emaildb==null){
			out.print(emailtest+"사용가능한이메일입니다");
		}else{
			out.print(emaildb+"중복된이메일입니다");
		}
	} 
		
	  
			
	}
	

}
