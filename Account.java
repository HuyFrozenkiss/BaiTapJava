/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

/**
 *
 * @author nguye
 */
public class Account {
    public String id;
    public String name;
    public int balance;

    public Account() {
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void debit(int amount)
    {
        if(amount > this.balance)
        {
            System.out.println("Payment unsucessful");
        }
        else
        {
            System.out.println("Payment successful");
            this.balance -= amount;
        }
    }
    public int getTransferTo(int balance)
    {
        return this.balance*21000;
    }
    public void showInfo()
    {
        System.out.println("id : " + this.getId());
        System.out.println("name : " + this.getName());
        System.out.println("balance : " + this.getBalance() + "$");
        System.out.println("tranfer to VND : " + this.getTransferTo(this.balance));
    }
}
