import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Dashboardpar extends JFrame {
    private JRadioButton rdY1s1,rdY1s2,rdY2s1,rdY2s2,rdY3s1,rdY3s2,rdY4s1,rdY4s2;
    private JLabel lblYos,lblAmount;
    private JTextField txtAmount;
    private float feebal,amtpaid,totalfeebilled;
    private ButtonGroup bgYos;
    private JButton btnSubmit;
    public Dashboardpar(){
        super("PASSMARK UNIVERSITY");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
        setLayout(null);
        rdY1s1=new JRadioButton("Y1S1");
        rdY1s2=new JRadioButton("Y1S2");
        rdY2s1=new JRadioButton("Y2S1");
        rdY2s2=new JRadioButton("Y2S2");
        rdY3s1=new JRadioButton("Y3S1");
        rdY3s2=new JRadioButton("Y3S2");
        rdY4s1=new JRadioButton("Y4S1");
        rdY4s2=new JRadioButton("Y4S2");
    lblYos=new JLabel(" STUDENTS' YEAR OF STUDY:");
    bgYos=new ButtonGroup();
    bgYos.add(rdY1s1);bgYos.add(rdY1s2);bgYos.add(rdY2s1);bgYos.add(rdY2s2);
    bgYos.add(rdY3s1);bgYos.add(rdY3s2);bgYos.add(rdY4s1);bgYos.add(rdY4s2);
    add(lblYos);
    lblYos.setBounds(20,50,300,40);
    lblYos.setForeground(Color.BLUE);
    lblYos.setFont(new Font("Tahoma", Font.PLAIN,20));
        rdY1s1.setBounds(60,100,70,20);
        add(rdY1s1);

        rdY1s2.setBounds(150,100,70,20);
        add(rdY1s2);
        rdY2s1.setBounds(60,130,70,20);
        add(rdY2s1);
        rdY2s2.setBounds(150,130,70,20);
        add(rdY2s2);
        rdY3s1.setBounds(60,160,70,20);
        add(rdY3s1);
        rdY3s2.setBounds(150,160,80,20);
        add(rdY3s2);
        rdY4s1.setBounds(60,190,70,20);
        add(rdY4s1);
        rdY4s2.setBounds(150,190,70,20);
        add(rdY4s2);
        lblAmount=new JLabel("Enter amount you wish to pay:");
        lblAmount.setBounds(60,230,200,20);
        txtAmount=new JTextField();
        txtAmount.setBounds(280,230,50,20);
        add(lblAmount);
        add(txtAmount);

btnSubmit=new JButton("Submit");
btnSubmit.setBounds(70,260,100,25);
btnSubmit.setForeground(Color.BLACK);
btnSubmit.setBackground(Color.GRAY);
    btnSubmit.setFont(new Font("Tahoma", Font.PLAIN,15));
add(btnSubmit);
btnSubmit.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand()=="Y1S1"){
            int amount=Integer.parseInt(txtAmount.getText());
            amtpaid += amount;
            totalfeebilled=20000;
            feebal= totalfeebilled-amtpaid;
            JOptionPane.showMessageDialog(Dashboardpar.this,"Your Total billed fee is "+totalfeebilled+ "and current fee balance is "+feebal);
        }
    }
});
    }


    public static void main(String[] args){
        new Dashboardpar();
    }
}