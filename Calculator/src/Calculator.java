import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Calculator {
    static JFrame frame = new JFrame("Calculator");
    static final int calcWidth = 400;
    static final int calcHeight = 500;
    static JTextField calcScreen;
    static JButton btnAdd;
    
    public static void main(String[] args) {
        createFrameProperties();
        addTextField();
        frame.setVisible(true);
    }
    
    public static void createFrameProperties(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(calcWidth, calcHeight);
        frame.getContentPane().setLayout(new FlowLayout());
    }
    
    public static void addTextField(){
        calcScreen = new JTextField("");
        calcScreen.setPreferredSize(new Dimension(calcWidth - 30, 75));
        calcScreen.setCaretColor(Color.WHITE);
        frame.getContentPane().add(calcScreen);
    }
    
    public static void addButtons(){
        
    }
    
}
