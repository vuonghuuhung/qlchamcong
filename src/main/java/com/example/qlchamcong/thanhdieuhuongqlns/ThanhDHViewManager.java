package com.example.qlchamcong.thanhdieuhuongqlns;

import com.example.qlchamcong.Initializer;
import com.example.qlchamcong.importdlcc.ImportDLCCViewManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ThanhDHViewManager implements Initializable, IThanhDieuHuongViewManager {

    @FXML
    public Pane contentPane;
    @FXML
    public Button homePage;
    @FXML
    public Button importDLCC;
    @FXML
    public Button dangXuat;

    @FXML
    public void handleImportDLCCButtonAction(ActionEvent event) throws IOException {
        // Tải file FXML của trang Page 1
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/qlchamcong/importdlcc/import-dlcc.fxml"));
        Parent root = loader.load();
        ImportDLCCViewManager importDLCCViewManager = loader.getController();
        importDLCCViewManager.setController((Initializer.getImportDLCCInitializer()).getController());
        importDLCCViewManager.setThanhDieuHuong(this);
        // Đặt nội dung mới cho contentPane
        contentPane.getChildren().setAll(root);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) { }

    public void setContentPane(Parent root) {
        contentPane.getChildren().setAll(root);
    }
}
