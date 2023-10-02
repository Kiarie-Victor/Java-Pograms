import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {
    private JButton btnStudent, btnParent,btnStaff;
    
    JFrame frame=new JFrame();

    public Home() {
        super("PASSMARK UNIVERSITY");
        
        frame.setLayout(null);
        frame.setBounds(50,20,800,800);
        Container container=frame.getContentPane();
        JLabel lblimg1=new JLabel();
       
        lblimg1.setIcon(new ImageIcon("pass.jpg"));
       
        Dimension sizeD =lblimg1.getPreferredSize();
        
         lblimg1.setBounds(50,50, sizeD.width,sizeD.height);
        
        container.add(lblimg1);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        
       
        btnStaff=new JButton("STAFF LOGIN");
        btnParent=new JButton("PARENT LOGIN");
        btnStudent=new JButton("STUDENT LOGIN");




        btnStaff.setBounds(280,460,300,55);
        btnStaff.setBackground(Color.blue);
        btnStaff.setForeground(Color.cyan);
        

btnParent.setBounds(280,515,300,55);
btnParent.setBackground(Color.BLUE);
btnParent.setForeground(Color.cyan);
        btnStudent.setBounds(280,570,300,55);
        btnStudent.setBackground(Color.BLUE);
        btnStudent.setForeground(Color.cyan);
     
     container.add(btnParent);
     container.add(btnStaff);
     container.add(btnStudent);
btnParent.addActionListener(this);
btnStudent.addActionListener(this);
btnStaff.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==btnParent){
            setVisible(false);
            frame.dispose();
            new Parent();
        }
        if(e.getActionCommand()=="STUDENT LOGIN"){
            setVisible(false);
            frame.dispose();
            new Student();
        }
        if (e.getSource()==btnStaff){
            setVisible(false);
            frame.dispose();
            new Staff();
        }
        
    }
    public static void main(String[] args){
        new Home();
    }
}