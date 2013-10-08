package RegLocation;

public class Mark
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
}
