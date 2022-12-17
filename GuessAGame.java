import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GuessAGame extends JFrame {

	private JPanel contentPane;
	private JTextField player1;
	private JTextField player2;
	private JTextField player3;
	private JTextField randomnumber;
	private JTextField result;
	private int a;
	private int b;
	private int c;
	private String random1;
	private int n1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuessAGame frame = new GuessAGame();
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
	public GuessAGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(228, 205, 227));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Guess Game");
		lblNewLabel.setForeground(new Color(128, 0, 64));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(170, 11, 157, 14);
		contentPane.add(lblNewLabel);
		
		player1 = new JTextField();
		player1.setBounds(195, 54, 96, 20);
		contentPane.add(player1);
		player1.setColumns(10);
		
		player2 = new JTextField();
		player2.setColumns(10);
		player2.setBounds(195, 85, 96, 20);
		contentPane.add(player2);
		
		player3 = new JTextField();
		player3.setColumns(10);
		player3.setBounds(195, 113, 96, 20);
		contentPane.add(player3);
		
		JLabel lblPlayer = new JLabel("Player 1");
		lblPlayer.setBounds(112, 57, 117, 14);
		contentPane.add(lblPlayer);
		
		JLabel lblPlayer_1 = new JLabel("Player 2");
		lblPlayer_1.setBounds(112, 88, 157, 14);
		contentPane.add(lblPlayer_1);
		
		JLabel lblPlayer_2 = new JLabel("Player 3");
		lblPlayer_2.setBounds(112, 116, 157, 14);
		contentPane.add(lblPlayer_2);
		
		randomnumber = new JTextField();
		randomnumber.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		randomnumber.setColumns(10);
		randomnumber.setBounds(195, 161, 96, 20);
		contentPane.add(randomnumber);
		
		result = new JTextField();
		result.setColumns(10);
		result.setBounds(273, 204, 96, 20);
		contentPane.add(result);
		
		JButton btnNewButton = new JButton("Random Number");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random  random = new Random();
				 n1 =random.nextInt(3);
				random1 = String.valueOf(n1);
				randomnumber.setText(random1);
			}
		});
		btnNewButton.setForeground(new Color(128, 0, 64));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton.setBounds(301, 160, 125, 23);
		contentPane.add(btnNewButton);
		
		JButton btnResult = new JButton("Result");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a==n1) {
					result.setText("Player 1 wins");
				}
				else if(b==n1) {
					result.setText("Player 2 wins");
				}
				else if(c==n1){
					result.setText("Player 3 wins");
				}
				else {
					result.setText("Everybody lost");
				}
			}
		});
		btnResult.setForeground(new Color(128, 0, 64));
		btnResult.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnResult.setBounds(115, 202, 143, 23);
		contentPane.add(btnResult);
		
		JButton bplayer3 = new JButton("Enter");
		bplayer3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c=Integer.valueOf(player3.getText());
			}
		});
		bplayer3.setForeground(new Color(128, 0, 64));
		bplayer3.setFont(new Font("Tahoma", Font.BOLD, 9));
		bplayer3.setBounds(301, 112, 96, 23);
		contentPane.add(bplayer3);
		
		JButton bplayer2 = new JButton("Enter");
		bplayer2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b=Integer.valueOf(player2.getText());
			}
		});
		bplayer2.setForeground(new Color(128, 0, 64));
		bplayer2.setFont(new Font("Tahoma", Font.BOLD, 9));
		bplayer2.setBounds(301, 84, 96, 23);
		contentPane.add(bplayer2);
		
		JButton bplayer1 = new JButton("Enter");
		bplayer1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Integer.valueOf(player1.getText());
			}
		});
		bplayer1.setForeground(new Color(128, 0, 64));
		bplayer1.setFont(new Font("Tahoma", Font.BOLD, 9));
		bplayer1.setBounds(301, 53, 96, 23);
		contentPane.add(bplayer1);
		
		JLabel lblPlayer_2_1 = new JLabel("Random Number");
		lblPlayer_2_1.setBounds(101, 164, 157, 14);
		contentPane.add(lblPlayer_2_1);
	}
}
