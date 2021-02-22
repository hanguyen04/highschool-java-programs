import java.awt.EventQueue;

import javax.swing.JFrame;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.stream.*;

public class boomboom {
	
	int randomWithRange(int min, int max) {
		int range = (max - min) + 1;
		return(int)(Math.random()*range)+min;
	}

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) { 
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					boomboom window = new boomboom();
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
	public boomboom() {
		initialize();
	}

	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(224, 255, 255));
		frame.setBounds(100, 100, 350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		String[] numbah = {"i","i","i","i","i","i","i","i","i","i",
				"i","i","i","i","i","i","i","i","i"};
		ArrayList<String> count = new ArrayList<String>();
		
		
		JButton btnNewButton = new JButton("Click here");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (count.size()== 18) {
					JOptionPane.showMessageDialog(null, "You have reached the end, thank you for everything sir. "
							+ "Hit command+Q to quit the schoo- i mean close program");
				}
				boomboom obj1 = new boomboom(); 
				int rand=obj1.randomWithRange(0, 17);
				
				String[]messages = {
						"Thank you for teaching us CS for two years and making the subject"
						+ "fun and enjoyable to learn. Thank you for also sparking and interest"
						+ "in the subject and making me love it. - Ha",
						"Minh Anh",
						"Phuong Linh",
						"Helen",
						"An",
						"Ha Linh",
						"Pham",
						"Se Hyun",
						"Angela",
						"Kiet",
						"Not all goodbyes are sad. For example: \"Goodbye class\"."
						+ " That said, please give me a pass. -nguyen thanh tri, 2020",
						"thank you for u to transfer big brain to me - Nam",
						"Phuoc",
						"Trung",
						"Thank you - Dat",
						"Viet Anh",
						"thank you <33 - Jei",
						"print(\"thank u\")Alex",
						"print(\"thank u\")-Kevin"
				};
				
				
					int selectNum = rand; 
					String stringRand = String.valueOf(selectNum);
			
					boolean contains = Arrays.stream(numbah).anyMatch(stringRand::equals);
					
					while (contains) {
						obj1 = new boomboom();
						rand=obj1.randomWithRange(0, 17);
						selectNum = rand;
						stringRand = String.valueOf(selectNum);
						contains = Arrays.stream(numbah).anyMatch(stringRand::equals);
					}
			
					JOptionPane.showMessageDialog(null, messages[selectNum]); 
					numbah[selectNum]= stringRand;
					count.add("I");
		
				
			}
		});
		
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setBounds(110, 50, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Random message generater ");
		lblNewLabel.setForeground(new Color(100, 149, 237));
		lblNewLabel.setBounds(81, 22, 177, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("From Y11 CS 2018-20");
		lblNewLabel_1.setForeground(new Color(100, 149, 237));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(110, 106, 130, 16);
		frame.getContentPane().add(lblNewLabel_1);
	
	}

}
