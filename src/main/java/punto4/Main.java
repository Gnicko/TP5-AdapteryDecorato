package punto4;

import punto4.modelo.Blog;
import punto4.persistencia.GuardarEnArchivo;
import punto4.persistencia.GuardarEnBaseDeDatos;
import punto4.persistencia.GuardarEnMemoria;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        String urlBaseDeDatos = "jdbc:mysql://localhost:3306/epp_gomez?useSSL=false";
        String urlWeb = "https://jsonplaceholder.typicode.com/posts";
        File file = new File("listaPost.txt");
        Blog blog1 = new Blog(urlWeb,
                new GuardarEnArchivo(file,
                        new GuardarEnMemoria()));

        Blog blog2 = new Blog(urlWeb,
                new GuardarEnBaseDeDatos(urlBaseDeDatos,
                        new GuardarEnMemoria()));
        Blog blog3 = new Blog(urlWeb,
                new GuardarEnArchivo(file,
                        new GuardarEnBaseDeDatos(urlBaseDeDatos,
                                new GuardarEnMemoria())));


        blog1.guardar();
        blog2.guardar();
        blog3.guardar();

    }
}

