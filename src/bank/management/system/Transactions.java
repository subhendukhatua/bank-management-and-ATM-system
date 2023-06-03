
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Transactions  extends JFrame implements ActionListener{
    
    JButton deposit,withdrawl,fastcash,ministatement,pinchange,balanceenquary,exit;
    String pinNumber;
    
    Transactions(String pinNumber){
        
        this.pinNumber = pinNumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        
        JLabel text = new JLabel("Please select your transaction");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        
        
        deposit = new JButton("Deposit");
        deposit.setBounds(160,415,130,30);
        //deposit.setBackground(Color.black);
       // deposit.setForeground(Color.white);
        deposit.setFont(new Font("System",Font.BOLD,12));
        deposit.addActionListener(this);
        image.add(deposit);
        
        
         withdrawl = new JButton(" Cash Withdrawl");
        withdrawl.setBounds(355,415,150,30);
        //deposit.setBackground(Color.black);
       // deposit.setForeground(Color.white);
        withdrawl.setFont(new Font("System",Font.BOLD,12));
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        
         fastcash = new JButton(" Fast Cash ");
        fastcash.setBounds(160,450,130,30);
        
        //deposit.setBackground(Color.black);
       // deposit.setForeground(Color.white);
        fastcash.setFont(new Font("System",Font.BOLD,12));
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        
         ministatement = new JButton(" Mini Statement");
        ministatement.setBounds(355,450,150,30);
        //deposit.setBackground(Color.black);
       // deposit.setForeground(Color.white);
        ministatement.setFont(new Font("System",Font.BOLD,12));
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        
         pinchange = new JButton(" PIN Change");
        pinchange.setBounds(160,485,130,30);
        //deposit.setBackground(Color.black);
       // deposit.setForeground(Color.white);
        pinchange.setFont(new Font("System",Font.BOLD,12));
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        
        
         balanceenquary = new JButton(" Balance Enquery");
        balanceenquary.setBounds(355,485,150,30);
        //deposit.setBackground(Color.black);
       // deposit.setForeground(Color.white);
        balanceenquary.setFont(new Font("System",Font.BOLD,12));
        balanceenquary.addActionListener(this);
        image.add(balanceenquary);
        
        
        exit = new JButton(" Exit");
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
            System.exit(0); 
        }else if(e.getSource()== deposit){
            setVisible(false);
            new Deposit(pinNumber).setVisible(true);
        }else if(e.getSource()==withdrawl){
            setVisible(false);
            new Withdrawl(pinNumber).setVisible(true);
        }else if(e.getSource()== fastcash){
            setVisible(false);
            new FastCash(pinNumber).setVisible(true);
        }else if(e.getSource()==pinchange){
            setVisible(false);
            new PinChange(pinNumber).setVisible(true);
        }else if(e.getSource()==balanceenquary){
            setVisible(false);
            new BalanceEnquiry(pinNumber).setVisible(true);
        }else if(e.getSource()==ministatement){
            new MiniStatement(pinNumber).setVisible(true);
        }
            
    }   
        
    

    
    public static void main(String args[]) {
        
        new Transactions("");
        
    }
}
