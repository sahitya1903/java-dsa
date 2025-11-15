import java.awt.*;
import java.awt.event.*;

public class MouseEventsAWT extends Frame 
    implements MouseListener, MouseMotionListener {

    private String msg = "";
    private int x = 0, y = 0;

    public MouseEventsAWT() {
        super("Mouse Events (AWT) - Example");
        setSize(400, 300);
        setVisible(true);

        addMouseListener(this);
        addMouseMotionListener(this);

        // close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }

    // MouseListener
    public void mouseClicked(MouseEvent me) {
        msg = "Mouse Clicked";
        x = me.getX(); y = me.getY();
        repaint();
    }

    public void mousePressed(MouseEvent me) {
        msg = "Mouse Pressed";
        x = me.getX(); y = me.getY();
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        msg = "Mouse Released";
        x = me.getX(); y = me.getY();
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        msg = "Mouse Entered";
        x = 10; y = 20;
        repaint();
    }

    public void mouseExited(MouseEvent me) {
        msg = "Mouse Exited";
        x = 10; y = 20;
        repaint();
    }

    // MouseMotionListener
    public void mouseDragged(MouseEvent me) {
        msg = "Mouse Dragged";
        x = me.getX(); y = me.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent me) {
        msg = "Mouse Moved";
        x = me.getX(); y = me.getY();
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString(msg + " (" + x + "," + y + ")", 50, 100);
    }

    public static void main(String[] args) {
        new MouseEventsAWT();
    }
}
