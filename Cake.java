package oleg_Lesson;

public class Cake {

	public static void main(String[] args) {
		int[] candles = new int[]{4,3,7,1};
		int result = cakeCandles(candles);
		System.out.println(result);

	}
	private static int cakeCandles(int candles[]) {
		int nrMax = candles[0];
		int count=1;
		for (int i=1; i<candles.length; i++) {
			if (nrMax<candles[i]) {
				nrMax=candles[i];
				count=1;
			}else if (nrMax==candles[i]) {
				count++;
			}
		}
		return count;
	}

}
