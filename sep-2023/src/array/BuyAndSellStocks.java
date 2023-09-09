package array;

public class BuyAndSellStocks {
	public static void main(String[] args) {
		int[] price= {7,1,5,3,6,4};
		int min=Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<price.length; i++) {
			
			min= Math.min(min, price[i]);
			
			for(int j=min; j<price.length; j++) {
				max=Math.max(max, price[j]);
			}
		}
		System.out.println(max);
		
	}
}
