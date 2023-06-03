
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;


public class FastCash  extends JFrame implements ActionListener{
    
    JButton deposit,withdrawl,fastcash,ministatement,pinchange,balanceenquary,exit;
    String pinNumber;
    
    FastCash(String pinNumber){
        
        this.pinNumber = pinNumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        
        JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        
        
        deposit = new JButton("Rs 100");
        deposit.setBounds(160,415,130,30);
        //deposit.setBackground(Color.black);
       // deposit.setForeground(Color.white);
        deposit.setFont(new Font("System",Font.BOLD,12));
        deposit.addActionListener(this);
        image.add(deposit);
        
        
         withdrawl = new JButton("Rs 500");
        withdrawl.setBounds(355,415,150,30);
        //deposit.setBackground(Color.black);
       // deposit.setForeground(Color.white);
        withdrawl.setFont(new Font("System",Font.BOLD,12));
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        
         fastcash = new JButton("Rs 1000");
        fastcash.setBounds(160,450,130,30);
        
        //deposit.setBackground(Color.black);
       // deposit.setForeground(Color.white);
        fastcash.setFont(new Font("System",Font.BOLD,12));
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        
         ministatement = new JButton("Rs 2000");
        ministatement.setBounds(355,450,150,30);
        //deposit.setBackground(Color.black);
       // deposit.setForeground(Color.white);
        ministatement.setFont(new Font("System",Font.BOLD,12));
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        
         pinchange = new JButton("Rs 5000");
        pinchange.setBounds(160,485,130,30);
        //deposit.setBackground(Color.black);
       // deposit.setForeground(Color.white);
        pinchange.setFont(new Font("System",Font.BOLD,12));
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        
        
         balanceenquary = new JButton("Rs 10000");
        balanceenquary.setBounds(355,485,150,30);
        //deposit.setBackground(Color.black);
       // deposit.setForeground(Color.white);
        balanceenquary.setFont(new Font("System",Font.BOLD,12));
        balanceenquary.addActionListener(this);
        image.add(balanceenquary);
        
        
        exit = new JButton("Back");
        exit.setBounds(355,520,150,30);
        //deposit.setBackground(Color.black);
       // deposit.setForeground(Color.white);
        exit.setFont(new Font("System",Font.BOLD,12));
        exit.addActionListener(this);
        image.add(exit);
        
        
        
      
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()== exit){
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        }else{
            String amount = ((JButton)e.getSource()).getText().substring(3);
            Conn c = new Conn();
            try{
                ResultSet rs = c.s.executeQuery("select * from bank where pinNumber = '"+pinNumber+"'");
                int balance =0;
                while(rs.next()){
                    if(rs.getString("type").equals("deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                        
                    } 
                    
                }
                if(e.getSource() != exit && balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                    
                }
                
                Date date = new Date();
                String query = "insert into  bank values ('"+pinNumber+"', '"+date+"', 'Withdrawl', '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+ amount+ " Debited Successfully");
                
                
                setVisible(false);
                new Transactions(pinNumber).setVisible(true);
                
            }catch(Exception ex){
                System.out.println(ex);
                
            }
           
        }
        
    }

    
    public static void main(String args[]) {
        
        new FastCash("");
        
    }
}
