package generalProblems;

public class GenerateOtp {

	public static void main(String[] args) {

		int otp = (int) (Math.random() * 9000) + 1000;

		System.out.println(otp);

	}

}
