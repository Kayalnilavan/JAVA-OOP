class Employee{
	
	int id;
	String name;
	double basic,bonus;
	
	void CalcBonus(){
		if(basic>=100000){
			bonus=basic*0.05;
		}else{
			bonus=basic*0.03;
		}
	}
	
	void SetEmployee(){
		id=1001;
		name="Raj";
		basic=150000;
	}
	
	void Display(){
		System.out.println("Your id : "+ id);
		System.out.println("Your name : "+ name);
		System.out.println("Your basic salary : "+ basic);
		System.out.println("Your bonus : "+bonus);
		System.out.println("Your net salary : "+ (basic+bonus));
	}
}