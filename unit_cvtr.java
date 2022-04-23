package converter;
import java.awt.Color;
import java.awt.event.*;  
import javax.swing.*;  	
public class unit_cvtr {
	public void start_page()
	{
		JFrame f=new JFrame();//creating instance of JFrame  
		f.getContentPane().setBackground(Color.GRAY);      
		JButton b1=new JButton("Temperature");//creating instance of JButton  
		b1.setBounds(200,200,200, 40);//x axis, y axis, width, height  
		          
		JButton b2=new JButton("Length");//creating instance of JButton  
		b2.setBounds(200,300,200, 40);//x axis, y axis, width, height  
		b1.setFont (b1.getFont ().deriveFont (20.0f));
	    b2.setFont (b2.getFont ().deriveFont (20.0f));
		f.add(b1);//adding button in JFrame  
		f.add(b2);     
		
		JLabel l1;  
	    l1=new JLabel("Unit Converter");  
	    l1.setBounds(200,50, 300,60);    
	    l1.setFont (l1.getFont ().deriveFont (25.0f));
	    
	    f.add(l1);
		
		
		f.setSize(600,600);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
		
		b1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				new Temperature_convert();
				
				f.dispose(); 
			        }  
			    });
		
		
		b2.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				new Length_conversion();  
				f.dispose(); 
			        }  
			    });
		
		
	}
	
	
	public static void main(String[] args) {  
	
		unit_cvtr cv = new unit_cvtr();
		cv.start_page();
		}

	
	
}
