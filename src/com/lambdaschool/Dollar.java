package com.lambdaschool;

public class Dollar extends Money2
{
    int worth = 1;
    double totalValue;

    // Constructor taking int
    public Dollar(int numOfMoney)
    {
        super(numOfMoney);
        this.totalValue = this.numOfMoney * this.worth;
        System.out.println("$" + numOfMoney);
    }

    // Constructor not taking int
    public Dollar()
    {
        this.totalValue = this.worth;
        System.out.println("$1");
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
