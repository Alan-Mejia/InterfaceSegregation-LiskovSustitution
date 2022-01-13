package liskovSubstitution.models;

import liskovSubstitution.servicio.EmpleadoBeneficios;

public class Jefatura extends Empleado{
    public Jefatura(String nombre, String rolEnEmpresa, int salario) {
        super(nombre, rolEnEmpresa, salario);
    }

    @Override
    public int diasDeVacaciones() {
        return 30;
    }
}
