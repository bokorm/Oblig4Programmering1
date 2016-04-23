package Oppgave3;

import java.util.Date;

public class Bank {
private  int customers;
private int account;
private double balance;
private Date date;
private int id=0;
private double transfer;
private int result;

public int customers(){
	return customers;
}
public int account(){
	return account;
}
public int getId() {
	return id;
}
public int result(){
	return result;
}
private Date date(){
	return date;
}
private void transfer(){
	if( transfer>0){
		System.out.println("Transfer complete. ");
		else (transfer<0){
			System.out.println("transfer not complete, try again. ");
		}
			
	}
}
public void withdraw( double withdraw ) {
	if (balance < withdraw)
		System.out.printf("\n Withdraw unsuccessful, balance on acount is less than what you are withdrawing %.2f",
				balance);
	else
		System.out.printf("\n Withdraw successful, new balance is %.2f", balance - withdraw);
}

public void deposit( double deposit ) {
	balance += deposit;
	System.out.printf("\n new balance is %.2f", balance);
}
public double getBalance() {
	return balance;
}
public void Account(int id, double balance) {
	setId(id);
	setBalance(balance);
	date = new Date();
	
}
public void setBalance(double balance) {
	if (balance >= 0)
		this.balance = balance;
	else
		this.balance = 0;
}
public void setId(int id) {
	if (id >= 0)
		this.id = id;
	else
		this.id = 99999;
}

}
