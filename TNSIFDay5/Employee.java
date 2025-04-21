package TNSIFDay5;

import java.util.Date;

// Assuming there's a class called Person
public class Employee extends person { // Employee should extend Person or the intended superclass

    private String companyName;
    private String Designation;

    public Employee() {
        System.out.println("Employee class default constructor");
    }

    public Employee(String name, String city, String companyName, String designation) {
        super(name, city); // Call to the superclass constructor
        this.companyName = companyName;
        this.Designation = designation; // Fixed the assignment
    }

    public Employee(String name, long contactNo, Date dateOfBirth, String deptName, double baseSalary) {
		// TODO Auto-generated constructor stub
	}

	public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        this.Designation = designation;
    }

    @Override
    public String toString() {
        return "Employee [companyName=" + companyName + ", Designation=" + Designation + "]";
    }
}
