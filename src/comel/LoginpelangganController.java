/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comel;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
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
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author firdahilya
 */
public class LoginpelangganController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Label label1;
    @FXML
    private JFXTextField edituser;
    @FXML
    private JFXButton masuk;
    @FXML
    private JFXPasswordField editpass;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void melbu(ActionEvent event) throws SQLException {
        if (edituser.getText().equals("")&&editpass.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Lengkapi Pliss");}
              if(edituser.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "username belum diisi-_-");}
                     else if(editpass.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "password belum diisi -_-");}        
        
        else{
          try {
             Connection con;
             Statement stat;
             ResultSet rs;
             String sql;
        //pemanggilan fungsi koneksi database yang sudah kita buat pada class koneksi.java
                     koneksi DB = new koneksi();
                        DB.config();
                        con = DB.con;
                        stat = DB.stm;
              sql = "SELECT * FROM pelanggan WHERE username='"+edituser.getText()+"' AND password='"+editpass.getText()+"'";
              rs = stat.executeQuery(sql);
              if(rs.next()){
                if(edituser.getText().equals(rs.getString("username")) && editpass.getText().equals(rs.getString("password"))){
                    JOptionPane.showMessageDialog(null, "berhasil login");
                        ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLHome.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 841, 465);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Chomel");
            stage.show();
                }
              }
            // Hide this current window (if this is what you want)
            
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        }
    }
    }


