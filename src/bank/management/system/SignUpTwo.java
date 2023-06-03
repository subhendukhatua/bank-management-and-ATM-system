
package bank.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SignUpTwo extends JFrame  implements ActionListener{
    
    JTextField panno,aadhar;
    JButton next;
    JRadioButton syes, sno,eyes,eno;
    JComboBox religion,category,income,education,occupation;
    String formno;
      
    SignUpTwo(String formno){
        
        this.formno = formno;
        
        setLayout(null);
        
        
        setTitle("NEW ACCOUNT APPLICATION FORM-PAGE 2"); 
        
        
        
        
        
        JLabel additionalDetails = new JLabel("page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD, 22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        
        
        JLabel Religion = new JLabel("Religion:");
        Religion.setFont(new Font("Raleway",Font.BOLD, 20));
        Religion.setBounds(100,140,100,30);
        add(Religion);
        
        String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.white);
        add(religion);
        
        
        
        
        
        JLabel Category = new JLabel("Category:");
        Category.setFont(new Font("Raleway",Font.BOLD, 20));
        Category.setBounds(100,190,200,30);
        add(Category);
        
        String valCategory[] = {"General","OBC","SC","ST","OBC A","OBC B","Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.white);
        add(category);
        
        
        
        
        
        JLabel Income = new JLabel("Income:");
        Income.setFont(new Font("Raleway",Font.BOLD, 20));
        Income.setBounds(100,240,200,30);
        add(Income);
        
        String valIncome[] = {"Null","< 1,50,000","< 2,50,000","<5,00,000","Upto 10,00,000"};
        income = new JComboBox(valIncome);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.white);
        add(income);
       
        
        
        JLabel Education = new JLabel("Educational:");
        Education.setFont(new Font("Raleway",Font.BOLD, 20));
        Education.setBounds(100,290,200,30);
        add(Education); 
        
        JLabel Qualification = new JLabel("Qualification:");
        Qualification.setFont(new Font("Raleway",Font.BOLD, 20));
        Qualification.setBounds(100,315,200,30);
        add(Qualification);
        
        String EducatioValues[] = {"Non-Graduation","Graduation","Post-Graduation","Doctrate","Other"};
        education = new JComboBox(EducatioValues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.white);
        add(education);
        
        
        
        
        
        
        JLabel Occupation = new JLabel("Occupation:");
        Occupation.setFont(new Font("Raleway",Font.BOLD, 20));
        Occupation.setBounds(100,390,200,30);
        add(Occupation);
        
        String OccupationValues[] = {"Salaried","Self-Employed","Business","Student","Retired","Other"};
        occupation = new JComboBox(OccupationValues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.white);
        add(occupation);
        
        
        
        
        
        
        
        
        
        
        
        JLabel pan = new JLabel("Pan Number:");
        pan.setFont(new Font("Raleway",Font.BOLD, 20));
        pan.setBounds(100,440,200,30);
        add(pan);
        
        panno = new JTextField();
        panno.setFont(new Font("Raleway", Font.BOLD,14));
        panno.setBounds(300,440,400,30);
        add(panno);
        
        
        JLabel AadharNumber = new JLabel("Aadhar Number:");
        AadharNumber.setFont(new Font("Raleway",Font.BOLD, 20));
        AadharNumber.setBounds(100,490,200,30);
        add(AadharNumber);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
        
        
        JLabel SeniorCitizen = new JLabel("Senior Citizen:");
        SeniorCitizen.setFont(new Font("Raleway",Font.BOLD, 20));
        SeniorCitizen.setBounds(100,540,200,30);
        add(SeniorCitizen);
        
        syes =new JRadioButton("Yes");
        syes.setBounds(300,540,90,30);
        syes.setBackground(Color.white);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,540,120,30);
        sno.setBackground(Color.white);
        add(sno);
        
        
        
        ButtonGroup CitizenGroup = new ButtonGroup();
        CitizenGroup.add(syes);
        CitizenGroup.add(sno);
     
        
        
        
        JLabel existingAccount = new JLabel("Existing Account:");
        existingAccount.setFont(new Font("Raleway",Font.BOLD, 20));
        existingAccount.setBounds(100,590,200,30);
        add(existingAccount);
        
        eyes =new JRadioButton("Yes");
        eyes.setBounds(300,590,90,30);
        eyes.setBackground(Color.white);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,590,120,30);
        eno.setBackground(Color.white);
        add(eno);
        
        
        
        ButtonGroup ExistingGroup = new ButtonGroup();
        ExistingGroup.add(eyes);
        ExistingGroup.add(eno);
       
        
       
        
        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        
        
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome =  (String)income.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        String sseniorcitizen = null;
        if(syes.isSelected()){
            sseniorcitizen = "Yes";  
        } else if (sno.isSelected()){
            sseniorcitizen = "No";
        }
        
        String  sexistingaccount = null;
        if(eyes.isSelected()){
            sexistingaccount = "Yes";
        }else if(eno.isSelected()){
            sexistingaccount = "Unmarried";
        }
        
        String spanno = panno.getText();
        String saadhar = aadhar.getText();
        
        
        
        try{
            
            Conn c = new Conn();
            String query = "insert into signupTwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation   +"', '"+soccupation+"', '"+spanno+"', '"+saadhar+"', '"+sseniorcitizen+"', '"+sexistingaccount+"')";
            c.s.executeUpdate(query);
            
            
            
            setVisible(false);
            new SignUpThree(formno).setVisible(true);
            
            
        }catch(Exception e){
            System.out.println(e);
        }
       
    }

    
    public static void main(String args[]) {
        new SignUpTwo("");
    }
}
