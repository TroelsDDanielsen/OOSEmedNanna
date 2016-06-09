package earlierExamSet;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
 
public class SpecialExam2016 {

	// b6eggg Question 4
	public static void Question4(){
		int[] a = {1,2,3,4,5,6,7,8};
		int sum1 = 0; int sum2 = 0;
		for (int i : a)
			if (i%2==0)
				sum1 +=i;
			else
				sum2+=i;
			System.out.println(sum1);
			System.out.println(sum2);
	}//Question 4 end
	//Question 9:
	static class Point{
		int x,y;
		public String toString(){
			return "("+x+","+y+")";
		}
	}//Question 9 end
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
		public String toString(){
			return "("+getX()+","+getY()+","+z+")";
		}
	}
	//Question 10 end
	//Question 16 start
		
		static class Glob{
			static int numGlobs;
			int id;
			public Glob() {
				numGlobs++;
				id = numGlobs;
			}
		}
		//Question 16 end

	
public static void main(String Args[]){
	Glob[] a = new Glob[10];
	for(int i = 0; i < 10; i++)
		a[i] = new Glob();
	for(Glob g : a)
		System.out.println(g.id+" ");
	 //Question 20 start
	 javax.swing.SwingUtilities.invokeLater(new Runnable(){
		public void run(){
			JFrame window = new JFrame("Main window");
			JButton button = new JButton("Button");
			JTextField textField = new JTextField("Goodbye");
			button.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if (textField.getText().equals("Hallo")){
						textField.setText("GoodBye");
					}
					else{
						textField.setText("Hallo");
					}
				}
			});
			window.getContentPane().add(button, BorderLayout.LINE_END);
			window.getContentPane().add(textField,BorderLayout.CENTER);
			window.pack();
			window.setVisible(true);
			
			
		}
	});
	 //Question 20 end
	//Question 10:
	/*A a = new A(4,5);
	B b = new B(1,2,3);
	A[] array = {a,b};
	for (A obj : array)
		System.out.println(obj);
	*/

	//Question 10 end
	//Question 4 start 
	/*
	Question4();
	Point p = new Point();
	Point q = p;
	q.x = 3;
	q.y = 5;
	q = null;
	System.out.println(p);
	Point r = new Point();
	p=r;
	System.out.println(p);
	 //Question 4 end
	//Question 17:
	Runnable runnableObject1 = new Runnable(){
		public void run(){
			for (int i = 1; i < 5; i++){
				System.out.println(i);
				try{Thread.sleep(10);
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	};
	Runnable runnableObject2 = new Runnable(){
		public void run(){
			for (String s : new String[]{"a","b","c","d","e"}){
				System.out.println(s);
				try{Thread.sleep(10);
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	};
	Thread t1 = new Thread(runnableObject1);
	Thread t2 = new Thread(runnableObject2);
	t1.start();
	t2.start();*/
	
}
}
