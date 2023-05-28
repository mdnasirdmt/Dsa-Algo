package anonymous;

public class LambdaExp {

	interface InterfaceFun1 {
		int operate(int a, int b);
	}
	
	interface InterfaceFun2 {
		void msg(String msg);
	}
	
	int operation(int a, int b, InterfaceFun1 fun1) {
		return fun1.operate(a, b);
	}

	public static void main(String[] args) {
		InterfaceFun1 iface= (int a, int b)-> a+b;
		
		InterfaceFun1 iface1= (int a, int b)-> a*b;
		
		LambdaExp exp = new LambdaExp();
		
		System.out.println(exp.operation(8, 8, iface));
		
		System.out.println(exp.operation(8, 8, iface1));
		
		InterfaceFun2 fun2= (msg)-> System.out.println("Hello "+ msg);
		
		fun2.msg("Nasir");
	}

}
