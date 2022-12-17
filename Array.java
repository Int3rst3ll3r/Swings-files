import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField position;
	private JTextField elementdelete;
	private JTextField display;
	private int arr[];
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(64, 0, 64));
		lblNewLabel.setBounds(159, 0, 118, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterLength = new JLabel("Enter Length");
		lblEnterLength.setForeground(new Color(64, 0, 64));
		lblEnterLength.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterLength.setBounds(27, 43, 94, 25);
		contentPane.add(lblEnterLength);
		
		length = new JTextField();
		length.setBounds(169, 47, 216, 20);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton createarray = new JButton("Create Array");
		createarray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int len = Integer.valueOf(length.getText());
				arr=new int[len];
				String msg="Array of size  "+len+" is created";
				JOptionPane.showMessageDialog(contentPane, msg);
			}
		});
		createarray.setBackground(new Color(192, 192, 192));
		createarray.setBounds(141, 78, 144, 23);
		contentPane.add(createarray);
		
		JLabel lblEnterIntegerElement = new JLabel("Enter integer element");
		lblEnterIntegerElement.setForeground(new Color(64, 0, 64));
		lblEnterIntegerElement.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterIntegerElement.setBounds(27, 114, 166, 31);
		contentPane.add(lblEnterIntegerElement);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(203, 121, 49, 20);
		contentPane.add(element);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setForeground(new Color(64, 0, 64));
		lblPosition.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPosition.setBounds(277, 117, 69, 25);
		contentPane.add(lblPosition);
		
		position = new JTextField();
		position.setColumns(10);
		position.setBounds(354, 121, 49, 20);
		contentPane.add(position);
		
		JButton insert = new JButton("Insert");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elem = Integer.valueOf(element.getText());
				int pos = Integer.valueOf(position.getText());
				arr[pos]=elem;
				count++;
				String msg="Element entered at position "+pos+" is "+elem;
				JOptionPane.showMessageDialog(contentPane, msg);
				element.setText("");
				position.setText("");
			}
		});
		insert.setBackground(new Color(192, 192, 192));
		insert.setBounds(141, 148, 144, 23);
		contentPane.add(insert);
		
		JLabel lblEnterPosition = new JLabel("Enter Position");
		lblEnterPosition.setForeground(new Color(64, 0, 64));
		lblEnterPosition.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterPosition.setBounds(27, 182, 118, 31);
		contentPane.add(lblEnterPosition);
		
		elementdelete = new JTextField();
		elementdelete.setColumns(10);
		elementdelete.setBounds(169, 189, 49, 20);
		contentPane.add(elementdelete);
		
		JButton delete = new JButton("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pos = Integer.valueOf(elementdelete.getText());
				String msg="Element deleted at position "+pos+" is "+arr[pos];
				arr[pos]=0;
				count--;
				JOptionPane.showMessageDialog(contentPane, msg);
				elementdelete.setText("");
			}
		});
		delete.setBackground(new Color(192, 192, 192));
		delete.setForeground(new Color(64, 0, 64));
		delete.setBounds(270, 188, 144, 23);
		contentPane.add(delete);
		
		display = new JTextField();
		display.setBounds(134, 224, 251, 20);
		contentPane.add(display);
		display.setColumns(10);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result=" ";
				for(int i=0;i<count;i++) {
					result=result+arr[i]+" ";
				}
				display.setText(result);
			}
		});
		btnDisplay.setBackground(new Color(192, 192, 192));
		btnDisplay.setBounds(27, 223, 82, 23);
		contentPane.add(btnDisplay);
	}

}
