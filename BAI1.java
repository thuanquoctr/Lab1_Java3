/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;

/**
 *
 * @author DELL
 */
public class BAI1 extends JFrame implements ActionListener {
    JCheckBox jchk_apple;
    JCheckBox jchk_mango;
    JCheckBox jchk_beer;
    JLabel jbl1;
    public BAI1() {
        this.setTitle("Bai 1");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p1 = new JPanel();
        JLabel jbl = new JLabel("Control in action: Checkbox");
        p1.add(jbl);
        jchk_apple = new JCheckBox("Apple");
        jchk_mango = new JCheckBox("Mango");
        jchk_beer = new JCheckBox("Beer");
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(jchk_apple);
        p2.add(jchk_mango);
        p2.add(jchk_beer);
        jchk_apple.addActionListener(this);
        jchk_mango.addActionListener(this);
        jchk_beer.addActionListener(this);
        jchk_apple.setMnemonic(KeyEvent.VK_M);
        jchk_mango.setMnemonic(KeyEvent.VK_H);
        jchk_beer.setMnemonic(KeyEvent.VK_B);     
        JPanel p3 = new JPanel();
        jbl1 = new JLabel(" Checkbox checked");
        p3.add(jbl1);
        ButtonGroup group = new ButtonGroup();
        group.add(jchk_apple);
        group.add(jchk_mango);
        group.add(jchk_beer);
        this.setLayout(new GridLayout(3, 1));
        this.add(p1);
        this.add(p2);
        this.add(p3);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            String event = e.getActionCommand();
            if(event.equals("Apple")){
                jbl1.setText("Apple Checkbox : checked");
            }
            if(event.equals("Mango")){
                jbl1.setText("Mango Checkbox : checked");
            }
            if(event.equals("Beer")){
                jbl1.setText("Beer Checkbox : checked");
            }
    }

}
