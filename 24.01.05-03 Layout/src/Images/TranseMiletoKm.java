package Images;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;

public class TranseMiletoKm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TranseMiletoKm frame = new TranseMiletoKm();
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
	public TranseMiletoKm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("mile를 Km로");
		sl_contentPane.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, rdbtnNewRadioButton, 50, SpringLayout.WEST, contentPane);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Km를 Mile로");
		sl_contentPane.putConstraint(SpringLayout.NORTH, rdbtnNewRadioButton_1, 0, SpringLayout.NORTH, rdbtnNewRadioButton);
		sl_contentPane.putConstraint(SpringLayout.EAST, rdbtnNewRadioButton_1, -67, SpringLayout.EAST, contentPane);
		contentPane.add(rdbtnNewRadioButton_1);
		
		textField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, textField, 63, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, textField, 110, SpringLayout.SOUTH, rdbtnNewRadioButton);
		sl_contentPane.putConstraint(SpringLayout.EAST, textField, 160, SpringLayout.WEST, contentPane);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("변환하기");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, 64, SpringLayout.EAST, textField);
		sl_contentPane.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, btnNewButton);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 87, SpringLayout.SOUTH, rdbtnNewRadioButton_1);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("변환기");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 181, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel, -57, SpringLayout.SOUTH, contentPane);
		contentPane.add(lblNewLabel);
	
		ButtonGroup grp = new ButtonGroup();
		grp.add(rdbtnNewRadioButton);
		grp.add(rdbtnNewRadioButton_1);
		
		rdbtnNewRadioButton.setSelected(true);
		
		ActionListener act = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			    double a = 0;
		        try {
		            double inputValue = Double.parseDouble(textField.getText());
		            
		            if (rdbtnNewRadioButton.isSelected() && e.getSource() == btnNewButton) {
		                a = inputValue * 1.60934;  // mile를 km로 변환
		            } else if (rdbtnNewRadioButton_1.isSelected() && e.getSource() == btnNewButton) {
		                a = inputValue / 1.60934;  // km를 mile로 변환
		            }
		            
		            lblNewLabel.setText(String.format("%.2f", a));  // 결과를 소수점 2자리까지 표시
		        } catch (NumberFormatException ex) {
		            lblNewLabel.setText("숫자를 입력하세요.");
		        }
		    }
		};

		btnNewButton.addActionListener(act);
		rdbtnNewRadioButton.addActionListener(act);
		rdbtnNewRadioButton_1.addActionListener(act);
	}
	
}
