package GetFirstElement;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        for(int i = 0; i < numbers.size(); i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(i);
            }
        }
    }
}
