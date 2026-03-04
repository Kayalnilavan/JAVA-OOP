class C extends B{
	int z;
	C(int z,int x,int y){
		super(x,y);
		this.z=z;
	}
	void getZ(){
		System.out.println("Cz "+this.z);
	}
}