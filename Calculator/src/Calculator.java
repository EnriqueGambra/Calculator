import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextField;

public class Calculator {
    static JFrame frame = new JFrame("Calculator");
    static final int calcWidth = 500;
    static final int calcHeight = 700;
    static JTextField calcScreen;
    
    public static void main(String[] args) {
        createFrameProperties();
        addCalculatorProperties();
    }
    
    public static void createFrameProperties(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(calcWidth, calcHeight);
        frame.getContentPane().setLayout(new FlowLayout());
        frame.setVisible(true);
    }
    
    public static void addCalculatorProperties(){
        calcScreen = new JTextField(" ", 10);
        frame.getContentPane().add(calcScreen, 100);
    }
    
}
