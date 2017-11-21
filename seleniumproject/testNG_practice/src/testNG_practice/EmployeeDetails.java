package testNG_practice;

public class EmployeeDetails {

	private String name;
	private double employeesalary;
	private int age;

	// @return the name
	public String getname() {
		return name;
	}

	// @set name
	public void setname(String name) {
		this.name = name;

	}

	// @retun monthlysalary
	public double getmonthlysalary() {
		return employeesalary;
	}

	// @Set monthly salary
	public void setmonthlysalary(double employeesalary) {
		this.employeesalary = employeesalary;
	}

	// @return age
	public int age() {
		return age;
	}

	// @set age
	public void setage(int age) {
		this.age = age;
	}
}
