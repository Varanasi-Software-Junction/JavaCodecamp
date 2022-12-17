package oopsday;

public class BankAccount {

    Person customer;//This Person object has been encapsulated in Bank Account
    String accountnumber;
    int balance;

    public BankAccount(Person customer, String accountnumber, int balance) {
        this.customer = customer;
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "customer=" + customer + ", accountnumber=" + accountnumber + ", balance=" + balance + '}';
    }

    public static void main(String[] args) {
        Person p = new Person("Bill Gates", "Seattle", 50);
        Employee x2 = new Employee("Jack", "London", "Clerk", 40, 2000);
        BankAccount b1 = new BankAccount(x2, "101", 100);
        System.out.println(b1);
    }

}
//Make a class Book that has a name, subject, price and author
// Subject wll be a class with topics and Author willbe a person
