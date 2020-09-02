import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Matematicas mates = new Matematicas();
        mates.sum(5,3);




        Empleado picador = new Picador(10);
        picador.trabajar();
        picador.cobrar();
        picador.vacaciones();
        System.out.println();

        Empleado sacador = new Sacador(20);
        sacador.trabajar();
        sacador.cobrar();
        sacador.vacaciones();
        System.out.println();

        Empleado aguador = new Aguador(10);
        aguador.trabajar();
        aguador.cobrar();
        aguador.vacaciones();
        System.out.println();

        Empleado empleado = new Aguador(10);
        empleado.trabajar();
    }
}
