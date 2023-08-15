/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1;

import javax.swing.UIManager;

/**
 *
 * @author DELL
 */
public class TestBai3 {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            BAI3 b3 = new BAI3();
            b3.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
