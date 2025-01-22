package ArrayListEquals;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        //This code is just to test your equals method
        ArrayList<Integer> list1 = new ArrayList<>() {{
            add(10);
            add(9);
            add(5);
            add(2);
            add(9);
        }};
        ArrayList<Integer> list2 = new ArrayList<>() {{
            add(10);
            add(9);
            add(5);
            add(2);
            add(9);
        }};

        equals(list1, list2);

        ArrayList<Integer> list3 = new ArrayList<>() {{
            add(1);
            add(9);
            add(5);
            add(2);
            add(9);
        }};

        equals(list2, list3);

    }

    public static boolean equals(ArrayList<Integer> arr1, ArrayList<Integer> arr2)
    {
        boolean runningBool = true;

        for(int i = 0; i < arr1.size(); i++)
        {
            if(arr1.get(i) == arr2.get(i))
            {
                runningBool = true;
            }
            else
            {
                runningBool = false;
            }
        }

        return runningBool;
    }

}
