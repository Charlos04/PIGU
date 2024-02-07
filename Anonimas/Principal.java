public class Principal{
    public static void main(String[] args) {
        // Implementación anónima de la interfaz Operacion
        Operacion operacion = new Operacion() {
            @Override
            public void realizarOperacion() {
                System.out.println("Realizando una operación anónima.");
            }
        };
        
        // Llamando al método de la operación anónima
        operacion.realizarOperacion();
    }
}
