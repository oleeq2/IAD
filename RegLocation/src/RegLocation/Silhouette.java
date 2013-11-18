package RegLocation;
import java.lang.Math;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Silhouette
{
    SilhouetteView       view;
    SilhouetteController controller;
    MarkDrawer drawer;
    double R;
    private final static int defaultTTL = 4; //ReplaceME
    
    public Silhouette(double val,MarkDrawer mdrawer)
    {
        drawer = mdrawer;
        view = new SilhouetteView(R);
        controller = new SilhouetteController(R); 
        R = val;

        view.addMouseListener(new MouseAdapter()
                {
                    public void mouseClicked(MouseEvent e)
                    {
                        Point p = e.getPoint();
                        float TTL = -1; 

                        if(!controller.InRegion(mark))
                            TTL = defaultTTL;
                        Mark mark = new Mark((float)p.getX,(float)p.getY,TTL);  
                        drawer.add(mark);
                    }
                });
    }

    public void setR(double val)
    {
        R = val;
    }

    public double getR()
    {
        return R;
    }

}
