package com.example.qlchamcong.importdlcc;

import com.example.qlchamcong.qlnshome.QLNSHomeViewManager;
import com.example.qlchamcong.thanhdieuhuongqlns.IThanhDieuHuongViewManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ImportDLCCViewManager implements Initializable {
    private static IThanhDieuHuongViewManager thanhDieuHuongViewManager;
    private static IImportDLCCController controller;
    @FXML
    private Button returnHomePage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.controller = new ImportDLCCController();
    }

    @FXML
    protected void onReturnHomeButtonAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/qlchamcong/qlnshome/qlns-home.fxml"));
        Parent root = loader.load();
        QLNSHomeViewManager viewManager = loader.getController();
        viewManager.setContent("a");
        thanhDieuHuongViewManager.setContentPane(root);
    }

    public void setThanhDieuHuong(IThanhDieuHuongViewManager thanhDieuHuongViewManager) {
        this.thanhDieuHuongViewManager = thanhDieuHuongViewManager;
    }
}
