import java.awt.*;

import java.awt.event.*;
import javax.swing.*;
public class Quiz extends Frame {
    public Quiz() {
        setSize(300, 200); //크기 설정
        setTitle("Quiz 화면");
        
        setLayout(new FlowLayout()); //배치 관리자 설정
        JButton button = new JButton("이전문제");
        JButton button1 = new JButton("다음문제");

        //컴포넌트 생성 및 추가
        this.add(button);
        this.add(button1);
        setVisible(true);
    }
    
}
