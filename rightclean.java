import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class rightclean extends Frame{
	JLabel imageLabel;
	ImageIcon img;
	public rightclean() {
        setSize(580, 360); //크기 설정
        setTitle("정답 화면");
		
		img = new ImageIcon("./img/정답.png");
		
		imageLabel = new JLabel(img);
		this.add(imageLabel, BorderLayout.CENTER);
        setLayout(new FlowLayout()); //배치 관리자 설정
        setVisible(true);
    }
    
}