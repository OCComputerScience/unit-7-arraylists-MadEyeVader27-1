package HelperMethods;

import java.util.ArrayList;

import static HelperMethods.ArrayListMethods.print;
import static HelperMethods.ArrayListMethods.duplicate;
import static HelperMethods.ArrayListMethods.condense;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Double> prices = new ArrayList<Double>();

        prices.add(13.45);
        prices.add(8.99);
        prices.add(2.95);
        prices.add(7.88);
        prices.add(12.56);
        prices.add(1.23);

        condense(prices);
        print(prices);


    }

}
