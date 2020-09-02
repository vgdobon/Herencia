public class Aguador extends Empleado {

    public Aguador(int vacaciones){
        super(vacaciones);
    }

    @Override
    public void trabajar() {
        aguando();
    }

    public void aguando(){
        System.out.println("Estoy echando agua");
    }
}
