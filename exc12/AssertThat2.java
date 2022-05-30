package exc12;

public class AssertThat2 {
	private static int result;
	public void substract(int m, int n) {
	    result = m - n;
	}       
	public void divide(int m, int n) {
	    result = m / n;
	}
	public void clear() {
	    result = 0;
	}
	public int getResult() {
	    return result;
	}
}

