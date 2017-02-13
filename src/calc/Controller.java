package calc;

import java.awt.event.ActionListener;
import java.awt.event.*;

public class Controller {
  Model mm ; 
  View  vv ; 
	
  Controller (Model model, View view ){
	  mm=model; 
	  vv=view; 
	 
      view.addMultiplyListener(new MultiplyListener());
      view.addClearListener(new ClearListener());
      view.addAdditionListener(new AdditionListener());
      view.addSubtractionListener(new SubtractionListener());
      view.addDivisionListener(new DivisionListener());
      

     
  }

  class MultiplyListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
          String FirstNum = "";
          String  SecondNum = ""; 
          try {
        	  FirstNum = vv.getFirstNum();
        	  SecondNum = vv.getSecondNum();
              mm.multiply(FirstNum,SecondNum);
              vv.setResult(mm.getValue());
              
          } catch (NumberFormatException nfex) {
             System.out.println("Try Again");
          }
      }
  }
  class AdditionListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
          String FirstNum = "";
          String  SecondNum = ""; 
          try {
        	  FirstNum = vv.getFirstNum();
        	  SecondNum = vv.getSecondNum();
              mm.Addition(FirstNum,SecondNum);
              vv.setResult(mm.getValue());
              
          } catch (NumberFormatException nfex) {
             System.out.println("Try Again");
          }
      }
  }
  
  class SubtractionListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
          String FirstNum = "";
          String  SecondNum = ""; 
          try {
        	  FirstNum = vv.getFirstNum();
        	  SecondNum = vv.getSecondNum();
              mm.Subtraction(FirstNum,SecondNum);
              vv.setResult(mm.getValue());
              
          } catch (NumberFormatException nfex) {
             System.out.println("Try Again");
          }
      }
  }
  
  
  class  DivisionListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
          String FirstNum = "";
          String  SecondNum = ""; 
          try {
        	  FirstNum = vv.getFirstNum();
        	  SecondNum = vv.getSecondNum();
              mm.Division(FirstNum,SecondNum);
              vv.setResult(mm.getValue());
              
          } catch (NumberFormatException nfex) {
             System.out.println("Try Again");
          }
      }
  }
  
  
  
  
  class ClearListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
          mm.ClearAll();
          vv.ClearAll();
      }
  }
	
	
}
