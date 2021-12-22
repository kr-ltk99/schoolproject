
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Stopwatch implements ActionListener{
   
   JFrame frame = new JFrame();
   JButton startButton = new JButton("START");
   JButton resetButton = new JButton("RESET");
   JLabel timeLabel = new JLabel();
   JTextField right_field;//추가 
   JLabel right_label;//추가 
   String right ="입력";//추가
   JButton commandButton = new JButton("ent"); 
   String rightcommand = "asd";
   int elapsedTime = 0;
   int seconds =0;
   int minutes =0;
   int hours =0;
   boolean started = false;
   String seconds_string = String.format("%02d", seconds);
   String minutes_string = String.format("%02d", minutes);
   String hours_string = String.format("%02d", hours);
   
   Timer timer = new Timer(1000, new ActionListener() {
      
      public void actionPerformed(ActionEvent e) {
         
         elapsedTime=elapsedTime+1000;
         hours = (elapsedTime/3600000);
         minutes = (elapsedTime/60000) % 60;
         seconds = (elapsedTime/1000) % 60;
         seconds_string = String.format("%02d", seconds);
         minutes_string = String.format("%02d", minutes);
         hours_string = String.format("%02d", hours);
         timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
         
      }
      
   });
   

   Stopwatch(){
      right_field = new JTextField(right, 5);
      right_field.setHorizontalAlignment(JTextField.CENTER);
      right_field.setFont(new Font("Serif", Font.PLAIN, 25));
      right_field.setBounds(100-50,260,150,50);

      timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
      timeLabel.setBounds(100-50,100,250,100);
      timeLabel.setFont(new Font("Verdana",Font.PLAIN,35));
      timeLabel.setBorder(BorderFactory.createBevelBorder(1));
      timeLabel.setOpaque(true);
      timeLabel.setHorizontalAlignment(JTextField.CENTER);
      
      startButton.setBounds(100-50,200,150,50);
      startButton.setFont(new Font("Ink Free",Font.PLAIN,20));
      startButton.setFocusable(false);
      startButton.addActionListener(this);
      
      resetButton.setBounds(250-50,200,100,50);
      resetButton.setFont(new Font("Ink Free",Font.PLAIN,20));
      resetButton.setFocusable(false);
      resetButton.addActionListener(this);
      
      //JButton commandButton = new JButton("ent");
      commandButton.setHorizontalAlignment(JTextField.CENTER);
      commandButton.setBounds(250-50,260,100,50);
      commandButton.setFocusable(false);
      commandButton.addActionListener(this);


      frame.add(startButton);
      frame.add(resetButton);
      frame.add(timeLabel);
      frame.add(right_field);
      frame.add(commandButton);
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(450,450);
      frame.setLayout(null);
      frame.setVisible(true);
      frame.setTitle("스톱워치");
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
      
      if(e.getSource()==startButton) {
         
         if(started==false) {
            started=true;
            startButton.setText("STOP");
            start();
         }
         else {
            started=false;
            startButton.setText("START");
            stop();
         }
         
      }
      if(e.getSource()==resetButton) {
         started=false;
         startButton.setText("START");
         reset();
      }
      
      if(e.getSource()==commandButton){
         right = right_field.getText();
         if (right.equals(rightcommand))
            new rightclean();
      }
   }   
      
   
   
   void start() {
      timer.start();
   }
   
   void stop() {
      timer.stop();
   }
   
   void reset() {
      timer.stop();
      elapsedTime=0;
      seconds =0;
      minutes=0;
      hours=0;
      seconds_string = String.format("%02d", seconds);
      minutes_string = String.format("%02d", minutes);
      hours_string = String.format("%02d", hours);
      timeLabel.setText(hours_string+":"+minutes_string+":"+seconds_string);
   }

}