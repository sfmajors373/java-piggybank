package com.lambdaschool;

public class Penny extends Money2
{
    double worth = .01;
    double totalValue;

    // Constructor taking int
    public Penny(int numOfMoney)
    {
        super(numOfMoney);
        this.totalValue = this.numOfMoney * this.worth;
        System.out.println(numOfMoney + " Penny");
    }

    // Constructor not taking int
    public Penny()
    {
        this.totalValue = this.worth;
        System.out.println(numOfMoney + " Penny");
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
