package Assignment;
import javax.swing.*;
import java.awt.event.*;
public class Calc extends JFrame {
 private JLabel input1,input2,result;
 private JButton but1,but2,but3;
 private JTextField num1,num2,answer;
 private float sum,product,difference;
 private float value1,value2;
 
 public Calc (){
    input1=new JLabel("Input");
    input1.setBounds(100, 100, 200,30);

    num1=new JTextField();
    num1.setBounds(300,100,100,30);

    input2=new JLabel("Input");
    input2.setBounds(100,150,200, 30);

    num2=new JTextField();
    num2.setBounds(300,150,100,30);

    but1=new JButton("sum");
    but1.setBounds(100,200,100, 30);
    but1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
           value1=Float.parseFloat(num1.getText());
           value2=Float.parseFloat(num2.getText());
           sum=value1+value2;
           JOptionPane.showMessageDialog(rootPane,"The sum is "+sum);

        }
    });

    but2=new JButton("product");
    but2.setBounds(250,200,100, 30);
    but2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            product=value1*value2;
            JOptionPane.showMessageDialog(rootPane,"The product is "+product);
        }
    });

    but3=new JButton("difference");
    but3.setBounds(400,200,160, 30);
    but3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            difference=product-sum;
            JOptionPane.showMessageDialog(rootPane,"The difference is "+difference);
        }
    });

    setVisible(true);
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(1000,1000);
    add(input1);
    add(num1);
    add(input2);
    add(num2);
    add(but1);
    add(but2);
    add(but3);

 }
 public static void main(String[]s){
    new Calc();
 }
}
