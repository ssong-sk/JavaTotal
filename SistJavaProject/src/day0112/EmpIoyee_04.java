package day0112;

public class EmpIoyee_04 {

	String empName; // 사원명
	int salary; // 급여

	public EmpIoyee_04(String name, int sal) {
		this.empName = name;
		this.salary = sal;
	}

	// 메서드
	public String getEmployee() {
		return empName + "," + salary;
	}

}
