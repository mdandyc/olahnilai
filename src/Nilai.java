import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Nilai {

	private JFrame frame;
	private JTextField nama;
	private JTextField nilai;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nilai window = new Nilai();
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
	public Nilai() {
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
		
		JLabel lblNama = new JLabel("Nama");
		lblNama.setBounds(47, 83, 46, 14);
		frame.getContentPane().add(lblNama);
		
		JLabel lblNilai = new JLabel("Nilai");
		lblNilai.setBounds(47, 130, 46, 14);
		frame.getContentPane().add(lblNilai);
		
		nama = new JTextField();
		nama.setBounds(47, 99, 86, 20);
		frame.getContentPane().add(nama);
		nama.setColumns(10);
		
		nilai = new JTextField();
		nilai.setBounds(47, 155, 86, 20);
		frame.getContentPane().add(nilai);
		nilai.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String namaku = nama.getText();
				String nilaiku= nilai.getText();
				String grade,keterangan;
				
				int nilaianda=Integer.parseInt(nilaiku);
				if(nilaianda>=90){
					grade="A";
					keterangan="pulang";
				}else if(nilaianda>=80){
					grade="B";
					keterangan="pulang";
				}else if(nilaianda>=70){
					grade="C";
					keterangan="pulang";
				}else if(nilaianda>=60){
					grade="D";
					keterangan="pulang";
				}else{
					keterangan="nginep";
					grade="E";
				}
				JOptionPane.showMessageDialog(null,namaku +" " +grade +" " +keterangan);
			}
		});
		btnOk.setBounds(44, 186, 89, 23);
		frame.getContentPane().add(btnOk);
	}
}
