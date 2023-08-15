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
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class BAI2 extends JFrame implements ActionListener {

    private JLabel firstnumber;
    private JTextField txtfirst;
    private JLabel secondnumber;
    private JTextField txtsecond;
    private JLabel result;
    private JTextField txtresult;
    private JButton cong;
    private JButton tru;
    private JButton nhan;
    private JButton chia;

    public BAI2() {
        this.setTitle("Bai 2");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        firstnumber = new JLabel("First Number     ");
        txtfirst = new JTextField();
        txtfirst.setPreferredSize(new Dimension(220, 30));
        secondnumber = new JLabel("Second Number");
        txtsecond = new JTextField();
        txtsecond.setPreferredSize(new Dimension(220, 30));
        result = new JLabel("Result              ");
        txtresult = new JTextField();
        txtresult.setPreferredSize(new Dimension(220, 30));
        txtresult.setEnabled(false);
        cong = new JButton("+");
        tru = new JButton("-");
        nhan = new JButton("*");
        chia = new JButton("/");

        JPanel p1 = new JPanel();
        p1.setBounds(5, 10, 350, 50);
        p1.add(firstnumber);
        p1.add(txtfirst);

        JPanel p2 = new JPanel();
        p2.setBounds(5, 70, 350, 50);
        p2.add(secondnumber);
        p2.add(txtsecond);

        JPanel p3 = new JPanel();
        p3.setBounds(5, 130, 350, 50);
        p3.add(result);
        p3.add(txtresult);

        JPanel p4 = new JPanel();
        p4.setBounds(70, 190, 300, 50);
        p4.add(cong);
        p4.add(tru);
        p4.add(nhan);
        p4.add(chia);
        cong.addActionListener(this);
        tru.addActionListener(this);
        nhan.addActionListener(this);
        chia.addActionListener(this);
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String click = e.getActionCommand();
        double a, b;
        if (txtfirst.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "First Number null");
            return;
        }
        if (txtsecond.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Second Number null");
            return;
        }
        try {
            a = Double.parseDouble(txtfirst.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "First != Number ?");
            return;
        }
        try {
            b = Double.parseDouble(txtsecond.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Second != Number ?");
            return;
        }
        if (click.equals("+")) {
            double tong = 0;

            tong = a + b;
            txtresult.setText(tong + "");
        }
        if (click.equals("-")) {
            double hieu = 0;
            hieu = a - b;
            txtresult.setText(hieu + "");
        }
        if (click.equals("*")) {
            double tich = 0;
            tich = a * b;
            txtresult.setText(tich + "");
        }
        if (click.equals("/")) {
            if (txtsecond.getText().equals(0 + "")) {
                JOptionPane.showMessageDialog(this, "Second = 0 !");
                return;
            }
            double thuong = 0;
            thuong = a / b;
            txtresult.setText(thuong + "");
        }

    }

}
