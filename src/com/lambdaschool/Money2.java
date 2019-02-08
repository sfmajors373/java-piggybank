package com.lambdaschool;

public abstract class Money2
{
    int numOfMoney;
    double totalValue;

    public Money2(int numOfMoney)
    {
        this.numOfMoney = numOfMoney;
    }

    public Money2()
    {
        this.numOfMoney = 1;
    }

    // Getters

    public int getNumOfMoney()
    {
        return numOfMoney;
    }

    public double getTotalValue()
    {
        return totalValue;
    }


}
