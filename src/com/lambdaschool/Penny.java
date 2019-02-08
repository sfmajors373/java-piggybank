package com.lambdaschool;

public class Penny extends Money2
{
    static double worth = .01;

    // Constructor taking int
    public Penny(int numOfMoney)
    {
        super(numOfMoney);
        this.totalValue = totalValue;
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
        return super.getNumOfMoney();
    }

    @Override
    public double getTotalValue()
    {
        return super.getTotalValue();
    }
}
