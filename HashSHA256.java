import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class HashSHA256 extends JFrame {
//Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private JTextArea  txtTexto = new JTextArea();
	private JScrollPane jspTexto = new JScrollPane(txtTexto);
	
	private JTextField txtResumo = new JTextField();
	private JButton btnCalcular = new JButton("Calcular Hash");
			
	public static void main(String[] args) {
		new HashSHA256().setVisible(true);
	}
	
	
//Método construtor da classe
	public HashSHA256() {
		setTitle("Programa de Cálculo do Resumo Unidirecional SHA-256");
		setSize(486,430);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		//Config da area de texto
		jspTexto.setBounds(10,10,465,300);
		add(jspTexto);
		txtTexto.setLineWrap(true);
		
		//Configuração Caixa Hash
		txtResumo.setBounds(10,320,465, 20);
		add(txtResumo);
		
		//Configuração Botão
		btnCalcular.setBounds(150,350,200,30);
		add(btnCalcular);
		btnCalcular.addActionListener(new ControladorCalcular(txtTexto, txtResumo));
		
	}
	
;}
