public class Nodo<T>{
    private T dato;
    private Nodo<T> Izq;
    private Nodo<T> Der;
    private Nodo<T> Arriba;
    private Nodo<T> Abajo;

    public Nodo(T dato) {
        this.dato = dato;
        Izq = this;
        Der = this;
        Arriba = this;
        Abajo = this;
    }

    public T getdato() {
        return dato;
    }

    public Nodo<T> getIzq() {
        return Izq;
    }

    public Nodo<T> getDer() {
        return Der;
    }

    public Nodo<T> getArriba() {
        return Arriba;
    }

    public Nodo<T> getAbajo() {
        return Abajo;
    }

    public void setIzq(Nodo<T> Izq) {
        this.Izq = Izq;
    }

    public void setDer(Nodo<T> Der) {
        this.Der = Der;
    }

    public void setArriba(Nodo<T> Arriba) {
        this.Arriba = Arriba;
    }

    public void setAbajo(Nodo<T> Abajo) {
        this.Abajo = Abajo;
    }

    public void setdato(T dato) {
        this.dato = dato;
    }
}
