import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class GradeForm extends JFrame {



    private JLabel lblstudName,lblRegno,lblGrade,lblUnit,lblCat,lblFexam;
    private JTextField txtstud,txtReg,txtGrade,txtUnit,txtCat,txtFexam;

    public GradeForm(){
        super("PASSMARK UNIVERSITY");

        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);


        JLabel lblGradingForm=new JLabel(" GRADING FORM");
        lblGradingForm.setFont(new Font("Tahoma", Font.PLAIN,20));
        lblGradingForm.setForeground(Color.CYAN);
        lblGradingForm.setBounds(200,50,300,40);
        add(lblGradingForm);
        lblstudName=new JLabel("Enter Name:");
        lblstudName.setFont(new Font("Tahoma", Font.PLAIN,15));
        lblstudName.setForeground(Color.BLUE);
        lblstudName.setBounds(50,100,150,30);
        lblRegno=new JLabel("Admission Number:");
        lblRegno.setFont(new Font("Tahoma", Font.PLAIN,15));
        lblRegno.setForeground(Color.BLUE);
        lblRegno.setBounds(50,140,150,30);
        lblUnit=new JLabel(" Unit:");
        lblUnit.setFont(new Font("Tahoma", Font.PLAIN,15));
        lblUnit.setForeground(Color.BLUE);
        lblUnit.setBounds(50,180,150,30);
        txtUnit=new JTextField();
        txtUnit.setBounds(200,180,150,30);


        txtstud=new JTextField();
        txtstud.setBounds(200,100,150,30);
        txtReg=new JTextField();
        txtReg.setBounds(200,140,150,30);

        lblGrade=new JLabel("Grade :");
        lblGrade.setForeground(Color.BLUE);
        lblGrade.setBounds(50,220,150,30);
        txtGrade=new JTextField();
        txtGrade.setBounds(200,220,150,30);

        add(lblstudName);add(txtstud);
        add(lblRegno);add(txtReg);
        add(lblGrade);
        add(txtGrade);
        add(lblUnit);
        add(txtUnit);

        JButton btnSubmit=new JButton("SUBMIT");
        btnSubmit.setBackground(Color.cyan);
        btnSubmit.setForeground(Color.BLUE);
        btnSubmit.setBounds(200,280,150,30);
        add(btnSubmit);
        
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i;
                 i = ResultDao.save(txtReg.getText(), txtstud.getText(),txtUnit.getText(), txtGrade.getText());
                 if (i > 0) {
                    JOptionPane.showMessageDialog(GradeForm.this, "Grade added successfully!");
                    setVisible(false);
                     new StaffSuccess();
                 } else {
                  JOptionPane.showMessageDialog(GradeForm.this, "Check Out for any ERRORS!!");
                 
                 setVisible(false);
                 new GradeForm();
             } 

                }
            
        });

    }
    public static void main(String[] args){
        
        new GradeForm();

    }
}