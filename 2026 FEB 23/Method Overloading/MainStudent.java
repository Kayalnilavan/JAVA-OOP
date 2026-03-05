class MainStudent{
	public static void main(String args[]){
		Student st1 = new Student();
		st1.SetStudent();
		st1.GetStudent();
		
		Student st2 = new Student();
		st2.SetStudent(2000);
		st2.GetStudent();
		
		Student st3 = new Student();
		st3.SetStudent("Vikki");
		st3.GetStudent();
		
		Student st4 = new Student();
		st4.SetStudent(4000,"Ara");
		st4.GetStudent();
		
		Student st5 = new Student();
		st5.SetStudent("Sara",5000);
		st5.GetStudent();	
	}
}