import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class DashbStud extends JFrame {
	static DashbStud frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new DashbStud();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DashbStud() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
        setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblStudentsection = new JLabel("Student Section");
		lblStudentsection.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblStudentsection.setForeground(Color.GRAY);
        lblStudentsection.setSize(100,50);
		
		JButton btnExam = new JButton("VIEW EXAM RESULTS");
		btnExam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Result.main(new String[]{});
			frame.dispose();
			}
		});
		
        JButton btnUnitreg = new JButton("Unit Registration");
		btnUnitreg.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnUnitreg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			UnitReg.main(new String[]{});
			frame.dispose();
			}
		});
        JButton btnViewRegUnits = new JButton("View Registered Units");
		btnViewRegUnits.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnViewRegUnits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			ViewUnits.main(new String[]{});
			frame.dispose();
			}
		});
        
		JButton btnFee = new JButton("FEES");
		btnFee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Fee.main(new String[]{});
				frame.dispose();
			}
		});
		btnFee.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Home.main(new String[]{});
				frame.dispose();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(150, Short.MAX_VALUE)
					.addComponent(lblStudentsection, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addGap(123))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(134)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnFee, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnViewRegUnits, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUnitreg, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExam, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(109, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblStudentsection, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(btnExam, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
                    .addComponent(btnUnitreg, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
                    .addComponent(btnViewRegUnits, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnFee, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}


