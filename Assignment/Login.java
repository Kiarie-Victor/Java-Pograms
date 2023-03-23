package Assignment;
//import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import java.awt.event.*;
public class Login {
private JLabel jusername,jpassword;
private JPasswordField jtpassword;
private JTextField jtusername;
private JButton blogin,bexit,bclear; 
private char getpass[];
private String username;
JFrame frame1,frame2;
    public Login(){  
        frame1=new JFrame();
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

        frame1.setVisible(true);
        frame1.setSize(1000, 1000);
        frame1.setLayout(null);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.add(jusername);
        frame1.add(jtusername);
        frame1.add(jpassword);
        frame1.add(jtpassword);
        frame1.add(blogin);
        frame1.add(bexit); 
        frame1.add(bclear);
    
    }
    private class Inner implements ActionListener{
        public void actionPerformed(ActionEvent e ){
        getpass=jtpassword.getPassword();
        username=jtusername.getText();
        char password []={'1','2','3','4'};
        if(e.getSource()==bexit){
            int ok=JOptionPane.showConfirmDialog(frame1,"Are you sure you want to exit");
            if(ok==0){
                System.exit(0);
            }
            else{

            }
            
        }
        else if(e.getSource()==bclear){
            jtusername.setText("");
            jtpassword.setText("");
        }
        else if(e.getSource()==blogin) {
                String user="kiarie";
                
                int response=user.compareTo(username);
                if(getpass.length != password.length || response!=0) {
                JOptionPane.showMessageDialog(null,"Incorrect password or username");
                
                }
                else{
                    String pass=String.valueOf(jtpassword.getPassword());
                    if(response==0 && pass.equals("1234")){
                            JOptionPane.showMessageDialog(null,"Loged in succesfully");
                            frame1.setVisible(false);
                             frame2=new JFrame();
                            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frame2.setVisible(true);
                            frame2.setSize(1000,1000);
                            frame2.setLayout(null);
                            JLabel input1,input2,usergender,result;
                            JButton but1,but2,but3,but4,logout,submit;
                            JTextField num1,num2,answer;
                            JRadioButton man,man2;
                            ButtonGroup manfemale;
                            usergender=new JLabel("User Gender");
                            usergender.setBounds(100,300,100,30);
                            frame2.add(usergender);
                        man=new JRadioButton("male"); 
                        man.setBounds(220,300,100,30);
                        manfemale= new ButtonGroup();
                         manfemale.add(man); 
                        man2=new JRadioButton("Female");
                        man2.setBounds(220,350,100,30);
                        manfemale.add(man2);
                        frame2.add(man);
                        frame2.add(man2);
                        input1=new JLabel("Input");
                        input1.setBounds(100, 100, 200,30);
                        frame2.add(input1);
                        num1=new JTextField();
                        num1.setBounds(300,100,100,30);
                        frame2.add(num1);
                        result=new JLabel("result");
                        result.setBounds(450,100,100,30);
                        frame2.add(result);
                        input2=new JLabel("Input");
                        input2.setBounds(100,150,200, 30);
                        frame2.add(input2);
                        num2=new JTextField();
                        num2.setBounds(300,150,100,30);
                        answer= new JTextField();
                        answer.setEditable(false);
                        answer.setBounds(450,150,100,30);
                        frame2.add(answer);
                        frame2.add(num2);
                        but1=new JButton("sum");
                        but1.setBounds(100,200,100, 30);
                        frame2.add(but1);
                        but1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e){
                                float value1,value2,sum;
                            value1=Float.parseFloat(num1.getText());
                            value2=Float.parseFloat(num2.getText());
                            sum=value1+value2;
                            answer.setText(Float.toString(sum));}
                            });
                        but2=new JButton("product");
                        but2.setBounds(250,200,100, 30);
                        frame2.add(but2);
                        but2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e){
                                float value1,value2,product;
                                value1=Float.parseFloat(num1.getText());
                                value2=Float.parseFloat(num2.getText());
                                product=value1*value2;
                                answer.setText(Float.toString(product));
                            }
                        });
                        but3=new JButton("Division");
                        but3.setBounds(400,200,140, 30);
                        frame2.add(but3);
                        but3.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e){
                                float value1,value2,division;
                                value1=Float.parseFloat(num1.getText());
                                value2=Float.parseFloat(num2.getText());
                                division =value1 / value2;
                                answer.setText(Float.toString(division));
                            }
                        });
                        but4=new JButton("Subtraction");
                        but4.setBounds(570, 200,140 , 30);
                        frame2.add(but4);
                        but4.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e){
                                float value1,value2,subtraction;
                                value1=Float.parseFloat(num1.getText());
                                value2=Float.parseFloat(num2.getText());
                                subtraction=value1-value2;
                                answer.setText(Float.toString(subtraction));
                            }
                        });
                        logout=new JButton("Logout");
                        logout.setBounds(100, 450, 100, 30);
                        frame2.add(logout);
                        logout.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e){
                                frame2.setVisible(false);
                                frame1.setVisible(true);
                            }
                        });
                        submit=new JButton("Submit");
                        submit.setBounds(250,450,100,30);
                        frame2.add(submit);
                        submit.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e){
                                if(man.isSelected()){
                                    JOptionPane.showMessageDialog(frame2, "A gentleman was using the system");
                                }
                                else if(man2.isSelected()){
                                    JOptionPane.showMessageDialog(frame2,"A lady     was using the system");
                                }
                                else{
                                    JOptionPane.showMessageDialog(frame2,"Couldnt validate the gender that was using the system");
                                }
                            }
                        });
                                                    
                                                
                             }
                else{
                 JOptionPane.showMessageDialog(null,"Incorrect password");
                }
            }

         }
    }
}
  
    public static void main(String [] argd){
        new Login();
    }
}

