package Calc;

public class addMinusMultiplyDivide {
	// Question 11
		public interface I{
			int multiply(int a, int b);
			double add(double a, double b);
			double divide(double a, double b);
			double minus(double a, double b);
		}
		private  static class hans implements I{
	
		public int multiply(int a, int b){
			return a*b;
		}
		public double add(double a, double b){
			return a+b;
		}	
		public double divide(double a, double b){
			return a/b;
		}	
		public double minus(double a, double b){
			return a+b;
		}	
	}

		public static void main(String Args[]){
			hans m = new hans();
			//System.out.println(m.multiply(3, 4));
			//System.out.println(m.add(5, 2));
			//System.out.println(m.minus(5, 2));
			//System.out.println(m.divide(5, 2));
		//Question 11 end
		}
		}
