/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comel;

import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author firdahilya
 */
public class MenuController implements Initializable {

    @FXML
    private AnchorPane total;
    @FXML
    private JFXTextField atasnama;
    @FXML
    private JFXTextField jumlahuang;
    @FXML
    private Label duit;
    @FXML
    private TextArea hasiltotall;
    @FXML
    private Button btnCetak;
    @FXML
    private CheckBox cek1;
    @FXML
    private Label harga1;
    @FXML
    private TextField jumlah1;
    @FXML
    private CheckBox cek2;
    @FXML
    private Label harga2;
    @FXML
    private TextField jumlah2;
    @FXML
    private CheckBox cek3;
    @FXML
    private Label harga3;
    @FXML
    private TextField jumlah3;
    @FXML
    private CheckBox cek6;
    @FXML
    private Label harga6;
    @FXML
    private TextField jumlah6;
    @FXML
    private CheckBox cek7;
    @FXML
    private Label harga7;
    @FXML
    private TextField jumlah7;
    @FXML
    private CheckBox cek8;
    @FXML
    private Label harga8;
    @FXML
    private TextField jumlah8;
    @FXML
    private CheckBox cek4;
    @FXML
    private Label harga4;
    @FXML
    private TextField jumlah4;
    @FXML
    private CheckBox cek9;
    @FXML
    private Label harga9;
    @FXML
    private TextField jumlah9;
    @FXML
    private CheckBox cek5;
    @FXML
    private Label harga5;
    @FXML
    private TextField jumlah5;
    @FXML
    private CheckBox cek10;
    @FXML
    private Label harga10;
    @FXML
    private TextField jumlah10;
    @FXML
    private Button hitung;
    @FXML
    private Button refresh;
    


    
    int jumlahpesan;
    int hargatotal1,hargatotal2,hargatotal3,hargatotal4,hargatotal5,hargatotal6,hargatotal7,hargatotal8,hargatotal9,hargatotal99;
    String menu="";
    String namapembeli, tampilTotalBayar, ket;
    int harga, kembalian;
    int totalbayar, jmlUangBayar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Cetak(ActionEvent event) {
        
        if (atasnama.getText().equals("")&&jumlahuang.getText().equals("")&&duit.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Lengkapi Pliss");}
        else if(atasnama.getText().equals(""))
        JOptionPane.showMessageDialog(null, "nama mu belum diisi-_-");
        else if(jumlahuang.getText().equals(""))
        JOptionPane.showMessageDialog(null, "jumlah uangmu belum diisi -_-");
        else if (duit.getText().equals(""))
        JOptionPane.showMessageDialog(null, "kamu belum pilih menu -_-");
                    
        
        namapembeli = atasnama.getText();
        jmlUangBayar = Integer.parseInt(jumlahuang.getText());
        kembalian = jmlUangBayar - totalbayar;
        
                    
                    
                    
    
             
        
        hasiltotall.setText("Nama Pemesanan: " + namapembeli +
          "\n" + "Menu yang Dipesan : "  + menu +"\n" + "Total Pembayaran : Rp. " + totalbayar+"" + "\n" + "Jumlah Uang yang Dibayar : Rp. "
                + jmlUangBayar +""+ "\n" + "Kembalian: " + kembalian  + "\n"  + "\n"  + "\n"  + "\n"  + "\n"  
                        +"Jangan Lupa Datang Lagi Yaaa"+"\n");   
    }
    
    @FXML
    private void totalsekabehan(ActionEvent event) {
         if(cek1.isSelected()){     
            harga = 15000;
            menu += cek1.getText()+", ";
            jumlahpesan=Integer.parseInt(jumlah1.getText());
            hargatotal1=harga*jumlahpesan;
            System.out.println(hargatotal1);
        }
        if(cek2.isSelected()){     
            harga = 12000;
            menu += cek2.getText()+", ";
            jumlahpesan=Integer.parseInt(jumlah2.getText());
            hargatotal2=harga*jumlahpesan;
            System.out.println(hargatotal2);
        }
        if(cek3.isSelected()){     
            harga = 10000;
            menu += cek3.getText()+", ";
            jumlahpesan=Integer.parseInt(jumlah3.getText());
            hargatotal3=harga*jumlahpesan;
            System.out.println(hargatotal3);
        }
        if(cek4.isSelected()){     
            harga = 15000;
            menu += cek4.getText()+", ";
            jumlahpesan=Integer.parseInt(jumlah4.getText());
            hargatotal4=harga*jumlahpesan;
            System.out.println(hargatotal4);
        }
        if(cek5.isSelected()){     
            harga = 12000;
            menu += cek5.getText()+", ";
            jumlahpesan=Integer.parseInt(jumlah5.getText());
            hargatotal5=harga*jumlahpesan;
            System.out.println(hargatotal5);
        }
        if(cek6.isSelected()){     
            harga = 15000;
            menu += cek6.getText()+", ";
            jumlahpesan=Integer.parseInt(jumlah6.getText());
            hargatotal6=harga*jumlahpesan;
            System.out.println(hargatotal6);
        }
        if(cek7.isSelected()){     
            harga = 12000;
            menu += cek7.getText()+", ";
            jumlahpesan=Integer.parseInt(jumlah7.getText());
            hargatotal7=harga*jumlahpesan;
            System.out.println(hargatotal7);
        }
        if(cek8.isSelected()){     
            harga = 10000;
            menu += cek8.getText()+", ";
            jumlahpesan=Integer.parseInt(jumlah8.getText());
            hargatotal8=harga*jumlahpesan;
            System.out.println(hargatotal8);
        }
        if(cek9.isSelected()){     
            harga = 12000;
            menu += cek9.getText()+", ";
            jumlahpesan=Integer.parseInt(jumlah8.getText());
            hargatotal9=harga*jumlahpesan;
            System.out.println(hargatotal9);
        
        }
          if(cek10.isSelected()){     
            harga = 12000;
            menu += cek9.getText()+", ";
            jumlahpesan=Integer.parseInt(jumlah8.getText());
            hargatotal99=harga*jumlahpesan;
            System.out.println(hargatotal99);
        
        }
        totalbayar = hargatotal1+hargatotal2+hargatotal3+hargatotal4+hargatotal5+hargatotal6+hargatotal7+hargatotal8+hargatotal9+hargatotal99;
        tampilTotalBayar=String.valueOf(totalbayar);
        duit.setText(tampilTotalBayar);
    

    }
    @FXML
    void penghapus(ActionEvent event) {
         atasnama.setText("");
         jumlahuang.setText("");
         cek1.setSelected(false);
         cek2.setSelected(false);
         cek3.setSelected(false);
         cek4.setSelected(false);
         cek5.setSelected(false);
         cek6.setSelected(false);
         cek7.setSelected(false);
         cek8.setSelected(false);
         cek9.setSelected(false);
         cek10.setSelected(false);
         jumlah1.setText("");
         jumlah2.setText("");
         jumlah3.setText("");
         jumlah4.setText("");
         jumlah5.setText("");
         jumlah6.setText("");
         jumlah7.setText("");
         jumlah8.setText("");
         jumlah9.setText("");
         jumlah10.setText("");
    }

}

