package BinarySearch;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<Integer> sortedNumbers = new ArrayList<>(Arrays.asList(
                1, 9, 16, 22, 24, 30, 34, 39, 41, 47,
                51, 58, 61, 65, 68, 71, 74, 75, 76, 77,
                78, 81, 85, 88, 89
        ));

        binarySearch(sortedNumbers, 47);

    }

    public static int binarySearch(ArrayList<Integer> array, int numToFind)
    {
        int left = 0;
        int right = array.size() - 1;

        System.out.println("Test 4");

        while (left <= right)
        {
            System.out.println("hi");

            //current middle index
            int mid = left + (right - left) / 2;

            //current middle value
            int current = array.get(mid);

            //Evaluate
            if(current == numToFind)
            {
                System.out.println("test 1");
                return mid;

            }
            else if (current < numToFind)
            {
                left = mid + 1;
                System.out.println("Test 2");
            }
            else
            {
                right = mid-1;
                System.out.println("Test 3");
            }
        }
        return -1;
    }
}
