// Old Method
// import java.applet.*;
// import java.awt.*;

// public class smiley extends Applet {
//   public void paint(Graphics g) {
//     g.drawOval(80, 70, 150, 150);
//     setForeground(Color.red);
//     setBackground(Color.green);
//     g.fillOval(120, 120, 15, 15);
//     g.fillOval(170, 120, 15, 15);
//     g.drawArc(130, 180, 50, 20, 180, 180);

//   }
// }
// /*
// * <applet code="smiley.class" width="300" height="300">;
// * </applet>;
// */

// modern version
import javax.swing.*;
import java.awt.*;

public class Smiley extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.green);
        g.setColor(Color.red);

        // Face outline
        g.drawOval(80, 70, 150, 150);

        // Eyes
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);

        // Smile
        g.drawArc(130, 160, 50, 30, 180, 180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Smiley Face");
        Smiley smiley = new Smiley();
        frame.add(smiley);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
