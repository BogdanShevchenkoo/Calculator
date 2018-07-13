import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class  CalculatorEngine implements ActionListener {
	
	Calculator parent;
	double smt = 1111;
	char selectedAction = ' ';
	double currentResult = 0;
	
	CalculatorEngine (Calculator parent){
		this.parent = parent;
	}
	
	public void actionPerformed (ActionEvent e) {
		
		JButton clickedButton = (JButton) e.getSource();
		String displayFieldText = parent.displayField.getText();
		double displayValue = 0;
		
			if (!"".equals(displayFieldText)) {
				displayValue = Double.parseDouble(displayFieldText);
			}
			Object src = e.getSource();
			
		/*if(displayFieldText.indexOf('.') == displayFieldText.lastIndexOf('.')){
			parent.displayField.setText("" + "Нельзя вводить больше 2-х точек");
		} */

			if (src == parent.buttonPlus){
				selectedAction = '+';
				currentResult = displayValue;
				parent.displayField.setText("");
			} else if (src == parent.buttonMinus) {
				selectedAction = '-';
				currentResult = displayValue;
				parent.displayField.setText("");
			} else if (src == parent.buttonDivide){		  
				selectedAction = '/';
				currentResult = displayValue;
				parent.displayField.setText("");
			} else if (src == parent.buttonMultiply){
				selectedAction = '*';
				currentResult = displayValue;
				parent.displayField.setText("");
			} else if (src == parent.buttonEqual){
				

				if (selectedAction == '+'){
					currentResult += displayValue;
					parent.displayField.setText("" + currentResult);
				} else if (selectedAction == '-') {
					currentResult -= displayValue;
					parent.displayField.setText("" + currentResult);
				} else if(selectedAction == '/'){
						if(displayValue == 0) {
							parent.displayField.setText("" + "на ноль делить нельзя");
						} else {
						currentResult /= displayValue;
						parent.displayField.setText("" + currentResult);}
				} else if(selectedAction == '*'){
					currentResult *= displayValue;
					parent.displayField.setText("" + currentResult);
				}} else  {
						String clickedButtonLabel = clickedButton.getText();
						parent.displayField.setText(displayFieldText + clickedButtonLabel);
					}
	
  }
}
	
	
	
	

