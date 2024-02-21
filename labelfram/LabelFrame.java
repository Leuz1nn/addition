package labelfram;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class LabelFrame extends JFrame {
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    public LabelFrame(){
        super("testing label");
        setLayout(new FlowLayout());
        Icon ifmt = new ImageIcon(getClass().getResource("ifmt.png"));
        label3 = new JLabel();
        label3.setText("INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE MATO GROSSO");
        label3.setIcon(ifmt);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("this is label3");
        add(label3);
    }   
}
