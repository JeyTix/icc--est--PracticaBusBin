import java.util.ArrayList;

public class MetodoBus {
    public void burbujaAsc(ArrayList<Persona> lista) {
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista.get(j).getEdad() > lista.get(j + 1).getEdad()) {
                    Persona temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
    }

    public int busquedaBinaria(ArrayList<Persona> lista, int value) {
        int inicio = 0;
        int fin = lista.size() - 1;
        while (inicio <= fin) {
            
            int medio = inicio + (fin - inicio) / 2;
            Persona pC= lista.get(medio);
            for (int i = inicio; i <= fin; i++) {
                System.out.print(lista.get(i).getEdad() + " | ");
            }
            System.out.println("\nbajo= "+inicio+"\talto= "+fin+"\tcentro= "+medio+"\tvalorCentro= "+pC.getEdad());
            if (pC.getEdad()== value) {
                // Elemento encontrado
                return medio;
            } else if (pC.getEdad()< value) {
                System.out.print("---> Derecha \n\n");
                inicio= medio+1;
            } else {
                System.out.print("---> Izquierda \n\n");
                fin= medio-1;
            }
        }
        return -1; 
    }
}
