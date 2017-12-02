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
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class 
 *
 * @author firdahilya
 */
public class DaftarPelangganController implements Initializable {

    @FXML
    private JFXTextField editnama;
    @FXML
    private JFXTextField editalamat;
    @FXML
    private JFXTextField edituser;
    @FXML
    private JFXTextField editpass;
    @FXML
    private Button login;
    @FXML
    private Button delete;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) throws IOException {
       
         if (editnama.getText().equals("")||editalamat.getText().equals("")||edituser.getText().equals("")||editpass.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Lengkapi Pliss");}
              if(editnama.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "nama mu belum diisi-_-");}
                     else if(editalamat.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "alamatmu mu belum diisi -_-");}
                     else if(edituser.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "usernamenya ya -_-");
                    }
                     else if(editpass.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "passwordnya ya-_-");}
              
        
        else{
            
        try{
            String sql = "INSERT INTO pelanggan VALUES ('"+editnama.getText()+"',"+ "'"+editalamat.getText()+"','"+edituser.getText()+"','"+editpass.getText()+"')";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            
             ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("utama.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Chomel");
            stage.show();
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
             
            
        }
        }
        
    }
   
       @FXML
    void refreshh(ActionEvent event) {
         editnama.setText("");
         editalamat.setText("");
         edituser.setText("");
         editpass.setText("");
        

    }
    }
    
    
