package liskovSubstitution.servicio;

import java.util.ArrayList;

public class EmpleadoBeneiciosCosto {

    public int costoDeEmpleados(ArrayList<EmpleadoBeneficios> todosLosEmpleados){
        int totalSalarios = 0;
        int gastoVaciones = 0;
        for (EmpleadoBeneficios cadaEmpleado : todosLosEmpleados){
            totalSalarios += cadaEmpleado.calcularSalario();
            gastoVaciones += cadaEmpleado.diasDeVacaciones()*cadaEmpleado.calcularSalario();
        }
        return totalSalarios+gastoVaciones;
    }
}
