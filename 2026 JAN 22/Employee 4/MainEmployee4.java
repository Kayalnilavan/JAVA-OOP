import java.util.Scanner;
class MainEmployee4{
	public static void main(String args[]){
	    
		Employee4 sal= new Employee4();
				
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter your id:");
		int id=scan.nextInt();
		System.out.println("Enter your name:");
		String name=scan.next();
		System.out.println("Enter your basic salary:");
		double basicSalary=scan.nextDouble();
		
		sal.SetEmployee(id,name);
		sal.CalcBonus(basicSalary);
		sal.Display();
	}
}