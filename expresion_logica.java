package programacionlogica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class expresion_logica extends JFrame {

	static JLabel condicional,c1,c2,c3,c4,conjuncion,cj1,cj2,cj3,cj4,condicional2,c21,c22,c23,c24;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					expresion_logica frame = new expresion_logica();
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
	public expresion_logica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,  709, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(0, 0, 693, 446);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Expresi\u00F3n L\u00F3gica.");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 31));
		lblNewLabel.setBounds(10, 11, 315, 39);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("[(p->q)^p]->q]");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_1.setBounds(295, 11, 180, 39);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Resolver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new ExpresionLogica();
			}
		});
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 17));
		btnNewButton.setBounds(469, 17, 128, 36);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(28, 61, 194, 26);
		panel.add(lblNewLabel_2);
		
		condicional = new JLabel(".");
		condicional.setFont(new Font("Arial", Font.BOLD, 17));
		condicional.setBounds(28, 119, 194, 26);
		panel.add(condicional);
		
		c1 = new JLabel(".");
		c1.setFont(new Font("Arial", Font.PLAIN, 15));
		c1.setBounds(28, 144, 194, 26);
		panel.add(c1);
		
		c4 = new JLabel(".");
		c4.setFont(new Font("Arial", Font.PLAIN, 15));
		c4.setBounds(28, 217, 194, 26);
		panel.add(c4);
		
		c3 = new JLabel(".");
		c3.setFont(new Font("Arial", Font.PLAIN, 15));
		c3.setBounds(28, 191, 194, 26);
		panel.add(c3);
		
		c2 = new JLabel(".");
		c2.setFont(new Font("Arial", Font.PLAIN, 15));
		c2.setBounds(28, 167, 194, 26);
		panel.add(c2);
		
		conjuncion = new JLabel(".");
		conjuncion.setFont(new Font("Arial", Font.BOLD, 17));
		conjuncion.setBounds(28, 271, 194, 26);
		panel.add(conjuncion);
		
		cj1 = new JLabel(".");
		cj1.setFont(new Font("Arial", Font.PLAIN, 15));
		cj1.setBounds(28, 296, 194, 26);
		panel.add(cj1);
		
		cj2 = new JLabel(".");
		cj2.setFont(new Font("Arial", Font.PLAIN, 15));
		cj2.setBounds(28, 319, 194, 26);
		panel.add(cj2);
		
		cj3 = new JLabel(".");
		cj3.setFont(new Font("Arial", Font.PLAIN, 15));
		cj3.setBounds(28, 343, 194, 26);
		panel.add(cj3);
		
		cj4 = new JLabel(".");
		cj4.setFont(new Font("Arial", Font.PLAIN, 15));
		cj4.setBounds(28, 369, 194, 26);
		panel.add(cj4);
		
		condicional2 = new JLabel(".");
		condicional2.setFont(new Font("Arial", Font.BOLD, 17));
		condicional2.setBounds(295, 119, 194, 26);
		panel.add(condicional2);
		
		c21 = new JLabel(".");
		c21.setFont(new Font("Arial", Font.PLAIN, 15));
		c21.setBounds(295, 144, 194, 26);
		panel.add(c21);
		
		c22 = new JLabel(".");
		c22.setFont(new Font("Arial", Font.PLAIN, 15));
		c22.setBounds(295, 167, 194, 26);
		panel.add(c22);
		
		c23 = new JLabel(".");
		c23.setFont(new Font("Arial", Font.PLAIN, 15));
		c23.setBounds(295, 191, 194, 26);
		panel.add(c23);
		
		c24 = new JLabel(".");
		c24.setFont(new Font("Arial", Font.PLAIN, 15));
		c24.setBounds(295, 217, 194, 26);
		panel.add(c24);
		
		JButton button = new JButton("Regresar al Men\u00FA");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu m = new menu();
				m.setVisible(true);
				m.setLocationRelativeTo(null);
			}
		});
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(153, 0, 0));
		button.setBounds(0, 423, 137, 23);
		panel.add(button);
	}
}
