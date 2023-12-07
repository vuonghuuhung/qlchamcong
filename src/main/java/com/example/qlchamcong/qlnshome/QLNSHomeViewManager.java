package com.example.qlchamcong.qlnshome;

import com.example.qlchamcong.HelloApplication;
import com.example.qlchamcong.entity.BanGhiChamCong;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class QLNSHomeViewManager implements Initializable {
    private static QLNSHomeController qlnsHomeController;

    @FXML
    private Label homePageText;

    @FXML
    private Button suaBGCC;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        qlnsHomeController = new QLNSHomeController();
    }

    public void setContent(String content) {
        String listBanGhiCC = qlnsHomeController.getListBGCC(content);
        homePageText.setText(listBanGhiCC);
    }

    @FXML
    protected void handleSuaBGCCAction() {
        Parent root;
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/qlchamcong/dangnhap/dang-nhap.fxml"));
            root = fxmlLoader.load();
            Stage stage = new Stage();

            stage.setTitle("My New Stage Title");
            stage.setScene(new Scene(root));
            stage.show();
            // Hide this current window (if this is what you want)
//            ((Node)(event.getSource())).getScene().getWindow().hide();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
