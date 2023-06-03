
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignUpThree extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    
    SignUpThree(String formno){
        
        this.formno = formno;
        
        setLayout(null);
        
        JLabel pageThree = new JLabel("Page 3:Account Details");
        pageThree.setFont(new Font("Raleway", Font.BOLD, 22));
        pageThree.setBounds(280,40,400,40);
        add(pageThree);
        
        
        
        JLabel type  = new JLabel("Account Type:");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100,140,200,30);
        add(type);
        
        r1= new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.white);
        r1.setBounds(100,180,150,20);
        add(r1);
        
        r2= new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.white);
        r2.setBounds(350,180,250,20);
        add(r2);
        
        r3= new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.white);
        r3.setBounds(100,220,150,20);
        add(r3);
        
        r4= new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.white);
        r4.setBounds(350,220,250,20);
        add(r4);
        
        ButtonGroup groupAccount = new ButtonGroup();
        groupAccount.add(r1);
        groupAccount.add(r2);
        groupAccount.add(r3);
        groupAccount.add(r4);
        
        
        
        
        JLabel cardno  = new JLabel("Card Number:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 22));
        cardno.setBounds(100,300,200,30);
        add(cardno);
        
        
        JLabel number  = new JLabel("XXXX-XXXX-XXXX-6742");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330,300,300,30);
        add(number);
        
         JLabel cardDetails  = new JLabel("Your 16 Digit Card Number");
        cardDetails.setFont(new Font("Raleway", Font.BOLD, 12));
        cardDetails.setBounds(100,330,300,20);
        add(cardDetails);
        
        
        JLabel pin  = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        
        JLabel pinnumber  = new JLabel("XXXX");
        pinnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pinnumber.setBounds(330,370,300,30);
        add(pinnumber);
        
        JLabel pinDetails  = new JLabel("Your 4 Digit PIN Number");
        pinDetails.setFont(new Font("Raleway", Font.BOLD, 12));
        pinDetails.setBounds(100,400,300,20);
        add(pinDetails);
        
        
        JLabel service = new JLabel("Services Required:");
        service.setFont(new Font("Raleway", Font.BOLD, 22));
        service.setBounds(100,450,400,30);
        add(service);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.white);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.white);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.white);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4 = new JCheckBox("EMAIL & SMS Alerts");
        c4.setBackground(Color.white);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350,550,200,30);
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.white);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.white);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best my knowledge ");
        c7.setBackground(Color.white);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100,680,600,30);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway",Font.BOLD, 14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
  
        
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway",Font.BOLD, 14));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        
        getContentPane().setBackground(Color.white);
        
        
        
        
        
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== submit){
            String AccountType = null;
            if(r1.isSelected()){
                AccountType = "Saving Account";
            }else if(r2.isSelected()){
                AccountType = "Fixed Deposit Account";
            }else if(r3.isSelected()){
                AccountType = "Current Account";
            }else if(r4.isSelected()){
                AccountType = "Recurring Deposit Account";
            }
            
            Random random = new Random();
            String cardNumber =""+Math.abs((random.nextLong()% 90000000L)+ 5040936000000000L);
            
            
            
            String pinNumber = ""+ Math.abs((random.nextLong()% 9000L)+ 1000L);
            
            String facility = "";
            if(c1.isSelected()){
                facility = facility +"ATM CARD";
            }else if (c2.isSelected()){
                facility = facility + "Internet Banking";
            }else if(c3.isSelected()){
                facility = facility +"Mobile Banking";
            }else if(c4.isSelected()){
                facility = facility + "EMAIL & SMS Alerts";
            }else if(c5.isSelected()){
                facility = facility + "Cheque Book";
            }else if(c6.isSelected()){
                facility = facility + "E-Statement";
            }
            
            
            try{
                if(AccountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type is required ");
                }else if(c7.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Check the declaration");
                }else{
                    Conn conn = new Conn();
                    String query1 = "insert into SignUpThree values('"+formno+"', '"+AccountType+"', '"+cardNumber+"','"+pinNumber+"', '"+facility+"')";
                    String query2 = "insert into login values('"+formno+"',  '"+cardNumber+"','"+pinNumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Card Number :"+ cardNumber + "\n PIN Number :" + pinNumber );
                    
                    setVisible(false);
                    new Deposit(pinNumber).setVisible(false);
                }
                
            }catch (Exception ex ){
                
                System.out.println(ex);
                
            }
            
        }else if(e.getSource()== cancel){
            setVisible(false);
            new Login().setVisible(true);
            
        }
    }
    

    
    public static void main(String args[]) {
        new SignUpThree("");
    }
}
