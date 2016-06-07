package earlierExamSet;

public class SpecialExam2016 {
	//Question 10:
	static class A{
		private int x, y;
		
		public A(int x, int y){
			setX(x);
			setY(y);
		}
		
		public int getX(){return x; }
		public void setX(int x){ this.x = x;}
		public int getY() { return y;}
		public void setY(int y){this.y = y;}
		
		public String toString(){
			return "("+x+","+y+")";
		}
	}
	static class B extends A{
		private int z;
		public int GetZ(){return z;}
		public void setZ(int z){this.z = z;}
		public B(int x, int y, int z){
			super(x, y);
			setZ(z);
		}
	}
	//Question 10 end
public static void main(String Args[]){
	//Question 10:
	A a = new A(4,5);
	B b = new B(1,2,3);
	A[] array = {a,b};
	for (A obj : array)
		System.out.println(obj);
	System.out.println(b.z);
	//Question 10 end
	}
}
