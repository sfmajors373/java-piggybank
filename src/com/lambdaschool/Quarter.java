package com.lambdaschool;

public class Quarter extends Money2
{
    static double worth = .25;
    double totalValue;

    // Constructor taking int
    public Quarter(int numOfMoney)
    {
        super(numOfMoney);
        this.totalValue = totalValue;
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
        return super.getNumOfMoney();
    }

    @Override
    public double getTotalValue()
    {
        return super.getTotalValue();
    }
}
