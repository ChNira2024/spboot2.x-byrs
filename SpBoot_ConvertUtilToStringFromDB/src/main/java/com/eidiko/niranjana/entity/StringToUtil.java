package com.eidiko.niranjana.entity;

public class StringToUtil {

	private Integer eid;
	private String ename;
	private String edob;
	private String edoj;
	private String edor;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdob() {
		return edob;
	}
	public void setEdob(String edob) {
		this.edob = edob;
	}
	public String getEdoj() {
		return edoj;
	}
	public void setEdoj(String edoj) {
		this.edoj = edoj;
	}
	public String getEdor() {
		return edor;
	}
	public void setEdor(String edor) {
		this.edor = edor;
	}
	@Override
	public String toString() {
		return "UtilTooString [eid=" + eid + ", ename=" + ename + ", edob=" + edob + ", edoj=" + edoj + ", edor=" + edor
				+ "]";
	}
	
}
