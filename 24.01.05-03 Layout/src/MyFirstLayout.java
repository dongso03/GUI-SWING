import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.SpringLayout;

public class MyFirstLayout extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstLayout frame = new MyFirstLayout();
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
	public MyFirstLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JButton button = new JButton("New button");
		sl_contentPane.putConstraint(SpringLayout.NORTH, button, 29, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, button, 41, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, button, 34, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, button, 5, SpringLayout.WEST, contentPane);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("New button");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 80, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, 155, SpringLayout.WEST, contentPane);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_1, 112, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_1, -269, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, -9, SpringLayout.NORTH, btnNewButton_1);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_2, 8, SpringLayout.EAST, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton_2, 0, SpringLayout.SOUTH, btnNewButton_1);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_3, 0, SpringLayout.NORTH, btnNewButton_1);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton_3, 6, SpringLayout.EAST, btnNewButton_2);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton_4, 6, SpringLayout.SOUTH, btnNewButton_3);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton_4, 0, SpringLayout.EAST, btnNewButton_3);
		contentPane.add(btnNewButton_4);
	}
}
