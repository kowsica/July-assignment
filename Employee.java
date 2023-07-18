package july7Assignment;
import java.util.Scanner;
	
public class Employee {
	static String name;
	static int age;
	static float salary;
	static long id;
	public static void empSalary(float esalary) {
		Scanner sc = new Scanner(System.in);
		esalary = salary;
		System.out.println("Enter the salary per day");
		int salaryperday = sc.nextInt();
		int daysperMonth = 20;
		 int salaryPerMonth = daysperMonth*salaryperday;
		 System.out.println("Salary per month is:"+salaryPerMonth);
		  int salaryPerYear = 12 * salaryPerMonth;
		  System.out.println("Salary of" +" "+name +"is" + " "+salaryPerYear);
		  
		
	}
	public static void empDetails(String ename, long eid, int eage) {
		
		ename = name;
		eid = id;
		eage = age;
		
		System.out.println("The name of the employee is:"+" " + name);
		 System.out.println("The age of the employee is:"+" "+ age);
		 System.out.println("The employee id is:"+" " + id);
		
			
		}
		
		
		
		
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of employee:");
		name = sc.nextLine();
		System.out.println("Enter the age");
		age = sc.nextInt();
		System.out.println("Enter the ID:");
		id = sc.nextLong();
		empDetails(name,id,age);
		empSalary(salary);
		

	}

}
