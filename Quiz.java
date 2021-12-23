import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Quiz extends JFrame {
	Container contentPane;
	JLabel imageLabel;
	ImageIcon img0;
	ImageIcon img1; 
	ImageIcon img2;
	ImageIcon img3; 
	ImageIcon img4;
	ImageIcon img5; 
	String[] right1 = {"사자","사과","신발","가방","나비"};
	String r;


	public Quiz() {
		setTitle("Quiz window");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		img0 = new ImageIcon("./img/출제.png");
		img1 = new ImageIcon("./img/사자.png");
		img2 = new ImageIcon("./img/사과.png");
		img3 = new ImageIcon("./img/신발.png");
		img4 = new ImageIcon("./img/가방.png");
		img5 = new ImageIcon("./img/나비.png");
		imageLabel = new JLabel(img0);
		contentPane.add(imageLabel, BorderLayout.CENTER);
		contentPane.add(new MenuPanel(), BorderLayout.SOUTH);

		setSize(900, 600);
		setVisible(true);
	}

	class MenuPanel extends JPanel {
		public MenuPanel() {

			JButton btn1 = new JButton("1p");
			JButton btn2 = new JButton("2p");
			JButton btn3 = new JButton("3p");
			JButton btn4 = new JButton("4p");
			JButton btn5 = new JButton("5p");

			add(btn1);
			add(btn2);
			add(btn3);
			add(btn4);
			add(btn5);

			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					imageLabel.setIcon(img1);
					r = right1[0];
				}
			});

			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					imageLabel.setIcon(img2);
					r = right1[1];
					
				}
			});
			
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					imageLabel.setIcon(img3);
					r = right1[2];
				}
			});

			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					imageLabel.setIcon(img4);
					r = right1[3];
					
				}
			});
			
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					imageLabel.setIcon(img5);
					r = right1[4];
					
				}
			});
		}
	}
}