package com.lambdaschool;

public class Quarter extends Money2
{
    double worth = .25;
    double totalValue;

    // Constructor taking int
    public Quarter(int numOfMoney)
    {
        super(numOfMoney);
        this.totalValue = this.numOfMoney * this.worth;
        System.out.println(this.totalValue);
        System.out.println(numOfMoney + " Quarter");
    }

    // Constructor not taking int
    public Quarter()
    {
        this.totalValue = this.worth;
        System.out.println("1 Quarter");
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
