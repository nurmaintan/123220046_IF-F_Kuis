package kuismajalah_123220046;

import TotalHarga.Perhitungan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */
public class HalamanPembelian extends JFrame implements ActionListener{
    JLabel header = new JLabel("Halaman Pembelian");
    JLabel labelKategori = new JLabel ("Kategori");
    JLabel isiKategori = new JLabel ();
    JLabel labelHarga = new JLabel ("Harga");
    JLabel isiHarga = new JLabel ();
    JLabel labelJumlah = new JLabel ("Jumlah");
    JLabel header2 = new JLabel ("Total Pembelian");
    JLabel labelHargaSatuan = new JLabel ("Harga Satuan");
    JLabel isiHargaSatuan = new JLabel ();
    JLabel labelJumlahProduk = new JLabel ("Jumlah Produk");
    JLabel isiJumlahProduk = new JLabel ();
    JLabel labelTotal = new JLabel ("Total");
    JLabel isiTotal = new JLabel ();
    
    JTextField inputJumlah = new JTextField();
    
    JButton tombolKembali = new JButton("Kembali");
    JButton tombolBeli = new JButton("Beli");

    public HalamanPembelian(String kategoriMajalah, int hargaMajalah) {
        String harga = String.valueOf(hargaMajalah);
        
        setTitle ("Halaman Pembelian");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(header);
        header.setBounds(20, 10, 400, 25);
        header.setFont(header.getFont().deriveFont(20f));
        
        add(labelKategori);
        labelKategori.setBounds(20, 40, 100, 25);
        
        add(isiKategori);
        isiKategori.setBounds(150, 40, 200, 25);
        isiKategori.setText(kategoriMajalah);
        
        add(labelHarga);
        labelHarga.setBounds(20, 70, 100, 25);
        
        add(isiHarga);
        isiHarga.setBounds(150, 70, 200, 25);
        isiHarga.setText(harga);
        
        add(labelJumlah);
        labelJumlah.setBounds(20, 100, 80, 25);
        
        add(inputJumlah);
        inputJumlah.setBounds(150, 100, 200, 25);
        
        add(tombolKembali);
        tombolKembali.setBounds(20, 130, 150, 25);
        tombolKembali.addActionListener(this);
        
        add(tombolBeli);
        tombolBeli.setBounds(200, 130, 150, 25);
        tombolBeli.addActionListener(this);
        
        add(header2);
        header2.setBounds(20, 160, 400, 25);
        
        add(labelHargaSatuan);
        labelHargaSatuan.setBounds(20, 190, 80, 25);
        
        add(isiHargaSatuan);
        isiHargaSatuan.setBounds(150, 190, 200, 25);
        isiHargaSatuan.setText(harga);
        
        add(labelJumlahProduk);
        labelJumlahProduk.setBounds(20, 220, 100, 25);
        
        add(isiJumlahProduk);
        isiJumlahProduk.setBounds(150, 220, 200, 25);
        
        add(labelTotal);
        labelTotal.setBounds(20, 250, 80, 25);
        
        add(isiTotal);
        isiTotal.setBounds(150, 250, 200, 25);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int jumlah = Integer.parseInt(inputJumlah.getText());
            int harga = Integer.parseInt(isiHarga.getText());
            
            Perhitungan majalah1 = new Perhitungan(harga, jumlah);
            
            String hitungJumlah = String.valueOf(jumlah);
            String hitungTotal = String.valueOf(majalah1.hargaTotal());
            
            if (e.getSource() == tombolBeli) {
                isiJumlahProduk.setText(hitungJumlah);
                isiTotal.setText(hitungTotal);
            }
            
            else if (e.getSource() == tombolKembali) {
                new HalamanLogin();
                this.dispose();
            }
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,"input harus berupa angka");
        }
 }
    
    
    
}
