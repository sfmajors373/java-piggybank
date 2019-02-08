package com.lambdaschool;

public class Dime extends Money2
{
    double worth = .10;
    double totalValue;

    // Constructor taking int
    public Dime(int numOfMoney)
    {
        super(numOfMoney);
        this.totalValue= numOfMoney * this.worth;
        System.out.println(numOfMoney + " Dime");
    }

    // Constructor not taking int
    public Dime()
    {
        this.totalValue = totalValue;
        this.totalValue = this.worth;
        System.out.println("1 Dime");
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
