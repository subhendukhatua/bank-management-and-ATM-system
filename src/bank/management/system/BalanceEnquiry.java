
package bank.management.system;
import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class BalanceEnquiry extends JFrame implements ActionListener {
    JButton back;
    String pinNumber;
    
    BalanceEnquiry(String pinNumber){
        this.pinNumber=pinNumber;
        
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
        Conn c = new Conn();
        int balance = 0;
        try{
            ResultSet r = c.s.executeQuery("select * from bank where pinNumber = '"+pinNumber+"'");
            while(r.next()){
                if(r.getString("type").equals("deposit")){
                    balance += Integer.parseInt(r.getString("amount"));
                }else if(r.getString("type").equals("Withdrawl")){
                    balance -= Integer.parseInt(r.getString("amount"));
                }
            }
           
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        
        
        
        
        
        JLabel text = new JLabel("Your Current Account Balance Is " +  balance);
        text.setForeground(Color.white);
        text.setBounds(170,300,400,30);
        image.add(text);
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent e){
        setVisible(false);
        new Transactions(pinNumber).setVisible(true);
    }

    
    public static void main(String args[]) {
        new BalanceEnquiry("");
    }
}
