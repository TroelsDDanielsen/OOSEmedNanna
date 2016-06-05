package lecture12;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class Exercise04 extends JFrame implements ChangeListener, ActionListener {
	
	private JButton buttonAdd;
	private JButton buttonMinus;
	private JButton buttonMultiply;
	private JButton buttonDivide;
	private JButton buttonSum;
	private JButton buttonClear;
	private JButton button0;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton buttoncomma;
	private JTextField inputData;
	
	public Exercise04() {
	//Setting up the window
	setTitle("Simple Calculator");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
		
	//Initializing the components
	buttonAdd = new JButton("+");
	buttonMinus = new JButton("-");
	buttonMultiply = new JButton("x");
	buttonDivide = new JButton("%");
	buttonSum = new JButton("=");
	button0 = new JButton("0");
	button1 = new JButton("1");
	button2 = new JButton("2");
	button3 = new JButton("3");
	button4 = new JButton("4");
	button5 = new JButton("5");
	button6 = new JButton("6");
	button7 = new JButton("7");
	button8 = new JButton("8");
	button9 = new JButton("9");
	buttoncomma = new JButton(",");
	buttonClear = new JButton("C");
	inputData = new JTextField();
	inputData.setEditable(false);
	
	//Setting up the layout of the components
	GroupLayout layout = new GroupLayout(getContentPane());
	getContentPane().setLayout(layout);
	layout.setAutoCreateContainerGaps(true);
	layout.setAutoCreateGaps(true);
	
	//Setting up the layout of the window form
	layout.setHorizontalGroup(
			layout.createSequentialGroup()
			.addComponent(inputData,0,150,450)
			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(button7)
					.addComponent(button4)
					.addComponent(button1)
				)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(buttonClear)
					.addComponent(button8)
					.addComponent(button5)
					.addComponent(button2)
					.addComponent(button0)
				)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(button9)
					.addComponent(button6)
					.addComponent(button3)
					.addComponent(buttoncomma)
				)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(buttonDivide)
					.addComponent(buttonMultiply)
					.addComponent(buttonMinus)
					.addComponent(buttonAdd)
					.addComponent(buttonSum)
				)		
	);
	layout.setVerticalGroup(
			layout.createSequentialGroup()
			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(inputData)
					)
			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(buttonClear)
					.addComponent(buttonDivide)
					)
			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(button7)
					.addComponent(button8)
					.addComponent(button9)
					.addComponent(buttonMultiply)
					)
			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(button4)
					.addComponent(button5)
					.addComponent(button6)
					.addComponent(buttonMinus)
					)
			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(button1)
					.addComponent(button2)
					.addComponent(button3)
					.addComponent(buttonAdd)
					)
			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(button0)
					.addComponent(buttoncomma)
					.addComponent(buttonSum)
					)
	);
	//Register ChangeListeners on Buttons
	buttonAdd.addActionListener(this);
	buttonMinus.addActionListener(this);
	buttonDivide.addActionListener(this);
	buttonMultiply.addActionListener(this);
	buttonClear.addActionListener(this);
	buttonSum.addActionListener(this);
	button0.addActionListener(this);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	button5.addActionListener(this);
	button6.addActionListener(this);
	button7.addActionListener(this);
	button8.addActionListener(this);
	button9.addActionListener(this);
	buttoncomma.addActionListener(this);
	//Packing and making the window public
	pack();
	setVisible(true);
	}
	public void sum(double value){
		String value2 = Double.toString(value);
		inputData.setText(value2);
	}
	public double addToState(int state){
		String input = inputData.getText();
		double value = Double.parseDouble(input);
		if (state == 1){
			if(i == 1){
			totalsum += value;
			}
			}else if (i > 1){
			totalsum = (temp + temp*i);
		}
		
		else if (state == 2){
			if(i == 1){
				totalsum -= value;
			}
			else if (i > 1){
			totalsum = (temp - (temp*i));
			}
		}
		else if (state == 3){
			if(i == 1){
				totalsum /= value;
			}
			else if (i > 1){
			totalsum = (temp / (temp*i));
			}
		}
		else if (state == 4){
			if(i == 1){
				totalsum *= value;
			}
			else if (i > 1){
			totalsum = (temp * (temp*i));
			}
		}
		return value;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Exercise04();
			}
		});
	}
	double totalsum = 0;
	int state = 1;
	boolean runbefore;
	int i = 1;
double temp;
	//The ActionEventListener(Who decide what happens when)
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(buttonAdd)){
			
			addToState(state);
			state = 1;
			inputData.setText("");
		}
		else if (e.getSource().equals(buttonMinus)){
			
			addToState(state);
			state = 2;
			inputData.setText("");
		}
		else if (e.getSource().equals(buttonDivide)){
			
			addToState(state);
			state = 3;
			inputData.setText("");
		}
		else if (e.getSource().equals(buttonMultiply)){
			
			addToState(state);
			state = 4;
			inputData.setText("");
		}
		else if (e.getSource().equals(buttonSum)){
			i++;
			if (runbefore == false){
				temp = addToState(state);
				String totalsum2 = Double.toString(totalsum);
				inputData.setText(totalsum2);
				runbefore = true;
				System.out.println("I is now: " + i + " and temp is now: " + temp);
			}
			else {
				addToState(state);
				System.out.println("I is now: " + i + " and temp is now: " + temp);
				String fisk = Double.toString(totalsum);
				inputData.setText(fisk);
			}
		}
		else if (e.getSource().equals(buttonClear)){
			state = 1;
			totalsum = 0;
			temp = 0;
			runbefore = false;
			i = 1;
			inputData.setText("");
		}
		else if (e.getSource().equals(button0)){
			String something = inputData.getText();
			something += "0";
			inputData.setText(something);
		}
		else if (e.getSource().equals(button1)){
			String something = inputData.getText();
			something += "1";
			inputData.setText(something);
		}
		else if (e.getSource().equals(button2)){
			String something = inputData.getText();
			something += "2";
			inputData.setText(something);
		}
		else if (e.getSource().equals(button3)){
			String something = inputData.getText();
			something += "3";
			inputData.setText(something);
		}
		else if (e.getSource().equals(button4)){
			String something = inputData.getText();
			something += "4";
			inputData.setText(something);
		}
		else if (e.getSource().equals(button5)){
			String something = inputData.getText();
			something += "5";
			inputData.setText(something);
		}
		else if (e.getSource().equals(button6)){
			String something = inputData.getText();
			something += "6";
			inputData.setText(something);
		}
		else if (e.getSource().equals(button7)){
			String something = inputData.getText();
			something += "7";
			inputData.setText(something);
		}
		else if (e.getSource().equals(button8)){
			String something = inputData.getText();
			something += "8";
			inputData.setText(something);
		}
		else if (e.getSource().equals(button9)){
			String something = inputData.getText();
			something += "9";
			inputData.setText(something);
		}
		else if (e.getSource().equals(buttoncomma)){
			String something = inputData.getText();
			something += ".";
			inputData.setText(something);
		}
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}
};


	/*
	@Override
	public void stateChanged(ChangeEvent e) {
		if (e.getSource().equals(rootSlider)){
			int root = rootSlider.getValue();
			rootValueLabel.setText(((Integer)root).toString());
			int square = root * root;
			int cubic = root * root * root;
			if (square <= squareSlider.getMaximum()) {
				squareSlider.setValue(square);
				squareValueLabel.setText(((Integer)square).toString());
			}
				if (square <= cubicSlider.getMaximum()) {
				cubicSlider.setValue(cubic);
				cubicValueLabel.setText(((Integer)cubic).toString());
			}
		}
		if (e.getSource().equals(squareSlider)){
			int square = squareSlider.getValue();
			squareValueLabel.setText(((Integer)square).toString());
			int root = (int)Math.sqrt(square);
			int cubic = root * root * root;
			rootSlider.setValue(root);
			rootValueLabel.setText(((Integer)root).toString());
			if (cubic <= cubicSlider.getMaximum()) {
			cubicSlider.setValue(cubic);
			cubicValueLabel.setText(((Integer)cubic).toString());
			}
		}	
		if (e.getSource().equals(cubicSlider)){
		}
	}
}

*/
