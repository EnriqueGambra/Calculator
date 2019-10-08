import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Calculator {
    static JFrame frame = new JFrame("Calculator");
    static final int calcWidth = 400;
    static final int calcHeight = 410;
    static JTextField calcScreen;
    static ArrayList<JButton> buttonList = new ArrayList<>();
    static ArrayList<String> buttonNames = new ArrayList<>();
    
    public static void main(String[] args) {
        createFrameProperties();
        addTextField();
        addButtons();
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
        createNames();
        
        for(int i = 0; i < buttonNames.size(); i++){
            buttonList.add(new JButton(buttonNames.get(i)));
            if(i < 5){
                buttonList.get(i).setPreferredSize(new Dimension(calcWidth/6, 30));
            }
            else if((i >= 5) && (i < 24) || (i >= 25) && (i < 29)){
                buttonList.get(i).setPreferredSize(new Dimension(calcWidth/6, 40));
            }
            else if(i == 24){
                buttonList.get(i).setPreferredSize(new Dimension(calcWidth/6, 40));
            }
        
        
            buttonList.get(i).setMinimumSize(new Dimension(100, 50));
            frame.getContentPane().add(buttonList.get(i));
        }
    }
    
    public static void createNames(){
        buttonNames.add("Off"); 
        buttonNames.add("SQRT"); 
        buttonNames.add("|>");
        buttonNames.add("TAX-");
        buttonNames.add("TAX+");
        buttonNames.add("MRC");
        buttonNames.add("M-");
        buttonNames.add("M+");
        buttonNames.add("%");
        buttonNames.add("/");
        buttonNames.add("M/EX");
        buttonNames.add("7");
        buttonNames.add("8");
        buttonNames.add("9");
        buttonNames.add("*");
        buttonNames.add("+/-");
        buttonNames.add("4");
        buttonNames.add("5");
        buttonNames.add("6");
        buttonNames.add("-");
        buttonNames.add("C");
        buttonNames.add("1");
        buttonNames.add("2");
        buttonNames.add("3");
        buttonNames.add("+");
        buttonNames.add("AC");
        buttonNames.add("0");
        buttonNames.add(".");
        buttonNames.add("=");
    }
    
}
