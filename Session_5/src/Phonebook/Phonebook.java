package Phonebook;
import java.util.ArrayList;

public class Phonebook
{
    private ArrayList<Contact> phonebook = new ArrayList<Contact>();

    public void addContact(Contact contact)
    {
        phonebook.add(contact);
    }

    public void sort()
    {
        for(int index = 0; index < phonebook.size() - 1; index++)
        {
            int minIndex = index;
            for(int j = index; j < phonebook.size(); j++)
            {
                if(phonebook.get(j).getName().compareTo(phonebook.get(minIndex).getName()) < 0)
                {
                    minIndex = j;
                }
            }
            Contact temp = phonebook.get(index);
            phonebook.remove(index);
            phonebook.add(index + 1,temp);
            //arr.get(index) = arr.get(minIndex);
            //arr.get(minIndex).getName() = temp;
        }
    }

    public void printPhonebook()
    {
        for(Contact contact : phonebook)
        {
            System.out.println(contact);
        }
    }

}
