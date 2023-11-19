module co.edu.uniquindio.proyectoFinal.AgenciaDeViajes {
    requires transitive javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;

    opens co.edu.uniquindio.proyectoFinal.AgenciaDeViajes to javafx.fxml;
    exports co.edu.uniquindio.proyectoFinal.AgenciaDeViajes;
    
    
}
