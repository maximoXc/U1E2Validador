package programacionlogica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;

public class menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
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
	public menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 128), new Color(0, 0, 102), new Color(0, 0, 102), new Color(0, 0, 102)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 693, 446);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btn1 = new JButton("Expresi\u00F3n Aritmetica");
		btn1.setBackground(new Color(153, 204, 204));
		btn1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				expresion_aritmetica ea = new expresion_aritmetica();
				ea.setVisible(true);
				ea.setLocationRelativeTo(null);
			}
		});
		btn1.setBounds(238, 64, 234, 39);
		panel.add(btn1);
		
		JButton btn2 = new JButton("Expresi\u00F3n L\u00F3gica");
		btn2.setBackground(new Color(153, 204, 204));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expresion_logica el = new expresion_logica();
				el.setVisible(true);
				el.setLocationRelativeTo(null);
			}
		});
		btn2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
		btn2.setBounds(254, 179, 205, 39);
		panel.add(btn2);
		
		JButton btn3 = new JButton("Contador de letras y numeros");
		btn3.setBackground(new Color(153, 204, 204));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contabilizar cont = new contabilizar();
				cont.setVisible(true);
				cont.setLocationRelativeTo(null);
			}
		});
		btn3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
		btn3.setBounds(186, 272, 351, 39);
		panel.add(btn3);
		
		JLabel lblNewLabel = new JLabel("Bonilla S\u00E1nchez Oscar");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 18));
		lblNewLabel.setBounds(504, 421, 179, 14);
		panel.add(lblNewLabel);
	}
}
