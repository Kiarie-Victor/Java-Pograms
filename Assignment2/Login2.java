package Assignment2;

import javax.swing.*;
import java.awt.event.*;

public class Login2 {
    private JFrame frame1,frame2;
    private JButton jbExit,jbClear,jbLogin;
    private JLabel jbusername,jbPassword;
    private JTextField jtTextfield;
    private JPasswordField jpPassword;
     

    public Login2(){
        frame1 =new JFrame("Login Form");
        jbusername= new JLabel("Username");
        jbusername.setBounds(100,100,100, 30);
        jtTextfield=new JTextField();
        jtTextfield.setBounds(220, 100,100, 30);
        jbPassword=new JLabel("Password");
        jbPassword.setBounds(100,150,100,30);
        jpPassword= new JPasswordField();
        jpPassword.setBounds(220,150, 100, 30);
        jbLogin=new JButton("Login");
        jbLogin.setBounds(100,280,80,30);
        jbExit = new JButton("Exit");
        jbExit.setBounds(190, 280, 60, 30);
        jbClear = new JButton("Clear");
        jbClear.setBounds(270,280,80,30);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(null);
        frame1.setSize(1000,1000);
        frame1.add(jbusername);
        frame1.add(jtTextfield);
        frame1.add(jbPassword);
        frame1.add(jpPassword);
        frame1.add(jbLogin);
        frame1.add(jbExit);
        frame1.add(jbClear);
        jbClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                jtTextfield.setText(" ");
                jpPassword.setText("");
            }
        });
        jbExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int option;
               option= JOptionPane.showConfirmDialog(frame1,"Are you sure you want to exit");
               if(option==0){
                System.exit(0);
               }
               else{

               }
            }
        });
        jbLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
            String username="kiarie";
            int comparison = username.compareTo(jtTextfield.getText());
            String userInputPassword=String.valueOf(jpPassword.getPassword());
           ;if(comparison==0){
                if(userInputPassword.equals("1234")){
                    JOptionPane.showMessageDialog(frame1,"You have loged in successfully");
                        frame1.setVisible(false);
                        frame2 = new JFrame("Main Form");
                        JMenuBar bar = new JMenuBar();
                        JMenu mnuFile,mnuExit,mnuView,mnuHelp,mnuImport;
                        JMenuItem newF;
                        JLabel portForlio;
                        mnuFile=new JMenu("File");
                        mnuView=new JMenu("View");
                        mnuExit=new JMenu("Exit");
                        mnuHelp=new JMenu("Help");
                        newF=new JMenuItem("New");
                        mnuImport=new JMenu("Import");
                        frame2.setVisible(true);
                        frame2.setJMenuBar(bar);
                        bar.add(mnuFile);
                        bar.add(mnuView);
                        bar.add(mnuExit);
                        bar.add(mnuHelp);
                        mnuFile.add(newF);
                        mnuFile.add(mnuImport);
                        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame2.setSize(1000,1000);

                }
                else{
                    JOptionPane.showMessageDialog(frame1,"Incorrect Password");
                }
            }
            else{
                JOptionPane.showMessageDialog(frame1,"Incorrect username");
            }
            }
        });
    }
    public static void main(String [] a){
        new Login2();
    }

}
