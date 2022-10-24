package hurufjalan_mulyadikamsul_2022210024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

//UTS PBO
//Nama: Mulyadi Kamsul
//NPM: 2022210024

public class HurufJalan_MulyadiKamsul_2022210024 extends JFrame 
{
    javax.swing.Timer waktu;
    JLabel lblText;
    JButton btStart = new JButton("Start");
    JButton btStop = new JButton("Stop");
	
    public HurufJalan_MulyadiKamsul_2022210024() 
    {  
        setLayout(null);
        lblText = new JLabel("UTS PBO - Mulyadi Kamsul - 2022210024       ");
        lblText.setBounds(15, 20, 300, 35);
        add(lblText);
        setLocationRelativeTo(null);
        waktu = new Timer(100,new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String text = lblText.getText();
                String text2 = text.substring(1) + text.substring(0,1);
                lblText.setText(text2);
            }
        });         
        btStart.setBounds(40, 70, 80, 20);
        add(btStart);
        btStart.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                waktu.start();
            }
        });
        btStop.setBounds(160, 70, 80, 20);
        add(btStop);
        btStop.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                waktu.stop();
            }
        });
        setTitle("HurufBerjalan_Mulyadi");
        setSize(300, 150);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }	

    public static void main(String[] args) 
    {
        EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                try 
                {
                    HurufJalan_MulyadiKamsul_2022210024 frame = new HurufJalan_MulyadiKamsul_2022210024();
                    frame.setVisible(true);
                } 
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
}