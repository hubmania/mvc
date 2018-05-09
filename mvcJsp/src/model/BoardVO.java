package model;

import java.util.ArrayList;
import java.util.Date;

public class BoardVO {
	Integer id, gid, seq, lev, cnt;
	Date reg_date;
	String pname, pw, title, content, upfile;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public Integer getSeq() {
		return seq;
	}
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	public Integer getLev() {
		return lev;
	}
	public void setLev(Integer lev) {
		this.lev = lev;
	}
	public Integer getCnt() {
		return cnt;
	}
	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUpfile() {
		if(upfile==null)
			upfile = "";
		return upfile;
	}
	public void setUpfile(String upfile) {
		this.upfile = upfile;
	}
	public boolean isImg()
	{
		if(upfile==null || upfile.equals(""))
			return false;
		
		ArrayList<String> imgs = new ArrayList<>();
		imgs.add("jpg");
		imgs.add("jpeg");
		imgs.add("gif");
		imgs.add("png");
		imgs.add("bmp");
		
		String exp = upfile.substring(upfile.lastIndexOf(".")+1).toLowerCase();
		return imgs.contains(exp);
	}

	/*@Override
	public String toString() {
		return "BoardVO [id=" + id + ", gid=" + gid + ", seq=" + seq + ", lev=" + lev + ", cnt=" + cnt + ", reg_date="
				+ reg_date + ", pname=" + pname + ", pw=" + pw + ", title=" + title + ", content=" + content
				+ ", upfile=" + upfile + "]";
	} */
	
}
