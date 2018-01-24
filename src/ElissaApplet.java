import java.awt.Graphics;

public class ElissaApplet extends java.applet.Applet {

    public void paint(Graphics g ) {
        g.drawString("Hello World!", 5,25);
        g.draw3DRect(300,350,600, 100,true);
        g.drawLine(1100,400,100,400);
    }
}
