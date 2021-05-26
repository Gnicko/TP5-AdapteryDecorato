package punto4.persistencia;

import punto4.modelo.MetodoGuardar;
import punto4.modelo.Post;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GuardarEnArchivo implements MetodoGuardar {
    private MetodoGuardar metodoGuardar;
    private File file;

    public GuardarEnArchivo(File file, MetodoGuardar metodoGuardar) {
        this.metodoGuardar = metodoGuardar;
        this.file = file;
    }

    @Override
    public void guardar(Post post) {
        this.metodoGuardar.guardar(post);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write("UserId: " + post.getUserId() + "\n" + "id: " + post.getId() + "\n" +
                    "Title: " + post.getTitle() + "\n" + "Body: " + post.getBody() + "\n**************\n");
        } catch (IOException e) {
            throw new RuntimeException("Error al escribir en el Archivo", e);
        }

    }
}
