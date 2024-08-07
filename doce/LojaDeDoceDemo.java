package doce;

import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
public class LojaDeDoceDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Loja de Doces");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel with a GridLayout
        JPanel gridPanel = new JPanel(new GridLayout(3, 2));

        // Add components to the grid
        gridPanel.add(new JLabel("cookie"));
        gridPanel.add(new JLabel(new ImageIcon("cookie.png"))); // replace with your image file

        gridPanel.add(new JLabel("pudim"));
        gridPanel.add(new JLabel(new ImageIcon("pudim.png"))); // replace with your image file

        gridPanel.add(new JLabel("brigadeiro"));
        gridPanel.add(new JLabel(new ImageIcon("brigadeiro.png"))); // replace with your image file

        // Add a label for the price
        gridPanel.add(new JLabel("Preço: R$ 5,00"));
        gridPanel.add(new JLabel()); // empty label to fill the grid

        // Add the grid panel to the frame
        frame.getContentPane().add(gridPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}