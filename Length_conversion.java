package converter;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Length_conversion {
	
	Length_conversion()
	{
		JFrame f=new JFrame();
		f.getContentPane().setBackground(Color.GRAY);      
		
		JLabel l1,l2,l3,l4,l5,l6,l7,l8;  
	    l1=new JLabel("Length Converter");  
	    l1.setBounds(150,20, 400,40);    
	    l1.setFont (l1.getFont ().deriveFont (25.0f));
	    f.add(l1);
	    
	    
	    l2=new JLabel("Meter");  
	    l2.setBounds(50,100, 400,40);    
	    l2.setFont (l2.getFont ().deriveFont (20.0f));
		f.add(l2);
		
		
		l3=new JLabel("Cm");  
	    l3.setBounds(50,200, 400,40);    
	    l3.setFont (l3.getFont ().deriveFont (20.0f));
		f.add(l3);
		
		l4=new JLabel("Km");  
	    l4.setBounds(50,300, 400,40);    
	    l4.setFont (l4.getFont ().deriveFont (20.0f));
		f.add(l4);
		
		l5 = new JLabel("M");
		l5.setBounds(510,100, 400,40);    
	    l5.setFont (l5.getFont ().deriveFont (20.0f));
		f.add(l5);
		
		l6 = new JLabel("Cm");
		l6.setBounds(510,200, 400,40);    
	    l6.setFont (l5.getFont ().deriveFont (20.0f));
		f.add(l6);
		
		l7 = new JLabel("Km");
		l7.setBounds(510,300, 400,40);    
	    l7.setFont (l5.getFont ().deriveFont (20.0f));
		f.add(l7);
		
		l8 = new JLabel("");
		l8.setBounds(120,400, 400,40);    
	    l8.setFont (l8.getFont ().deriveFont (20.0f));
		l8.setVisible(false);
	    f.add(l8);
		
		 JTextField t1,t2,t3;  
	    t1=new JTextField();  
	    t1.setBounds(300,100, 200,40);  
	    t1.setFont (t1.getFont ().deriveFont (20.0f));
	    f.add(t1);
	    
	    
	    t2=new JTextField();  
	    t2.setBounds(300,200, 200,40);  
	    f.add(t2);
	    
	    t3=new JTextField();  
	    t3.setBounds(300,300, 200,40);  
	    f.add(t3);
	    
	    
		JButton b1=new JButton("Convert");//creating instance of JButton  
		b1.setBounds(300,500,200, 40);//x axis, y axis, width, height  
		         
		JButton b2=new JButton("Main Page");//creating instance of JButton  
		b2.setBounds(50,500,200, 40);//x axis, y axis, width, height  
		b2.setFont (b1.getFont ().deriveFont (20.0f));
		b1.setFont (b1.getFont ().deriveFont (20.0f));
	    f.add(b1);//adding button in JFrame  
		f.add(b2);     
		
		
		
		
		f.setSize(600,600);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
		
		b1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				if(t1.getText().isEmpty())
				{
					l8.setText("Enter  Length to Convert");
					l8.setVisible(true);
				}
				else
				{
					function_class fc = new function_class();
					float m = Float.valueOf(t1.getText());
					
					double cm = fc.meter_to_cm(m);
					t2.setText(String.valueOf(cm));
					t2.setFont (t2.getFont ().deriveFont (20.0f));
					double km = fc.meter_to_km(m);
					t3.setText(String.valueOf(km));
					t3.setFont (t3.getFont ().deriveFont (20.0f));
				}
			        }  
			    });	
		
		b2.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				
				unit_cvtr cv = new unit_cvtr();
				cv.start_page();
				f.dispose(); 
			        }  
			    });	
		}
	
	
	
	
	
	
	
	
	
	
	
}
