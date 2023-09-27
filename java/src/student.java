import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class student extends JFrame {
    String regno;
    JLabel lblreg,lbllevel,lblyr;
    JTextField txtreg,txtyr;
    JRadioButton y1s1,y1s2,y2s1,y2s2,y3s1,y3s2,y4s1,y4s2;
    ButtonGroup bg=new ButtonGroup();
    JButton btnOk,btn_close;





    public student(){
        super("STUDENT CAPTURE");

        lblreg=new JLabel("Enter student's registration number");
        txtreg=new JTextField(20);
        lbllevel=new JLabel("Choose Level of study");
        lblyr=new JLabel("Academic year");
        txtyr=new JTextField(20);
        y1s1=new JRadioButton("Y1S1");
        y1s2=new JRadioButton("Y1S2");
        y2s1=new JRadioButton("Y2S1");
        y2s2=new JRadioButton("Y2S2");
        y3s1=new JRadioButton("Y3S1");
        y3s2=new JRadioButton("Y3S2");
        y4s1=new JRadioButton("Y4S1");
        y4s2=new JRadioButton("Y4S2");
        btn_close=new JButton("CLOSE");
        btnOk=new JButton("OK");


        setSize(900,500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        lblreg.setBounds(20,50,220,20); add(lblreg);
        txtreg.setBounds(240,50,150,20);add(txtreg);
        lblyr.setBounds(20,70,100,20); add(lblyr);
        txtyr.setBounds(120,70,100,20); add(txtyr);
        lbllevel.setBounds(20,90,150,20); add(lbllevel);
        y1s1.setBounds(170,90,60,20); add(y1s1);
        y1s2.setBounds(170,110,60,20);add(y1s2);
        y2s1.setBounds(170,130,60,20); add(y2s1);
        y2s2.setBounds(170,150,60,20); add(y2s2);
        y3s1.setBounds(230,90,60,20);add(y3s1);
        y3s2.setBounds(230,110,60,20); add(y3s2);
        y4s1.setBounds(230,130,60,20);add(y4s1);
        y4s2.setBounds(230,150,60,20); add(y4s2);
        bg.add(y1s1);bg.add(y1s2);bg.add(y2s1);bg.add(y2s2);bg.add(y3s1);bg.add(y3s2);bg.add(y4s1);bg.add(y4s2);
        btnOk.setBounds(200,200,100,40); add(btnOk);
        btn_close.setBounds(60,250,80,30);add(btn_close);
        btn_close.setForeground(Color.RED);

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             int u=JOptionPane.showConfirmDialog(btnOk,"Are you sure you want to proceed?");
                if (u == 0) {
                    new marks();
                   setVisible(false);}
            }});
            
        btn_close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
