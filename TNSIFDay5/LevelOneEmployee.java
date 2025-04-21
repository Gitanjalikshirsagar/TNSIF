package TNSIFDay5;

import java.util.Date; // Fixed import

public class LevelOneEmployee extends Employee { // Added extends Employee

    private int noOfShares;
    private String authority;

    public LevelOneEmployee(String name, long contactNo, Date dateOfBirth, String deptName, double baseSalary, int noOfShares, String authority) {
        super(name, contactNo, dateOfBirth, deptName, baseSalary); // Ensure Employee class has this constructor
        this.noOfShares = noOfShares;
        this.authority = authority;
    }

    public int getNoOfShares() {
        return noOfShares;
    }

    public void setNoOfShares(int noOfShares) {
        this.noOfShares = noOfShares;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "LevelOneEmployee [noOfShares=" + noOfShares + ", authority=" + authority + ", getDeptName()="
                + getDeptName() + ", getBaseSalary()=" + getBaseSalary() + ", getName()=" + getName()
                + ", getContactNo()=" + getContactNo() + ", getDateOfBirth()=" + getDateOfBirth() + "]";
    }

	private String getBaseSalary() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getDeptName() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getContactNo() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getDateOfBirth() {
		// TODO Auto-generated method stub
		return null;
	}
}
