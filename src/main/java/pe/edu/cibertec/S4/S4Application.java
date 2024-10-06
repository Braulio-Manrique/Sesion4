package pe.edu.cibertec.S4;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.cibertec.S4.Service.FileService;

import javax.swing.*;
@RequiredArgsConstructor
@Slf4j
@SpringBootApplication
public class S4Application implements CommandLineRunner {
	private final FileService fileService;
	public static void main(String[] args) {
		SpringApplication.run(S4Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Creando Archivo");
		fileService.crearArchivoEscribi();
		log.info("Leyendo archivos !!!");
		fileService.abrirLeerArchivo();
	}
}
