class B extends A{
	int y;
	int x;
	B(){
		this.y=20;
		this.x=70;
	}
	void getY(){
		System.out.println("By:"+this.y);
	}
	void getX(){
		System.out.println("Bx:"+this.x);
	}
	void getX(int x){
		this.x=x;
		System.out.println("Ax:"+super.x);
		System.out.println("By:"+this.x);
	}
}