package one_to_many;

import java.util.*;

public class Teacher {
	private List<Student> students;
	public Teacher() {
		students=new ArrayList<Student>();
	}
	public void addStudent(Student student) {
		students.add(student);
	}
	public void removeStudent(Student student) {
		students.remove(student);
	}
	public List<Student> getStudents(){
		return students;
	}
}
