package com.lambdaschool;

public class PiggyBank
{
    Money[] storage = new Money[5];

    // Constructor
    public PiggyBank()
    {
        this.storage = storage;
        this.storage[0] = new Money("Penny", .01);
        System.out.println("First in bank: " + this.storage[0].getName());
        this.storage[1] = new Money("Nickel", .05);
        System.out.println("Second in bank: " + this.storage[1].getName());
        this.storage[2] = new Money("Dime", .10);
        System.out.println("Third in bank: " + this.storage[2].getName());
        this.storage[3] = new Money("Quarter", .25);
        System.out.println("Fourth in bank: " +  this.storage[3].getName());
        this.storage[4] = new Money("Dollar", 1);
        System.out.println("Fifth in bank: " + this.storage[4].getName());
    }

    // Determine the whole value of the piggy bank and print it
    public void totalStored()
    {
        double total = 0;
        for (int i = 0; i < 5; i++)
        {
            double current = this.storage[i].getTotalValue();
            total += current;
        }
        System.out.println("The piggy bank holds $" + total);
    }

    // addMoney requiring input of num of coins
    public void addMoney(String denomination, int num)
    {
        System.out.println("Testing denomination in addMoney1 " + denomination);
        switch (denomination)
        {
            case "Penny":
                this.storage[0].add(num);
                break;
            case "Nickel":
                this.storage[1].add(num);
                break;
            case "Dime":
                this.storage[2].add(num);
                break;
            case "Quarter":
                this.storage[3].add(num);
                break;
            case "Dollar":
                this.storage[4].add(num);
                break;
        }
    }

    // Alternate addMoney to allow not providing num of coins
    public void addMoney(String denomination)
    {
        switch (denomination)
        {
            case "Penny":
                this.storage[0].add(1);
                break;
            case "Nickel":
                this.storage[1].add(1);
                break;
            case "Dime":
                this.storage[2].add(1);
                break;
            case "Quarter":
                this.storage[3].add(1);
                break;
            case "Dollar":
                this.storage[4].add(1);
                break;
        }
    }
}
