import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class GUI {

	private JFrame frame;
	private JTextField textFieldAdd;
	private JTextField textFieldMin;
	private JTextField textFieldAns;
	private JLabel lblNewLabelnName;
	private JButton addButton;
	private JButton minusButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton addButton = new JButton("ADD");
		addButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				int numb1,numb2,answer;
				try {
					numb1=Integer.parseInt(textFieldAdd.getText());
					numb2=Integer.parseInt(textFieldMin.getText());
					answer = numb1 + numb2;
					textFieldAns.setText(Integer.toString(answer));
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Invalid! Only integer number!");
				}
			}
		});
		addButton.setBounds(86, 106, 89, 20);
		frame.getContentPane().add(addButton);
		
		JButton minusButton = new JButton("MIN");
		minusButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				int numb1,numb2,answer;
				try {
					numb1=Integer.parseInt(textFieldAdd.getText());
					numb2=Integer.parseInt(textFieldMin.getText());
					answer = numb1 - numb2;
					textFieldAns.setText(Integer.toString(answer));
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Invalid! Only integer number!");
				}
			}
		});
		minusButton.setBounds(248, 106, 89, 23);
		frame.getContentPane().add(minusButton);
		
		textFieldAdd = new JTextField();
		
		textFieldAdd.setBounds(89, 75, 86, 20);
		frame.getContentPane().add(textFieldAdd);
		textFieldAdd.setColumns(10);
		
		textFieldMin = new JTextField();
		textFieldMin.setBounds(248, 75, 89, 20);
		frame.getContentPane().add(textFieldMin);
		textFieldMin.setColumns(10);
		
		JLabel lblNewLabelAnswer = new JLabel("The asnwer is   :");
		lblNewLabelAnswer.setBounds(111, 163, 89, 20);
		frame.getContentPane().add(lblNewLabelAnswer);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(210, 163, 86, 20);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		lblNewLabelnName = new JLabel("CALCULATOR ADD AND MIN");
		lblNewLabelnName.setBounds(149, 22, 183, 20);
		frame.getContentPane().add(lblNewLabelnName);
	}
}
