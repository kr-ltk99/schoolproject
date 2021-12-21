import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class rightclean extends Frame{
    public rightclean() {
        setSize(300, 200); //크기 설정
        setTitle("정답 화면");
        
        setLayout(new FlowLayout()); //배치 관리자 설정
        JButton button = new JButton("정답");
        
        //컴포넌트 생성 및 추가
        this.add(button);
        setVisible(true);
    }
    
}
