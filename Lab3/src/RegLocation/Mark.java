package RegLocation;

public class Mark implements Comparable<Mark>
{
    float x;
    float y;

    public Mark(float x,float y)
    {
        this.x = x;
        this.y = y;
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
    public int compareTo(Mark o) {
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
}
