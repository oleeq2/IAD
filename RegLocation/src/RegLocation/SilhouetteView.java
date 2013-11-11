package RegLocation;

import javax.swing.*;
import java.awt.*;

public class SilhouetteView extends JComponent {

    double R;

    public SilhouetteView(double R)
    {
        this.R = R;
    }

    public void setR(double R)
    {
        this.R = R;
    }

    @Override
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        Dimension size = getSize();

        drawAxes(g,size);
        drawSilhouette(g,size);
    }

    void drawAxes(Graphics g,Dimension size){

    }

    void drawSilhouette(Graphics g,Dimension size){
        int iR = (int)this.R;
        int x_center = (int)size.getWidth()/2;
        int y_center = (int)size.getHeight()/2;

        g.setColor(Color.BLUE);

        g.drawRect(x_center,y_center,-iR,-(iR/2));
        g.drawPolygon(getTriangle(size));
    }

    Polygon getTriangle(Dimension size)
    {
        int iR = (int)this.R;
        int x_center = (int)size.getWidth()/2;
        int y_center = (int)size.getHeight()/2;

        int n_points = 3;
        int[] x_points = new int[n_points];
        int[] y_points = new int[n_points];

        x_points[0] = x_center;
        y_points[0] = y_center;

        x_points[1] = x_center + iR;
        y_points[1] = y_center;

        x_points[2] = x_center;
        x_points[2] = y_center + iR;

        return new Polygon(x_points,y_points,n_points);
    }
}
