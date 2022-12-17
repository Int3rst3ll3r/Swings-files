import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.DropMode;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator2 extends JFrame {

	private JPanel contentPane;
	private JTextField heading;
	private JTextField vara;
	private JTextField varb;
	private JTextField result;
	private JTextField tfa;
	private JTextField tfb;
	private JTextField tfr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator2 frame = new Calculator2();
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
	public Calculator2() {
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(8, 5, 8, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		vara = new JTextField();
		vara.setBackground(new Color(0, 0, 0));
		vara.setForeground(new Color(0, 255, 0));
		vara.setText("A");
		vara.setBounds(119, 55, 24, 20);
		contentPane.add(vara);
		vara.setColumns(10);
		
		heading = new JTextField();
		heading.setBounds(143, 11, 136, 22);
		heading.setFont(new Font("Tahoma", Font.BOLD, 13));
		heading.setBackground(new Color(0, 0, 0));
		heading.setForeground(new Color(0, 255, 0));
		heading.setText("Calculator");
		contentPane.add(heading);
		heading.setColumns(10);
		
		varb = new JTextField();
		varb.setText("B");
		varb.setForeground(Color.GREEN);
		varb.setColumns(10);
		varb.setBackground(Color.BLACK);
		varb.setBounds(119, 86, 24, 20);
		contentPane.add(varb);
		
		result = new JTextField();
		result.setText("RES");
		result.setForeground(Color.GREEN);
		result.setColumns(10);
		result.setBackground(Color.BLACK);
		result.setBounds(119, 121, 33, 20);
		contentPane.add(result);
		
		tfa = new JTextField();
		tfa.setBounds(176, 55, 103, 20);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		tfb = new JTextField();
		tfb.setColumns(10);
		tfb.setBounds(176, 86, 103, 20);
		contentPane.add(tfb);
		
		tfr = new JTextField();
		tfr.setColumns(10);
		tfr.setBounds(176, 121, 103, 20);
		contentPane.add(tfr);
		
		JButton add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1 = tfa.getText();
				String data2 = tfb.getText();
				int a = Integer.valueOf(data1);
				int b = Integer.valueOf(data2);
                int c = a+b;
                String data3 = String.valueOf(c);
                tfr.setText(data3);

			}
		});
		add.setBackground(new Color(192, 192, 192));
		add.setBounds(34, 173, 65, 22);
		contentPane.add(add);
		
		JButton sub = new JButton("SUB");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1 = tfa.getText();
				String data2 = tfb.getText();
				int a = Integer.valueOf(data1);
				int b = Integer.valueOf(data2);
                int c = a-b;
                String data3 = String.valueOf(c);
                tfr.setText(data3);
				
			}
		});
		sub.setBackground(new Color(192, 192, 192));
		sub.setBounds(109, 173, 68, 22);
		contentPane.add(sub);
		
		JButton mul = new JButton("MUL");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1 = tfa.getText();
				String data2 = tfb.getText();
				int a = Integer.valueOf(data1);
				int b = Integer.valueOf(data2);
                int c = a*b;
                String data3 = String.valueOf(c);
                tfr.setText(data3);
			}
		});
		mul.setBackground(new Color(192, 192, 192));
		mul.setBounds(187, 173, 70, 22);
		contentPane.add(mul);
		
		JButton div = new JButton("DIV");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String data1 = tfa.getText();
				String data2 = tfb.getText();
				float a = Float.valueOf(data1);
				float b = Float.valueOf(data2);
                float c = a/b;
                String data3 = String.valueOf(c);
                tfr.setText(data3);
				
				
			}
		});
		div.setBackground(new Color(192, 192, 192));
		div.setBounds(267, 173, 70, 22);
		contentPane.add(div);
		
		
		JButton rem = new JButton("REM");
		rem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1 = tfa.getText();
				String data2 = tfb.getText();
				int a = Integer.valueOf(data1);
				int b = Integer.valueOf(data2);
                int c = a%b;
                String data3 = String.valueOf(c);
                tfr.setText(data3);
			}
		});
		rem.setBackground(new Color(192, 192, 192));
		rem.setBounds(347, 173, 65, 22);
		contentPane.add(rem);
	}
}
