package july7Assignment;
import java.util.Scanner;

public class StudentDetails {
		public static String name;
		static int age;
		 static long id;
		public static void studentDetails(String bname,int bage,long bid) {
			name = bname;
			age = bage;
			id =bid;
			System.out.println("The name is:"+name);
			System.out.println("The age is:"+age);
			System.out.println("The name is:"+id);
			
			
			
		}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name:");
		name = sc.nextLine();
		System.out.println("enter the age:");
		age = sc.nextInt();
		System.out.println("enter the ID number");
		id =sc.nextLong();
		studentDetails(name,age,id);
	

	}

}
