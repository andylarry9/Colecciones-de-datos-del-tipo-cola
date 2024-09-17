
package cola;

import java.util.LinkedList;
import java.util.Queue;


public class ServerRequest {
    private Queue<RequestImpresion> colaPeticiones = new LinkedList<>();

    public void addRequest(RequestImpresion request) {
        colaPeticiones.add(request);
    }

    public void printWork() {
        if (!colaPeticiones.isEmpty()) {
            RequestImpresion request = colaPeticiones.poll();
            System.out.println("Imprimiendo: " + request);
        } else {
            System.out.println("No hay peticiones para imprimir.");
        }
    }

    public int getNumRequest() {
        return colaPeticiones.size();
    }

    public void showAll() {
        for (RequestImpresion request : colaPeticiones) {
            System.out.println(request);
        }
    }

    public void printAll() {
        while (!colaPeticiones.isEmpty()) {
            printWork();
        }
    }
}


