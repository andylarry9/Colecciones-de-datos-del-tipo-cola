

package cola;


public class RequestImpresion {
    private String id;
    private String nombreDocumento;
    private int numPaginas;
    private int numCopias;

    public RequestImpresion(String id, String nombreDocumento, int numPaginas, int numCopias) {
        this.id = id;
        this.nombreDocumento = nombreDocumento;
        this.numPaginas = numPaginas;
        this.numCopias = numCopias;
    }

    public String getId() {
        return id;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public int getNumCopias() {
        return numCopias;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Documento: " + nombreDocumento + ", Páginas: " + numPaginas + ", Copias: " + numCopias;
    }
}
    

