package RegLocation;
import java.lang.Math; 
public class Silhouette
{
    float R;
    public Silhouette(float R)
    {
        this.R = R;
    }

    public int InRegion(Mark mk)
    {
        int ret = 0; 
 
        float[] ar = mk.getCoord();
        float x = ar[0];
        float y = ar[1];

        if(x > 0)
            if ( y > 0 )
                ret = 0; 
            else    
                ret = ForthQuater(x,y);
        else
            if ( y > 0 )
                ret = SndQuater(x,y);
            else
                ret = ThrQuater(x,y);
        return ret;
    }

    int SndQuater(float x,float y)
    {
        int ret = 0; 
        if((x > R && x < 0) && ( R/2 > y && y > 0  ) )
            ret = 1;
        return ret;
    } 

    int ThrQuater(float x,float y)
    {
        int ret = 0;
        float val = (-1)*x -  R;
        if( y > val )
            ret = 1;
        return ret;
    }

    int ForthQuater(float x,float y)
    {
        int ret = 0;
        float val = (float)Math.pow(x,2) + (float)Math.pow(y,2);
        if ( R/2 > val  )
            ret = 1;
        return ret;
    }
}
