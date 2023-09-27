import java.awt.*;
//import java.awt.Color;
//import java.awt.Font;
import java.awt.event.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.SQLException;
import java.sql.*;
import javax.swing.*;
//import javax.swing.JButton;
//import javax.swing.JFrame;

public class Admin {
    public void adminView() {
        Common commons = new Common();
        JFrame frame = (JFrame) commons.Frame();

        //-------------ADDUSERS---------------------
        JButton btnAdd = new JButton("ADD USER");
        btnAdd.setBounds(150, 250, 300, 100);
        btnAdd.setBackground(new Color(0x2B3467));
        btnAdd.setForeground(Color.white);
        btnAdd.setFont(new Font("Rockwell", Font.BOLD, 25));
        frame.add(btnAdd);
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddUser user = new AddUser();
                try {
                    user.addView();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
                frame.dispose();
            }
        });
        //------------------------------------------

        //--------------EXIT---------------------------
        JButton btnExit = new JButton("EXIT");
        btnExit.setBounds(150, 400, 300, 100);
        btnExit.setBackground(new Color(0x2B3467));
        btnExit.setForeground(Color.white);
        btnExit.setFont(new Font("Rockwell", Font.BOLD, 25));
        frame.add(btnExit);
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        //---------------------------------------------
        frame.setVisible(true);
    }
}
