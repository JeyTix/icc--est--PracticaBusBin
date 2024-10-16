import java.util.ArrayList;

public class MetodoBus {
    public void insercionAsc(ArrayList<Persona> lista) {
        for (int j = 1; j < lista.size(); j++) {
            Persona key = lista.get(j);
            int i = j - 1;
    
            while (i > -1 && lista.get(i).getEdad() > key.getEdad()) {
                lista.set(i + 1, lista.get(i));
                i--;
            }
            lista.set(i + 1, key);
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
