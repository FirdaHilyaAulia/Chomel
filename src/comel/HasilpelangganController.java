/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comel;

import com.jfoenix.controls.JFXTextField;
import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author firdahilya
 */
public class HasilpelangganController implements Initializable {

    @FXML
    private Label nama;
    @FXML
    private Label notell;
    @FXML
    private Label menu;
    @FXML
    private Label total;
    @FXML
    private Button metuu;
     @FXML
    private Button cetak;

    @FXML
    private TextField hasil;

    


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
@FXML
    void keluar(ActionEvent event) {
        System.exit(0);

    }
    void setData(String nm, String nt, String m, String d) {
       nama.setText(nm);
       notell.setText(nt);
       menu.setText(m);
       total.setText(d);//To change body of generated methods, choose Tools | Templates.
    }
    
    @FXML
    void oke(ActionEvent event) throws SQLException {
        
   
    
    }
      @FXML
    void hasile(ActionEvent event) {

    }
}

