import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lib extends JFrame implements ActionListener{
	
	public JFrame jFrame;
	public JButton b1,b2;
	public JTextField t1,t2;
	public JComboBox cb1;
	public ButtonGroup bg;
	public JRadioButton r1,r2,r3,r4;
	public lib(){
		jFrame=new JFrame("LIBRARY REGISTRATION");

		JLabel l1=new JLabel("LIBRARY ID");
		l1.setBounds(100,100,130,30);
		jFrame.add(l1);
		t1=new JTextField();
		t1.setBounds(200,100,130,30);
		jFrame.add(t1);
		
		JLabel l2=new JLabel("NAME");
		l2.setBounds(100,150,130,30);
		jFrame.add(l2);
		t2=new JTextField();
		t2.setBounds(200,150,130,30);
		jFrame.add(t2);		
	
		JLabel l3=new JLabel("YEAR");	
		l3.setBounds(100,200,130,30);
		jFrame.add(l3);
		r1=new JRadioButton("F.E");
		r1.setBounds(200,200,50,30);
		r2=new JRadioButton("S.E");
		r2.setBounds(260,200,50,30);
		r3=new JRadioButton("T.E");
		r3.setBounds(320,200,50,30);
		r4=new JRadioButton("B.E");
		r4.setBounds(380,200,50,30);
	
		bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		bg.add(r4);
		
		jFrame.add(r1);
		jFrame.add(r2);
		jFrame.add(r3);
		jFrame.add(r4);

		JLabel l4=new JLabel("BRANCH");
		l4.setBounds(100,250,130,30);
		jFrame.add(l4);
		String branch[]={"Comps","IT","AIDS","EXTC","Chemical"};
		cb1=new JComboBox(branch);
		cb1.setBounds(200,250,130,30);	
		jFrame.add(cb1);
		

		b1=new JButton("Submit");
		b1.setBounds(270,350,80,30);
		b2=new JButton("Reset");
		b2.setBounds(160,350,80,30);
		
		jFrame.add(b1);
		jFrame.add(b2);

		addActionEvent();

		jFrame.setLayout(null);
		jFrame.setSize(600,500);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public void addActionEvent(){
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			JOptionPane.showMessageDialog(this,"You are successfully Registered");
		}
		else if(e.getSource()==b2){
			t1.setText("");
			t2.setText("");
			cb1.setSelectedIndex(0);
			bg.clearSelection();
		}
	}
	
	public static void main(String h[]){
		lib l=new lib();
	}
}