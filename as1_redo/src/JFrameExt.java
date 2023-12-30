import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;


public class JFrameExt extends JFrame {

	private JPanel contentPane;
	private JTextField jtf1;
	private JTextField jtf2;
	private JTextField jtf3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameExt frame = new JFrameExt();
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
	public JFrameExt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel jp2 = new JPanel();
		contentPane.add(jp2);
		jp2.setBackground(Color.MAGENTA);
		
		JLabel lblNumber = new JLabel("Number 1");
		jp2.add(lblNumber);
		
		jtf1 = new JTextField();
		jp2.add(jtf1);
		jtf1.setColumns(10);
		
		JPanel jp1 = new JPanel();
		contentPane.add(jp1);
		jp1.setBackground(Color.GREEN);
		
		JLabel lblNumber_1 = new JLabel("Number 2");
		jp1.add(lblNumber_1);
		
		jtf2 = new JTextField();
		jp1.add(jtf2);
		jtf2.setColumns(10);
		
		JPanel jp3 = new JPanel();
		contentPane.add(jp3);
		jp3.setBackground(Color.BLUE);
		
		JLabel lblNewLabel = new JLabel("Results");
		jp3.add(lblNewLabel);
		
		jtf3 = new JTextField();
		jtf3.setEditable(false);
		jp3.add(jtf3);
		jtf3.setColumns(10);
		
		JPanel jp4 = new JPanel();
		contentPane.add(jp4);
		jp4.setBackground(Color.YELLOW);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double result = Double.parseDouble(jtf1.getText()) - Double.parseDouble(jtf2.getText());
				jtf3.setText("" + result);
			}
		});
		
		JButton button_1 = new JButton("+");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double result = Double.parseDouble(jtf1.getText()) + Double.parseDouble(jtf2.getText());
				jtf3.setText("" + result);
			}
		});
		jp4.add(button_1);
		jp4.add(button);
		
		JButton btnNewButton_1 = new JButton("/");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double result = Double.parseDouble(jtf1.getText()) / Double.parseDouble(jtf2.getText());
				jtf3.setText("" + result);
			}
		});
		jp4.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double result = Double.parseDouble(jtf1.getText()) * Double.parseDouble(jtf2.getText());
				jtf3.setText("" + result);
			}
			
		});
		jp4.add(btnNewButton_2);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener(){
		    public void actionPerformed(ActionEvent e){
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
			}
		});
		jp4.add(btnClear);
	}

	
}
