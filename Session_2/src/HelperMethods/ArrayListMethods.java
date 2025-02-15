package HelperMethods;

import java.util.ArrayList;

public class ArrayListMethods
{

    public static void print(ArrayList<Double> arr)
    {
        for(int i = 0; i < arr.size(); i++)
        {
            System.out.print(arr.get(i));
        }
    }

    public static void condense(ArrayList<Double> arr)
    {
        for(int i = 0; i < arr.size()-1; i+=2)
        {
            arr.add(arr.get(i) * arr.get(i + 1));
            arr.remove(i);
            arr.remove(i + 1);
            i-=2;
        }
    }

    public static ArrayList<Double> duplicate(ArrayList<Double> arr)
    {
        ArrayList<Double> duplicate = new ArrayList<Double>();

        for(int i = 0; i < arr.size(); i++)
        {
            duplicate.add(arr.get(i));
        }

        return duplicate;

    }

}
