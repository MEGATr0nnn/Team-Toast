module com.example.real_estate_managent_software {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.real_estate_managent_software to javafx.fxml;
    exports com.example.real_estate_managent_software;
}