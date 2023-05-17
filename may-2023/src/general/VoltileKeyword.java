package general;

class VoltileKeyword {

	public static void main(String[] args) {
		UseOfVolatile sharedData = new UseOfVolatile();

		Thread thread2 = new Thread(() -> {
			sharedData.doSomething();
		});

		Thread thread1 = new Thread(() -> {
			sharedData.setFlag();
		});

		thread1.start();
		thread2.start();
	}
}

class UseOfVolatile {
	private volatile boolean flag = false;

	public void setFlag() {
		flag = true;
	}

	public void doSomething() {
		if (flag) {
			System.out.println("Flag is true");
		} else {
			System.out.println("Flag is false");
		}
	}

}

/*
 * using the volatile keyword o
 * 
 * r any other synchronization mechanism, the output can indeed be
 * "Flag is false" in some cases.
 * 
 * When the flag variable is not declared as volatile, there is no guarantee of
 * visibility between threads. In this situation, it is possible for Thread 2 to
 * read a stale value of the flag variable, even after Thread 1 has set it to
 * true.
 */