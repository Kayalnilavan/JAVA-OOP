class Student{
	int id;
	String name;
	
	Student(){
		this.id=1000;
		this.name="Kayal";
	}
	Student(int id){
		this.id=id;
		this.name="Nilavan";
	}
	Student(String name){
		this.id=3000;
		this.name=name;
	}
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	Student(String name,int id){
		this.id=id;
		this.name=name;
	}	
	void GetStudent(){
		System.out.println("ID :"+ this.id);
		System.out.println("Name :"+ this.name);
	}
}