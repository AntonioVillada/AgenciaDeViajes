module co.edu.uniquindio.proyectoFinal.AgenciaDeViajes {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.proyectoFinal.AgenciaDeViajes to javafx.fxml;
    exports co.edu.uniquindio.proyectoFinal.AgenciaDeViajes;
}
