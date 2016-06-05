package lecture12;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class Exercise03 extends JFrame implements ChangeListener {
	
	private JSlider rootSlider;
	private JSlider squareSlider;
	private JSlider cubicSlider;
	private JLabel rootHeaderLabel;
	private JLabel rootValueLabel;
	private JLabel squareHeaderLabel;
	private JLabel squareValueLabel;
	private JLabel cubicHeaderLabel;
	private JLabel cubicValueLabel;;

	
	public Exercise03() {
		//Set up the main window frame
		setTitle("Squaring Sliders");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		//Initialize the components
		rootSlider = new JSlider(SwingConstants.VERTICAL,0,100,0);
		squareSlider = new JSlider(SwingConstants.VERTICAL,0,10000,0);
		cubicSlider = new JSlider(SwingConstants.VERTICAL,0,1000000,0);
		rootHeaderLabel = new JLabel("x");
		squareHeaderLabel = new JLabel("x^2");
		cubicHeaderLabel = new JLabel("x^3");
		rootValueLabel = new JLabel(((Integer)(rootSlider.getValue())).toString());
		squareValueLabel = new JLabel(((Integer)(squareSlider.getValue())).toString());
		cubicValueLabel = new JLabel(((Integer)(cubicSlider.getValue())).toString());

		
		//Set up the layout of the components
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setAutoCreateContainerGaps(true);
		layout.setAutoCreateGaps(true);
		
		layout.setHorizontalGroup(
				layout.createSequentialGroup()
					.addGroup(
							layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(rootHeaderLabel)
								.addComponent(rootValueLabel)
								.addComponent(rootSlider))
					.addGroup(
							layout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(squareHeaderLabel)
							.addComponent(squareValueLabel)
							.addComponent(squareSlider))
					.addGroup(
							layout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(cubicHeaderLabel)
							.addComponent(cubicValueLabel)
							.addComponent(cubicSlider))
		);
		
		layout.setVerticalGroup(
				layout.createSequentialGroup()
					.addGroup(
							layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(rootHeaderLabel)
								.addComponent(squareHeaderLabel)
								.addComponent(cubicHeaderLabel))
					.addGroup(
							layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(rootValueLabel)
								.addComponent(squareValueLabel)
								.addComponent(cubicValueLabel))
					.addGroup(
							layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(rootSlider)
								.addComponent(squareSlider)
								.addComponent(cubicSlider))
							);
		
		//Register ChangeListeners on sliders
			rootSlider.addChangeListener(this);
			squareSlider.addChangeListener(this);
			cubicSlider.addChangeListener(this);
		
		pack();
		setVisible(true);

	}
	/*	
	private class RootChangeListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			int root = rootSlider.getValue();
			rootValueLabel.setText(((Integer)root).toString());
			int square = root * root;
			if (square <= squareSlider.getMaximum()) {
				squareSlider.setValue(square);
				squareValueLabel.setText(((Integer)square).toString());
			}
		}
		
		
	}
	
	private class SquareChangeListener implements ChangeListener {

		@Override
		public void stateChanged(ChangeEvent e) {
			int square = squareSlider.getValue();
			squareValueLabel.setText(((Integer)square).toString());
			int root = (int)Math.sqrt(square);
			rootSlider.setValue(root);
			rootValueLabel.setText(((Integer)root).toString());
		}
		
	}*/
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Exercise03();
			}
		});
	}
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
			int cubic = cubicSlider.getValue();
			cubicValueLabel.setText(((Integer)cubic).toString());
			int root = (int)Math.cbrt(cubic);
			int square = root*root;
			rootSlider.setValue(root);
			rootValueLabel.setText(((Integer)root).toString());
			squareSlider.setValue(square);
			squareValueLabel.setText(((Integer)square).toString());

		}
	}
}

