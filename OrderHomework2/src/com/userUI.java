package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class userUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JTextField password;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userUI frame = new userUI();
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
	public userUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(47, 22, 371, 262);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Log in");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(123, 17, 61, 45);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username or email address");
		lblNewLabel_1.setBounds(34, 67, 268, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setBounds(34, 133, 268, 16);
		panel.add(lblNewLabel_1_1);
		
		username = new JTextField();
		username.setBounds(34, 85, 256, 33);
		panel.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(34, 151, 256, 33);
		panel.add(password);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//get text from user
				//get text for password
				
				String un=username.getText();
				String pas=password.getText();
				if(un.equals("admin")&& pas.equals("123")) {
					JOptionPane.showMessageDialog(null,"Login Successful");
				
					Order2UI nini = new Order2UI();
							nini.setVisible(true);
							dispose();
		
			
					
				}else {
					JOptionPane.showMessageDialog(null,"Invalid ");
				}
				
			}
		});
		btnNewButton.setBounds(111, 196, 117, 29);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(40, 285, 388, 78);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea txtradmin = new JTextArea();
		txtradmin.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		txtradmin.setForeground(new Color(0, 0, 0));
		txtradmin.setText("假設帳號為admin 密碼為123");
		txtradmin.setBounds(25, 6, 330, 66);
		panel_1.add(txtradmin);
		
	/*	JButton login = new JButton("Submit");
		login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			if (user.getText().contentEquals("ABC") == true && password.getText().contentEquals("123") 
					== true )
						{
						Order2UI x = new Order2UI();
						x.setVisible(true);
						dispose();
						}
						else
						{
							output2.setText("帳號或密碼錯誤!請重新輸入");
						}
					}
				});
				//btnLogin.setBounds(269, 106, 69, 63);
				//panel.add(btnLogin);
			
		
	/*	login.setBounds(109, 207, 117, 29);
		panel.add(login);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(47, 285, 371, 131);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea output2 = new JTextArea();
		output2.setBounds(6, 6, 359, 119);
		panel_1.add(output2);*/
	}
}

