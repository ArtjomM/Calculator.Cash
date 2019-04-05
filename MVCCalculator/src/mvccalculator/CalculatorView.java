/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvccalculator;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author artjo
 */
public class CalculatorView extends JFrame{
        private JLabel additionLabel1 = new JLabel("Ваша сумма");
	private JTextField firstNumber  = new JTextField(10);
	private JLabel additionLabel = new JLabel("Сумма покупки");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	
        private JLabel additionLabel3 = new JLabel("Бумажки");
        private JTextField calcSolution = new JTextField(100);
        
        private JLabel additionLabel2 = new JLabel("Центы");
        private JTextField calcSolution1  = new JTextField(100);
        
        
	CalculatorView(){
		
		// Sets up the view and adds the components
		
                //JTextField calcSolution = new JTextField();
                //.setPreferredSize( new Dimension( 200, 24 ) );
                //calcSolution.setPreferredSize( new Dimension( 200, 24 ) );
		
                JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 300);
                
                
		
                
                calcPanel.add(additionLabel1);
		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		
                calcPanel.add(additionLabel3);
                calcPanel.add(calcSolution);
                
                calcPanel.add(additionLabel2);
                calcPanel.add(calcSolution1);
                
                
                //int defaultHeight = (int) calcSolution.getSize().getHeight();
                //calcSolution.setSize(new Dimension(20, defaultHeight));
		
		this.add(calcPanel);
		
		// End of setting up the components --------
		
	}
	
	public double getFirstNumber(){
		
		return Double.parseDouble(firstNumber.getText());
		
	}
	
	public double getSecondNumber(){
		
		return Double.parseDouble(secondNumber.getText());
		
	}
	
	public double getCalcSolution(){
		
		return Double.parseDouble(calcSolution.getText());
		
	}
        
	
	public void setCalcSolution(String solution){
		
		calcSolution.setText(solution);
		
	}
	
        public void setCalcSolution1(String solution1) {
                
                calcSolution1.setText(solution1);
        }
	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed
	
	void addCalculateListener(ActionListener listenForCalcButton){
		
		calculateButton.addActionListener(listenForCalcButton);
		
	}
	
	// Open a popup that contains the error message passed
	
	void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
		
	}
	
}

