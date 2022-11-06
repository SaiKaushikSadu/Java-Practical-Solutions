/*
import java.awt.*;

class First extends Frame{
	Button b=new Button("Submit");
	b.setBounds(50,100,100,50);
	add(b);
	setSize(300,300);
	setLayout(null);
	setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

class prac15{
	public staitc void main(String h[]){
		First f=new First();
		f.
	}
}*/

import java.awt.*;    
  
// extending Frame class to our class AWTExample1  
class AWTExample1 extends Frame {    
  
   // initializing using constructor  
   AWTExample1() {  
  
      // creating a button   
      Button b = new Button("Click Me!!");  
  
      // setting button position on screen  
      b.setBounds(30,100,80,30);  
  
      // adding button into frame    
      add(b);  
  
      // frame size 300 width and 300 height    
      setSize(300,300);  
  
      // setting the title of Frame  
      setTitle("This is our basic AWT example");   
          
      // no layout manager   
      setLayout(null);   
  
      // now frame will be visible, by default it is not visible    
      setVisible(true);  
}    
  
// main method  
public static void main(String args[]) {   
  
// creating instance of Frame class   
AWTExample1 f = new AWTExample1();    
  
}  
  
}    