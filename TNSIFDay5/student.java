package TNSIFDay5;

public class student extends person { // Added extends Person

    private String studentClass; // Renamed from clas
    private float per;

    public student() {
        System.out.println("Student class default constructor");
        studentClass = "Last Year";
        per = 80;
    }

    public student(String studentClass, float per) {
        this.studentClass = studentClass;
        this.per = per;
    }

    public student(String name, String city, String studentClass, float per) {
        super(name, city); // super() must be the first statement
        this.studentClass = studentClass;
        this.per = per;
    }

    public String getStudentClass() { // Updated getter method name
        return studentClass;
    }

    public void setStudentClass(String studentClass) { // Updated setter method name
        this.studentClass = studentClass;
    }

    public float getPer() {
        return per;
    }

    public void setPer(float per) {
        this.per = per;
    }

    @Override
    public String toString() {
        return "Student [studentClass=" + studentClass + ", per=" + per + ", getName()=" + getName()
                + ", getCity()=" + getCity() + ", toString()=" + super.toString() + "]";
    }
}
