package com.lambdaschool;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        // Make Collection
        ArrayList<Money2> piggy = new ArrayList<Money2>();
        piggy.add(new Quarter());
        piggy.add(new Dime());
        piggy.add(new Dollar(5));
        piggy.add(new Nickel(3));
        piggy.add(new Dime(7));
        piggy.add(new Dollar());
        piggy.add(new Penny(10));

        System.out.println("********");
        double acc = 0;
        for (int i = 0; i < piggy.size(); i++)
        {
            double current = piggy.get(i).getTotalValue();
            acc += current;
        }
        System.out.println("The piggy bank holds $" + acc);
    }
}
