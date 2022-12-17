import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BinarySearch extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BinarySearch frame = new BinarySearch();
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
	public BinarySearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("BINARY SEARCH");
		l1.setBounds(159, 25, 125, 14);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Enter Numbers");
		l2.setBounds(60, 67, 100, 14);
		contentPane.add(l2);
		
		JLabel l3 = new JLabel("Key Index");
		l3.setBounds(60, 149, 85, 20);
		contentPane.add(l3);
		
		tf1 = new JTextField();
		tf1.setBounds(200, 64, 125, 20);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		JLabel l4 = new JLabel("Key");
		l4.setBounds(60, 110, 85, 20);
		contentPane.add(l4);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(200, 107, 125, 20);
		contentPane.add(tf2);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(200, 146, 125, 20);
		contentPane.add(tf3);
		
		JButton bs = new JButton("Binary Search");
		bs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = tf1.getText();
				int key = Integer.valueOf(tf2.getText());
				String ar[]= str.split(" ");
				int a[]= new int[ar.length];
				for(int i=0;i<a.length;i++) {
					a[i]=Integer.valueOf(ar[i]);
				}
				for(int i=0;i<=a.length-2;i++) {
					for(int j=0;j<=a.length-2-i;j++) {
						if(a[j]>a[j+1]) {
							int temp = a[j];
							a[j]=a[j+1];
							a[j+1]= temp;
						}
					}
				}
				
				String d1,d2;
				int low =0;
				int high = a.length-1;
				while(low<=high) {
					int mid = (low+high)/2;
					for(int i=0;i<a.length;i++) {
						if(key==a[mid]) {
							d1=" Key found "+mid;
							tf3.setText(d1);
							return;
						}
						else if(key>a[mid]) {
							low = mid+1;
						}
						else {
							high = mid-1;
						}
					}
				}
				d2 = "key not found ";
				tf3.setText(d2);
			}
		});
		bs.setBounds(124, 194, 160, 23);
		contentPane.add(bs);
	}

}
