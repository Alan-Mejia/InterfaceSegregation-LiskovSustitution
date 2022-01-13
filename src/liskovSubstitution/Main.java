package liskovSubstitution;

import liskovSubstitution.models.Administracion;
import liskovSubstitution.models.Empleado;
import liskovSubstitution.models.Jefatura;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Carlos","Programador",100);
        Jefatura jefe1 = new Jefatura("Santiago","Jefe Contabilidad",150);
        Administracion admin1 = new Administracion("Ian","Aministracion RH",200);

        admin1.aumentoDeSalarioAdministracion();
    }
}
