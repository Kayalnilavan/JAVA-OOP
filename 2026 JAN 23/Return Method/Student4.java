class Student4{
	int id;
	String firstname,lastname;
	
	void SetData(int id,String firstname,String lastname){
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
	}
	String getFullname(){
		String fullname = this.firstname + " " + this.lastname;
		return fullname;
	}
	void Display(){
		System.out.println("ID : "+ this.id);
		System.out.println("First Name : "+ this.firstname);
		System.out.println("Last Name : "+ this.lastname);
		
		String fna=this.getFullname();
		System.out.println("Fullname : "+ fna);
	}
	
}