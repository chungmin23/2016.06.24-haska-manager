package kr.co.juhun.memb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class MemberDAO {
	protected Connection conn;
	protected PreparedStatement pstmt;
	protected int cnt;
	protected DataSource dataFactory;
	protected String sql;
	protected ArrayList<MemberDTO> memberList;
	protected ResultSet rs;
	
	public MemberDAO() {
		try {
			Context ctx = new InitialContext(); //초기화
			dataFactory = (DataSource) ctx.lookup("java:comp/env/jdbc/ho5854");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public int insert(String id,String pw,String pwch,String irum,String nickname, String email,String emailcheck,String smscheck){
		try {
			conn = dataFactory.getConnection(); //연결
			sql = "insert into member(id,pw,pwch,irum,nickname,email,emailcheck,smscheck) values(?,?,?,?,?,?,?,?)";//sql문 작성
			pstmt=conn.prepareStatement(sql);//sql문 연결		
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, pwch);
			pstmt.setString(4, irum);
			pstmt.setString(5, nickname);
			pstmt.setString(6, email);
			pstmt.setString(7, emailcheck);
			pstmt.setString(8, smscheck);
			cnt=pstmt.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
	public ResultSet memberidcheck(String id){
		try {
			conn = dataFactory.getConnection();
			sql = "select id from member where id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	public ResultSet membernickcheck(String nicktest){
		try {
			conn = dataFactory.getConnection();
			sql = "select nickname from member where nickname=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, nicktest);
			rs=pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	public ResultSet memberemailcheck(String emailtest){
		try {
			conn = dataFactory.getConnection();
			sql = "select email from member where email=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emailtest);
			rs=pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	public ResultSet idpwCheck(String id,String pw){
		try {
			conn = dataFactory.getConnection();
			sql = "select id,pw from member where id=?";			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
   
}
