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

public class stack extends JFrame {

	private JPanel contentPane;
	private JTextField stacksize;
	private JTextField element1;
	private JTextField stack;
	private int arr[];
	private int  size;
	private int top=-1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stack frame = new stack();
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
	public stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(173, 11, 66, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterTheStack = new JLabel("Enter the stack size");
		lblEnterTheStack.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterTheStack.setBounds(30, 54, 148, 14);
		contentPane.add(lblEnterTheStack);
		
		stacksize = new JTextField();
		stacksize.setBounds(214, 53, 96, 20);
		contentPane.add(stacksize);
		stacksize.setColumns(10);
		
		JButton CreateStack = new JButton("Create Stack");
		CreateStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = Integer.valueOf(stacksize.getText());
				arr=new int[n];
				String message="Stack of size  "+n+" is created ";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		CreateStack.setBounds(145, 86, 121, 23);
		contentPane.add(CreateStack);
		
		JLabel lblEnterTheElement = new JLabel("Enter the element");
		lblEnterTheElement.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterTheElement.setBounds(30, 120, 148, 14);
		contentPane.add(lblEnterTheElement);
		
		element1 = new JTextField();
		element1.setColumns(10);
		element1.setBounds(214, 119, 96, 20);
		contentPane.add(element1);
		
		JButton push = new JButton("Push");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem=Integer.valueOf(element1.getText());
				if(top==(Integer.valueOf(stacksize.getText()))-1) {
					String  message = "Stack push is not possible ";
					JOptionPane.showMessageDialog(contentPane, message);
				}
				else {
					++top;
					arr[top]=elem;
					JOptionPane.showMessageDialog(contentPane, "Push successful");
					element1.setText("");
				}
			}
		});
		push.setBounds(51, 160, 96, 23);
		contentPane.add(push);
		
		JButton pop = new JButton("Pop");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				element1.setText("");
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "Stack is empty,Pop is not possible");
				}
				else {
					String message="Element popped is "+arr[top];
					JOptionPane.showMessageDialog(contentPane, message);
					--top;
							}
			}
		});
		pop.setBounds(173, 160, 96, 23);
		contentPane.add(pop);
		
		JButton display = new JButton("Display");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result="";
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "Stack is empty");
				}
				else {
					for(int i=top;i>=0;i--) {
						result = result+arr[i]+" ";
					}
				}
				stack.setText(result);
			}
		});
		display.setBounds(296, 160, 96, 23);
		contentPane.add(display);
		
		stack = new JTextField();
		stack.setColumns(10);
		stack.setBounds(82, 206, 284, 20);
		contentPane.add(stack);
	}
}
