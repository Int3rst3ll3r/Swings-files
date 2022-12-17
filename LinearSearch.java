import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LinearSearch extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LinearSearch frame = new LinearSearch();
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
	public LinearSearch() {
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ls = new JLabel("LINEAR SEARCH");
		ls.setFont(new Font("MS Gothic", Font.BOLD, 13));
		ls.setForeground(new Color(64, 0, 64));
		ls.setBounds(160, 28, 121, 14);
		contentPane.add(ls);
		
		JLabel b1 = new JLabel("Enter numbers");
		b1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		b1.setForeground(new Color(0, 0, 0));
		b1.setBounds(61, 71, 105, 14);
		contentPane.add(b1);
		
		JLabel b2 = new JLabel("Enter Key");
		b2.setForeground(Color.BLACK);
		b2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		b2.setBounds(61, 109, 105, 14);
		contentPane.add(b2);
		
		JLabel b3 = new JLabel("Index ");
		b3.setBounds(61, 147, 49, 14);
		contentPane.add(b3);
		
		tf1 = new JTextField();
		tf1.setBounds(198, 69, 170, 20);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(198, 107, 170, 20);
		contentPane.add(tf2);
		
		res = new JTextField();
		res.setColumns(10);
		res.setBounds(198, 144, 170, 20);
		contentPane.add(res);
		
		JButton ls1 = new JButton("Linear Search");
		ls1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = tf1.getText();
				String arr[]= str.split(" ");
				String d1,d2,r;
				for(int i=0;i<arr.length;i++) {
					if(Integer.valueOf(arr[i])==(Integer.valueOf(tf2.getText()))) {
						 r=String.valueOf(i);
						 d1= "key found at  "+r; 
						 res.setText(d1);
						 return ;
					}
				}
				
					d2=" Key not found ";
					res.setText(d2);
				
				
				}
		});
		ls1.setBackground(new Color(192, 192, 192));
		ls1.setFont(new Font("Tahoma", Font.BOLD, 13));
		ls1.setBounds(142, 196, 141, 23);
		contentPane.add(ls1);
	}
}
