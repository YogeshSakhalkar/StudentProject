package net.codejava.ws;

import java.util.List;
import java.util.ArrayList;

public class StudentDAO {
	private static StudentDAO instance;
	private static List <Student> data = new ArrayList<>();
	
	static {
		data.add(new Student(1, "yogesh", "1/07/1996", "1/03/2021"));
		data.add(new Student(2, "samin", "11/12/1996", "01/01/2021"));
	}
	
	private StudentDAO() {}
	
	public static StudentDAO getInstance() {
		if(instance == null) {
			instance = new StudentDAO();
		}
		return instance;
	}
	
	public List<Student> listAll(){
		return new ArrayList<Student>(data);
	}
	
	public int add(Student student) {
		int newId = data.size()+1;
		student.setStudent_No(newId);
		data.add(student);
		
		return newId;
	}
	
	public Student get(int id) {
		Student studentToFind = new Student(id);
		int index = data.indexOf(studentToFind);
		if(index >=0) {
			return data.get(index);
		}
		return null;
	}
	
	public boolean update(Student student) {
		int index = data.indexOf(student);
		if(index>=0) {
			data.set(index, student);
			
			return true;
		}
		return false;
	}
	
	public boolean delete(int id) {
		Student studentToFind = new Student(id);
		
		int index = data.indexOf(studentToFind);
		
		if(index >=0) {
			data.remove(index);
			return true;
		}
		return false;
	}
}
