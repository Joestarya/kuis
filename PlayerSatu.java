package Kuis;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class PlayerSatu extends JFrame{
    
    private JTextField namaField, nimField, jurusanField;
    private List<Pilihan> daftarPilihan;
    private Pilihan pilihanTerpilih;
    private JFrame parent;
    
    public PlayerSatu(String jenis, JFrame parent) {
        this.parent = parent;
        parent.setVisible(false);
        setTitle("Informasi Pemain");
        setLocationRelativeTo(null);
        setSize(400, 300);
        setLayout(new GridLayout(6, 2));
    
    
        
        
    }
}
