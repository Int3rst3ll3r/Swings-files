import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sorting extends JFrame {

	private JPanel contentPane;
	private JTextField tfa;
	private JTextField tfb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sorting frame = new Sorting();
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
	public Sorting() {
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel sorting = new JLabel("Sorting");
		sorting.setFont(new Font("Tahoma", Font.BOLD, 13));
		sorting.setBounds(175, 11, 49, 14);
		contentPane.add(sorting);
		
		JLabel num = new JLabel("Enter numbers for Sorting");
		num.setBounds(23, 45, 185, 32);
		contentPane.add(num);
		
		JLabel num2 = new JLabel("Numbers after Sorting");
		num2.setBounds(23, 88, 144, 17);
		contentPane.add(num2);
		
		tfa = new JTextField();
		tfa.setBounds(236, 48, 163, 20);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		tfb = new JTextField();
		tfb.setColumns(10);
		tfb.setBounds(236, 85, 163, 20);
		contentPane.add(tfb);
		
		JButton bubblesort = new JButton("BubbleSort");
		bubblesort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sen = tfa.getText();
				String a[]= sen.split(" ");
				String result=" ";
				String temp;
				for(int i=0;i<+a.length-2;i++) {
					for(int j=0;j<=a.length-2-i;j++) {
						if(Integer.valueOf(a[j])>Integer.valueOf(a[j+1])) {
							temp=a[j];
							a[j]=a[j+1];
							a[j+1]=temp;
						}
					}
				}
				for(int k=0;k<=a.length-1;k++) {
					result= result+a[k]+" ";
				}
				tfb.setText(result);
			}
		});
		bubblesort.setFont(new Font("Tahoma", Font.BOLD, 13));
		bubblesort.setBounds(143, 136, 114, 23);
		contentPane.add(bubblesort);
	}
}
