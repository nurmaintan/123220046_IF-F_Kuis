package kuismajalah_123220046;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lab Informatika
 */

public class HalamanLogin extends JFrame implements ActionListener{
    JLabel header = new JLabel ("Halaman Login");
    JLabel labelUsername = new JLabel ("Username : ");
    JLabel labelPassword = new JLabel ("Password : ");
    
    JTextField inputUsername = new JTextField();
    
    JPasswordField inputPassword = new JPasswordField();
    
    JButton tombolLogin = new JButton ("Login");
    
    public HalamanLogin() {
        setTitle ("Halaman Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 250);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        
        add(header);
        header.setBounds(20, 10, 200, 25);
        header.setFont(header.getFont().deriveFont(20f));
        
        add(labelUsername);
        labelUsername.setBounds(20, 40, 200, 25);
        
        add(inputUsername);
        inputUsername.setBounds(20, 60, 400, 25);
        
        add(labelPassword);
        labelPassword.setBounds(20, 90, 200, 25);
        
        add(inputPassword);
        inputPassword.setBounds(20, 110, 400, 25);
        
        add(tombolLogin);
        tombolLogin.setBounds(200, 160, 80, 25);
        tombolLogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String username = inputUsername.getText();
            String password = String.valueOf(inputPassword.getPassword());
            
            if(!"123220046".equals(username)) {
                throw new Exception("Username Salah !");
            }
            
            else if(!"12345".equals(password)) {
                throw new Exception("Password Salah !");
            }
            
            new HalamanUtama(username);
            this.dispose();
            
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
        }
          
          
    }
    
    
}
