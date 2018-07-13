import javax.swing.*;
import java.awt.FlowLayout;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JPanel windowContent = new JPanel();
		
		FlowLayout fl = new FlowLayout();
		windowContent.setLayout(fl);
		
		JLabel labell = new JLabel("Number 1:");
		JTextField field1 = new JTextField(10);
		JLabel label2 = new JLabel("Number 2:");
		JTextField field2 = new JTextField(10);
		JLabel label3 = new JLabel("Number 3:");
		JTextField field3 = new JTextField(10);
		JButton go = new JButton("Add");
		
		windowContent.add(labell);
		windowContent.add(field1);
		windowContent.add(label2);
		windowContent.add(field2);
		windowContent.add(label3);
		windowContent.add(field3);
		windowContent.add(go);
		
		JFrame frame = new JFrame("My first Calculator");
		frame.setContentPane(windowContent);
		
		frame.setSize(600,100);
		frame.setVisible(true);
		
	}

}
