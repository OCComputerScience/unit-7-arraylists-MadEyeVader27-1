package TraversingOdds;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(int i = 0; i < 51; i++)
        {
            numbers.add(i);
        }

        removeEvens(numbers);
    }

    public static void removeEvens(ArrayList<Integer> array)
    {
        for(int i = 0; i < array.size(); i++)
        {
            if(array.get(i) % 2 == 0)
            {
                array.remove(i);
                i--;
            }
        }
    }
}
