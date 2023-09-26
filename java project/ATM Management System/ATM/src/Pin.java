import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class Pin {
    public void pinView(String cardNum) {
        Common common = new Common();
        JFrame frame = (JFrame)common.Frame();
        Font txt = new Font("", Font.BOLD, 15);
        Home home = new Home();
        Admin admin = new Admin();

        //---------------PASSWORD----------------
        JLabel pswd = new JLabel("ENTER YOUR PIN");
        pswd.setBounds(50, 270, 250, 20);
        pswd.setFont(txt);
        JPasswordField pswdField = new JPasswordField();
        pswdField.setBounds(180, 270, 300, 25);
        pswdField.setFont(txt);
        frame.add(pswdField);
        frame.add(pswd);
        //-----------------------------------------

        //-----------------BUTTON-----------------
        JButton cont = new JButton("COUNTINUE");
        cont.setBounds(220, 350, 150, 30);
        cont.setBackground(new Color(0x2B3467));
        cont.setForeground(Color.white);
        cont.setFont(new Font("Rockwell", Font.BOLD, 15));
        frame.add(cont);
        cont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    SQLConnect man = new SQLConnect();
                    ResultSet rst = man.check(cardNum, pswdField.getText());
                    if(rst.next()) {
                        if(rst.getString("card").equals("admin")) {
                            admin.adminView();
                            frame.dispose();
                        }
                        else {
                            home.homeView(rst.getInt("id"));
                            frame.dispose();
                        }
                    }
                    else {
                        Fail fail = new Fail();
                        fail.failView("WRONG PIN!!!");
                        frame.dispose();
                    }
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }

        });
        //----------------------------------------
        frame.setVisible(true);
    }
}