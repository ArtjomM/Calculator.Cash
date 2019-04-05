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
public class CalculatorModel {
    // Holds the value of the sum of the numbers
	// entered in the view
	
	private double calculationValue;
        private String vqhod;
        private String vqhodCent;
	
	public void addTwoNumbers(double amount, double summa){
        calculationValue = amount - summa;
int valueIntegral = (int) calculationValue;
int valueFractional = (int) Math.round(100 * calculationValue - 100 * valueIntegral);

// Integral values Бумажки

int fiveHundred = valueIntegral / 500;

int twoHundred = (valueIntegral % 500) / 200;

int hundred = ((valueIntegral % 500) % 200) / 100;

int fifty = (((valueIntegral % 500) % 200) % 100) /50;

int twenty = (((valueIntegral % 100) % 50) % 50) / 20;

int ten = ((((valueIntegral % 100) % 50) % 50) % 20) / 10;

int five = (((((valueIntegral % 100) % 50) % 50) % 20) % 10) / 5;

int two = ((((((valueIntegral % 100) % 50) % 50) % 20) % 10) % 5) / 2;

int one = (((((((valueIntegral % 100) % 50) % 50) % 20) % 10) % 5) % 2) / 1;

// Fractional values Центы

int half = valueFractional / 50;

int quarter = (valueFractional % 50) / 20;

int dime = ((valueFractional % 50) % 20) / 10;

int nickel = (((valueFractional % 50) % 20) % 10) / 5;

int twoCent = ((((valueFractional % 50) % 20) % 10) % 5) / 2;

int penny = (((((valueFractional % 50) % 20) % 10) % 5) % 2) / 1;

vqhod = "Пятисоток: " + fiveHundred + " Двусоток: " + twoHundred + " Соток: " + hundred + 
        " Пятьдесяток: " + fifty + " Двацаток: " + twenty + " Десяток: " + ten + " Пятерок: " + five + " Двоек: " + two + " Едениц: " + one;
        
vqhodCent = " Пятьдесят центов: " + half + " Двадцать центов: " + quarter + " Десять центов: " + dime + " Пять центов: " + nickel + " Два цента: " 
        + twoCent + " Один цент: " + penny;
	
	}
	
	public double getCalculationValue(){
		
		return calculationValue;

}
        public String getVqhod(){
            return vqhod;
        }
        public String getVqhodCent() {
            return vqhodCent;
        }
       
        
}
