public class OctogonalMatrix {

    private Node<Vehiculo> centro; // nodo central de la matriz

    // Constructor que inicializa la matriz con un nodo central
    public OctogonalMatrix() {
        centro = new Node<>(null);
    }

    // Método que inserta un vehículo en la matriz
    public void insert(Vehiculo vehiculo) {
        Node<Vehiculo> node = new Node<>(vehiculo);

        // Enlazar el nuevo nodo con los nodos vecinos
        node.setDerecha(centro.getDerecha());
        centro.getDerecha().setIzquierda(node);
        centro.setDerecha(node);
        node.setIzquierda(centro);

        node.setAbajo(centro.getAbajo().getDerecha());
        centro.getAbajo().getDerecha().setArriba(node);
        centro.setAbajo(node);
        node.setArriba(centro);
    }

    public Vehiculo search(String placa) {
        Node<Vehiculo> Actual = centro.getDerecha();
        while (Actual != centro) {
            if (Actual.getData() != null && Actual.getData().getPlaca().equals(placa)) {
                return Actual.getData();
            }
            Actual = Actual.getDerecha();
        }

        Actual = centro.getAbajo().getDerecha();
        while (Actual != centro) {
            if (Actual.getData() != null && Actual.getData().getPlaca().equals(placa)) {
                return Actual.getData();
            }
            Actual = Actual.getAbajo();
        }

        Actual = centro.getIzquierda().getAbajo();
        while (Actual != centro) {
            if (Actual.getData() != null && Actual.getData().getPlaca().equals(placa)) {
                return Actual.getData();
            }
            Actual = Actual.getIzquierda();
        }

        Actual = centro.getArriba().getIzquierda();
        while (Actual != centro) {
            if (Actual.getData() != null && Actual.getData().getPlaca().equals(placa)) {
                return Actual.getData();
            }
            Actual = Actual.getArriba();
        }

        // El vehículo no se encontró en la matriz
        return null;
    }

    // Método que elimina un vehículo de la matriz por su placa
    public boolean delete(String placa) {
        Node<Vehiculo> current = centro.getDerecha();
        while (current != centro) {
            if (current.getData() != null && current.getData().getPlaca().equals(placa)) {
                current.getIzquierda().setDerecha(current.getDerecha());
                current.getDerecha().setIzquierda(current.getIzquierda());
                current.getArriba().setAbajo(current.getAbajo());
                current.getAbajo().setArriba(current.getArriba());
                current.setData(null);
                return true;
            }
            current = current.getDerecha();
        }

        current = centro.getAbajo().getDerecha();
        while (current != centro) {
            if (current.getData() != null && current.getData().getPlaca().equals(placa)) {
                current.getIzquierda().setDerecha(current.getDerecha());
                current.getDerecha().setIzquierda(current.getIzquierda());
                current.getArriba().setAbajo(current.getAbajo());
                current.getAbajo().setArriba(current.getArriba());
                current.setData(null);
                return true;
            }
            current = current.getAbajo();
        }

        current = centro.getIzquierda().getAbajo();
        while (current != centro) {
            if (current.getData() != null && current.getData().getPlaca().equals(placa)) {
                current.getIzquierda().setDerecha(current.getDerecha());
                current.getDerecha().setIzquierda(current.getIzquierda());
                current.getArriba().setAbajo(current.getAbajo());
                current.getAbajo().setArriba(current.getArriba());
                current.setData(null);
                return true;
            }
            current = current.getIzquierda();
        }

        current = centro.getArriba().getIzquierda();
        while (current != centro) {
            if (current.getData() != null && current.getData().getPlaca().equals(placa)) {
                current.getIzquierda().setDerecha(current.getDerecha());
                current.getDerecha().setIzquierda(current.getIzquierda());
                current.getArriba().setAbajo(current.getAbajo());
                current.getAbajo().setArriba(current.getArriba());
                current.setData(null);
                return true;
            }
            current = current.getArriba();
        }
        return  true;
    }
    //Metodo que lista
    public void list() {
        Node<Vehiculo> Actual = centro.getDerecha();
        while (Actual != centro) {
            if (Actual.getData() != null) {
                System.out.println(Actual.getData().getPlaca() + " " + Actual.getData().getColor() +" " + Actual.getData().getLinea() + " " + Actual.getData().getModelo() + " " + Actual.getData().getPropietario());
            }
            Actual = Actual.getDerecha();
        }
        Actual = centro.getAbajo().getDerecha();
        while (Actual == centro) {
            if (Actual.getData() != null) {
                System.out.println(Actual.getData().getPlaca() + " " + Actual.getData().getColor() + " " + Actual.getData().getLinea() + " " + Actual.getData().getModelo() + " " + Actual.getData().getPropietario());
            }
            Actual = Actual.getAbajo();
        }

        Actual = centro.getIzquierda().getAbajo();
        while (Actual == centro) {
            if (Actual.getData() != null) {
                System.out.println(Actual.getData().getPlaca() + " " + Actual.getData().getColor() + " " + Actual.getData().getLinea() + " " + Actual.getData().getModelo() + " " + Actual.getData().getPropietario());
            }
            Actual = Actual.getIzquierda();
        }

        Actual = centro.getArriba().getIzquierda();
        while (Actual == centro) {
            if (Actual.getData() != null) {
                System.out.println(Actual.getData().getPlaca() + " " + Actual.getData().getColor() + " " + Actual.getData().getLinea() + " " + Actual.getData().getModelo() + " " + Actual.getData().getPropietario());
            }
            Actual = Actual.getArriba();
        }
    }
}
