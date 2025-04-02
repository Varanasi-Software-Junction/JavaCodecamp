/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingpackage;

import bankingpackage.accounts.BankAccount;

/**
 *
 * @author Lenovo
 */
public class BankUse {
    public static void main(String[] args) {
        BankAccount account=new BankAccount("Popat Lal","101",1000);
        System.out.println(account);
        account.deposit(100);
        System.out.println(account);
        account.deposit();
        System.out.println(account);
    }
    
}
