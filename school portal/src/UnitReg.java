import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class UnitReg extends JFrame {
    private JLabel lblyostudy,lblsem,lblcorsecode;
    private JRadioButton rdSem1,rdSem2,rdBcs,rdBse,rdY1,rdY2,rdy3,rdY4;
    private ButtonGroup bgCourse,bgYos;
    private JButton btnSubmit;
    private JTable table;
    private JPanel contentPane;
    public UnitReg(){
        super("PASSMARK UNIVERSITY");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setSize(800,800);
        JLabel lblUnreg=new JLabel("UNIT  REGISTRATION FORM");
        lblUnreg.setFont(new Font("Tahoma", Font.PLAIN,20));
        lblUnreg.setForeground(Color.CYAN);
        lblUnreg.setBounds(150,50,300,40);
        add(lblUnreg);


        lblcorsecode=new JLabel("Course :");
        lblcorsecode.setForeground(Color.BLACK);
        lblcorsecode.setBounds(50,200,100,30);
        add(lblcorsecode);
        rdBcs=new JRadioButton("BCS");rdBcs.setBounds(100,230,100,20);
        add(rdBcs);
        rdBse=new JRadioButton("BSE");rdBse.setBounds(200,230,100,20);
        add(rdBse);

        bgCourse=new ButtonGroup();
        bgCourse.add(rdBcs);bgCourse.add(rdBse);

        lblyostudy=new JLabel("Year of study:");
        lblyostudy.setForeground(Color.BLACK);
        lblyostudy.setBounds(50,100,150,20);
        rdY1=new JRadioButton("Y1");rdY1.setBounds(100,120,100,20);
        add(rdY1);
        rdY2=new JRadioButton("Y2");rdY2.setBounds(100,150,100,20);
        add(rdY2);
        rdy3=new JRadioButton("Y3");rdy3.setBounds(200,120,100,20);
        add(rdy3);
        rdY4=new JRadioButton("Y4");rdY4.setBounds(200,150,100,20);
        add(rdY4);
        bgYos=new ButtonGroup();
        bgYos.add(rdY1);bgYos.add(rdY2);bgYos.add(rdy3);bgYos.add(rdY4);
        add(lblyostudy);
        lblsem=new JLabel("Semester:");
        lblsem.setForeground(Color.black);
        lblsem.setBounds(50,320,100,20);
        rdSem1=new JRadioButton("Sem 1");rdSem1.setBounds(100,350,100,20);
        add(rdSem1);
        rdSem2=new JRadioButton("Sem 2");rdSem2.setBounds(100,380,100,20);
        add(rdSem2);
        bgYos=new ButtonGroup();
        bgYos.add(rdSem1);bgYos.add(rdSem2);
        add(lblsem);

        btnSubmit=new JButton("SUBMIT");
        btnSubmit.setFont(new Font("Tahoma",Font.PLAIN,18));
        btnSubmit.setBounds(100,500,150,30);
        add(btnSubmit);
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            if (rdBcs.isSelected()&& rdY1.isSelected()&&rdSem1.isSelected()){
                      setVisible(false);
                      new BcsY1s1();


            }
            else if (rdBcs.isSelected()&&rdSem2.isSelected()&&rdY1.isSelected()){
                setVisible(false);
                new BcsY1S2();
            }
            else if (rdBse.isSelected()&&rdSem1.isSelected()&&rdY1.isSelected()){
                setVisible(false);
                new BcsY1S2();
            }
            else if (rdBse.isSelected()&&rdSem2.isSelected()&&rdY1.isSelected()){
                setVisible(false);
                new BcsY1s1();
            }
            else if (rdBse.isSelected()&&rdSem2.isSelected()&&rdY2.isSelected()){
                setVisible(false);
                new BcsY3s3();
            }
            else if (rdBse.isSelected()&&rdSem2.isSelected()&&rdy3.isSelected()){
                setVisible(false);
                new BcsY4s1();
            }
            else if (rdBse.isSelected()&&rdSem1.isSelected()&&rdy3.isSelected()){
                setVisible(false);
                new BcsY4s1();
            }
            else if (rdBse.isSelected()&&rdSem2.isSelected()&&rdY4.isSelected()){
                setVisible(false);
                new BcsY3s1();
            }
            else if (rdBcs.isSelected()&&rdSem2.isSelected()&&rdY1.isSelected()){
                setVisible(false);
                new BcsY1S2();
            }
            else if (rdBcs.isSelected()&&rdSem2.isSelected()&&rdY2.isSelected()){
                setVisible(false);
                new BcsY2s2();
            }
            else if (rdBcs.isSelected()&&rdSem1.isSelected()&&rdy3.isSelected()){
               setVisible(false);
               new BcsY3s1();
            }
            else if (rdBcs.isSelected()&&rdSem2.isSelected()&&rdy3.isSelected()){
                setVisible(false);
                new BcsY3s3();
            }
            else if (rdBcs.isSelected()&&rdSem1.isSelected()&&rdY4.isSelected()){
                setVisible(false);
                new BcsY4s1();
            }
            else{
                new BcsY4s2();
            }


            }

        });




    }
    public static void main(String[] args){
        new UnitReg();
    }
}