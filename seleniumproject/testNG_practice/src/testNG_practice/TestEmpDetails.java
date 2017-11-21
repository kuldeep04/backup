package testNG_practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmpDetails {
	EmpBusinessLogic empbusiness = new EmpBusinessLogic();
	EmployeeDetails employee = new EmployeeDetails();

	@Test
	public void testcalaculateappriasal() {
		employee.setname("Kuldeep");
		employee.setage(26);
		employee.setmonthlysalary(8000);
		double appriasal = empbusiness.calculateapprasial(employee);
		System.out.println(appriasal);
		Assert.assertEquals(1000, appriasal, 0.0, "1000");
	}

	@Test
	public void testyearlycalculatesalary() {
		employee.setname("Kuldeep");
		employee.setage(26);
		employee.setmonthlysalary(8000);
		double yearlysalary = empbusiness.calculateyearlysalary(employee);
		System.out.println(yearlysalary);
	}
}
