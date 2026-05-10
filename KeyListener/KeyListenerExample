import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample extends Frame implements KeyListener {

    Label l;
    TextArea area;

    KeyListenerExample() {
        // Create components
        l = new Label();
        l.setBounds(20, 50, 200, 20);

        area = new TextArea();
        area.setBounds(20, 80, 300, 300);
        area.addKeyListener(this);  // Register KeyListener

        // Add components to frame
        add(l);
        add(area);

        // Frame settings
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    // KeyListener methods
    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        l.setText("Key Released");
    }

    public void keyTyped(KeyEvent e) {
        l.setText("Key Typed");
    }

    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
