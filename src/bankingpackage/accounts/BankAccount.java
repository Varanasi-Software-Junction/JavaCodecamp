/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingpackage.accounts;

import java.util.Scanner;
import javax.management.Query;

/**
 *
 * @author Lenovo
 */
public class BankAccount {
    
    private String name, accountno;
    private int balance;
    
    ;

    public BankAccount(String name, String accountno, int balance) {
        this.name = name;
        this.accountno = accountno;
        this.balance = balance;
    }
    
    public void deposit(int value) {
        balance += value;
    }
    
    public void deposit() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter amount for deposit.");
        int value = Integer.parseInt(s.nextLine());
        deposit(value);
    }
    
    public BankAccount() {
        
    }

//        System.out.println(this.getClass());
//        System.out.println(this.getClass().getSuperclass());
//        System.out.println(this.getClass().getSuperclass().getSuperclass());
//return super.toString();
    @Override
    public String toString() {
        return "BankAccount{" + "name=" + name + ", accountno=" + accountno + ", balance=" + balance + '}';
    }
}
