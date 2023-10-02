import com.mysql.cj.protocol.Resultset;
import java.sql.ResultSet;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Student extends JFrame {



    private JLabel lblstudName,lblRegno,lblpasswd;
    private JTextField txtstud,txtReg;
    private JPasswordField passwdField;

    public Student(){
        super("PASSMARK UNIVERSITY");

        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);


        JLabel lblstudloginForm=new JLabel("STUDENT LOGIN FORM");
        lblstudloginForm.setFont(new Font("Tahoma", Font.PLAIN,20));
        lblstudloginForm.setForeground(Color.CYAN);
        lblstudloginForm.setBounds(200,50,300,40);
        add(lblstudloginForm);
        lblstudName=new JLabel("Enter Name:");
        lblstudName.setFont(new Font("Tahoma", Font.PLAIN,15));
        lblstudName.setForeground(Color.BLUE);
        lblstudName.setBounds(50,100,150,30);
        lblRegno=new JLabel("Admission Number:");
        lblRegno.setFont(new Font("Tahoma", Font.PLAIN,15));
        lblRegno.setForeground(Color.BLUE);
        lblRegno.setBounds(50,140,150,30);

        txtstud=new JTextField();
        txtstud.setBounds(200,100,150,30);
        txtReg=new JTextField();
        txtReg.setBounds(200,140,150,30);
        lblpasswd=new JLabel("Enter Password:");
        lblpasswd.setForeground(Color.BLUE);
        lblpasswd.setBounds(50,180,150,30);
        passwdField=new JPasswordField();
        passwdField.setBounds(200,180,150,30);
        add(lblstudName);add(txtstud);
        add(lblRegno);add(txtReg);
        add(lblpasswd);
        add(passwdField);
        JButton btnLogin=new JButton("LOGIN");
        btnLogin.setBackground(Color.cyan);
        btnLogin.setForeground(Color.BLUE);
        btnLogin.setBounds(200,220,150,30);
        add(btnLogin);
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                PreparedStatement ps;
                ResultSet rs;

                String Username=txtstud.getText();
                String Regno=txtReg.getText();
                String sql="select * from tblstudents where Fullname=? and RegNo=?";
                try{
                    ps=Db.getConnection().prepareStatement(sql);
                    ps.setString(1,Username);
                    ps.setString(2,Regno);
                    rs=ps.executeQuery();
                    if(rs.next())
                    {

                        JOptionPane.showMessageDialog(Student.this, "Logged in successfully!");
                        setVisible(false);
                        new DashbStud();
                    }else {
                        JOptionPane.showMessageDialog(Student.this, "Incorrect Student name  or Registration Number!!" );
                }

            }  catch (SQLException x){
                    Logger.getLogger(Student.class.getName()).log(Level.SEVERE,null,x);
                }
        }
        });
        JLabel lblSignup=new JLabel("Do not have an account yet?");
        lblSignup.setFont(new Font("Lucida calligraphy", Font.PLAIN,15));
        lblSignup.setForeground(Color.BLUE);
        lblSignup.setBounds(50,280,300,30);
        add(lblSignup);
        JButton btnSignup=new JButton("Sign Up");
        add(btnSignup);
        btnSignup.setBounds(200,310,150,30);
        btnSignup.setForeground(Color.blue);
        btnSignup.setBackground(Color.cyan);
        btnSignup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btnSignup){
                    setVisible(false);
                    new Signup();
                }
            }
        });

    }
    public static void main(String[] args){
        
        new Student();

    }
}