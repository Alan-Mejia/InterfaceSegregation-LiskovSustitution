package liskovSubstitution.models;

import liskovSubstitution.servicio.EmpleadoBeneficios;

public class Empleado implements EmpleadoBeneficios {
    private String nombre;
    private String rolEnEmpresa;
    private int salario;

    public Empleado(String nombre, String rolEnEmpresa, int salario) {
        this.nombre = nombre;
        this.rolEnEmpresa = rolEnEmpresa;
        this.salario = salario;
    }

    @Override
    public int calcularSalario() {
        return salario*30 ;
    }

    @Override
    public int diasDeVacaciones() {
        return 20;
    }




}
