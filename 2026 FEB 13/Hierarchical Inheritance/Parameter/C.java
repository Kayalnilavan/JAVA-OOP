class C extends A{
	int z;
	C(int z,int x){
		super(x);
		this.z=z;
	}
	void getZ(){
		System.out.println("Cz "+this.z);
	}
}