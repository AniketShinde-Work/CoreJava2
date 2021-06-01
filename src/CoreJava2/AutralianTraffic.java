package CoreJava2;

public class AutralianTraffic implements TrafficRules{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficRules a= new AutralianTraffic();
		a.green();
		a.yellow();
		a.red();

	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("Inside green");
	}

	@Override
	public void yellow() {
		// TODO Auto-generated method stub
		System.out.println("Inside yellow");

		
	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("Inside red");

		
	}

}
