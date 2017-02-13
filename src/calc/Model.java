package calc;
public class Model {

	 private int  m_result;
	 View b; 
	 Model(){
		 ClearAll(); 
	 }
	 
	 public void ClearAll() {
	        m_result = 0;
	       
	    } 
	 
	 public void multiply( String  num1 , String num2 ) {
	       m_result= Integer.parseInt(num1)  *Integer.parseInt(num2); 
	    }
	 public void Addition(String num1 , String num2 ) {
		 m_result= Integer.parseInt(num1) +Integer.parseInt(num2);
	    }
	 public void Subtraction( String num1 ,String num2 ) {
		 m_result=Integer.parseInt(num1) -Integer.parseInt(num2);  
	    }
	 public void Division( String num1 ,String num2 ) {
		 m_result= Integer.parseInt(num1) /Integer.parseInt(num2);  
	    }

	 
	
	 
	 public void setValue(String value) {
	        m_result = Integer.parseInt(value) ;
	    }
	    
	 
	 public String  getValue() {
	        return m_result+" ";
	    }
}
