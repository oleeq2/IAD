package RegLocation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet; 
import java.util.Iterator;
import java.lang.IndexOutOfBoundsException;
import java.util.ArrayList;

public class Lab2
{
    public static void main(String[] args)
    {
        float R = 0f; 
        TreeSet<Mark> marks = null;

        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String RString = reader.readLine();
            String MarksString = reader.readLine();

            marks = parseMarks(MarksString);
            R     = Float.parseFloat(RString);
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Неверно введены точки");
            return;
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
            return;
        }

        Silhouette region = new Silhouette(R); 
        Iterator<Mark> marks_iter = marks.iterator();

        if(!marks_iter.hasNext())
            return;
        do
        {
            Mark item = marks_iter.next();
            if(region.InRegion(item) == 1)
                System.out.println(item.toString());
        }while(marks_iter.hasNext());

        return;
    }
    
    static TreeSet<Mark> parseMarks(String input) throws NumberFormatException
    {

        TreeSet<Mark> marks = new TreeSet<Mark>();

        int i; 
        ArrayList<int[]> BrIndexList = new ArrayList<int[]>();
        int BrIndex = -1;

        for(i = 0; i < input.length(); i++)
            switch(input.charAt(i))
            {
                case '{':
                    int []index = new int[2];
                    index[0] = i;
                    index[1] = -1;
                    BrIndexList.add(index);
                    BrIndex++;
                    break;
                case '}':
                    try
                    {
                        int[] indexes = BrIndexList.get(BrIndex); //WARNING 
                        indexes[1] = i;

                        BrIndex--;
                    }
                    catch(IndexOutOfBoundsException ex)
                    {
                        ex.printStackTrace();
                    }
                    break;
            }
        //TODO BrListIndex check
        i=0;
        for(int[] indexes : BrIndexList)
        {

            if(i == 0)
                continue;
            String substr = input.substring(indexes[0]+1,indexes[1]-1);
            System.out.println(substr);
            String[] numbers = substr.split(",");
            float x = Float.parseFloat(numbers[0]);
            float y = Float.parseFloat(numbers[1]);

            i++;
            marks.add(new Mark(x,y));
        }
        return marks;
    }
}
