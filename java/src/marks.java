import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;

import static java.lang.Float.compare;
import static java.lang.Float.parseFloat;
import static java.lang.Short.parseShort;

public class marks extends JFrame{
    double mathtotal,engtotal,scietotal,scstotal;

    JLabel lblMaths,lbl_mathcat1,lbl_mathcat2,lbl_mathexam,
            lblEng,lbl_engcat1,lbl_engcat2,lbl_engexam,
            lblScience,lbl_sciecat1,lbl_sciecat2,lbl_scieexam,
            lbl_scs,lbl_scscat1,lbl_scscat2,lbl_scsexam,
            lblRE,lblScs,cap;
    JTextField txt_mathcat1,txt_mathcat2,txt_mathexam,txt_mathtotal,txt_mathgrade,
            txt_engcat1,txt_engcat2,txt_engexam,txt_engtotal,txt_enggrade,
            txt_sciecat1,txt_sciecat2,txt_scieexam,txt_scietotal,txt_sciegrade,
            txt_scscat1, txt_scscat2,txt_scsexam,txt_scstotal,txt_scsgrade;

    JRadioButton radbtn_mathtotal,radbtn_mathgrade,rad_engtotal,rad_enggrade,rad_scietotal,rad_sciegrade,rad_scstotal,rad_scsgrade;
    ButtonGroup mathbg=new ButtonGroup();
    ButtonGroup engbg=new ButtonGroup();
    ButtonGroup sciebg=new ButtonGroup();
    ButtonGroup scsbg=new ButtonGroup();

public marks() {
        super("MARKS COMPUTATION");
    cap=new JLabel("**MARKS CAPTURE**"); cap.setForeground(Color.red);
    lblMaths=new JLabel("MATHEMATICS"); lblMaths.setForeground(Color.blue);
    lbl_mathcat1=new JLabel("CAT one:"); lbl_mathcat2=new JLabel("CAT two:"); lbl_mathexam=new JLabel("Exam:");
    radbtn_mathtotal=new JRadioButton("total score"); radbtn_mathgrade=new JRadioButton("grade");

    txt_mathcat1=new JTextField(10);txt_mathcat2=new JTextField(10);txt_mathexam=new JTextField(10);txt_mathtotal=new JTextField(10);
    txt_mathgrade=new JTextField(10);
    txt_mathgrade.setEditable(false); txt_mathtotal.setEditable(false);

    lblEng=new JLabel("ENGLISH" ); lblEng.setForeground(Color.blue);
    lbl_engcat1=new JLabel("CAT one:"); lbl_engcat2=new JLabel("CAT two:"); lbl_engexam=new JLabel("Exam:");
    txt_engcat1=new JTextField(10); txt_engcat2=new JTextField(10); txt_engexam=new JTextField(10); txt_engtotal=new JTextField(10);
    txt_enggrade=new JTextField(10);

    rad_engtotal=new JRadioButton("total score"); rad_enggrade=new JRadioButton("grade");
    txt_engtotal.setEditable(false); txt_enggrade.setEditable(false);

    lblScience=new JLabel("SCIENCE"); lblScience.setForeground(Color.blue);
    lbl_sciecat1=new JLabel("CAT one");lbl_sciecat2=new JLabel("CAT two"); lbl_scieexam=new JLabel("Exam");lbl_scieexam=new JLabel("Exam");
    rad_scietotal=new JRadioButton("total score"); rad_sciegrade=new JRadioButton("grade");
    txt_sciecat1=new JTextField(10); txt_sciecat2=new JTextField(10); txt_scieexam=new JTextField(10);txt_scietotal=new JTextField(10);
    txt_sciegrade=new JTextField(10);
    txt_scietotal.setEditable(false);txt_sciegrade.setEditable(false);
    sciebg.add(rad_sciegrade); sciebg.add(rad_scietotal);

    lblScs=new JLabel("SOCIAL STUDIES");lblScs.setForeground(Color.blue);
    lbl_scscat1=new JLabel("CAT one"); lbl_scscat2=new JLabel("CAT two"); lbl_scsexam=new JLabel("Exam");
    txt_scscat1=new JTextField(10); txt_scscat2=new JTextField(10); txt_scsexam=new JTextField(10);txt_scstotal=new JTextField(10);
    txt_scsgrade=new JTextField(10);
    rad_scstotal=new JRadioButton("total score"); rad_scsgrade=new JRadioButton("grade");

    txt_scsgrade.setEditable(false); txt_scstotal.setEditable(false);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setSize(3000,2500);



        cap.setBounds(20,5,250,40);
        add(cap);
lblMaths.setBounds(20,60,100,40); add(lblMaths);
        lbl_mathcat1.setBounds(10,110,50,20);add(lbl_mathcat1);
        txt_mathcat1.setBounds(65,110,50,20);add(txt_mathcat1);
          lbl_mathcat2.setBounds(10,130,50,20);add(lbl_mathcat2);
        txt_mathcat2.setBounds(65,130,50,20); add(txt_mathcat2);
         lbl_mathexam.setBounds(10,150,50,20); add(lbl_mathexam);
        txt_mathexam.setBounds(65,150,50,20); add(txt_mathexam);
    radbtn_mathtotal.setBounds(10,170,90,20);add(radbtn_mathtotal);

         txt_mathtotal.setBounds(100,170,120,20);add(txt_mathtotal);
        radbtn_mathgrade.setBounds(10,190,70,20);add(radbtn_mathgrade);
        txt_mathgrade.setBounds(85,190,120,20);add(txt_mathgrade);
        mathbg.add(radbtn_mathgrade); mathbg.add(radbtn_mathtotal);
        radbtn_mathtotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 mathtotal=(parseFloat(txt_mathcat1.getText()) + parseFloat(txt_mathcat2.getText()))/2 + parseFloat(txt_mathexam.getText());
                txt_mathtotal.setText(String.valueOf(mathtotal));
            }
        });

        radbtn_mathgrade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(mathtotal>=70 &&mathtotal<=100)
                    txt_mathgrade.setText("A-Excellent");
                else if(mathtotal>=60 &&mathtotal<70)
                    txt_mathgrade.setText("B-Good");
                else if(mathtotal>=50 && mathtotal<60)
                    txt_mathgrade.setText("C-Fair");
                else if(mathtotal>=40 && mathtotal<50)
                    txt_mathgrade.setText("D-Pass");
                else if(mathtotal>=0 && mathtotal<40)
                    txt_mathgrade.setText("FAIL");
                else
                    txt_mathgrade.setText("Error");





            }
        });

        lblEng.setBounds(20,250,100,40); add(lblEng);
        lbl_engcat1.setBounds(10,300,50,20); add(lbl_engcat1);
        txt_engcat1.setBounds(65,300,50,20);add(txt_engcat1);
        lbl_engcat2.setBounds(10,320,50,20);add(lbl_engcat2);
        txt_engcat2.setBounds(65,320,50,20);add(txt_engcat2);
        lbl_engexam.setBounds(10,340,50,20); add(lbl_engexam);
        txt_engexam.setBounds(65,340,50,20);add(txt_engexam);
        rad_engtotal.setBounds(10,360,100,20);add(rad_engtotal);
        txt_engtotal.setBounds(115,360,100,20);add(txt_engtotal);
        rad_enggrade.setBounds(10,380,70,20); add(rad_enggrade);
        txt_enggrade.setBounds(85,380,100,20);add(txt_enggrade);

        engbg.add(rad_enggrade); engbg.add(rad_engtotal);

        rad_engtotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                engtotal=(parseFloat(txt_engcat1.getText()) + parseFloat(txt_engcat2.getText()))/2 + parseFloat(txt_engexam.getText());
                txt_engtotal.setText(String.valueOf(engtotal));

            }
        });

        rad_enggrade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(engtotal>=70 &&engtotal<=100)
                    txt_enggrade.setText("A-Excellent");
                else if(engtotal>=60 &&engtotal<70)
                    txt_enggrade.setText("B-Good");
                else if(engtotal>=50 && engtotal<60)
                    txt_enggrade.setText("C-Fair");
                else if(engtotal>=40 && engtotal<50)
                    txt_enggrade.setText("D-Pass");
                else if(engtotal>=0 &&engtotal<40)
                    txt_enggrade.setText("FAIL");
                else
                    txt_enggrade.setText("Error");

            }
        });

        lblScience.setBounds(20,420,100,40); add(lblScience);
        lbl_sciecat1.setBounds(10,450,50,20); add(lbl_sciecat1);
        txt_sciecat1.setBounds(65,450,50,20); add(txt_sciecat1);
        lbl_sciecat2.setBounds(10,470,50,20); add(lbl_sciecat2);
        txt_sciecat2.setBounds(65,470,50,20); add(txt_sciecat2);
        lbl_scieexam.setBounds(10,490,50,20); add(lbl_scieexam);
        txt_scieexam.setBounds(65,490,50,20); add(txt_scieexam);

        rad_scietotal.setBounds(10,510,100,20); add(rad_scietotal);
        txt_scietotal.setBounds(115,510,100,20); add(txt_scietotal);
        rad_sciegrade.setBounds(10,530,100,20); add(rad_sciegrade);
        txt_sciegrade.setBounds(115,530,100,20);add(txt_sciegrade);

        rad_scietotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 scietotal=(parseFloat(txt_sciecat1.getText()) + parseFloat(txt_sciecat2.getText()))/2 + parseFloat(txt_scieexam.getText());
                txt_scietotal.setText(String.valueOf(scietotal));

            }
        });

        rad_sciegrade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(scietotal>=70 &&scietotal<=100)
                   txt_sciegrade.setText("A-Excellent");
                else if(scietotal>=60 &&scietotal<70)
                    txt_sciegrade.setText("B-Good");
                else if(scietotal>=50 && scietotal<60)
                    txt_sciegrade.setText("C-Fair");
                else if(scietotal>=40 && scietotal<50)
                    txt_sciegrade.setText("D-Pass");
                else if(scietotal>=0 &&scietotal<40)
                    txt_sciegrade.setText("FAIL");
                else
                    txt_sciegrade.setText("Error");

            }
        });

lblScs.setBounds(420,60,250,40); add(lblScs);
lbl_scscat1.setBounds(410,110,50,20); add(lbl_scscat1);
txt_scscat1.setBounds(465,110,50,20);add(txt_scscat1);
lbl_scscat2.setBounds(410,130,50,20);add(lbl_scscat2);
txt_scscat2.setBounds(465,130,50,20); add(txt_scscat2);
lbl_scsexam.setBounds(410,150,50,20);add(lbl_scsexam);
txt_scsexam.setBounds(465,150,50,20);add(txt_scsexam);
rad_scstotal.setBounds(410,170,100,20); add(rad_scstotal);
txt_scstotal.setBounds(510,170,100,20);add(txt_scstotal);
rad_scsgrade.setBounds(410,190,100,20);add(rad_scsgrade);
txt_scsgrade.setBounds(510,190,100,20);add(txt_scsgrade);

        scsbg.add(rad_scsgrade); scsbg.add(rad_scstotal);

        rad_scstotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scstotal=(parseFloat(txt_scscat1.getText()) + parseFloat(txt_scscat2.getText()))/2 + parseFloat(txt_scsexam.getText());
                txt_scstotal.setText(String.valueOf(scstotal));

            }
        });

        rad_scsgrade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( scstotal>=70 &&  scstotal<=100)
                    txt_scsgrade.setText("A-Excellent");
                else if( scstotal>=60 && scstotal<70)
                    txt_scsgrade.setText("B-Good");
                else if( scstotal>=50 &&  scstotal<60)
                    txt_scsgrade.setText("C-Fair");
                else if( scstotal>=40 && scstotal<50)
                    txt_scsgrade.setText("D-Pass");
                else if(scstotal>=0 && scstotal<40)
                    txt_scsgrade.setText("FAIL");
                else
                    txt_scsgrade.setText("error!");

            }
        });

JButton btn_exit =new JButton("EXIT");
btn_exit.setForeground(Color.RED);
btn_exit.setBounds(550,600,100,40);
add(btn_exit);
btn_exit.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int j=JOptionPane.showConfirmDialog(btn_exit,"Do you want to quit?");
                if(j==0)
                    System.exit(0);
    }
});

JButton btn_back=new JButton("BACK");btn_back.setForeground(Color.RED);
btn_back.setBounds(400,600,100,40); add(btn_back);
btn_back.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        new login();
        setVisible(false);
    }
});

JButton save=new JButton("SAVE ");save.setForeground(Color.BLUE);
save.setBounds(750,600,100,40); add(save);
save.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(save,"grades added succesfully ");
        txt_mathcat1.setText("");
        txt_mathcat2.setText("");
        txt_mathexam.setText("");
        txt_mathgrade.setText("");
        txt_mathtotal.setText("");
        txt_engcat1.setText("");
        txt_engcat2.setText("");
        txt_engexam.setText("");
        txt_enggrade.setText("");
        txt_engtotal.setText("");
        txt_sciecat1.setText("");
        txt_sciecat2.setText("");
        txt_scieexam.setText("");
        txt_sciegrade.setText("");
        txt_scietotal.setText("");
        txt_scscat1.setText("");
        txt_scscat2.setText("");
        txt_scsexam.setText("");
        txt_scsgrade.setText("");
        txt_scstotal.setText("");

    }
});

    }

}
