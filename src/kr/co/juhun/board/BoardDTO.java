package kr.co.juhun.board;

import java.io.Serializable;

public class BoardDTO implements Serializable {
	protected int no;
     protected String title;
     protected String author;
     protected String content;
     protected String nal;
     protected int readcount;
	public BoardDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardDTO(int no, String title, String author, String content, String nal, int readcount) {
		super();
		this.no = no;
		this.title = title;
		this.author = author;
		this.content = content;
		this.nal = nal;
		this.readcount = readcount;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getNal() {
		return nal;
	}
	public void setNal(String nal) {
		this.nal = nal;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	@Override
	public String toString() {
		return "BoardDTO [no=" + no + ", title=" + title + ", author=" + author + ", content=" + content + ", nal="
				+ nal + ", readcount=" + readcount + "]";
	}
	
     
	
     
}
