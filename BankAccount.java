package july7Assignment;
import java.util.Scanner;

public class BankAccount {
	double balance;
	static String accountNumber;
	static int dep =1;
	static int with =2;
	static float origbal = 100000;
	public static void deposit() {
		Scanner sc = new Scanner(System.in);
		//let the original balance be 10000;
		
		System.out.println("Enter the money you need to deposit");
		float money = sc.nextFloat();
		float balance= origbal + money;
			System.out.println("Current balance ="+" "+ balance);
		
		}
		
		
		
	public static void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to be withdrawn");
		float money = sc.nextFloat();
		float balance = origbal-money;
		float minbal = origbal-2000;
		if(money<origbal) {
			 System.out.println("Current balance="+" "+balance);
		}
		else
			System.out.println("Enter money less than"+" "+minbal);
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account number");
		accountNumber = sc.nextLine();
             System.out.println(accountNumber);
             System.out.println("Choose the option 1 or 2");
             int num = sc.nextInt();
             if(num==dep) {
            	deposit();
             }
             else if(num== with) {
            	 withdraw();
            	 
             }
             else
            	 System.out.println("Enter the valid number");
             
		
	}

}
