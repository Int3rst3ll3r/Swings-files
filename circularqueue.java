import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class circularqueue extends JFrame {

	private JPanel contentPane;
	private JTextField queuesize;
	private JTextField queueelement;
	private JTextField display1;
	  private int arr[];
	   private int count =0;
	   private int front = 0;
	   private int rear=-1;
	   private int size;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					circularqueue frame = new circularqueue();
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
	public circularqueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(149, 11, 152, 14);
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
				int a =Integer.valueOf(queuesize.getText());
				 arr= new int[a];
				 String message = "Size of the circular queue is "+a;
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
				if(count==Integer.valueOf(queuesize.getText())) {
					JOptionPane.showMessageDialog(contentPane,"Insertion not possible");
				}
				else {
					rear = (rear+1)%Integer.valueOf(queuesize.getText());
					arr[rear]=elem;
					count++;
					queueelement.setText("");
				}
			}
		});
		insert.setBounds(38, 156, 124, 23);
		contentPane.add(insert);
		
		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display1.setText("");
				queueelement.setText("");
			  	if(count==0) {
		    		JOptionPane.showMessageDialog(contentPane,"Deletion is not possible,Queue is empty");
		    	}
		    	else {
		    		String message = "Element deleted is "+arr[front];
		    		JOptionPane.showMessageDialog(contentPane,message);
		    		front = (front+1)%Integer.valueOf(queuesize.getText());
		    		count--;
		    	}
			}
		});
		delete.setBounds(168, 156, 124, 23);
		contentPane.add(delete);
		
		JButton display = new JButton("Display");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result="";
			  	 if(count ==0) {
		    		JOptionPane.showMessageDialog(contentPane,"Display not possible,Queue is empty");
		    	 }
		    	 else {
		    		 int f1=front;
		    		 for(int i =1;i<=count;i++) {
		    			result =result+arr[f1]+" ";
		    			 f1=(f1+1)%Integer.valueOf(queuesize.getText());
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
