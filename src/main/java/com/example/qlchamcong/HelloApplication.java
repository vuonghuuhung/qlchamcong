package com.example.qlchamcong;

import com.example.qlchamcong.dangnhap.DangNhapViewManager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Initializer initializer = new Initializer(Config.DATABASE_TYPE);

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/qlchamcong/dangnhap/dang-nhap.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        DangNhapViewManager dangNhapViewManager =  fxmlLoader.getController();
        dangNhapViewManager.setDangNhapController((initializer.getDangNhapInitializer()).getDangNhapController());
        stage.setTitle("Phan mem quan ly cham cong");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}