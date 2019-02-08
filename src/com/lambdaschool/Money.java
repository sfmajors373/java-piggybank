package com.lambdaschool;

public class Money
{
    static double worth;
    static String name;
    int numOfDenomination;
    double totalValue;

    // Constructor
    public Money(String name, double worth)
    {
        this.name = name;
        this.worth = worth;
        this.numOfDenomination = 0;
        this.totalValue = 0;
    }

    // Getters
    public static double getWorth()
    {
        return worth;
    }

    public static String getName()
    {
        return name;
    }

    public int getNumOfDenomination()
    {
        return numOfDenomination;
    }

    public double getTotalValue()
    {
        return totalValue;
    }

    // Method to add money
    public void add(int num)
    {
        double added = num * this.worth;
        this.totalValue += added;
        this.numOfDenomination += num;
        System.out.println("Testing this.name in add1: " + this.name);
        if (this.name == "Dollar")
        {
            System.out.println("$" + num);
        }
        else
        {
            System.out.println(num + " " + this.name);
        }
    }

    // Alternate method to add money
    public void add()
    {
        this.totalValue += this.worth;
        this.numOfDenomination += 1;
        System.out.println("Testing this.name in add2: " + this.name);
        if (this.name == "Dollar")
        {
            System.out.println("$1");
        }
        else
        {
            System.out.println("1 " + this.name);
        }
    }


}
