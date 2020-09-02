public abstract class Empleado {

    private int vacaciones;


    public Empleado(int vacaciones){
        this.vacaciones = vacaciones;
    }

    public void cobrar(){
        System.out.println("Nómina cobrada");
    }

    public void vacaciones(){
        StringBuilder sb= new StringBuilder();
        sb.append("Te quedan ");
        sb.append(vacaciones);
        sb.append(" días de vacaciones");
        System.out.println(sb.toString());
    }

    //Metodo abstracto
    public abstract void trabajar();
}
