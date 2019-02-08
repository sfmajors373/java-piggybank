package com.lambdaschool;

public class Nickel extends Money2
{
    static double worth = .05;
    double totalValue;

    // Constructor taking int
    public Nickel(int numOfMoney)
    {
        super(numOfMoney);
        this.totalValue = totalValue;
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
        return super.getNumOfMoney();
    }

    @Override
    public double getTotalValue()
    {
        return super.getTotalValue();
    }
}
