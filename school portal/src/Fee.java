import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class Fee extends JFrame{
    private JLabel lblyostudy,lblsem,lblAmount,lblpaid,lblbal;
    private  JTextField txtsem,txtyos,txtAmt,txtpaid,txtbal;

    private JButton btnSubmit;

    public Fee(){
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        JLabel lblFee=new JLabel("FEE PAYMENT FORM");
        lblFee.setFont(new Font("Tahoma",Font.BOLD,25));
        lblFee.setForeground(Color.BLUE);
        setLayout(null);
        lblFee.setBounds(50,50,300,30);
        add(lblFee);
        lblyostudy=new JLabel("Year of study:");
        lblyostudy.setForeground(Color.GRAY);
        lblyostudy.setBounds(50,100,150,30);
        add(lblyostudy);
        txtyos=new JTextField();
        txtyos.setBounds(200,100,70,30);
        add(txtyos);

        lblsem=new JLabel("Semester:");
        lblsem.setForeground(Color.GRAY);
        lblsem.setBounds(50,140,100,30);
        add(lblsem);
        txtsem=new JTextField();
        txtsem.setBounds(200,140,70,30);
        add(txtsem);

        lblAmount=new JLabel("Amount to be paid:");
        lblAmount.setForeground(Color.GRAY);
        lblAmount.setBounds(50,180,150,30);
        add(lblAmount);
        txtAmt=new JTextField();
        txtAmt.setBounds(200,180,70,30);
        add(txtAmt);
        lblpaid=new JLabel("Amount you wish to pay:");
        lblpaid.setForeground(Color.GRAY);
        lblpaid.setBounds(50,220,150,30);
        add(lblpaid);
        txtpaid=new JTextField();
        txtpaid.setBounds(200,220,70,30);
        add(txtpaid);
        lblbal=new JLabel("Balance:");
        lblbal.setForeground(Color.GRAY);
        lblbal.setBounds(50,260,150,30);
        add(lblbal);
        txtbal=new JTextField();
        txtbal.setBounds(200,260,70,30);
        add(txtbal);

        txtbal.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                txtbal.setText("");


            }

            @Override
            public void keyReleased(KeyEvent e) {
                int bal=Integer.parseInt(txtAmt.getText())-Integer.parseInt(txtpaid.getText());
                txtbal.setText(String.valueOf(bal));
                txtbal.setEditable(false);
            }
        });

        btnSubmit=new JButton("SUBMIT");
        btnSubmit.setFont(new Font("Tahoma",Font.PLAIN,18));
        btnSubmit.setBounds(100,320,150,30);
        add(btnSubmit);
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i;
                i = FeeDao.save(txtyos.getText(), txtsem.getText(), txtAmt.getText(),txtpaid.getText(),txtbal.getText());
                if (i > 0) {
                    JOptionPane.showMessageDialog(Fee.this, "Fee Updated successfully!");
                    setVisible(false);
                    new Home();
                } else {
                    JOptionPane.showMessageDialog(Fee.this, "Check Out for any ERRORS!!");

                    setVisible(false);
                    new Fee();
                }
            }
        });


    }

    public static void main(String[] args){
        new Fee();
    }    
}
