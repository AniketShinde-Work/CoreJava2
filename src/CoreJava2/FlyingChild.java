package CoreJava2;

public class FlyingChild extends Flying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyingChild fly=new FlyingChild();
		fly.Engine();
		fly.Color();
		fly.Model();
		

	}



	@Override
	public void Color() {
		// TODO Auto-generated method stub
		System.out.println("Inside Color");
	}

}
