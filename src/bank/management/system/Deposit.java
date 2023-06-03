
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Deposit extends JFrame  implements ActionListener {
    
    JTextField amount;
    JButton deposit,back;
    String pinNumber;
    
    Deposit(String pinNumber){
        this.pinNumber=pinNumber;
        
        setLayout(null);
        
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        
        image.setBounds(0,0,900,900);
        add(image);
        
        
        JLabel text = new JLabel("Enter the amount you want to deposit");
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD,16));
        text.setBounds(190,300,400,20);
        image.add(text);
        
        
        amount = new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,18));
        amount.setBounds(190,350,285,25);
        image.add(amount);
        
        
        deposit = new JButton("Deposit");
        deposit.setBounds(355,485,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        
        
        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
                
                
                
                
                
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()== deposit){
            String number = amount.getText();
            Date date = new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
            } else{
                try{
                    Conn conn = new Conn();
                    String query = "insert into bank values('"+pinNumber+"', '"+date+"', 'deposit', '"+number+"')";
                    conn.s.executeUpdate(query); 
                    JOptionPane.showMessageDialog(null, "Rs "+number+" Deposited successfully");  
                    setVisible(false);
                    new Transactions(pinNumber).setVisible(true);
                }catch(Exception x){
                    System.out.println(x);
                }
            }
                
                
                
            
            
        }else if(e.getSource()== back){
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
            
        }
    }

    
    public static void main(String args[]) {
        
        new Deposit("");
        
    }
}
