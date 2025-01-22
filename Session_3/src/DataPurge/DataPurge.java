package DataPurge;

import java.util.ArrayList;

public class DataPurge
{
    public static void removeDuplicates(ArrayList<String> people)
    {
        if(people.isEmpty()) return;


        for(int i = 0; i < people.size(); i++)
        {
            String currentPerson = people.get(i);

            for(int j = i+1; j < people.size(); j++)
            {
                if (currentPerson.equals(people.get(j)))
                {
                    System.out.println("Found Duplicate");
                    people.remove(j);
                    j--;
                }
            }
        }
    }

    public static void removeNames(ArrayList<String> people, String personToRemove)
    {
        if(people.isEmpty()) return;

        for(int i = 0; i < people.size(); i++)
        {
            String currentPerson = people.get(i);

            if (currentPerson.contains(personToRemove))
            {
                System.out.println("Removing" + currentPerson);
                people.remove(i);
                i--;
            }
        }

    }

    public static boolean correctlyFormatted(ArrayList<String> people)
    {
        if(people.isEmpty()) return true;

        for(String person : people)
        {
            //Check for space between name
            if(!person.contains(" "))
            {
                return false;
            }

            String firstLetter = person.substring(0,1);

            if(!firstLetter.equals(firstLetter.toUpperCase()))
            {
                return false;
            }

            int idx = people.indexOf(" ") + 1;

            String firstLetterLastName = person.substring(idx, idx+1);

            if(!firstLetterLastName.equals(firstLetterLastName.toUpperCase()))
            {
                return false;
            }
        }
        return true;
    }


}
