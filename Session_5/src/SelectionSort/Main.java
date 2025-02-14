package SelectionSort;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] array1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array2 = {5, 6, 4, 8, 9, 7, 3, 1, 2};

        System.out.print("First array: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array: ");
        System.out.println(Arrays.toString(array2));
        System.out.println();

        selectionSort(array1);
        System.out.println(array1);

        selectionSort(array2);
        System.out.println(array2);

        System.out.print("First array sorted: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array sorted: ");
        System.out.println(Arrays.toString(array2));
    }

    public static void selectionSort(int[] arr)
    {
        int swapCount = 0;
        for(int index = 0; index < arr.length - 1; index++)
        {
            int minIndex = index;
            for(int j = index; j <arr.length; j++)
            {
                if(arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr [minIndex];
            arr[minIndex] = temp;
        }

    }

}
