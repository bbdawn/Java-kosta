package step3;

public class Employee {//������ ��Ӱ��谡 ������ extends Object ó�� 
	private String empNo;
	private String name;
	private int salary;
	public Employee(String empNo, String name, int salary) {
		super();// java.lang.Object �� ������ ȣ���ؼ� Object ��ü ����
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}