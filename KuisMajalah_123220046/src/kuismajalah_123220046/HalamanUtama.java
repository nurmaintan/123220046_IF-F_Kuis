package kuismajalah_123220046;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */

public class HalamanUtama extends JFrame implements ActionListener{
    JLabel header = new JLabel();
    JLabel subHeader = new JLabel("Silahkan pilih menu dibawah");
    
    JButton tombolAnak = new JButton("Majalah Anak");
    JButton tombolRemaja = new JButton("Majalah Remaja");
    JButton tombolDewasa = new JButton("Majalah Dewasa");

    public HalamanUtama(String username) {
        setTitle ("Halaman Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 300);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(header);
        header.setBounds(20, 10, 400, 25);
        header.setFont(header.getFont().deriveFont(20f));
        header.setText("Selamat Datang, " + username);
        
        add(subHeader);
        subHeader.setBounds(20, 30, 200, 25);
        
        add(tombolAnak);
        tombolAnak.setBounds(50, 80, 200, 25);
        tombolAnak.addActionListener(this);
        
        add(tombolRemaja);
        tombolRemaja.setBounds(50, 110, 200, 25);
        tombolRemaja.addActionListener(this);
        
        add(tombolDewasa);
        tombolDewasa.setBounds(50, 140, 200, 25);
        tombolDewasa.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   String kategoriMajalah = " ";
   int hargaMajalah = 0; 
   
   if (e.getSource() == tombolAnak) {
       kategoriMajalah = "Majalah Anak";
       hargaMajalah = 10800;
   }
   
   else if (e.getSource() == tombolRemaja) {
       kategoriMajalah = "Majalah Remaja";
       hargaMajalah = 13100;
   }
   
   else if (e.getSource() == tombolDewasa) {
       kategoriMajalah = "Majalah Dewasa";
       hargaMajalah = 69400;
   }
   new HalamanPembelian(kategoriMajalah, hargaMajalah);
   this.dispose();
    }
    
    
    
}
