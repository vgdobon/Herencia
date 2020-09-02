public class Picador extends Empleado{


    public Picador(int vacaciones){
        super(vacaciones);
    }

    @Override
    public void trabajar() {
        picandoPiedra();
    }

    public void picandoPiedra(){
        System.out.println("Estoy picando piedra");
    }


}
