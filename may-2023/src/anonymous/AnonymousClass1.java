package anonymous;

public class AnonymousClass1 {

	public static void main(String[] args) {
		
		Intr1 i= new Intr1() {
			
			@Override
			public void meth1() {
				System.out.println("anonymous class using interface");
				
			}
		};

		i.meth1();
	}

}

interface Intr1{
	void meth1();
}
