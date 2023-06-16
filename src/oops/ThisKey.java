package oops;

public class ThisKey {

	int x,y;
	
	void setData(int x,int y) {
		this.x=x;
		this.y=y;
	}
	void disp() {
		System.out.println("X="+x+"Y="+y);
	}
	public static void main(String[] args) {
		
		ThisKey obj = new ThisKey();
		
		obj.setData(12, 13);
		obj.disp();
	}

}
