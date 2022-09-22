package 인터페이스;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
    class NewFrame extends JFrame implements ActionListener{ // public main 하지말고 public ~~ extends JFrame 할 것

        private JButton button;
        private JLabel label;
        
        public NewFrame(){
            this.setSize(300,200); // 가로 세로 픽셀단위임
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("이벤트 예제");
        
            JPanel panel = new JPanel();
            button = new JButton("버튼을 누르시오");
            label= new JLabel("아직 버튼이 눌리지 않았습니다");
            button.addActionListener((ActionListener) this);
            panel.add(button);
            panel.add(label);
            
            this.add(panel);
            this.setVisible(true);
        }
        
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == button) {
                label.setText("마침내 버튼이 눌러졌습니다.");
        }
        }
        public static void main(String[] args){
            final NewFrame f = new NewFrame();
            //함수를 직접 코드를 짜서 이를 사용하는 예제
            }
            }