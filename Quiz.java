import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Quiz extends JFrame {
	Container contentPane;
	JLabel imageLabel;
	ImageIcon img0;
	ImageIcon img1;
	ImageIcon img2;

	public Quiz() {
		setTitle("Quiz window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		img0 = new ImageIcon("./imgaes/mango.png");
		img1 = new ImageIcon("./imgaes/mango.png");
		img2 = new ImageIcon("./imgaes/banana.jpg");

		imageLabel = new JLabel(img0);
		contentPane.add(imageLabel, BorderLayout.CENTER);
		contentPane.add(new MenuPanel(), BorderLayout.SOUTH);

		setSize(900, 600);
		setVisible(true);
	}

	class MenuPanel extends JPanel {
		public MenuPanel() {

			JButton btn1 = new JButton("다음");
			JButton btn2 = new JButton("이전");

			add(btn1);
			add(btn2);

			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					imageLabel.setIcon(img1);
				}
			});

			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					imageLabel.setIcon(img2);
				}
			});
		}
	}

	public static void main(String[] args) {
		new Quiz();
	}
}