import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class college extends JFrame implements ActionListener{

	public JFrame jFrame;
	public JTextField name,school,score;
	public JRadioButton male,female;
	public JComboBox branch;
	public ButtonGroup bg;
	public JButton submit,reset;

	public college(){
		jFrame=new JFrame("College Website");

		JLabel l1=new JLabel("Name");
		l1.setBounds(100,100,130,30);
		jFrame.add(l1);
		name=new JTextField();
		name.setBounds(200,100,130,30);
		jFrame.add(name);

		JLabel l2=new JLabel("Gender");
		l2.setBounds(100,150,130,30);
		jFrame.add(l2);
		male=new JRadioButton("Male");
		male.setBounds(200,150,80,30);
		female=new JRadioButton("Female");
		female.setBounds(300,150,80,30);

		bg=new ButtonGroup();
		bg.add(male);
		bg.add(female);
		
		jFrame.add(male);
		jFrame.add(female);

		JLabel l3=new JLabel("Branch");
		l3.setBounds(100,200,130,30);
		jFrame.add(l3);
		String dep[]={"Comps","I.T.","AIDS","EXTC","Chemical"};
		branch=new JComboBox(dep);
		branch.setBounds(200,200,130,30);
		jFrame.add(branch);
	
		JLabel l4=new JLabel("CET-Score");
		l4.setBounds(100,250,130,30);
		jFrame.add(l4);
		score=new JTextField();
		score.setBounds(200,250,130,30);
		jFrame.add(score);
		
		JLabel l5=new JLabel("School");
		l5.setBounds(100,300,130,30);
		jFrame.add(l5);
		school=new JTextField();
		school.setBounds(200,300,130,30);
		jFrame.add(school);

		submit=new JButton("Submit");
		submit.setBounds(270,350,80,30);
		reset=new JButton("Reset");
		reset.setBounds(160,350,80,30);
	
		jFrame.add(submit);
		jFrame.add(reset);
		
		addActionEvent();
		
		jFrame.setLayout(null);
		jFrame.setSize(600,500);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public void addActionEvent(){
		submit.addActionListener(this);
		reset.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e){

		if(e.getSource()==submit){
			JOptionPane.showMessageDialog(this,"Your information is successfully submitted");
		}
		else if(e.getSource()==reset){
			name.setText("");
			school.setText("");
			score.setText("");
			bg.clearSelection();
			branch.setSelectedIndex(0);
		}
	}

	public static void main(String h[]){
		college c=new college();
	}
}