package teacher;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;

import javax.imageio.ImageIO;
import javax.swing.*;
public class mainwindow implements ActionListener
  {
 static JFrame jf = new JFrame("Example");
 JPanel panel = new JPanel();
 JRadioButton rb1 = new JRadioButton("用户");
 JRadioButton rb2 = new JRadioButton("管理员");
 Button btok= new Button("登陆");
 ButtonGroup group = new ButtonGroup ();
 JTextField text = new JTextField(10);
 JTextField text2= new JTextField(10);
 JTextField text3= new JTextField(10);
 Image img;
 mainwindow(){
 rb1.setBounds(10, 10, 100, 25);
 rb2.setBounds(10, 30, 100, 25);
 text.setBounds(10, 70, 100, 30);
 text2.setBounds(10, 110, 100, 30);
 text3.setBounds(10, 150, 100, 30);
 btok.setBounds(10, 190, 100, 30);
 panel.setLocation(0, 0);
 panel.setSize(200, 250);

 jf.add(panel);
 group.add(rb1);
 group.add(rb2);
 panel.add(rb1);
 panel.add(rb2);
 panel.add(text);
 panel.add(text2);
 panel.add(text3);
 panel.add(btok);
 rb1.addActionListener(this);
 rb2.addActionListener(this);
 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 jf.setSize(500,500);
 jf.setLayout(null);
 panel.setLayout(null);
 jf.setVisible(true);
 jf.setResizable(false);
 text.setVisible(false);

btok.addActionListener(new ActionListener() {
//@Override
public void actionPerformed(ActionEvent arg0) {
String name=text2.getText();
String password=text3.getText();
String compefence=text.getText();
if (new Login().verify(name,password,compefence)) {
Secwindow.start();
}
else { JOptionPane jop=new JOptionPane();
 JOptionPane.showMessageDialog(null,"用户名或密码错误","信息提示!",-1);}
}




});
 }
 public static void main(String[] args) {
 mainwindow t = new mainwindow();

 }
 public void actionPerformed(ActionEvent e) {
 if(group.getSelection()==rb1.getModel()){
 text.setText("0");
 }
 if(group.getSelection()==rb2.getModel()){
 text.setText("1");
 }
 }

}


