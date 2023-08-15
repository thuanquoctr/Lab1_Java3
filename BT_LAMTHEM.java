/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author DELL
 */
public class BT_LAMTHEM extends JFrame implements ActionListener {

    private JLabel num1;
    private JLabel cong;
    private JLabel num2;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JLabel text;
    private JButton reset;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;

    public BT_LAMTHEM() {
        setTitle("BT LAM THEM");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        num1 = new JLabel("0");
        cong = new JLabel("+");
        num2 = new JLabel("0");
        text = new JLabel("Xin moi chon !");
        btn1 = new JButton("0");
        btn2 = new JButton("0");
        btn3 = new JButton("0");
        reset = new JButton("Reset");
        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(num1);
        p1.add(cong);
        p1.add(num2);

        p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(btn1);
        p2.add(btn2);
        p2.add(btn3);

        p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        p3.add(text);
        p4 = new JPanel();
        p4.setLayout(new FlowLayout());
        p4.add(reset);
        this.setLayout(new GridLayout(4, 1));
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        reset.addActionListener(this);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String click = e.getActionCommand();
        System.out.println(click);
        int numm1, numm2;
        if (click.equals("Reset")) {
            Random rand = new Random();
            numm1 = rand.nextInt(100) + 1;
            numm2 = rand.nextInt(100) + 1;
            num1.setText(numm1 + "");
            num2.setText(numm2 + "");
            int sum = numm1 + numm2; // ket qua dung;
            int[] numbers = new int[3];
            numbers[0] = sum;
            do {
                numbers[1] = rand.nextInt((sum + 10) - (sum - 10) + 1) + (sum - 10); //số ngẫu nhiên trong khoảng từ 0 đến 99
            } while (numbers[1] == sum);
            do {
                numbers[2] = rand.nextInt((sum + 10) - (sum - 10) + 1) + (sum - 10);
            } while (numbers[2] == sum || numbers[2] == numbers[1]);
            // Tron mang so ngau nhien
            for (int i = 0; i < numbers.length; i++) {
                int randomIndex = rand.nextInt(numbers.length);
                int temp = numbers[i];
                numbers[i] = numbers[randomIndex];
                numbers[randomIndex] = temp;
            }
            // gan cac gia tri cho btn;
            btn1.setText(String.valueOf(numbers[0]));
            btn2.setText(String.valueOf(numbers[1]));
            btn3.setText(String.valueOf(numbers[2]));
            text.setText("Xin moi chon !");
            return;
        }
        //su ly si kien;
        if (Integer.parseInt(click) == (Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText()))) {
            text.setText("Bạn đã chọn đúng , Reset để chơi tiếp !");
            return;
        } else {
            text.setText("Bạn đã chọn sai , Reset để chơi lại !");
            return;
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new BT_LAMTHEM();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
