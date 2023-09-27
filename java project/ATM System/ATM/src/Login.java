import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends Common{
    public void loginView() {
        Common common = new Common();
        JFrame frame = (JFrame)common.Frame();
        Font txt = new Font("", Font.BOLD, 15);
        Pin pin = new Pin();

        //---------------CARDNUMBER----------------
        JLabel card = new JLabel("CARD NUMBER");
        card.setBounds(50, 270, 250, 20);
        card.setFont(txt);
        JTextField cardNumber = new JTextField();
        cardNumber.setBounds(180, 270, 300, 25);
        cardNumber.setFont(txt);
        frame.add(cardNumber);
        frame.add(card);
        //-----------------------------------------

        //----------------ADMIN--------------------
        JLabel admin = new JLabel("ADMIN LOGIN >");
        admin.setBounds(370, 340, 570, 30);
        admin.setFont(txt);
        frame.add(admin);
        admin.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                pin.pinView("admin");
                frame.dispose();
            }
        });
        //------------------------------------------

        //-----------------BUTTON-----------------
        JButton cont = new JButton("COUNTINUE");
        cont.setBounds(190, 340, 130, 30);
        cont.setBackground(new Color(0x2B3467));
        cont.setForeground(Color.white);
        cont.setFont(new Font("Sans Serif", Font.BOLD, 15));
        frame.add(cont);
        cont.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cardNumber.getText().length() == 16) {
                    pin.pinView(cardNumber.getText());
                    frame.dispose();
                }
                else {
                    Fail fail = new Fail();
                    fail.failView("WRONG CARD NUMBER!!!");
                    frame.dispose();
                }
            }

        });
        //----------------------------------------
        frame.setVisible(true);
    }
}
