package liskovSubstitution.models;

import liskovSubstitution.servicio.AdministracionBeneficios;
import liskovSubstitution.servicio.EmpleadoBeneficios;

public class Administracion extends Empleado implements AdministracionBeneficios {

    public Administracion(String nombre, String rolEnEmpresa, int salario) {
        super(nombre, rolEnEmpresa, salario);
    }

    @Override
    public int diasDeVacaciones() {
        return 25;
    }

    @Override
    public void aumentoDeSalarioAdministracion() {
        System.out.println("Felicidades has recibido un aumento");
    }

}
