package school.managament.system;

/*
 * this class is responsible for keep the
 * track of students name,id,name ,grade&fees
 * paid.
 */
public class Student {
	//Fields					
	private int id; // we want to protect accessing to this id ,not everybody can get access on this id
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	//constructor is going to CREAT THE OBJECTS
	/**
	 * Fees for every student is $30,000.
	 * Fees paid initially is 0.
	 * To create a new student by initializing 
	 * @param id id is for the student: unique.
	 * @param name name of the student.
	 * @param grade grade of the student.
	 */
	public Student(int id,String name,int grade) {
		this.feesPaid=0;//is the same like feesPaid=0.
		this.feesTotal=30000;
		this.id=id;
		this.name=name;
		this.grade=grade;
		
	}
	
	//Not going to alter student's name,student's name.
	
	/**
	 * Used to update the student's grade.
	 * @param grade is the new grade of the student.
	 */
	public void setGrade(int grade){
		this.grade=grade;
	}
	
	
	/**
	 * FeesPaid = 10,000+5000+15000
	 * Keep adding the fees to feesPaid Field.
	 * Add the Fees to the fees paid.
	 * The school is going to receive the funds.
	 * @param fees the fees that the student pays.
	 */
	public void payfees(int fees) {
		feesPaid+=fees;
		School.updateTotalMoneyEarned(feesPaid);
	}
	
	/**
	 * 
	 * @return id of the student
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @return the name of the student.
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return fees paid by the student.
	 */
	public int getFeesPaid() {
		return feesPaid;
	}
	
	/**
	 * 
	 * @return the total fees of the student.
	 */
	public int getFeesTotal() {
		return feesTotal;
	}

	/**
	 * 
	 * @return the grade of the student.
	 */
	public int getGrade() {
		return grade;
	}
	/**
	 * 
	 * @return the Remaining fees
	 */
	public int getRemainingFees() {
		return feesTotal-feesPaid;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", feesPaid=" + feesPaid + ", feesTotal="
				+ feesTotal + "]";
	}
	
}
