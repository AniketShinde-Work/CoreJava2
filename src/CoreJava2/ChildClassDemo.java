package CoreJava2;

public class ChildClassDemo extends ChildLevel{
	
	public void getInfo() {
		System.out.println("Child");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassDemo ch= new ChildClassDemo();
		ch.getInfo();
	}

}
