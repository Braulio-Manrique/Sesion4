package pe.edu.cibertec.S4.Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
@Slf4j
public class FileService {
    private final String FILE_PATH = "data_prueba.txt";
    public void crearArchivoEscribi() throws IOException{
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH)) {
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeUTF("Desarrollo de Aplicaciones Web ");
        }
    }
    public  void abrirLeerArchivo() throws IOException{
        try(FileInputStream fileInputStream = new FileInputStream(FILE_PATH)) {
            DataInputStream dataInputStream  = new DataInputStream(fileInputStream);
            String nombrecurso = dataInputStream.readUTF();
            log.info(nombrecurso);
        }
    }
}
