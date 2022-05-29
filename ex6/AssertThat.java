package ex6;

public class AssertThat {
	private static double result;
	public void substract(double m, double n) {
	    result = m - n;
	}
	public void clear() {
	    result = 0;
	}
	public double getResultOne() {
	    return result;
	}	
}  	
