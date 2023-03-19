package Assignment;
//import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import java.awt.event.*;
public class Login extends JFrame {
private JLabel jusername,jpassword;
private JPasswordField jtpassword;
private JTextField jtusername;
private JButton blogin,bexit,bclear; 
private char getpass[];
private String username;
    public Login(){  
        super("Login");
        jusername=new JLabel("Usename");
        jusername.setBounds(100, 100, 200, 30);
        jtusername=new JTextField();
        jtusername.setBounds(300,100,200,30);

        jpassword=new JLabel("Password");
        jpassword.setBounds(100, 150, 200,30);
        jtpassword=new JPasswordField();
        jtpassword.setBounds(300, 150, 200, 30);

        blogin=new JButton("Login");
        blogin.setBounds(100, 200, 80, 30);
        blogin.addActionListener(new Inner());

        bexit=new JButton("Exit");
        bexit.setBounds(230, 200, 80, 30);
        bexit.addActionListener(new Inner());

        bclear=new JButton("Clear");
        bclear.setBounds(360,200,80,30);
        bclear.addActionListener(new Inner());

        setVisible(true);
        setSize(1000, 1000);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(jusername);
        add(jtusername);
        add(jpassword);
        add(jtpassword);
        add(blogin);
        add(bexit);
        add(bclear);
    }
    private class Inner implements ActionListener{
        public void actionPerformed(ActionEvent e ){
        getpass=jtpassword.getPassword();
        username=jtusername.getText();
        char password []={'1','2','3','4'};
        if(e.getSource()==bexit){
            System.exit(0);
        }
        else if(e.getSource()==bclear){
            jtusername.setText("");
            jtpassword.setText("");
        }
        else if(e.getSource()==blogin) {
                String user="kiarie";
                int response=user.compareTo(username);
                if(getpass.length != password.length || response!=0) {
                JOptionPane.showMessageDialog(rootPane,"Incorrect password or username");
                }
                else{
                    if(response==0){
                        for(int i=0;i<password.length;i++){
                            if(password[i]==getpass[i]){
                            JOptionPane.showMessageDialog(rootPane,"Loged in succesfully");
                            setVisible(false);
                                }
                            }
                    }
                    else{
                        JOptionPane.showMessageDialog(rootPane,"Incorrect password");
                    }
                }
            }
        }                
    }            
    public static void main(String [] argd){
        new Login();
    }
}
