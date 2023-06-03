package one_to_many;

public class Student {
	private Teacher teacher;
	public Student(Teacher teacher) {
		this.teacher=teacher;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher=teacher;
	}
}
