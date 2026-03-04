class Employee2{
	
	int id;
	String name;
	double basic,bonus;
	
	void CalcBonus(double basic){
		this.basic=basic;
		if(basic>=100000){
			bonus=basic*0.05;
		}else{
			bonus=basic*0.03;
		}
	}
	
	void SetEmployee(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	void Display(){
		System.out.println("Your id : "+ this.id);
		System.out.println("Your name : "+ this.name);
		System.out.println("Your basic salary : "+ this.basic);
		System.out.println("Your bonus : "+bonus);
		System.out.println("Your net salary : "+ (this.basic+bonus));
	}
}