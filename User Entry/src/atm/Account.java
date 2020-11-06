package atm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	private int accountNumber;
	private int pinNumber;
	private double checkingBalance;
	private double savingBalance;
	Scanner scan = new Scanner(System.in);
	DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00")

	public Account() {
		// TODO Auto-generated constructor stub
	}
	

	
	
	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}




	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}




	/**
	 * @return the pinNumber
	 */
	public int getPinNumber() {
		return pinNumber;
	}




	/**
	 * @param pinNumber the pinNumber to set
	 */
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}




	/**
	 * @return the checkingBalance
	 */
	public double getCheckingBalance() {
		return checkingBalance;
	}




	/**
	 * @param checkingBalance the checkingBalance to set
	 */
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}




	/**
	 * @return the savingBalance
	 */
	public double getSavingBalance() {
		return savingBalance;
	}




	/**
	 * @param savingBalance the savingBalance to set
	 */
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}




	/**
	 * @return the moneyFormat
	 */
	public DecimalFormat getMoneyFormat() {
		return moneyFormat;
	}




	/**
	 * @param moneyFormat the moneyFormat to set
	 */
	public void setMoneyFormat(DecimalFormat moneyFormat) {
		this.moneyFormat = moneyFormat;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void getCheckingWithdraw()

	{
		System.out.println("Your checking account balance is"+moneyFormat.format(getCheckingBalance()));
		System.out.println("Please, enter the amount to withraw");
		double amount = scan.nextDouble();
		
		if (amunt <=0)
		{
			System.out.println("Amount can not be less than equal to zero");
			getCheckingWithdraw();
		}
		else if (checkingBalance>=amount)
		{
			this.checkingBalance-=amount;
			System.out.println("Your checking account balance is"+moneyFormat.format(getCheckingBalance()));
		}
	}
	
}
