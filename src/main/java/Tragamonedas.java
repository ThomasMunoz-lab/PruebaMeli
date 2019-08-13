public class Tragamonedas {

    Tambor tambor1;
    Tambor tambor2;
    Tambor tambor3;
    public Tragamonedas(Tambor tambor1, Tambor tambor2, Tambor tambor3) {
        this.tambor1 = tambor1;
        this.tambor2 = tambor2;
        this.tambor3 = tambor3;
    }

    public boolean obtenerPremio() {
        if(tambor1.obtenerPosicion() == tambor2.obtenerPosicion() && tambor1.obtenerPosicion() == tambor3.obtenerPosicion()){
            return true;
        }
        return false;
    }
}
