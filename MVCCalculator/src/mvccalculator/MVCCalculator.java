/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvccalculator;

/**
 *
 * @author artjo
 */
public class MVCCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculatorView theView = new CalculatorView();
        
    	CalculatorModel theModel = new CalculatorModel();
        
        CalculatorController theController = new CalculatorController(theView,theModel);
        
        theView.setVisible(true);

    }
    
}
