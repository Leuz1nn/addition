package Paint;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Paint extends JFrame {
    private int lastX, lastY;
    private Color currentColor = Color.BLACK;
    
    public Paint() {
        setTitle("Java Paint");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                lastX = e.getX();
                lastY = e.getY();
            }
        });
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Graphics g = panel.getGraphics();
                g.setColor(currentColor);
                int x = e.getX();
                int y = e.getY();
                g.drawLine(lastX, lastY, x, y);
                lastX = x;
                lastY = y;
            }
        });
        
        JButton colorButton = new JButton("Change Color");
        colorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color newColor = JColorChooser.showDialog(null, "Choose a color", currentColor);
                if (newColor != null) {
                    currentColor = newColor;
                }
            }
        });
        
        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(colorButton, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Paint();
    }
}
