import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Parent extends JFrame{
static Parent frame;
private JPanel contPane;
private JTextField txtfield;
private JPasswordField pwdfield;
    public Parent(){
        super("PASSMARK UNIVERSITY");


        setBounds(100,100,450,450);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        contPane=new JPanel();
        contPane.setBorder(new EmptyBorder(5,5,5,5));
        contPane.setBackground(Color.GRAY);
        setContentPane(contPane);

        JLabel lblParentLoginForm=new JLabel("PARENT LOGIN FORM");
        lblParentLoginForm.setForeground(Color.blue);
        lblParentLoginForm.setFont(new Font("Tahoma", Font.PLAIN,18));
        JLabel lblName= new JLabel("Enter Name:");
        lblName.setForeground(Color.BLUE);
        lblName.setFont(new Font("Tahoma", Font.PLAIN,15));
        JLabel lblPwd= new JLabel("Enter Password:");
        lblPwd.setForeground(Color.BLUE);
        lblPwd.setFont(new Font("Tahoma", Font.PLAIN,15));
        JLabel lblSignup=new JLabel("Do not have an account yet?");
        lblSignup.setFont(new Font("Lucida calligraphy", Font.PLAIN,15));
        lblSignup.setForeground(Color.BLUE);
        lblSignup.setBounds(50,280,250,30);
        add(lblSignup);
        JButton btnSignup=new JButton("Sign Up");
        add(btnSignup);
        btnSignup.setBounds(300,280,120,30);
        btnSignup.setForeground(Color.cyan);
        btnSignup.setBackground(Color.blue);
        btnSignup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==btnSignup){
                    setVisible(false);
                    new ParentSignup();
                }
            }
        });



        txtfield=new JTextField();
        txtfield.setColumns(10);

        JButton btnLogin=new JButton("Login");
        btnLogin.setForeground(Color.CYAN);
        btnLogin.setBackground(Color.blue);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PreparedStatement ps;
                ResultSet rs;

                String Username=txtfield.getText();
                String pass=pwdfield.getText();
                String sql="select * from parent where Fullname=? and Password=?";
                try{
                    ps=Db.getConnection().prepareStatement(sql);
                    ps.setString(1,Username);
                    ps.setString(2,pass);
                    rs=ps.executeQuery();
                    if(rs.next())
                    {

                        JOptionPane.showMessageDialog(Parent.this, "Logged in successfully!");
                        setVisible(false);
                        ParentSuccess.main(new String[]{});
                    }else {
                        JOptionPane.showMessageDialog(Parent.this, "Incorrect Parent name  or Password!!" );
                    }

                }  catch (SQLException x){
                    Logger.getLogger(Student.class.getName()).log(Level.SEVERE,null,x);
                }

            }
        });
        pwdfield=new JPasswordField();
        GroupLayout gl_contPane=new GroupLayout(contPane);
        gl_contPane.setHorizontalGroup(gl_contPane.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addGroup(gl_contPane.createSequentialGroup()
                        .addGroup(gl_contPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(gl_contPane.createSequentialGroup()
                                        .addGap(124)
                                        .addComponent(lblParentLoginForm))
                                .addGroup(gl_contPane.createSequentialGroup()
                                        .addGap(20)
                                        .addGroup(gl_contPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(lblName)
                                                .addComponent(lblPwd))
                                        .addGap(50)
                                        .addGroup(gl_contPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(pwdfield)
                                                .addComponent(txtfield,GroupLayout.DEFAULT_SIZE,170,Short.MAX_VALUE))))
                        .addContainerGap(108,Short.MAX_VALUE)
                )
                .addGroup(gl_contPane.createSequentialGroup()
                        .addContainerGap(185,Short.MAX_VALUE)
                        .addComponent(btnLogin,GroupLayout.DEFAULT_SIZE,172,Short.MAX_VALUE)
                        .addGap(151))
        );
        gl_contPane.setVerticalGroup(
                gl_contPane.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_contPane.createSequentialGroup()
                                .addComponent(lblParentLoginForm)
                                .addGap(26)
                                .addGroup(gl_contPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblName)
                                        .addComponent(txtfield,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(28)
                                .addGroup(gl_contPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPwd)
                                        .addComponent(pwdfield, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(80, Short.MAX_VALUE))
        );
        contPane.setLayout(gl_contPane);



    }
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new Parent();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}