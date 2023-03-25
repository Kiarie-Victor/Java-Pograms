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
            //Getting the user inputed usernam and password.
            int comparison = username.compareTo(jtTextfield.getText());
            String userInputPassword=String.valueOf(jpPassword.getPassword());

            //Checking if the password the user entered matches the correct passowrd
           ;if(comparison==0){
                if(userInputPassword.equals("1234")){
                    JOptionPane.showMessageDialog(frame1,"You have loged in successfully");
                        frame1.setVisible(false);
                        //Creating a new frame
                        frame2 = new JFrame("Main Form");
                        //Creating the Menu Bar
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
                        frame2.setJMenuBar(bar);
                        bar.add(mnuFile);
                        bar.add(mnuView);
                        bar.add(mnuExit);
                        bar.add(mnuHelp);
                        mnuFile.add(newF);
                        mnuFile.add(mnuImport);
                        
                        portForlio=new JLabel("Student Portfolio");
                        portForlio.setBounds(400,80, 200, 30);

                        //Creating the labels and the other components and intializing them.
                        JLabel name=new JLabel("Name");
                        name.setBounds(100, 150, 80, 30);
                        JTextField jtName= new JTextField();
                        jtName.setBounds(200, 150, 120, 30);
                        JLabel regNo= new JLabel("regNo");
                        regNo.setBounds(340, 150, 100, 30);
                        JTextField jtRegno=new JTextField();
                        jtRegno.setBounds(450, 150, 150, 30);
                        JLabel gender = new JLabel("Gender");
                        gender.setBounds(100,200,80,30);
                        JRadioButton female = new JRadioButton("Female");
                        female.setBounds(210,200,80,30);
                        JRadioButton male=new JRadioButton("Male");
                        male.setBounds(310, 200, 80, 30);
                        ButtonGroup genders=new ButtonGroup();
                        genders.add(male);
                        genders.add(female);
                        JLabel level = new JLabel("Level");
                        level.setBounds(100, 250, 80, 30);
                        ButtonGroup levels = new ButtonGroup();
                        JRadioButton y1,y2,y3,y4;
                        y1= new JRadioButton("Y1");
                        y1.setBounds(200, 250, 60, 30);

                        y2= new JRadioButton("Y2");
                        y2.setBounds(290, 250, 60, 30);

                        y3= new JRadioButton("Y3");
                        y3.setBounds(380, 250, 60, 30);

                        y4= new JRadioButton("Y4");
                        y4.setBounds(460, 250, 60, 30);
                        levels.add(y1);
                        levels.add(y2);
                        levels.add(y3);
                        levels.add(y4);
                        JLabel state = new JLabel("State");
                        state.setBounds(100, 300, 80, 50);
                        JCheckBox feePaid,unitsReg,examDone;
                        feePaid=new JCheckBox("Fee Paid");
                        feePaid.setBounds(200, 300, 200, 30);
                        unitsReg = new JCheckBox("Units Registered");
                        unitsReg.setBounds(420,300, 200,30);
                        examDone = new JCheckBox("Exam Done");
                        examDone.setBounds(200,350,200,30);
                        JButton print,view,logout;
                        print=new JButton("Print Card");
                        print.setBounds(100, 500, 150, 30);
                        view = new JButton("View Result");
                        view.setBounds(300, 500, 150, 30);
                        logout = new JButton("Log Out");
                        logout.setBounds(490,500, 150, 30);

                            //adding of the components
                        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame2.setVisible(true);
                        frame2.setSize(1000,1000);
                        frame2.setLayout(null);
                        frame2.add(portForlio);
                            frame2.add(name);
                            frame2.add(jtName);
                            frame2.add(regNo);
                            frame2.add(jtRegno);
                            frame2.add(gender);
                            frame2.add(male);
                            frame2.add(female);
                            frame2.add(level);
                            frame2.add(y1);
                            frame2.add(y2);
                            frame2.add(y3);
                            frame2.add(y4);
                            frame2.add(state);
                            frame2.add(feePaid);
                            frame2.add(unitsReg);
                            frame2.add(examDone);
                            frame2.add(print);
                            frame2.add(view);
                            frame2.add(logout);
                            print.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e){
                                    JOptionPane.showMessageDialog(frame2,"You have succesfully printed /n your card.");
                                }
                            });
                            logout.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e){
                                    frame2.setVisible(false);
                                    frame1.setVisible(true);
                                }
                            });
                            view.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e){
                                    String name,regno;
                                    name=jtName.getText();
                                    regno=jtRegno.getText();
                                    if(examDone.isSelected()){
                                        JOptionPane.showMessageDialog(frame2,name+" of registration number "+regno+" You have done your exam wait, for the results" );
                                        if (examDone.isSelected() && feePaid.isSelected()) {
                                        JOptionPane.showMessageDialog(frame2,name+" of of regitration number "+regno+" You have paid for fees and sat done the exam");
                                        }
                                        else if(examDone.isSelected() && unitsReg.isSelected()){
                                        JOptionPane.showMessageDialog(frame2,name+" of registration number "+regno+" You have already registered units and did the exam.");
                                         }
                                    } 
                                    else if(feePaid.isSelected()){
                                    JOptionPane.showMessageDialog(frame2,name+" of registration number "+regno+" You have paid for fees.");
                                        if (feePaid.isSelected() && unitsReg.isSelected()){
                                            JOptionPane.showMessageDialog(frame2,name+" of registration number "+regno+" You have paid for fees and registered units");
                                        }
                                        else if (unitsReg.isSelected()){
                                        JOptionPane.showMessageDialog(frame2,name+" of regitration "+regno+" You have registered units");
                                        }
                                    }
                                    else if(unitsReg.isSelected() && feePaid.isSelected() && examDone.isSelected()){
                                        JOptionPane.showMessageDialog(frame2,name+" of registration number "+regno+" You have paid for fees, registered units and done the exam.");
                                         }
                                }
                            });   

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
