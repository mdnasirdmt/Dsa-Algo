package oops;

public interface Interface {

	public static void main(String[] args) {
		King k = new King();
		k.moves();
//		k.n=3;  interface have variable n that is public static and final by default
		System.out.println(k.n);

		Queen q = new Queen();
		q.moves();
	}

}

interface Chess {
	int n = 2;

	void moves();
}

class King implements Chess {

	@Override
	public void moves() {
		System.out.println("all directions by one step ");

	}

}

class Queen implements Chess {

	@Override
	public void moves() {
		System.out.println("up , down , right, left, diagonaly ");

	}

}

//interface 
//interface is use to get 
//1. total abstraction 
//2. multiple inheritance 
//because in java 
//multiple inheritance is not supported with class level but it supported with interface level 
