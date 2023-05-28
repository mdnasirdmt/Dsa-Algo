package anonymous;

public class AnonymousClass {

	public static void main(String[] args) {
		AbstractClass abs= new AbstractClass() {
			
			@Override
			void meth1() {
				System.out.println(" anonymous class using abstract class ");
				
			}
		};
		abs.meth1();
	}

}

abstract class AbstractClass{
	abstract void meth1();
}