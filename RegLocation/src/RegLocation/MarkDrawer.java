package RegLocation;
import java.util.ArrayList;

public class MarkDrawer implements Runnable 
{
    ArrayList<Mark> Marks; 
    
    public MarkDrawer()
    {
        Marks = new ArrayList<Mark>();
    }

    public void add(Mark mk)
    {
        Marks.add(mk);
    }

    public void paintComponent(Graphics g)
    {
        Mark item;
        for(item : Marks)
        {
            item.PaitMe(g);
            item--;
        }
    }

    public void run()
    {

    }
}
