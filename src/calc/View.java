package calc;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class View extends JFrame  {
	 private static final String INITIAL_VALUE = "0";

    JTextField operand1 = new JTextField(20); 
	JTextField operand2 = new JTextField(20); 
	JTextField result   = new JTextField(20); 
	JButton add         = new JButton("+"); 
	JButton sub         = new JButton("-"); 
	JButton mul         = new JButton("*"); 
	JButton div         = new JButton("/");
	JButton clear       = new JButton("CE"); 
	Model   model       = new Model(); 
	
	View( Model m){
		model = m;
		model.setValue(INITIAL_VALUE);
	    result.setText(model.getValue());
	    result.setEditable(false); 
	    JPanel content  = new JPanel(); 
	    content.setLayout(new FlowLayout());
	    content.add(new JLabel("FirstInput"));
	    content.add(operand1);
	    content.add(new JLabel("SecondInput"));
	    content.add(operand2);
	    content.add(add);
	    content.add(sub);
	    content.add(mul);
	    content.add(div);
	    content.add(clear); 
	    content.add(new JLabel("Result"));
	    content.add(result);
	    this.setContentPane(content);
        this.pack();
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
		
	}
	 void ClearAll() {
	       result.setText(INITIAL_VALUE);
	    }
	 String getFirstNum() {
	        return operand1.getText();
	    }
	 String getSecondNum() {
	        return operand2.getText();
	    }
	 void setResult(String Result) {
	        result.setText(Result);
	    }
	 
	void addAdditionListener(ActionListener addition) {
        add.addActionListener(addition);
    }
	void addSubtractionListener(ActionListener subtraction) {
        sub.addActionListener(subtraction);
    }
	void addMultiplyListener(ActionListener mull) {
        mul.addActionListener(mull);
    }
	void addDivisionListener(ActionListener  division) {
        div.addActionListener(division);
	}
	void addClearListener(ActionListener clr) {
        clear.addActionListener(clr);
    }
	
	
}
