class MainStudent{
	public static void main(String args[]){
		Student st1 = new Student();
		st1.GetStudent();
		
		Student st2 = new Student(2000);
		st2.GetStudent();
		
		Student st3 = new Student("Vikki");
		st3.GetStudent();
		
		Student st4 = new Student(4000,"Ara");
		st4.GetStudent();
		
		Student st5 = new Student("Sara",5000);
		st5.GetStudent();
	}
}