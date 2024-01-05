import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InonFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InonFrame frame = new InonFrame();
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
	public InonFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.setPreferredSize(new Dimension(10, 70));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼이벤트 확인");
			}
		});
		btnNewButton.setIcon(new ImageIcon(InonFrame.class.getResource("/Images/kitchenware_equipment_decor_set_room_interior_kitchen_fork_spoon_icon_260151.png")));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 동작 확인");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(InonFrame.class.getResource("/Images/kitchenware_equipment_decor_set_room_interior_kitchen_oven_icon_260136.png")));
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setIcon(new ImageIcon(InonFrame.class.getResource("/Images/kitchenware_equipment_decor_set_room_interior_kitchen_pan_icon_260133.png")));
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton_3, 5, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton_3, 5, SpringLayout.WEST, panel_1);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("New button");
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton_2, 0, SpringLayout.WEST, btnNewButton_3);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("New button");
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton_4, 66, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btnNewButton_2, -6, SpringLayout.NORTH, btnNewButton_4);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton_4, 0, SpringLayout.WEST, btnNewButton_3);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setIcon(new ImageIcon(InonFrame.class.getResource("/Images/kitchenware_equipment_decor_set_room_interior_kitchen_oven_icon_260136.png")));
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton_5, 6, SpringLayout.SOUTH, btnNewButton_3);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton_5, 0, SpringLayout.WEST, btnNewButton_3);
		panel_1.add(btnNewButton_5);
	}

}
