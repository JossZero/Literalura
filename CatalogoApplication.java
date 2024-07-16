package com.lietaratura.Catalogo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class AppRunner implements CommandLineRunner {

	private final Gutendex gutendexClient = new Gutendex();
	private final ServicioLibro servicioLibro = new ServicioLibro(gutendexClient);

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Seleccione una opción:");
			System.out.println("1. Buscar libro por título");
			System.out.println("2. Listar todos los libros");
			System.out.println("3. Listar libros por idioma");
			System.out.println("4. Listar autores");
			System.out.println("5. Listar autores vivos en un determinado año");
			System.out.println("6. Salir");

			int opcion = scanner.nextInt();
			scanner.nextLine();  // Consumir la nueva línea

			switch (opcion) {
				case 1:
					System.out.println("Ingrese el título del libro:");
					String titulo = scanner.nextLine();
					String respuestaJson = gutendexClient.buscarLibros(titulo);
					Libro libro = servicioLibro.parsearLibro(respuestaJson);
					System.out.println(libro);
					break;
				case 2:
					// Lógica para listar todos los libros
					break;
				case 3:
					System.out.println("Ingrese el idioma:");
					String idioma = scanner.nextLine();
					// Lógica para listar libros por idioma
					break;
				case 4:
					// Lógica para listar autores
					break;
				case 5:
					System.out.println("Ingrese el año:");
					int año = scanner.nextInt();
					// Lógica para listar autores vivos en un determinado año
					break;
				case 6:
					System.out.println("Saliendo...");
					return;
				default:
					System.out.println("Opción no válida");
			}
		}
	}
}

