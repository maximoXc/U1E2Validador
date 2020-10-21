package programacionlogica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class contabilizar extends JFrame {

	static JLabel numeroslbl,letraslbl;
	private JPanel contentPane;
	private JTextField tf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contabilizar frame = new contabilizar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Frame.
	 */
	public contabilizar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		//panel_1.setBackground(new Color(173, 216, 230));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 0, 683, 436);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escribir:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 21, 152, 30);
		panel_1.add(lblNewLabel);
		
		tf1 = new JTextField();
		tf1.setFont(new Font("Arial", Font.PLAIN, 18));
		tf1.setBounds(155, 21, 284, 27);
		panel_1.add(tf1);
		tf1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Esta cadena contiene:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 151, 404, 27);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Contabilizar");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(51, 51, 102));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadenaT = tf1.getText();
				String letra = "";
				String numero = "";
				
				char cletra;
				char cnumero;
				
				int numeros=0, letras=0;
				
				for(int i=0; i<cadenaT.length(); i++) {
					
					if(Character.isDigit(cadenaT.charAt(i))) {
						numeros++;
						cnumero = cadenaT.charAt(i);
						numero = numero+cnumero;
						
					}else {
						if(cadenaT.charAt(i) != (char)32)
							letras++;
						cletra = cadenaT.charAt(i);
						letra = letra+cletra;
					}
				}
				letraslbl.setText("Letras: "+ letras+"----- Letras que aparecen: "+ letra);
				numeroslbl.setText("Numeros: "+ numeros+"----- Números que aparecen: "+numero);
			}
		});
		btnNewButton.setBounds(449, 16, 155, 41);
		panel_1.add(btnNewButton);
		
		letraslbl = new JLabel("Letras: ");
		letraslbl.setFont(new Font("Arial", Font.BOLD, 18));
		letraslbl.setBounds(10, 204, 663, 61);
		panel_1.add(letraslbl);
		
		numeroslbl = new JLabel("Numeros: ");
		numeroslbl.setFont(new Font("Arial", Font.BOLD, 18));
		numeroslbl.setBounds(10, 309, 663, 61);
		panel_1.add(numeroslbl);
		
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
		button.setBounds(0, 413, 137, 23);
		panel_1.add(button);
	}
}
