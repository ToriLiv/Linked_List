public class ListaEnlazadaSimple {
    private Nodo cabeza;
    /**
     * Inicializamos Nodo
     */
    public ListaEnlazadaSimple() {
        this.cabeza = cabeza;
    }
    public boolean esListaVacia(){
        if(cabeza == null){
            return true;
        }return false;
    }
    /***************************************************************************************************/
    /**
     * Inserta nuevo nodo al inicio de la lista
     * @param dato
     */
    public void insertarAlInicio(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.setSiguiente(cabeza);
        cabeza = nuevoNodo;
    }
    /***************************************************************************************************/
    /**
     * Metodo para insertar nodo al final de la lista
     * @param dato
     */
    public void insertarAlFinal(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        // La lista se inicializa?
        if(cabeza== null){
            cabeza = nuevoNodo;
            return;
        }
        // definimos una banderilla que apunte por defecto a null.
        Nodo actual = cabeza;
        // Recorremos lista simple
        while (actual.getSiguiente() != null){
            actual = actual.getSiguiente();
        }

        actual.setSiguiente(nuevoNodo);
    }
    /***************************************************************************************************/
    /**
     * Eliminado el nodo al principio de la lista
     * @return true si el nodo eliminado exitosamente, false si no encuentra nada
     */
    public boolean eliminarAlInicio(){
        if (cabeza == null){
            return  false;
        }
        cabeza = cabeza.getSiguiente();
        return true;
    }
    /***************************************************************************************************/
    /**
     * Metodo que dato un objetivo (dato) busca y
     * elimina la primera coincidencia
     * @param dato
     * @return true si el objetivo es eliminado, false si no hay coincidencias
     */
    public boolean eliminar(int dato){
        if(cabeza == null){
            return false;
        }
        if (cabeza.getDato() == dato){
            cabeza = cabeza.getSiguiente();
            return true;
        }
        Nodo actual = cabeza;

        while(actual.getSiguiente() != null){
            if(actual.getSiguiente().getDato() == dato){
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }
    /***************************************************************************************************/
    /**
     * Verifica cuantos nodos tenemos
     * @return INT de la cantidad de nodos
     */
    public int tamanio(){
        int contador = 0;
        Nodo actual = cabeza;

        while (actual!=null){
            contador++;
            actual = actual.getSiguiente();

        }
        return contador;
    }
    /***************************************************************************************************/
    /**
     * Busca un objetivo en especifico
     * @param obj
     * @return
     */
    public boolean buscar(int obj){
        Nodo actual = cabeza;
        while (actual!= null){
            if(actual.getDato() == obj){
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }
    /***************************************************************************************************/
    /**
     * Imprime todos los valores de la lista
     */
    public void imprimir(){
        if(cabeza== null){
            System.out.println("Lista vacia");
            return;
        }
        System.out.println("Lista:");
        Nodo actual = cabeza;
        while (actual != null){
            System.out.println("actual.getDato() = " + actual.getDato());
            if(actual.getSiguiente() != null){
                System.out.println("^");
                System.out.println("|");
            }
            actual = actual.getSiguiente();
        }
        System.out.println();
    }
    /***************************************************************************************************/
    /**
     * Obtiene informacion sobre el uso de memoria de
     * la lista en tiempo de ejecucion
     * @return STRING con los datos de tiempo de ejecucion
     */
    public String informacionMemoria(){
        Runtime runtime = Runtime.getRuntime();
        long memoriaUtilizada = runtime.totalMemory();

        return String.format(
                "Tamaño total del programa %d bytes \n" +
                        "Tiempo de ejecucion:  %d",
                memoriaUtilizada,
                runtime.freeMemory()
        );
    }
}