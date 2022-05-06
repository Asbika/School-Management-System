package school.managament.system;

import java.util.List;

/**
 * Many teachers, Many Students.
 * Implements teachers and students 
 * Using ArrayList. 
 * @author hicha
 *
 */
public class School {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	/**
	 * New school object is created.
	 * @param teacher list of teachers in the school.
	 * @param student list of students in the school.
	 */
	public School(List<Teacher> teacher, List<Student> student) {
		this.teachers = teacher;
		this.students = student;
		totalMoneyEarned=0;
		totalMoneySpent=0;
		
		
		
		/**
		 *@return the list of teachers in the school
		 */
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	
	
	/**
	 * add a teacher to the school.
	 * @param teacher the teacher to be added. 
	 */
	public void addTeacher(Teacher teacher) {
			teachers.add(teacher);
		
	}
	/**
	 * the list of students in the school.
	 * @return the student to be added.
	 */
	public List<Student> getStudents() {
		return students;
	}
	/**
	 * 
	 * @param student add the student to the school.
	 */
	public void addStudent(Student student) {
		students.add(student);
		
	/**
	 *@return the total money earned by the school.
	 */
	}
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	/**
	 * add total money earned by the school
	 * @param MoneyEarned money that is supposed to be added.
	 */
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned +=MoneyEarned;
	}
	
	/**
	 * 
	 * @return the total money spent by the school.
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	/**
	 * update the money that is spent by the school wich
	 * is the salary given by the school to its teachers
	 * @param totalMoneySpent the money spent by school
	 */
	public static void updateTotalMoneySpent(int moneySpent) {
		
		totalMoneyEarned-=moneySpent;
	}
	

	
}
