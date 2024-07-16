import com.fasterxml.jackson.databind.ObjectMapper;

public class ServicioLibro {
    private ObjectMapper objectMapper = new ObjectMapper();
    private Gutendex gutendexClient;

    public ServicioLibro(Gutendex gutendexClient) {
        this.gutendexClient = gutendexClient;
    }

    public Libro parsearLibro(String json) throws Exception {
        // Parsear el JSON para obtener un objeto Libro
        return objectMapper.readValue(json, Libro.class);
    }

    // Método para buscar un libro por título
    public Libro buscarLibroPorTitulo(String titulo) throws Exception {
        String respuestaJson = gutendexClient.buscarLibros(titulo);
        return parsearLibro(respuestaJson);
    }

    // Método para buscar libros por idioma (a implementar)
    public void listarLibrosPorIdioma(String idioma) {
        // Implementar lógica para listar libros por idioma
    }

    // Método para listar todos los libros (a implementar)
    public void listarTodosLosLibros() {
        // Implementar lógica para listar todos los libros
    }

    // Método para listar autores (a implementar)
    public void listarAutores() {
        // Implementar lógica para listar autores
    }

    // Método para listar autores vivos en un determinado año (a implementar)
    public void listarAutoresVivosEnAno(int ano) {
        // Implementar lógica para listar autores vivos en un determinado año
    }
}
