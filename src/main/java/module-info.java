module com.example.mbsd_git_demo_test {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.mbsd_git_demo_test to javafx.fxml;
    exports com.example.mbsd_git_demo_test;
}