package org.emp;

public class Employee 
{
	private void empId(int empID, String Name) 
	{
		System.out.println("EmpID"+" "+empID+"\n"+"EmpName"+" "+Name);

	}
	private void empId(String dob, char block) 
	{
		System.out.println("DOB"+" "+dob+"\n"+"Block"+" "+block);

	}
	private void empId(String email, double salary, long rating) 
	{
		System.out.println("Email"+" "+email+"\n"+"Salary"+" "+salary+"\n"+"Rating"+" "+rating);

	}
	public static void main(String[] args) {
		Employee d=new Employee();
		d.empId(2345, "Archana");
		d.empId("17.01.1995", 'A');
		d.empId("archana@gmail.com", 3.5, 2l);
	}

}
