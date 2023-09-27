import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame {

    JButton btnLogin,btnLock;
    JLabel lblmsgLock,lblPwd;
    JPasswordField txtpwd;

    public login(){

        super("LOG IN FRAME");

        lblmsgLock=new JLabel("Application Locked.Click \"UNLOCK\" to gain access");
        btnLock=new JButton("UNLOCK");
        btnLogin=new JButton("Log in");
        lblPwd=new JLabel("Enter password");
        txtpwd=new JPasswordField(20);

        btnLogin.setVisible(false);
        lblPwd.setVisible(false);
        txtpwd.setVisible(false);

        setSize(900,500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


        lblmsgLock.setBounds(120,50,300,40);
        add(lblmsgLock);
        btnLock.setBounds(240,130,120,30);
        add(btnLock);
        lblPwd.setBounds(140,100,90,20);
        add(lblPwd);
        txtpwd.setBounds(240,100,170,20);
        add(txtpwd);
        btnLogin.setBounds(280,150,80,40);
        add(btnLogin);

        btnLock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblmsgLock.setVisible(false);
                btnLock.setVisible(false);
                 lblPwd.setVisible(true);
                 txtpwd.setVisible(true);
                 btnLogin.setVisible(true);


        }});

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtpwd.getText().equals("123")){
                    new student();
                    setVisible(false);

                }
                else {
                    JOptionPane.showMessageDialog(btnLock,"wrong password");
                    txtpwd.setText("");
                }

            }

        });


    }


    public static void main(String[] args) {
        login l=new login();

    }
}
