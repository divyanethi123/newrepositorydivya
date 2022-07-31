package streammethods;

public class Employee {
	private int eid;
	private String ename;
	private String department;
	public Employee(int eid, String ename, String department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.department = department;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	

}
