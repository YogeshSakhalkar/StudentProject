package net.codejava.ws;

public class Student {
   int Student_No;
  String Student_Name;
  String Student_DOB;
  String Student_DOJ;
  
  public Student(int student_No) {
	super();
	Student_No = student_No;
  }
  
  public Student(int student_No, String student_Name, String student_DOB, String student_DOJ) {
	super();
	Student_No = student_No;
	Student_Name = student_Name;
	Student_DOB = student_DOB;
	Student_DOJ = student_DOJ;
  }
	public int getStudent_No() {
		return Student_No;
	}
	public void setStudent_No(int student_No) {
		Student_No = student_No;
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	public String getStudent_DOB() {
		return Student_DOB;
	}
	public void setStudent_DOB(String student_DOB) {
		Student_DOB = student_DOB;
	}
	public String getStudent_DOJ() {
		return Student_DOJ;
	}
	public void setStudent_DOJ(String student_DOJ) {
		Student_DOJ = student_DOJ;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Student_No;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Student_No != other.Student_No)
			return false;
		return true;
	}
	  
}
