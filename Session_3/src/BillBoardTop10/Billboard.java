package BillBoardTop10;

import java.util.ArrayList;

public class Billboard
{
    private ArrayList<Musician> top10 = new ArrayList<>();







    //artistName.getIsPlatinum()

    public void add(Musician artist)
    {
        top10.add(artist);
    }



    //Don't make alterations to this method!
    public void printTop10()
    {
        System.out.println(top10);
    }
}
