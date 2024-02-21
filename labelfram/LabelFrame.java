package labelfram;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class LabelFrame extends JFrame {
    private JLabel label1;
    public LabelFrame(){
        super("testing label");
        setLayout(new FlowLayout());
        Icon ifmt = new ImageIcon(getClass().getResource("ifmt.png"));
        label1 = new JLabel();
        label1.setText("INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE MATO GROSSO");
        label1.setIcon(ifmt);
        label1.setHorizontalTextPosition(SwingConstants.CENTER);
        label1.setVerticalTextPosition(SwingConstants.BOTTOM);
        label1.setToolTipText("this is label3");
        add(label1);
    }   
}
