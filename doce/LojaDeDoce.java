package doce;

import javax.swing.*;
import java.awt.*;

public class LojaDeDoce {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Loja de Doces");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel northPanel = new JPanel();
        northPanel.add(new JLabel("Loja de Doces"));

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(new JLabel("Selecione um doce:", SwingConstants.CENTER), BorderLayout.NORTH);

        JPanel cookiePanel = new JPanel();
        cookiePanel.add(new JLabel("cookie"));
        cookiePanel.add(new JLabel(new ImageIcon("cookie.png"))); 

        JPanel pudimPanel = new JPanel();
        pudimPanel.add(new JLabel("pudim"));
        pudimPanel.add(new JLabel(new ImageIcon("pudim.png"))); 

        JPanel brigadeiroPanel = new JPanel();
        brigadeiroPanel.add(new JLabel("brigadeiro"));
        brigadeiroPanel.add(new JLabel(new ImageIcon("brigadeiro.png"))); 

        centerPanel.add(cookiePanel, BorderLayout.WEST);
        centerPanel.add(pudimPanel, BorderLayout.CENTER);
        centerPanel.add(brigadeiroPanel, BorderLayout.EAST);

        JPanel southPanel = new JPanel();
        southPanel.add(new JLabel("Preço: R$ 5,00"));

       
        frame.getContentPane().add(northPanel, BorderLayout.NORTH);
        frame.getContentPane().add(centerPanel, BorderLayout.CENTER);
        frame.getContentPane().add(southPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}