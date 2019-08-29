package kr.co.juhun.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.xml.datatype.DatatypeFactory;

public class BoardDAO {
	protected Connection conn;
	protected PreparedStatement pstmt;
	protected int cnt;
	protected DataSource dataFactory;
	protected String sql;
	protected ArrayList<BoardDTO> boardList;
	protected ResultSet rs;

	public BoardDAO(){
		try {
			Context ctx = new InitialContext();
			dataFactory = (DataSource) ctx.lookup("java:comp/env/jdbc/ho5854");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	public int edit(String author,String title,String content,int cnt, String nal,int readcount){
		try {
			conn = dataFactory.getConnection();
			sql="update board set author=?,title=?,content=?,nal=?,readcount=? where no=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, author);
			pstmt.setString(2, title);
			pstmt.setString(3, content);
			pstmt.setString(4, nal);
			pstmt.setInt(5, readcount);
			pstmt.setInt(6, cnt);
			cnt=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
	public int delete(String title){
		try {
			conn = dataFactory.getConnection();
			sql = "delete from board where title=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			cnt=pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}
	public int insert(String title,String author,String content,String nal,int readcount){
		try {
			conn = dataFactory.getConnection(); //연결
			sql = "insert into board(title,author,content,nal,readcount) values(?,?,?,?,?)";//sql문 작성
			pstmt=conn.prepareStatement(sql);//sql문 연결		
			pstmt.setString(1, title);
			pstmt.setString(2, author);
			pstmt.setString(3, content);
			pstmt.setString(4, nal);
			pstmt.setInt(5, readcount);
			cnt=pstmt.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
	 public ResultSet search(String title){
		 try {
			conn = dataFactory.getConnection();
			sql="select no,title,author,content,nal,readcount from board where title=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			rs=pstmt.executeQuery();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 return rs;
	 }
	 public ArrayList<BoardDTO> list(){
			ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
			
			try {
				conn = dataFactory.getConnection(); //Connection 얻기
				sql = "select no,title,author,content,nal,readcount from board";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					int no = cnt = rs.getInt("no");
					String title = rs.getString("title");
					String author= rs.getString("author");
					String content = rs.getString("content");
					String nal =rs.getString("nal");
					int readcount =rs.getInt("readcount");
					BoardDTO boardDTO = new BoardDTO(no,title,author,content,nal,readcount);
					list.add(boardDTO);
				}//end while
			} catch (SQLException e) {
				e.printStackTrace();
			} finally{
				try {
					if(rs!=null) rs.close();
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();//Connection 반환
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}//end finally
			return list;
		}//end select
	
	}
	
	
	
	
	


