package com.tns.day7;

public class Employee extends Manager{
	private String EName;
	private int Eid;
	private String field;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String eName, int eid, String field) {
		super();
		EName = eName;
		Eid = eid;
		this.field = field;
	}
	public String getEName() {
		return EName;
	}
	public void setEName(String eName) {
		EName = eName;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	@Override
	public String toString() {
		return "Employee [EName=" + EName + ", Eid=" + Eid + ", field=" + field + "]";
	}
	
	
}
