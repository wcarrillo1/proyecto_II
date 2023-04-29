public class OctogonalMatrix {

    private Nodo<Vehiculo> centro; // nodo central de la matriz

    // Constructor que inicializa la matriz con un nodo central
    public OctogonalMatrix() {
        centro = new Nodo<>(null);
    }

    // Método que inserta un vehículo en la matriz
    public void insert(Vehiculo vehiculo) {
        Nodo<Vehiculo> Nodo = new Nodo<>(vehiculo);

        // Enlazar el nuevo nodo con los nodos vecinos
        Nodo.setDer(centro.getDer());
        centro.getDer().setIzq(Nodo);
        centro.setDer(Nodo);
        Nodo.setIzq(centro);

        Nodo.setAbajo(centro.getAbajo().getDer());
        centro.getAbajo().getDer().setArriba(Nodo);
        centro.setAbajo(Nodo);
        Nodo.setArriba(centro);
    }

    public Vehiculo search(String placa) {
        Nodo<Vehiculo> Actual = centro.getDer();
        while (Actual != centro) {
            if (Actual.getdato() != null && Actual.getdato().getPlaca().equals(placa)) {
                return Actual.getdato();
            }
            Actual = Actual.getDer();
        }

        Actual = centro.getAbajo().getDer();
        while (Actual != centro) {
            if (Actual.getdato() != null && Actual.getdato().getPlaca().equals(placa)) {
                return Actual.getdato();
            }
            Actual = Actual.getAbajo();
        }

        Actual = centro.getIzq().getAbajo();
        while (Actual != centro) {
            if (Actual.getdato() != null && Actual.getdato().getPlaca().equals(placa)) {
                return Actual.getdato();
            }
            Actual = Actual.getIzq();
        }

        Actual = centro.getArriba().getIzq();
        while (Actual != centro) {
            if (Actual.getdato() != null && Actual.getdato().getPlaca().equals(placa)) {
                return Actual.getdato();
            }
            Actual = Actual.getArriba();
        }

        // El vehículo no se encontró en la matriz
        return null;
    }

    // Método que elimina un vehículo de la matriz por su placa
    public boolean delete(String placa) {
        Nodo<Vehiculo> current = centro.getDer();
        while (current != centro) {
            if (current.getdato() != null && current.getdato().getPlaca().equals(placa)) {
                current.getIzq().setDer(current.getDer());
                current.getDer().setIzq(current.getIzq());
                current.getArriba().setAbajo(current.getAbajo());
                current.getAbajo().setArriba(current.getArriba());
                current.setdato(null);
                return true;
            }
            current = current.getDer();
        }

        current = centro.getAbajo().getDer();
        while (current != centro) {
            if (current.getdato() != null && current.getdato().getPlaca().equals(placa)) {
                current.getIzq().setDer(current.getDer());
                current.getDer().setIzq(current.getIzq());
                current.getArriba().setAbajo(current.getAbajo());
                current.getAbajo().setArriba(current.getArriba());
                current.setdato(null);
                return true;
            }
            current = current.getAbajo();
        }

        current = centro.getIzq().getAbajo();
        while (current != centro) {
            if (current.getdato() != null && current.getdato().getPlaca().equals(placa)) {
                current.getIzq().setDer(current.getDer());
                current.getDer().setIzq(current.getIzq());
                current.getArriba().setAbajo(current.getAbajo());
                current.getAbajo().setArriba(current.getArriba());
                current.setdato(null);
                return true;
            }
            current = current.getIzq();
        }

        current = centro.getArriba().getIzq();
        while (current != centro) {
            if (current.getdato() != null && current.getdato().getPlaca().equals(placa)) {
                current.getIzq().setDer(current.getDer());
                current.getDer().setIzq(current.getIzq());
                current.getArriba().setAbajo(current.getAbajo());
                current.getAbajo().setArriba(current.getArriba());
                current.setdato(null);
                return true;
            }
            current = current.getArriba();
        }
        return  true;
    }
    //Metodo que lista
    public void list() {
        Nodo<Vehiculo> Actual = centro.getDer();
        while (Actual != centro) {
            if (Actual.getdato() != null) {
                System.out.println(Actual.getdato().getPlaca() + " " + Actual.getdato().getColor() +" " + Actual.getdato().getLinea() + " " + Actual.getdato().getModelo() + " " + Actual.getdato().getPropietario());
            }
            Actual = Actual.getDer();
        }
        Actual = centro.getAbajo().getDer();
        while (Actual == centro) {
            if (Actual.getdato() != null) {
                System.out.println(Actual.getdato().getPlaca() + " " + Actual.getdato().getColor() + " " + Actual.getdato().getLinea() + " " + Actual.getdato().getModelo() + " " + Actual.getdato().getPropietario());
            }
            Actual = Actual.getAbajo();
        }

        Actual = centro.getIzq().getAbajo();
        while (Actual == centro) {
            if (Actual.getdato() != null) {
                System.out.println(Actual.getdato().getPlaca() + " " + Actual.getdato().getColor() + " " + Actual.getdato().getLinea() + " " + Actual.getdato().getModelo() + " " + Actual.getdato().getPropietario());
            }
            Actual = Actual.getIzq();
        }

        Actual = centro.getArriba().getIzq();
        while (Actual == centro) {
            if (Actual.getdato() != null) {
                System.out.println(Actual.getdato().getPlaca() + " " + Actual.getdato().getColor() + " " + Actual.getdato().getLinea() + " " + Actual.getdato().getModelo() + " " + Actual.getdato().getPropietario());
            }
            Actual = Actual.getArriba();
        }
    }
}
