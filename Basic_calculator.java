package Student_Crud;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Basic_calculator implements ActionListener 
{
    JFrame f;
    JLabel l1;
    JTextField t1,t2,t3,t4;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b000,b11,b22,b33,b44,b55,b66,b77,b88;
    
     void Calculate()
     {
            f=new JFrame();
            f.setSize(300,405);
            f.setVisible(true);
            f.setLayout(null);
 
            
            Container c=f.getContentPane();
            c.setLayout(null);
            
            l1=new JLabel();
            l1.setText("Created By J.C.Prajapati");
            l1.setBounds(5,350,275,15);
            c.add(l1);
            
            
            t1=new JTextField();
            t2=new JTextField();
            t3=new JTextField();
            t4=new JTextField();
            
            Font f0=new Font("Arial",Font.BOLD,12);
            Font f1=new Font("Arial",Font.BOLD,15);
            Font f2=new Font("Arial",Font.BOLD,17);
            
            l1.setFont(f0);
            
            t1.setFont(f0);
            t2.setFont(f0);
            t3.setFont(f0);
            t4.setFont(f2);
            
            t1.setBorder(null);
            t2.setBorder(null);
            t3.setBorder(null);
            t4.setBorder(null);
        
            c.add(t1);
            c.add(t2);
            c.add(t3);
            c.add(t4);
           
            t1.setBounds(5,5,275,30);
            t2.setBounds(5,35,275,15);
            t3.setBounds(5,50,275,30);
            t4.setBounds(5,80,275,15);      
            
            b1=new JButton("1");
            b2=new JButton("2");
            b3=new JButton("3");
            b4=new JButton("4");
            b5=new JButton("5");
            b6=new JButton("6");
            b7=new JButton("7");
            b8=new JButton("8");
            b9=new JButton("9");
            b0=new JButton("0");
            b000=new JButton("000");
            b11=new JButton(".");
            b22=new JButton("+");
            b33=new JButton("-");
            b44=new JButton("*");
            b55=new JButton("/");
            b66=new JButton("CE");
            b77=new JButton("C");
            b88=new JButton("=");
            
            b1.setFont(f1);
            b2.setFont(f1);
            b3.setFont(f1);
            b4.setFont(f1);
            b5.setFont(f1);
            b6.setFont(f1);
            b7.setFont(f1);
            b8.setFont(f1);
            b9.setFont(f1);
            b0.setFont(f1);
            b000.setFont(f1);
            b11.setFont(f1);
            b22.setFont(f1);
            b33.setFont(f1);
            b44.setFont(f1);
            b55.setFont(f1);
            b66.setFont(f1);
            b77.setFont(f1);
            b88.setFont(f1);
       
            c.add(b1);
            c.add(b2);
            c.add(b3);
            c.add(b4);
            c.add(b5);
            c.add(b6);
            c.add(b7);
            c.add(b8);
            c.add(b9);
            c.add(b0);
            c.add(b000);
            c.add(b11);
            c.add(b22);
            c.add(b33);
            c.add(b44);
            c.add(b55);
            c.add(b66);
            c.add(b77);
            c.add(b88);
           
            //col 1
            b0.setBounds(5,300,65,45);        
            b1.setBounds(5,250,65,45);
            b4.setBounds(5,200,65,45);
            b7.setBounds(5,150,65,45);
            b77.setBounds(5,100,65,45);
            //col 2
            b000.setBounds(75,300,65,45);
            b2.setBounds(75,250,65,45);
            b5.setBounds(75,200,65,45);
            b8.setBounds(75,150,65,45);
            b66.setBounds(75,100,65,45);
            //col 3
            b11.setBounds(145,300,65,45);  
            b3.setBounds(145,250,65,45);
            b6.setBounds(145,200,65,45);
            b9.setBounds(145,150,65,45);
            b33.setBounds(145,100,65,45);
            //col 4
            b88.setBounds(215,300,65,45); 
            b22.setBounds(215,200,65,95); 
            b44.setBounds(215,150,65,45);
            b55.setBounds(215,100,65,45); 
           
           
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
            b6.addActionListener(this);
            b7.addActionListener(this);
            b8.addActionListener(this);
            b9.addActionListener(this);
            b0.addActionListener(this);
            b000.addActionListener(this);
            b11.addActionListener(this);
            b22.addActionListener(this);       
            b33.addActionListener(this);
            b44.addActionListener(this);
            b55.addActionListener(this);
            b66.addActionListener(this);
            b77.addActionListener(this);
            b88.addActionListener(this);
          
          
     }
    
	public static void main(String[] args) 
	{
		Basic_calculator b1=new Basic_calculator();
		b1.Calculate();	 
    }
	public void actionPerformed(ActionEvent e) {
		
		String s="",s1="";

		if(e.getSource()==b1)
		{
			if((t1.getText()).length()>0&&(t2.getText()).length()>0)
			{
			    s1=s1+t3.getText()+"1";
				t3.setText(s1);	
			}
			else
			{
                 s=s+t1.getText()+"1";	
				 t1.setText(s);
			}
			System.out.println("1 Clicked");
		}
		if(e.getSource()==b2)
		{
			if((t1.getText()).length()>0&&(t2.getText()).length()>0)
			{
			    s1=s1+t3.getText()+"2";
				t3.setText(s1);	
			}
			else
			{
                 s=s+t1.getText()+"2";	
				 t1.setText(s);
			}
			    System.out.println("2 Clicked");
		}
		if(e.getSource()==b3)
		{
			if((t1.getText()).length()>0&&(t2.getText()).length()>0)
			{
			    s1=s1+t3.getText()+"3";
				t3.setText(s1);	
			}
			else
			{
                 s=s+t1.getText()+"3";	
				 t1.setText(s);
			}
			System.out.println("3 Clicked");
		}
		if(e.getSource()==b4)
		{
			if((t1.getText()).length()>0&&(t2.getText()).length()>0)
			{
			    s1=s1+t3.getText()+"4";
				t3.setText(s1);	
			}
			else
			{
                 s=s+t1.getText()+"4";	
				 t1.setText(s);
			}
			System.out.println("4 Clicked");
		}
		if(e.getSource()==b5)
		{   
			if((t1.getText()).length()>0&&(t2.getText()).length()>0)
			{
			    s1=s1+t3.getText()+"5";
				t3.setText(s1);	
			}
			else
			{
                 s=s+t1.getText()+"5";	
				 t1.setText(s);
			}
			System.out.println("5 Clicked");
		}
		if(e.getSource()==b6)
		{
			if((t1.getText()).length()>0&&(t2.getText()).length()>0)
			{
			    s1=s1+t3.getText()+"6";
				t3.setText(s1);	
			}
			else
			{
                 s=s+t1.getText()+"6";	
				 t1.setText(s);
			}
			System.out.println("6 Clicked");
		}
		if(e.getSource()==b7)
		{
			if((t1.getText()).length()>0&&(t2.getText()).length()>0)
			{
			    s1=s1+t3.getText()+"7";
				t3.setText(s1);	
			}
			else
			{
                 s=s+t1.getText()+"7";	
				 t1.setText(s);
			}
			System.out.println("7 Clicked");
		}
		if(e.getSource()==b8)
		{
			if((t1.getText()).length()>0&&(t2.getText()).length()>0)
			{
			    s1=s1+t3.getText()+"8";
				t3.setText(s1);	
			}
			else
			{
                 s=s+t1.getText()+"8";	
				 t1.setText(s);
			}
			System.out.println("8 Clicked");
		}
		if(e.getSource()==b9)
		{
			if((t1.getText()).length()>0&&(t2.getText()).length()>0)
			{
			    s1=s1+t3.getText()+"9";
				t3.setText(s1);	
			}
			else
			{
                 s=s+t1.getText()+"9";	
				 t1.setText(s);
			}
			System.out.println("9 Clicked");
		}
		if(e.getSource()==b0)
		{
			if((t1.getText()).length()>0&&(t2.getText()).length()>0)
			{
			    s1=s1+t3.getText()+"0";
				t3.setText(s1);	
			}
			else
			{
                 s=s+t1.getText()+"0";	
				 t1.setText(s);
			}
			System.out.println("0 Clicked");
		}
		if(e.getSource()==b000)
		{   
			if((t1.getText()).length()>0&&(t2.getText()).length()>0)
			{
			    s1=s1+t3.getText()+"000";
				t3.setText(s1);	
			}
			else
			{
                 s=s+t1.getText()+"000";	
				 t1.setText(s);
			}
			System.out.println("000 Clicked");
		}
		
		if(e.getSource()==b11)
		{
			if((t1.getText()).length()>0&&(t2.getText()).length()>0)
			{
			    s1=s1+t3.getText()+".";
				t3.setText(s1);	
			}
			else
			{
                 s=s+t1.getText()+".";	
				 t1.setText(s);
			}
			System.out.println("(.) Clicked");
		} 
if(e.getSource()==b22||e.getSource()==b33||e.getSource()==b44 ||e.getSource()==b55 )
{
	if((t1.getText()).length()>0 && (t2.getText()).length()==0)
	{
		 if(e.getSource()==b22 )     // +
		{
		      t2.setText("+");
			  System.out.println("Addition Clicked");
		}
		if(e.getSource()==b33)    // -
		{
			 t2.setText("-");
			 System.out.println("Substraction Clicked");
		}
		if(e.getSource()==b44)    // *
		{   
			 t2.setText("*");
			 System.out.println("Multiplication Clicked");
		}
		if(e.getSource()==b55)    // (/)
		{
			 t2.setText("/");
			 System.out.println("Division Clicked");
		}
	}
	else
	{
		t4.setText("Enter Valid Input");
	}
}
    	if(e.getSource()==b66)//   CE
		{  
    		t1.setText("");
			t2.setText("");
			t3.setText("");
			System.out.println("CE Clicked");
		}
		if(e.getSource()==b77)    // C    n=n+1   n+=1
		{
			s="";
			s1="";
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			System.out.println("C Clicked");
		}
		if(e.getSource()==b88)      // =
		{
			   float num1=0,num2=0,result=0;
			   char c=(t2.getText()).charAt(0);
			   num1=Float.parseFloat(t1.getText());
			   num2=Float.parseFloat(t3.getText());
			   if(c=='+'||c=='-'||c=='*'||c=='/')
			    {
			      System.out.println(t2.getText());
		          if(c=='+')  result=num1+num2;  t4.setText(String.valueOf(result));
			      if(c=='-')  result=num1-num2;  t4.setText(String.valueOf(result));
			      if(c=='*')  result=num1*num2;  t4.setText(String.valueOf(result));
			      if(c=='/')  result=num1/num2;  t4.setText(String.valueOf(result));
			      System.out.println("= Clicked");
			    }
			   else
			    {
				  t4.setText("Enter Valid Operatror");
			    }
			
		}
	}
}
  	
