import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 0, 64));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(214, 10, 1, 1);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(220, 10, 1, 1);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel DS = new JLabel("DATA STRUCTURE");
		DS.setForeground(new Color(192, 192, 192));
		DS.setFont(new Font("Tahoma", Font.BOLD, 13));
		DS.setBounds(148, 2, 122, 45);
		contentPane.add(DS);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Array a = new Array();
			a.setVisible(true);
			}
		});
		array.setForeground(new Color(64, 0, 64));
		array.setBounds(37, 71, 89, 23);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stack s = new stack();
				s.setVisible(true);
			}
		});
		stack.setBounds(37, 121, 89, 23);
		contentPane.add(stack);
		
		JButton cq = new JButton("CIRCULAR QUEUE");
		cq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				circularqueue cq = new circularqueue();
				cq.setVisible(true);
			}
		});
		cq.setBounds(207, 69, 167, 26);
		contentPane.add(cq);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				queue q = new queue();
				q.setVisible(true);
			}
		});
		queue.setBounds(37, 176, 89, 23);
		contentPane.add(queue);
		
		JButton sll = new JButton("SINGLY LINKED LIST");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				singlyinkedlist sll = new singlyinkedlist();
				sll.setVisible(true);
			}
		});
		sll.setBounds(200, 119, 190, 26);
		contentPane.add(sll);
		
		JButton dll = new JButton("DOUBLY LINKED LIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Doublylinkedlist dll = new Doublylinkedlist();
				dll.setVisible(true);
			}
		});
		dll.setBounds(199, 174, 191, 26);
		contentPane.add(dll);
	}
}
