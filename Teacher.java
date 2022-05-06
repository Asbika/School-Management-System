package school.managament.system;

/*
 * This class is responsible of keeping the track
 * of teacher's name,id & salary.
 */

public class Teacher {
	
	private int id;
	private String name;
	private int salary;
	private static int salaryEarned=0;

	/**
	 * Creates a new Teacher object.
	 * @param id id for the teacher.
	 * @param name name of the teacher.
	 * @param salary salary of the teacher.
	 */
	public Teacher(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	/**
	 * 
	 * @return the id  for the teacher.
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @return the name of the teacher
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @return id of the teacher.
	 */
	public int getSalary() {
		return salary;
	}
	
	/**
	 * 
	 * @param salary Set the salary.
	 */
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	/**
	 * Add to the salaryEarned. 
	 * Removes from the total money earned by SCHOOL.
	 * @param salary
	 */
	public static void receiveSalary(int salary) {
		salaryEarned+=salary;
		School.updateTotalMoneySpent(salary);
		
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + ", SalaryEarned=" + salaryEarned+ "]";
	}
	
	
}