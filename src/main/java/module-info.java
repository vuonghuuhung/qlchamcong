module com.example.qlchamcong {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;

    opens com.example.qlchamcong to javafx.fxml;
    opens com.example.qlchamcong.dangnhap to javafx.fxml;
    opens com.example.qlchamcong.thanhdieuhuongqlns to javafx.fxml;
    opens com.example.qlchamcong.importdlcc to javafx.fxml;
    opens com.example.qlchamcong.qlnshome to javafx.fxml;
    exports com.example.qlchamcong;
    exports com.example.qlchamcong.dangnhap;
    exports com.example.qlchamcong.thanhdieuhuongqlns;
    exports com.example.qlchamcong.importdlcc;
    exports com.example.qlchamcong.qlnshome;
}