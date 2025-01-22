package FantasyFootball;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> availablePlayers = new ArrayList<String>();
        addPlayers(availablePlayers);
        ArrayList<String> userRoster = new ArrayList<String>();


        Scanner scanner = new Scanner(System.in);



        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter your player choice: ");

            String player = scanner.nextLine();

            String userPlayer = removeElement(availablePlayers, player);
            userRoster.add(userPlayer);

        }

        for(int i = 0; i < userRoster.size(); i++)
        {
            System.out.println(userRoster.get(i));
        }

    }

    public static void addPlayers(ArrayList<String> array)
    {
        array.add("Frodo");
        array.add("Gandalf");
        array.add("Aragorn");
        array.add("Legolas");
        array.add("Gimli");
        array.add("Samwise");
        array.add("Bilbo");
        array.add("Gollum");
        array.add("Thorin");
        array.add("Balin");
        array.add("Galadriel");
        array.add("Elrond");
        array.add("Sauron");
        array.add("Melkor");
        array.add("Lúthien");
    }

    public static String removeElement(ArrayList<String> array, String input)
    {
        for(int i = 0; i < array.size(); i++)
        {
            if(array.contains(input))
            {
                array.remove(input);
            }
        }
        return input;
    }
}
