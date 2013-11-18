package RegLocation;

public class Mark implements Comparable<Mark>
{
    public static final int RadiusDefault = 5;
    public static final float step = 0.4;
    float x;
    float y;
    float TTL;

    public Mark(float x,float y)
    {
        this.x = x;
        this.y = y;
        this.TTL = -1;
    } 

    public Mark(float x,float y,float TTL)
    {
        this(x,y);
        this.TTL = TTL;
    }

    public int decTTL()
    {
        return TTL--;
    }

    public Mark(float x,float y)
    {
        this(x,y,RadiusDefault);
    }

    public float[] getCoord()
    {
        float[] ret = new float[2];
        ret[0] = x;
        ret[1] = y;
        return ret;
    }
    
    public String toString()
    {
        return "X: "+x + "\n Y: "+y;
    }

    @Override
    public int compareTo(Mark o)
    {

        float [] coord = o.getCoord();
        int ret = 0;

        double r_current = Math.sqrt((float)Math.pow(x,2)+(float)Math.pow(y,2));
        double r = Math.sqrt((float)Math.pow(coord[0],2)+(float)Math.pow(coord[1],2));

        if(x == coord[0] && y == coord[1])
             ret = 0;
        else if ( r_current < r )
            ret = 1;
        else
            ret = -1;

        return  ret;
    }

    public void paintMe(Graphics g)
    {

    }
}
