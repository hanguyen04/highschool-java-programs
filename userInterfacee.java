import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;


public class userInterfacee extends JFrame {

	public JFrame frame;
	private JTextField txtHeight;
	private JTextField txtLength;
	private JTextField txtWidth;
	private JTextField txtWeight;
	private JTextField txtPrice;
	private JTextField txtAccept;
	private JTextField txtReject;
	private JTextField txtTotalWeight;
	private JTextField txtTotalCost;
	private JTextField txtShippingPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userInterfacee window = new userInterfacee();
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
	public userInterfacee() {
		initialize();
	}

	/**
	 * Initialise the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.setBounds(100, 100, 530, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		//All the labels in the window 
		JLabel lblHeight = new JLabel("Enter the Height: ");
		lblHeight.setForeground(new Color(147, 112, 219));
		lblHeight.setBounds(31, 79, 111, 16);
		frame.getContentPane().add(lblHeight);
		
		JLabel lblLength = new JLabel("Enter the Length:");
		lblLength.setForeground(new Color(147, 112, 219));
		lblLength.setBounds(31, 121, 111, 16);
		frame.getContentPane().add(lblLength);
		
		JLabel lblWidth = new JLabel("Enter the Width:");
		lblWidth.setForeground(new Color(147, 112, 219));
		lblWidth.setBounds(31, 163, 111, 16);
		frame.getContentPane().add(lblWidth);
		
		JLabel lblWeight = new JLabel("Enter the Weight:");
		lblWeight.setForeground(new Color(147, 112, 219));
		lblWeight.setBounds(31, 203, 111, 16);
		frame.getContentPane().add(lblWeight);
		
		JLabel lblTotalCost = new JLabel("Total Cost");
		lblTotalCost.setForeground(new Color(147, 112, 219));
		lblTotalCost.setBounds(61, 335, 72, 16);
		frame.getContentPane().add(lblTotalCost);
		
		JLabel lblTotalWeight = new JLabel("Total Weight");
		lblTotalWeight.setForeground(new Color(147, 112, 219));
		lblTotalWeight.setBounds(51, 297, 79, 16);
		frame.getContentPane().add(lblTotalWeight);
		
		JLabel lblPrice = new JLabel("Parcel's Price:");
		lblPrice.setForeground(new Color(147, 112, 219));
		lblPrice.setBackground(new Color(147, 112, 219));
		lblPrice.setBounds(355, 79, 98, 16);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblAccept = new JLabel("Accepted");
		lblAccept.setForeground(new Color(147, 112, 219));
		lblAccept.setBounds(366, 150, 61, 16);
		frame.getContentPane().add(lblAccept);
		
		JLabel lblReject = new JLabel("Rejected");
		lblReject.setForeground(new Color(147, 112, 219));
		lblReject.setBounds(366, 216, 61, 16);
		frame.getContentPane().add(lblReject);
		
		JLabel lblParcelNum = new JLabel("No. of Parcels");
		lblParcelNum.setForeground(new Color(147, 112, 219));
		lblParcelNum.setBounds(31, 39, 91, 16);
		frame.getContentPane().add(lblParcelNum);
		
		JLabel lblShipping = new JLabel("Shipping Location ");
		lblShipping.setForeground(new Color(147, 112, 219));
		lblShipping.setBounds(255, 39, 117, 16);
		frame.getContentPane().add(lblShipping);
		
		
		//All the text boxes in the window 
		txtHeight = new JTextField();
		txtHeight.setBounds(154, 74, 130, 26);
		frame.getContentPane().add(txtHeight);
		txtHeight.setColumns(10);
	
		txtLength = new JTextField();
		txtLength.setBounds(154, 116, 130, 26);
		frame.getContentPane().add(txtLength);
		txtLength.setColumns(10);
		
		txtWidth = new JTextField();
		txtWidth.setBounds(154, 158, 130, 26);
		frame.getContentPane().add(txtWidth);
		txtWidth.setColumns(10);
		
		txtWeight = new JTextField();
		txtWeight.setBounds(154, 198, 130, 26);
		frame.getContentPane().add(txtWeight);
		txtWeight.setColumns(10);
		
		txtPrice = new JTextField();
		txtPrice.setBounds(336, 103, 130, 26);
		frame.getContentPane().add(txtPrice);
		txtPrice.setColumns(10);
	
		txtAccept = new JTextField();
		txtAccept.setBounds(336, 178, 130, 26);
		frame.getContentPane().add(txtAccept);
		txtAccept.setColumns(10);
		
		txtReject = new JTextField();
		txtReject.setBounds(336, 244, 130, 26);
		frame.getContentPane().add(txtReject);
		txtReject.setColumns(10);
		
		txtTotalWeight = new JTextField();
		txtTotalWeight.setBounds(154, 292, 130, 26);
		frame.getContentPane().add(txtTotalWeight);
		txtTotalWeight.setColumns(10);
		
		txtTotalCost = new JTextField();
		txtTotalCost.setBounds(154, 330, 130, 26);
		frame.getContentPane().add(txtTotalCost);
		txtTotalCost.setColumns(10);
		
		JLabel lblShippingPrice = new JLabel("Shipping Price");
		lblShippingPrice.setForeground(new Color(147, 112, 219));
		lblShippingPrice.setBounds(355, 297, 91, 16);
		frame.getContentPane().add(lblShippingPrice);
		
		txtShippingPrice = new JTextField();
		txtShippingPrice.setBounds(336, 330, 130, 26);
		frame.getContentPane().add(txtShippingPrice);
		txtShippingPrice.setColumns(10);
		
		//Combo box to select number of parcels
		JComboBox cmbParcelNum = new JComboBox();
		cmbParcelNum.setBounds(154, 35, 79, 27);
		frame.getContentPane().add(cmbParcelNum);
		for(int i=1;i<11;i++) {
			cmbParcelNum.addItem(i); //Add number in the box
		}
		
		JComboBox cmbShipping = new JComboBox();
		cmbShipping.setBounds(384, 35, 122, 27);
		frame.getContentPane().add(cmbShipping);
		cmbShipping.addItem("Local");
		cmbShipping.addItem("International");
		String transport = (String) cmbShipping.getSelectedItem();
		
	
		//Creating lists 
		ArrayList<String> parcelsPrices = new ArrayList<String>(); //Store parcel prices
		ArrayList<String> numAccepted = new ArrayList<String>(); //The no. of elements = no. of parcels
		ArrayList<String> numRejected = new ArrayList<String>();
		ArrayList<String> totalWeight = new ArrayList<String>(); //Hold all the weights to be added
		ArrayList<String> totalCost = new ArrayList<String>(); //Hold all the costs to be added
		ArrayList<String> count = new ArrayList<String>();//The no. of elements = no. of times code had ran
		ArrayList<String> totalShipping = new ArrayList<String>();
		
		
		//Code execute when submit is pressed
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(new Color(147, 112, 219));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				//Exiting the code when all the parcels had been passed through 
				if (count.size()==(int)cmbParcelNum.getSelectedItem()) {
					
					//for loop to add the numbers together for printing
					float totalWeightPrint =0;
					for (int i=0;i<totalWeight.size();i++) {
						double doubleWeight = Double.parseDouble(totalWeight.get(i));
						totalWeightPrint += doubleWeight ;
					}
					float totalCostPrint =0;
					for (int i=0;i<totalCost.size();i++) {
						double doubleCost = Double.parseDouble(totalCost.get(i));
						totalCostPrint += doubleCost ;
					}
					
					double shippingPrint =0;
					for (int i=0;i<totalShipping.size();i++) {
						double doubleShipping = Double.parseDouble(totalShipping.get(i));
						shippingPrint += doubleShipping ;
					}
					
					if ((int)cmbParcelNum.getSelectedItem()>3) {
						shippingPrint=shippingPrint*0.9;
					}
					
					double totalCostPrint2 = totalCostPrint ;
					double totalEverything = totalCostPrint2 + shippingPrint; 
					
					//Printing out everything needed
					JOptionPane.showMessageDialog(null,("The number of accepted parcels are "+numAccepted.size())+" parcels");
					JOptionPane.showMessageDialog(null,("The number of rejects parcels are "+numRejected.size())+" parcels");
					JOptionPane.showMessageDialog(null,("The total weight is "+totalWeightPrint)+" kg");
					JOptionPane.showMessageDialog(null,("The total cost is $"+totalCostPrint));
					JOptionPane.showMessageDialog(null,("The list of costs: "+ parcelsPrices));
					JOptionPane.showMessageDialog(null,("The total cost for everything is "+totalEverything));

					//Exit code
					System.exit(1);
				}
				
				//adding an element to the list for count
				count.add(".");
				
				//for number input in the text boxes
				double height=0,length=0,width=0,weight =0;
				try {
					height = Double.parseDouble(txtHeight.getText());
					length = Double.parseDouble(txtLength.getText());
					width = Double.parseDouble(txtWidth.getText());
					weight = Double.parseDouble(txtWeight.getText());
				} catch (Exception n) { //Validation of data
					JOptionPane.showMessageDialog(null, "no bro");
				}
				
				//Normal code execution 
				
				double sum = (length+width+height);
				
				if (sum>200||height>80||width>80||length>80||weight>10||weight==0) {
					numRejected.add("I");//Add element for counting 
					txtReject.setText(String.valueOf(numRejected.size())+" parcels");
					JOptionPane.showMessageDialog(null,"The parcel is rejected because:");
					if (height>80) {
						JOptionPane.showMessageDialog(null,"The height of the parcel is over 80cm");	
						}
					if (width>80) {
						JOptionPane.showMessageDialog(null,"The width of the parcel is over 80cm");
						}
					if (length>80) {
						JOptionPane.showMessageDialog(null,"The length of the parcel is over 80cm");
						}
					if (weight==0||weight>10) {
						JOptionPane.showMessageDialog(null,"The weight of the parcel is over 10kg or under 1kg");
						}
					if (sum>200) {
						JOptionPane.showMessageDialog(null,"The sum of the parcel are over 200cm");
					}
				}
				else { 	
					JOptionPane.showMessageDialog(null,"Parcel accepted");
					double cost = 0;
					if (weight >=1 && weight <=5) {
						cost +=10;
						txtPrice.setText(String.valueOf("$"+cost));
					}
					else {
						cost+=10;
						double weightRemain = weight - 5;
						cost+=weightRemain;
						txtPrice.setText(String.valueOf("$"+cost));
					}
					//Add the values to the array 
					totalWeight.add(String.valueOf(weight)); 
					totalCost.add(String.valueOf(cost)); 
					
					float totalWeightPrint =0;
					for (int i=0;i<totalWeight.size();i++) {
						double doubleWeight = Double.parseDouble(totalWeight.get(i));
						totalWeightPrint += doubleWeight ;
					}
					float totalCostPrint =0;
					for (int i=0;i<totalCost.size();i++) {
						double doubleCost = Double.parseDouble(totalCost.get(i));
						totalCostPrint += doubleCost ;
					}
					//Printing everything onto the text boxes 
					String cost2 = String.valueOf(cost);
					
					parcelsPrices.add(cost2); 
					numAccepted.add("I");
					txtAccept.setText(String.valueOf(numAccepted.size())+" parcels");
					txtTotalWeight.setText(String.valueOf(totalWeightPrint)+" kg");
					txtTotalCost.setText(String.valueOf("$"+totalCostPrint));
				}
				
				int shipping = 0;
				if (transport == "Local") {
					if (weight<2&&weight!=0) {
						txtShippingPrice.setText("$2");
						shipping = 2;
					}
					if (weight<5&&weight>=2) {
						txtShippingPrice.setText("$10");
						shipping = 10;
					}
					if (weight<7.5&&weight>=5) {
						txtShippingPrice.setText("15");
						shipping = 15;
					}
					if (weight<=10&&weight>=
							7.5) {
						txtShippingPrice.setText("$20");
						shipping = 20;
					}
				}
				if (transport == "International") {
					if (weight<2&&weight!=0) {
						txtShippingPrice.setText("$10");
						shipping = 10;
					}
					if (weight<5&&weight>=2) {
						txtShippingPrice.setText("$20");
						shipping = 20;
					}
					if (weight<7.5&&weight>=5) {
						txtShippingPrice.setText("$30");
						shipping = 30;
					}
					if (weight<=10&&weight>=7.5) {
						txtShippingPrice.setText("$50");
						shipping = 50;
					}
				}
				
				totalShipping.add(String.valueOf(shipping));
				
				}//End here
			
		});
		
		btnSubmit.setBounds(101, 244, 117, 29);
		frame.getContentPane().add(btnSubmit);

		
	}
	}
