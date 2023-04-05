module br.edu.senacsp {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.edu.senacsp to javafx.fxml;
    exports br.edu.senacsp;
}
