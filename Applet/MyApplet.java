import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {

    String username;

    // init() method
    public void init() {
        username = getParameter("username");
        System.out.println("Applet Initialized");
    }

    // start() method
    public void start() {
        System.out.println("Applet Started");
    }

    // paint() method
    public void paint(Graphics g) {
        System.out.println("Painting Applet");

        g.drawString("Welcome to VJIT", 50, 50);
        g.drawString("Hello, " + username, 50, 80);
    }

    
    public void stop() {
        System.out.println("Applet Stopped");
    }

    
    public void destroy() {
        System.out.println("Applet Destroyed");
    }
}
