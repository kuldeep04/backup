package testNG_practice;

public class EmpBusinessLogic {

	// calculate yearly salary
	public double calculateyearlysalary(EmployeeDetails employeeDetails) {
		double yearlysalary = 0;
		yearlysalary = employeeDetails.getmonthlysalary() * 12;
		return yearlysalary;
	}
	// calculate appraisal

	public double calculateapprasial(EmployeeDetails employeeDetails) {
		double apprasial = 0;
		if (employeeDetails.getmonthlysalary() < 1000) {
			apprasial = 500;
		} else {
			apprasial = 1000;
		}
		return apprasial;
	}
}
