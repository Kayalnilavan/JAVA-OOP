class Employee4{
	
	int id;
	String name;
	double basicSalary;
	double bonus;
	
	void CalcBonus(double basicSalary){
		this.basicSalary=basicSalary;
		if(basicSalary>=100000){
			bonus=basicSalary*0.05;
		}else{
			bonus=basicSalary*0.03;
		}
	}
	
	void SetEmployee(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	void Display(){
		System.out.println("Your id : "+ this.id);
		System.out.println("Your name : "+ this.name);
		System.out.println("Your basic salary : "+ this.basicSalary);
		System.out.println("Your bonus : "+bonus);
		System.out.println("Your net salary : "+ (this.basicSalary+bonus));
	}
}