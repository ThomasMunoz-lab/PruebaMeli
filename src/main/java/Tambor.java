public class Tambor {

    protected Integer posicionTambor;
    private static final Integer NUMERO_MAXIMO_POSICION  = 8;

    public Tambor()
    {
        girar();
    }

    public void girar()
    {
        posicionTambor = (int) (Math.random()*NUMERO_MAXIMO_POSICION) + 1;
    }

    public int obtenerPosicion(){
        return posicionTambor;
    }

    public int pruebaMockito(){
        return 2;
    }
}
