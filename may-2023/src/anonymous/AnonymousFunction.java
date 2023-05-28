package anonymous;

interface Intr{
	void fun();
}

public class AnonymousFunction {

	public static void main(String[] args) {
		
		Intr i1= new Intr() {
			
			@Override
			public void fun() {
				
				System.out.println("inner class");
			}
		};
		
		i1.fun();

	}

}
