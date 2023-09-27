import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.Random;

import javax.swing.*;

public class AddUser {

    JTextField txtAtmField, txtPinField;
    Random random = new Random();

    public void addView() throws SQLException {
        Common commons = new Common();
        JFrame frame = (JFrame) commons.Frame();
        Font txt = new Font("Rockwell", Font.BOLD, 20);
        SQLConnect manage = new SQLConnect();
        Success success = new Success();

        //--------------NAME--------------------
        JLabel lblName = new JLabel("Name : ");
        lblName.setBounds(50, 200, 100, 25);
        lblName.setFont(txt);
        JTextField txtName= new JTextField();
        txtName.setBounds(50, 230, 500, 30);
        frame.add(txtName);
        frame.add(lblName);
        //--------------------------------------

        //-------------ATMNUMBER------------------
        JLabel atmno = new JLabel("ATM Card Number : ");
        atmno.setBounds(50, 300, 500, 25);
        atmno.setFont(txt);
        txtAtmField = new JTextField();
        txtAtmField.setBounds(50, 330, 500, 30);
        txtAtmField.setEditable(false);
        frame.add(txtAtmField);
        frame.add(atmno);
        //----------------------------------------

        //-------------ATMPIN------------------
        JLabel lblAtmPin = new JLabel("ATM Card PIN : ");
        lblAtmPin.setBounds(50, 400, 500, 25);
        lblAtmPin.setFont(txt);
        txtPinField = new JTextField();
        txtPinField.setBounds(50, 430, 200, 30);
        txtPinField.setEditable(false);
        frame.add(txtPinField);
        frame.add(lblAtmPin);
        //----------------------------------------

        //-------------BALANCE------------------
        JLabel bal = new JLabel("BALANCE : ");
        bal.setBounds(350, 400, 500, 25);
        bal.setFont(txt);
        JTextField balField = new JTextField();
        balField.setBounds(350, 430, 200, 30);
        frame.add(balField);
        frame.add(bal);
        //----------------------------------------

        //--------------AUTOGENERATION----------------
        auto();
        //---------------------------------------------

        //---------------SUBMIT-------------------
        JButton sbmt = new JButton("SUBMIT");
        sbmt.setBounds(200, 500, 200, 50);
        sbmt.setBackground(new Color(0x2B3467));
        sbmt.setForeground(Color.white);
        frame.add(sbmt);
        sbmt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtName.getText().equals("")) {
                    if(balField.getText().equals(""))
                        balField.setText("0");
                    try {
                        manage.adding(txtAtmField.getText(), txtPinField.getText(), txtName.getText(), balField.getText());
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                    success.detailView(txtAtmField.getText(), txtPinField.getText());
                    balField.setText("");
                    txtName.setText("");
                    auto();
                }
            }
        });
        //------------------------------------------

        frame.setVisible(true);
    }

    public void auto() {
        String str = "";
        for(int i=0; i<16; i++) {
            str += random.nextInt(9 - 0 + 1) + 0;
        }
        txtAtmField.setText(str);
        str = "";
        for(int i=0; i<4; i++) {
            str += random.nextInt(9 - 0 + 1) + 0;
        }
        txtPinField.setText(str);
    }
}
