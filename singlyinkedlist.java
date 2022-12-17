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

public class singlyinkedlist extends JFrame {

	private JPanel contentPane;
	private JTextField elementrear;
	private JTextField elementfront;
	private JTextField display2;
	class Node{
		int data;
	    Node link;
	}
	Node first=null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					singlyinkedlist frame = new singlyinkedlist();
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
	public singlyinkedlist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(129, 11, 202, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterTheElement = new JLabel("Enter the element");
		lblEnterTheElement.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterTheElement.setBounds(32, 47, 147, 14);
		contentPane.add(lblEnterTheElement);
		
		JLabel lblEnterTheElement_1 = new JLabel("Enter the element");
		lblEnterTheElement_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterTheElement_1.setBounds(32, 72, 125, 14);
		contentPane.add(lblEnterTheElement_1);
		
		elementrear = new JTextField();
		elementrear.setBounds(192, 46, 62, 20);
		contentPane.add(elementrear);
		elementrear.setColumns(10);
		
		elementfront = new JTextField();
		elementfront.setColumns(10);
		elementfront.setBounds(192, 71, 62, 20);
		contentPane.add(elementfront);
		
		JButton insertrear = new JButton("Insert Rear");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int elem = Integer.valueOf(elementrear.getText());
				 Node newnode= new Node();
				 newnode.data=elem;
				 newnode.link=null;
				  if(first==null) {
					  first=newnode;
				  }
				  else {
					   Node temp =first;
					  while(temp.link!=null) {
						  temp=temp.link;
					  }
					  temp.link=newnode;
				  }
				  elementrear.setText("");
			}
		});
		insertrear.setBounds(307, 45, 105, 23);
		contentPane.add(insertrear);
		
		JButton insertfront = new JButton("Insert Front");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int elem = Integer.valueOf(elementfront.getText());
				 Node newnode= new Node();
				 newnode.data=elem;
				 newnode.link=null;
				  if(first==null) {
					  first=newnode;
				  }
				  else {
					  newnode.link=first;
					 first=newnode;
				  }
				  elementfront.setText("");
			}
		});
		insertfront.setBounds(307, 70, 105, 23);
		contentPane.add(insertfront);
		
		JButton deleterear = new JButton("Delete Rear");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display2.setText("");
				 if(first==null) {
					JOptionPane.showMessageDialog(contentPane,"Deletion not possible,because LinkedList is empty");
				 }
				 else if(first.link==null){
					 first = null;	 
					 }
				 else {
					 Node temp=first;
					 while(temp.link.link!=null) {
						 temp=temp.link;
					 }
					String message="The deleted element is "+temp.link.data;
					JOptionPane.showMessageDialog(contentPane, message);
					 temp.link=null;
				 }
		}
		});
		deleterear.setBounds(98, 120, 105, 23);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("Delete Front");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display2.setText("");
				 if(first==null) {
					 JOptionPane.showMessageDialog(contentPane, "Deletion not possible,because LinkedList is empty");
				 }
				 else if(first.link==null){
					 first = null;	 
					 }
				 else {
					String Message="The deleted element is "+first.data;
					JOptionPane.showMessageDialog(contentPane, Message);
					 first=first.link;
				 }
			}
		});
		deletefront.setBounds(213, 120, 135, 23);
		contentPane.add(deletefront);
		
		JButton display = new JButton("Display");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result="";
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane,"Display not possibe,Linked list is empty");
				}
				else {
					Node temp=first;
					while(temp!=null) {
						result = result+temp.data+"  ";
						temp=temp.link;
					}
					display2.setText(result);
				}
			}
		});
		display.setBounds(176, 207, 89, 23);
		contentPane.add(display);
		
		display2 = new JTextField();
		display2.setColumns(10);
		display2.setBounds(110, 176, 253, 20);
		contentPane.add(display2);
	}

}
