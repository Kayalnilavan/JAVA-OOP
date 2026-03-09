package PackB;
import PackA.A;
public class B extends A{
	int y;
	public B(int x,int y){
		super(x);
		this.y=y;
	}
	public void getY(){
		System.out.println("By:"+this.y);
	}
}