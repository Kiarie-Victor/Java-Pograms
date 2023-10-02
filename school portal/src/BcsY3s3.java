import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BcsY3s3 extends JFrame {
    private JLabel lblunits;
    private JButton btnSubmit;
    private JCheckBox chkSe,chkOs,chkAlg;
    public BcsY3s3(){

        setVisible(true);
        setSize(300,300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        lblunits=new JLabel("UNITS YOU CAN REGISTER");
        lblunits.setForeground(Color.BLUE);
        lblunits.setBounds(50,100,150,20);
        add(lblunits);
        chkAlg=new JCheckBox("Info Tech.");chkAlg.setBounds(80,130,100,20);
        add(chkAlg);
        chkOs=new JCheckBox("Operating System II");chkOs.setBounds(80,160,150,20);
        add(chkOs);
        chkSe=new JCheckBox("Calculus II");chkSe.setBounds(80,190,150,20);
        add(chkSe);

        btnSubmit=new JButton("SUBMIT");
        btnSubmit.setFont(new Font("Tahoma",Font.PLAIN,18));
        btnSubmit.setBounds(100,230,150,30);
        add(btnSubmit);
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i;
                i = UnitDao.save(chkSe.getActionCommand(), chkOs.getActionCommand(),chkAlg.getActionCommand());
                if (i > 0) {
                    JOptionPane.showMessageDialog(BcsY3s3.this, "Unit Registered successfully!");
                    new DashbStud();
                } else {
                    JOptionPane.showMessageDialog(BcsY3s3.this, "Check Out for any ERRORS!!");

                    setVisible(false);
                    new UnitReg();
                }

            }
        });
    }
    public static void main(String[] args){
        new BcsY3s3();
    }
}