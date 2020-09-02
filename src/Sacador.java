public class Sacador extends Empleado {

    public Sacador(int vacaciones){
        super(vacaciones);
    }

    @Override
    public void trabajar() {
        sacandoPiedra();
    }

    public void sacandoPiedra(){
        System.out.println("Estoy sacando piedra");
    }
}
