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

public class Doublylinkedlist extends JFrame {

	private JPanel contentPane;
	private JTextField elementrear;
	private JTextField elementfront;
	private JTextField display2;
	class Node{
		Node prevlink;
		int data;
		Node nextlink;
	}
	Node first;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doublylinkedlist frame = new Doublylinkedlist();
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
	public Doublylinkedlist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST");
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
			Node temp;
			int elem=Integer.valueOf(elementrear.getText());
			Node newnode = new Node();
			newnode.data=elem;
			newnode.nextlink=null;
			newnode.prevlink=null;
			if(first==null) {
				first=newnode;
			}
			else {
				temp=first;
				while(temp.nextlink!=null) {
					temp=temp.nextlink;
				}
				temp.nextlink=newnode;
				newnode.prevlink=temp;
				}
			elementrear.setText("");
			}
		});
		insertrear.setBounds(307, 45, 105, 23);
		contentPane.add(insertrear);
		
		JButton insertfront = new JButton("Insert Front");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem=Integer.valueOf(elementfront.getText());
			Node newnode = new Node();
			newnode.data=elem;
			newnode.nextlink=null;
			newnode.prevlink=null;
			
		if(first==null) {
			first=newnode;
		}
		else {
			newnode.nextlink=first;
			first.prevlink=newnode;
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
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane,"Deletion is not possible");
				}
				else if(first.nextlink==null) {
					String msg="Deleted element  is "+first.data;
					JOptionPane.showMessageDialog(contentPane, msg);
					first=null;
				}
				else {
					Node temp=first;
					while(temp.nextlink.nextlink!=null) {
						temp=temp.nextlink;
					}
					String msg="Element deleted is "+temp.nextlink.data;
					JOptionPane.showMessageDialog(contentPane, msg);
					temp.nextlink=null;
				}
				elementfront.setText("");
				elementrear.setText("");
				display2.setText("");
			}
		});
		deleterear.setBounds(98, 120, 105, 23);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("Delete Front");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane,"Deletion is not possible");
				}
				else if(first.nextlink==null) {
					String msg="Deleted element  is "+first.data;
					JOptionPane.showMessageDialog(contentPane, msg);
					first=null;
				}
				else {
					String msg="Deleted element is "+first.data;
					JOptionPane.showMessageDialog(contentPane, msg);
					first=first.nextlink;
					first.prevlink=null;
				}
				elementfront.setText("");
				elementrear.setText("");
				display2.setText("");
			}
		});
		deletefront.setBounds(223, 120, 125, 23);
		contentPane.add(deletefront);
		
		display2 = new JTextField();
		display2.setColumns(10);
		display2.setBounds(82, 176, 302, 20);
		contentPane.add(display2);
		
		JButton display_1 = new JButton(" Display Forward");
		display_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result="";
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane,"Display not possible");
				}
				else if(first.nextlink==null) {
					String res= String.valueOf(first.data);
					display2.setText(res);
				}
				else {
					Node temp=first;
					while(temp.nextlink!=null) {
						temp=temp.nextlink;
					}
					while(temp!=null) {
						result= temp.data+result+" ";
						temp=temp.prevlink;
					}
					display2.setText(result);
				}
			}
		});
		display_1.setBounds(57, 207, 169, 23);
		contentPane.add(display_1);
		
		JButton display_1_1 = new JButton(" Display Reverse");
		display_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display2.setText("");
				String rest1="";
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane,"Display not possible");
				}
				else if(first.nextlink==null) {
					String res= String.valueOf(first.data);
					display2.setText(res);
				}
				else {
					Node temp=first;
					while(temp.nextlink!=null) {
						temp=temp.nextlink;
					}
					while(temp!=null) {
						rest1= rest1+temp.data+" ";
						temp=temp.prevlink;
					}
					display2.setText(rest1);
				}
			}
		});
		display_1_1.setBounds(243, 207, 169, 23);
		contentPane.add(display_1_1);
	}
}
