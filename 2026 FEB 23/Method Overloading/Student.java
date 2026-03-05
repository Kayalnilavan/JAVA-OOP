class Student{
	int id;
	String name;
	
	void SetStudent(){
		this.id=1000;
		this.name="Kayal";
	}
	void SetStudent(int id){
		this.id=id;
		this.name="Nilavan";
	}
	void SetStudent(String name){
		this.id=3000;
		this.name=name;
	}
	void SetStudent(int id,String name){
		this.id=id;
		this.name=name;
	}
	void SetStudent(String name,int id){
		this.id=id;
		this.name=name;
	}
	void GetStudent(){
		System.out.println("ID :"+ this.id);
		System.out.println("Name :"+ this.name);
	}
}