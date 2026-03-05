class B extends A{
	int y;
	int x=500;	
	B(){
		this.y=20;
	}	
	void getY(){
		System.out.println("By"+this.y);
	}
	void getX(){
		System.out.println("Bx"+this.x);
		System.out.println("Bx"+super.x);
		super.getX();		
	}
}