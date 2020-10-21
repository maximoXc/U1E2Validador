package programacionlogica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class expresion_aritmetica extends JFrame {
	static JLabel lbl1;
	static JLabel lbl2;

	private JPanel contentPane;
	private JLabel lblResultado;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					expresion_aritmetica frame = new expresion_aritmetica();
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
	public expresion_aritmetica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 673, 424);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lbl1 = new JLabel(".");
		lbl1.setFont(new Font("Arial", Font.BOLD, 25));
		lbl1.setBounds(10, 206, 474, 65);
		panel.add(lbl1);
		
		JLabel lblNewLabel = new JLabel("Expresi\u00F3n Aritmetica (6+2)*3/2^2-4");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel.setBounds(72, 5, 499, 92);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Resolver");
		btnNewButton.setBackground(new Color(153, 204, 204));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ExpresionAritmetica();
				
			}
		});
		btnNewButton.setBounds(72, 90, 117, 44);
		panel.add(btnNewButton);
		
		lbl2 = new JLabel(".");
		lbl2.setFont(new Font("Arial", Font.BOLD, 25));
		lbl2.setBounds(10, 282, 474, 65);
		panel.add(lbl2);
		
		lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Arial", Font.BOLD, 25));
		lblResultado.setBounds(10, 139, 127, 56);
		panel.add(lblResultado);
		
		btnNewButton_1 = new JButton("Regresar al Men\u00FA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu m = new menu();
				m.setVisible(true);
				m.setLocationRelativeTo(null);
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(153, 0, 0));
		btnNewButton_1.setBounds(0, 401, 137, 23);
		panel.add(btnNewButton_1);
	
	
		
		
		
		
	}
}
