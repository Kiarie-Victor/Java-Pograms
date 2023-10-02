import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParentSignup extends JFrame{
    public ParentSignup(){
        super("PASSMARK UNIVERSITY");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLayout(null);
        JLabel lblSignupForm=new JLabel("CREATE AN ACCOUNT");
        lblSignupForm.setForeground(Color.GREEN);
        lblSignupForm.setBounds(50,20,300,30);
        lblSignupForm.setFont(new Font("Tahoma", Font.BOLD,20));
        JLabel lblFname=new JLabel("Fullname:");
        JTextField txtFname= new JTextField();
        lblFname.setBounds(20,70,150,25);
        lblFname.setForeground(Color.BLUE);
        txtFname.setBounds(170,70,150,25);
        txtFname.setForeground(Color.BLUE);
        add(lblFname);
        add(txtFname);
        JLabel lblEmail=new JLabel("Parent Email:");
        lblEmail.setForeground(Color.BLUE);
        lblEmail.setBounds(20,100,150,25);
        JTextField txtEmail=new JTextField();
        txtEmail.setBounds(170,100,150,25);
        JLabel lblUname=new JLabel("Enter Username:");
        lblUname.setForeground(Color.BLUE);
        JTextField txtUname=new JTextField();
        txtUname.setBounds(170,150,150,25);
        lblUname.setBounds(20,150,150,25);
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
        add(lblUname);
        add(lblEmail);
        add(lblmobNo);
        add(lblPwd);
        add(txtMobno);add(txtEmail);add(txtUname);add(pwdPass);
        JButton btnSignup=new JButton("SIGN UP");
        btnSignup.setBackground(Color.DARK_GRAY);
        btnSignup.setForeground(Color.BLUE);
        btnSignup.setBounds(100,300,150,30);
        add(btnSignup);
        btnSignup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i;
                i = ParentDao.save(txtFname.getText(), txtEmail.getText(),txtUname.getText(),txtMobno.getText(),pwdPass.getText());
                if (i > 0) {
                    JOptionPane.showMessageDialog(ParentSignup.this, "Parent added successfully!");
                    setVisible(false);
                    new Parent();
                } else {
                    JOptionPane.showMessageDialog(ParentSignup.this, "Check Out for any ERRORS!!");

                    setVisible(false);
                    new ParentSignup();
                }}
        });


    } public static void main(){
        new ParentSignup();
    }
}