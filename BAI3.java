/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class BAI3 extends JFrame implements ActionListener {

    private JLabel username;
    private JTextField txtusername;
    private JLabel password;
    private JPasswordField txtpassword;
    private JLabel confirm;
    private JPasswordField txtconfirm;
    private JButton sign_up;
    private JButton cancel;

    public BAI3() {

        this.setTitle("Bai 3");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        username = new JLabel("UserName     ");
        txtusername = new JTextField();
        txtusername.setPreferredSize(new Dimension(220, 30));
        password = new JLabel("PassWord     ");
        txtpassword = new JPasswordField();
        txtpassword.setPreferredSize(new Dimension(220, 30));
        confirm = new JLabel("Confirm         ");
        txtconfirm = new JPasswordField();
        txtconfirm.setPreferredSize(new Dimension(220, 30));
        sign_up = new JButton("Sign Up");
        cancel = new JButton("Cancel");

        JPanel p1 = new JPanel();
        p1.setBounds(5, 10, 350, 50);
        p1.add(username);
        p1.add(txtusername);

        JPanel p2 = new JPanel();
        p2.setBounds(5, 70, 350, 50);
        p2.add(password);
        p2.add(txtpassword);

        JPanel p3 = new JPanel();
        p3.setBounds(5, 130, 350, 50);
        p3.add(confirm);
        p3.add(txtconfirm);

        JPanel p4 = new JPanel();
        p4.setBounds(60, 190, 300, 50);
        p4.add(sign_up);
        p4.add(cancel);
        sign_up.addActionListener(this);
        cancel.addActionListener(this);

        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
    }

    private boolean checknull() {
        if (txtusername.getText().equals("")) {
            return false;
        }
        if (txtpassword.getText().equals("")) {
            return false;
        }
        if (txtconfirm.getText().equals("")) {
            return false;
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String click = e.getActionCommand();
        if (click.equals("Sign Up")) {
            if (checknull()) {
                if (txtpassword.getText().equals(txtconfirm.getText())) {
                    JOptionPane.showMessageDialog(this, "OK");
                    txtusername.setText("");
                    txtpassword.setText("");
                    txtconfirm.setText("");
                    return;
                } else {
                    JOptionPane.showMessageDialog(this, "PassWord != Confirm ");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please fill in the information !");
            }
        }
        if (click.equals("Cancel")) {
            System.exit(0);
        }
    }

}
