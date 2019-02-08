package com.lambdaschool;

public class Nickel extends Money2
{
    double worth = .05;
    double totalValue;

    // Constructor taking int
    public Nickel(int numOfMoney)
    {
        super(numOfMoney);
        this.totalValue = this.numOfMoney * this.worth;
        System.out.println(numOfMoney + " Nickel");
    }

    // Constructor not taking int


    public Nickel()
    {
        this.totalValue = this.worth;
        System.out.println(numOfMoney + " Nickel");
    }

    @Override
    public int getNumOfMoney()
    {
        return numOfMoney;
    }

    @Override
    public double getTotalValue()
    {
        return totalValue;
    }
}
