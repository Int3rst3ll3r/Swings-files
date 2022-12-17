import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class queue extends JFrame {

	private JPanel contentPane;
	private JTextField queuesize;
	private JTextField queueelement;
	private JTextField display1;
	private int size;
	private int que[];
	private int front = 0;
	private int rear =-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					queue frame = new queue();
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
	public queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(174, 11, 111, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Queue size");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(38, 49, 132, 14);
		contentPane.add(lblNewLabel_1);
		
		queuesize = new JTextField();
		queuesize.setBounds(187, 47, 199, 20);
		contentPane.add(queuesize);
		queuesize.setColumns(10);
		
		JButton createqueue = new JButton("Create Queue");
		createqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int  n=Integer.valueOf(queuesize.getText());
				que = new int[n];
				size= n;
				String message ="Size of Queue is "+size;
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		createqueue.setBounds(135, 78, 124, 23);
		contentPane.add(createqueue);
		
		JLabel lblNewLabel_1_1 = new JLabel("Enter Element");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(38, 112, 132, 14);
		contentPane.add(lblNewLabel_1_1);
		
		queueelement = new JTextField();
		queueelement.setColumns(10);
		queueelement.setBounds(187, 110, 199, 20);
		contentPane.add(queueelement);
		
		JButton insert = new JButton("Insert");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem = Integer.valueOf(queueelement.getText());
				if(rear==Integer.valueOf(queuesize.getText())-1) {
					JOptionPane.showMessageDialog(contentPane, "Queue is full");
				}
				else {
					++rear;
					que[rear]=elem;
					String msg = "Element entered is "+elem;
					JOptionPane.showMessageDialog(contentPane, msg);
				}
				queueelement.setText("");
			}
		});
		insert.setBounds(38, 156, 124, 23);
		contentPane.add(insert);
		
		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				queueelement.setText("");
				if(rear==-1|| front>rear) {
					JOptionPane.showMessageDialog(contentPane, "Queue is empty");
				}
				else {
					String msg ="Deleted element is "+que[front];
					JOptionPane.showMessageDialog(contentPane, msg);
					++front;
				}
				display1.setText("");
			}
		});
		delete.setBounds(168, 156, 124, 23);
		contentPane.add(delete);
		
		JButton display = new JButton("Display");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result="";
				if(rear==-1||front>rear) {
					JOptionPane.showMessageDialog(contentPane, "Display not possible");
				}
				else {
					for(int i=front;i<=rear;i++) {
					result = result+que[i]+" ";
				}
					display1.setText(result);
			}
			}
		});
		display.setBounds(302, 156, 124, 23);
		contentPane.add(display);
		
		display1 = new JTextField();
		display1.setColumns(10);
		display1.setBounds(105, 199, 221, 20);
		contentPane.add(display1);
	}

}
