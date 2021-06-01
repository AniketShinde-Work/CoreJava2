package CoreJava2;

public class ChildLevel {
	public void getData(int a)
	{
	System.out.println(a);
	}
	public void getData(String a)
	{
	System.out.println(a);
	}
	public void getData(int a,int b)
	{
	System.out.println(b);
	}
	public void getInfo() {
		System.out.println("Parent");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildLevel cl=new ChildLevel();
		cl.getData(2);
		cl.getData("hello");
		cl.getData(2, 5);

		}
}
