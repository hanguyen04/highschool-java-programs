import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class parcelNum2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					parcelNum2 window = new parcelNum2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public parcelNum2() {
		initialize();
	}

	/**
	 * Initialise the contents of the frame.
	 */
	
	
		
	
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setBounds(100, 100, 350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblParcelNum = new JLabel("Enter the number of parcels:");
		lblParcelNum.setForeground(new Color(147, 112, 219));
		lblParcelNum.setBounds(83, 36, 184, 16);
		frame.getContentPane().add(lblParcelNum);
		
		JComboBox cmbParcelNum = new JComboBox();
		cmbParcelNum.setBounds(129, 64, 104, 27);
		frame.getContentPane().add(cmbParcelNum);
		for(int i=1;i<11;i++) {
			cmbParcelNum.addItem(i);
		}
		int selectedParcelNum = (int) cmbParcelNum.getSelectedItem();
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					userInterfacee second = new userInterfacee();
					second.setVisible(true);
					frame.dispose();
			
			}
		});
		btnContinue.setBounds(116, 131, 117, 29);
		frame.getContentPane().add(btnContinue);
	}

}
