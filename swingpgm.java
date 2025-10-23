import javax.swing.*;
import java.awt.Color;

class swingpgm {
  public static void main(String[] args) {
    JFrame f = new JFrame();// creating instance of JFrame
    JLabel l1, l2, l3, l4, l5, l6, l7;
    l1 = new JLabel("NAME");
    l1.setBounds(10, 50, 200, 30);
    f.add(l1);
    JTextField name = new JTextField();
    name.setBounds(70, 50, 200, 30);
    l2 = new JLabel("PNUM");
    l2.setBounds(10, 100, 200, 30);
    f.add(l2);
    JTextField phnum = new JTextField();
    phnum.setBounds(70, 100, 200, 30);
    f.add(name);
    f.add(phnum);
    l3 = new JLabel("COURSE");
    l3.setBounds(2, 130, 200, 30);
    f.add(l3);
    JCheckBox checkBox1 = new JCheckBox("MCA");
    checkBox1.setBounds(70, 120, 100, 50);
    JCheckBox checkBox2 = new JCheckBox("MBA", true);

    checkBox2.setBounds(70, 150, 100, 50);
    f.add(checkBox1);
    f.add(checkBox2);
    l4 = new JLabel("ADDRESS");
    l4.setBounds(1, 200, 200, 30);
    f.add(l4);
    JTextArea address = new JTextArea();
    address.setBounds(70, 200, 100, 50);
    f.add(address);
    l5 = new JLabel("GENDER");
    l5.setBounds(2, 250, 200, 30);
    f.add(l5);
    JRadioButton r1 = new JRadioButton("A) Male");
    JRadioButton r2 = new JRadioButton("B) Female");
    r1.setBounds(70, 250, 100, 30);
    r2.setBounds(70, 300, 100, 30);
    ButtonGroup bg = new ButtonGroup();
    bg.add(r1);
    bg.add(r2);
    f.add(r1);
    f.add(r2);
    l6 = new JLabel("COUNTRY");
    l6.setBounds(2, 340, 200, 30);
    f.add(l6);
    String country[] = { "India", "Aus", "U.S.A", "England", "Newzealand" };
    JComboBox cb = new JComboBox(country);
    cb.setBounds(70, 350, 90, 20);

    f.add(cb);
    l7 = new JLabel("SUBJECT");
    l7.setBounds(2, 400, 200, 30);
    f.add(l7);
    String week[] = { "C++", "Java", "Web" };
    JList list1 = new JList(week);
    list1.setBounds(70, 400, 100, 50);
    f.add(list1);
    JPanel panel = new JPanel();
    panel.setBounds(70, 500, 200, 100);
    panel.setBackground(Color.GRAY);
    JButton b1 = new JButton("Button 1");
    b1.setBounds(70, 470, 80, 30);
    b1.setBackground(Color.YELLOW);
    JButton b2 = new JButton("Button 2");
    b2.setBounds(100, 470, 80, 30);
    b2.setBackground(Color.GREEN);
    panel.add(b1);
    panel.add(b2);
    f.add(panel);
    f.setSize(400, 750);// 400 width and 500 height
    f.setLayout(null);// using no layout managers
    f.setVisible(true);// making the frame visible
    JButton b = new JButton("REGISTER");// creating instance of JButton
    b.setBounds(130, 650, 100, 40);// x axis, y axis, width, height
    f.add(b);// adding button in JFrame
  }
}