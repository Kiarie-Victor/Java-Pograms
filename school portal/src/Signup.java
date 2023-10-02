import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup extends JFrame{
    public Signup(){
        super("PASSMARK UNIVERSITY");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(null);
        JLabel lblSignupForm=new JLabel("CREATE AN ACCOUNT");
        lblSignupForm.setForeground(Color.GREEN);
        lblSignupForm.setBounds(50,20,300,30);
        lblSignupForm.setFont(new Font("Tahoma", Font.BOLD,20));
        JLabel lblRegNo=new JLabel("REG No.");
        JTextField txtRegNo= new JTextField();
        lblRegNo.setBounds(20,70,150,25);
        lblRegNo.setForeground(Color.BLUE);
        txtRegNo.setBounds(170,70,150,25);
        txtRegNo.setForeground(Color.BLUE);
        add(lblRegNo);
        add(txtRegNo);
         JLabel lblFname=new JLabel("Enter Name:");
         lblFname.setForeground(Color.BLUE);
         lblFname.setBounds(20,100,150,25);
         JTextField txtFname=new JTextField();
         txtFname.setBounds(170,100,150,25);
         JLabel lblEmail=new JLabel("Enter EmailId:");
         lblEmail.setForeground(Color.BLUE);
         JTextField txtEmail=new JTextField();
         txtEmail.setBounds(170,150,150,25);
         lblEmail.setBounds(20,150,150,25);
         JLabel lblPwd=new JLabel("Password");
         lblPwd.setForeground(Color.BLUE);
         lblPwd.setBounds(20,200,150,25);
         JPasswordField pwdPass=new JPasswordField();
         pwdPass.setBounds(170,200,150,25);
         JLabel lblmobNo=new JLabel("Mobile Number:");
         lblmobNo.setForeground(Color.BLUE);
         lblmobNo.setBounds(20,250,150,25);
         JTextField txtMobno=new JTextField();
         txtMobno.setBounds(170,250,150,25);
         add(lblSignupForm);
         add(lblFname);
         add(lblEmail);
         add(lblmobNo);
         add(lblPwd);
         add(txtMobno);add(txtEmail);add(txtFname);add(pwdPass);
         JButton btnSignup=new JButton("SIGN UP");
         btnSignup.setBackground(Color.DARK_GRAY);
         btnSignup.setForeground(Color.BLUE);
         btnSignup.setBounds(100,300,150,30);
         add(btnSignup);
         btnSignup.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                int i;
                 i = StudentDao.save(txtRegNo.getText(), txtFname.getText(),txtEmail.getText(),txtMobno.getText(),pwdPass.getText());
                 if (i > 0) {
                    JOptionPane.showMessageDialog(Signup.this, "student added successfully!");
                     new Student();
                 } else {
                  JOptionPane.showMessageDialog(Signup.this, "Check Out for any ERRORS!!");
                 
                 setVisible(false);
                 new Signup();
             }}
             });


} public static void main(){
        new Signup();
    }
}