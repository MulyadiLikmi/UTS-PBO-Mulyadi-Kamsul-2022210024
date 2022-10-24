package suit_mulyadikamsul_2022210024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

//UTS PBO
//Nama: Mulyadi Kamsul
//NPM: 2022210024

public class Suit_MulyadiKamsul_2022210024 extends JFrame implements ActionListener{
    JRadioButton ibujari = new JRadioButton("Ibujari", true);
    JRadioButton telunjuk = new JRadioButton("Telunjuk", false);
    JRadioButton kelingking = new JRadioButton("Kelingking", false);
    ButtonGroup grup = new ButtonGroup();
    
    JLabel displayJempol = new JLabel();
    JLabel displayTelunjuk = new JLabel();
    JLabel displayKelingking = new JLabel();
    
    JButton btDoit = new JButton("Do it");
    //Object random untuk menentukan pilihan jari oleh komputer
    Random random = new Random();
    int menang = 0;
    int seri = 0;
    int kalah = 0;
    ImageIcon imgJempol, imgTelunjuk, imgKelingking;
        
    public Suit_MulyadiKamsul_2022210024(){
        //Layout dibebaskan untuk penempatan komponen
        setLayout(null);
        
        grup.add(ibujari);
        grup.add(telunjuk);
        grup.add(kelingking);
                        //(x, y, panjang, lebar)
        ibujari.setBounds(10, 60, 90, 20);
        telunjuk.setBounds(110, 60, 90, 20);
        kelingking.setBounds(210, 60, 90, 20);
        
        displayJempol.setBounds(20, 10, 50, 50);
        displayJempol.setHorizontalAlignment(JLabel.CENTER);
        add(displayJempol);
        
        displayTelunjuk.setBounds(130, 10, 50, 50);
        displayTelunjuk.setHorizontalAlignment(JLabel.CENTER);
        add(displayTelunjuk);
        
        displayKelingking.setBounds(230, 10, 50, 50);
        displayKelingking.setHorizontalAlignment(JLabel.CENTER);
        add(displayKelingking);
        
        imgJempol = new ImageIcon(this.getClass().getResource("/images/imgJempol.png"));
        imgTelunjuk = new ImageIcon(this.getClass().getResource("/images/imgTelunjuk.png"));
        imgKelingking = new ImageIcon(this.getClass().getResource("/images/imgKelingking.png"));     
        displayJempol.setIcon(imgJempol);
        displayTelunjuk.setIcon(imgTelunjuk);
        displayKelingking.setIcon(imgKelingking);
        
        btDoit.setBounds(90, 90, 100, 20);
        add(ibujari);
        add(telunjuk);
        add(kelingking);
        add(btDoit);
        btDoit.addActionListener(this);
        setTitle("Game Suit");
        setSize(300, 150);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == btDoit)
        {
            mulaiSuit();
            
        }
    } 
    public void mulaiSuit() {
        int comp = random.nextInt(3);//Menyimpan pilihan oleh komputer
        //0:Ibujari, 1:Telunjuk, 2:Kelingking
        int user = 0;  
        String hasil = "";    
        String jari[] = {"Ibujari", "Telunjuk", "Kelingking"};
        String imgStatus = "";
        
        //Jika user milih Ibu Jari
        if(ibujari.isSelected())
        {
            user = 0;
            if (comp == 0) {hasil = "SERI"; seri++; imgStatus = "/images/seri.png"; }
            if (comp == 1) {hasil = "Anda MENANG"; menang++; imgStatus = "/images/menang.png";}
            if (comp == 2) {hasil = "Anda KALAH"; kalah++; imgStatus = "/images/kalah.png";}
        }
        //Jika user milih Telunjuk
        if(telunjuk.isSelected())
        {
            user = 1 ;
            if(comp == 0) {hasil = "Anda KALAH"; kalah++; imgStatus = "/images/kalah.png";}
            if(comp == 1) {hasil = "SERI"; seri++; imgStatus = "/images/seri.png";}
            if(comp == 2) {hasil = "Anda MENANG"; menang++; imgStatus = "/images/menang.png";}
        }
        //Jika user milih Kelingking
        if (kelingking.isSelected())
        {
            user = 2;
            if(comp == 0) {hasil = "Anda MENANG"; menang++; imgStatus = "/images/menang.png";}
            if(comp == 1) {hasil = "Anda KALAH"; kalah++; imgStatus = "/images/kalah.png";}
            if(comp == 2) {hasil = "SERI"; seri++; imgStatus = "/images/seri.png";}
        }
        ImageIcon icon = new ImageIcon(this.getClass().getResource(imgStatus));
        hasil = "Comp: " + jari[comp] + ", User: " + jari[user] + "\n" + hasil + "\n" + "Menang: " + menang + " Seri: " + seri + " Kalah: " + kalah;
        //Menampilkan hasil SUIT
        JOptionPane.showMessageDialog(null, hasil, "Hasilnya", JOptionPane.QUESTION_MESSAGE, icon); }
    
    public static void main(String[] args)
    {
        new Suit_MulyadiKamsul_2022210024();
    }
}