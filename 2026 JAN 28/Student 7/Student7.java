class Student7{
	int id;
	String name;
	int m1;
	int m2;
	int m3;
	
	Student7(int id,String name){
		this.id=id;
		this.name=name;
	}
	void setmarks(int m1,int m2,int m3){
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	int calctotal(){
		int total=this.m1+this.m2+this.m3;
		return total;
	}
	double calcaverage(int tot){
		double average= tot/3.0;
		return average;
	}
	char getresult(double avg){
		char result='\u0000';
		if(avg>75){
			result='A';
		}else if(avg>65){
			result='B';
		}else if(avg>55){
			result='C';
		}else if(avg>45){
			result='S';
		}else{
			result='W';
		}
		return result;
	}
	void display(){
		System.out.println("ID : "+ this.id);
		System.out.println("Name : "+ this.name);
		System.out.println("Sub 1 : "+ this.m1);
		System.out.println("Sub 2 : "+ this.m2);
		System.out.println("Sub 3 : "+ this.m3);
		
		int tot=this.calctotal();
		System.out.println("Total : "+ tot);
		
		double avg=this.calcaverage(tot);
		System.out.println("Average : "+ avg);
		
		char rslt=this.getresult(avg);
		System.out.println("Result : "+ rslt);
	}
}