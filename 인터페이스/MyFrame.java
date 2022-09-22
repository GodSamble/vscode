
package 인터페이스;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{

	public MyFrame(){
	setSize(300,200);
    JPanel p = new JPanel();
    JButton b = new JButton("Button");
    add(b);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
}

public static void main(String[] args){
    final MyFrame f = new MyFrame();
    //함수를 직접 코드를 짜서 이를 사용하는 예제
    }
    }