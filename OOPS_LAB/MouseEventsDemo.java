import java.awt.*;
import java.awt.event.*;

public class MouseEventsDemo extends Frame implements MouseListener, MouseMotionListener {
    String msg = "";

    public MouseEventsDemo() {
        addMouseListener(this);
        addMouseMotionListener(this);
        setSize(400, 300);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawString(msg, 50, 100);
    }

    public void mouseClicked(MouseEvent e) { msg = "Mouse Clicked"; repaint(); }
    public void mouseEntered(MouseEvent e) { msg = "Mouse Entered"; repaint(); }
    public void mouseExited(MouseEvent e) { msg = "Mouse Exited"; repaint(); }
    public void mousePressed(MouseEvent e) { msg = "Mouse Pressed"; repaint(); }
    public void mouseReleased(MouseEvent e) { msg = "Mouse Released"; repaint(); }

    public void mouseMoved(MouseEvent e) { msg = "Mouse Moved"; repaint(); }
    public void mouseDragged(MouseEvent e) { msg = "Mouse Dragged"; repaint(); }

    public static void main(String[] args) {
        new MouseEventsDemo();
    }
}
