package school.managament.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher lizzy = new Teacher(1,"Lizzy",500);
		Teacher mellisa = new Teacher(2,"Mellisa",700);
		Teacher ahmed = new Teacher(3,"Ahmed",800);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(mellisa);
		teacherList.add(ahmed);
		
		
		Student misaki = new Student(1,"Misaki",4);
		Student hanna = new Student(2,"Hanna",10);
		Student robbey = new Student(3,"Robbey",13);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(misaki);
		studentList.add(hanna);
		studentList.add(robbey);
		
		School ghs = new School(teacherList,studentList);
		 //nowww we gota add to the liste of ghs the liste of school
		ghs.addTeacher(ahmed);
		
	
	    hanna.payfees(7000);
	    misaki.payfees(5000);
	    
	    System.out.println("GHS has earned: $"+ghs.getTotalMoneyEarned());
	    //System.out.println(hanna.getFeesPaid());
	    
	    System.out.println("-----MAKING GHS PAY SALARY-----");
	    lizzy.receiveSalary(lizzy.getSalary());
	    mellisa.receiveSalary(mellisa.getSalary());
	    System.out.println("GHS has spent for salary to "+lizzy.getName()
	    +"and now has $"+ghs.getTotalMoneyEarned());
	    
	    System.out.println(misaki.toString());
	    lizzy.setSalary(lizzy.getSalary());
	    System.out.println(lizzy.toString());
	    
	    
	   
	    
	    
	    
	}

	
	
}
