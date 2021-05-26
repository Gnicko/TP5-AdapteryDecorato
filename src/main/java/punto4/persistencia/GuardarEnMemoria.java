package punto4.persistencia;

import punto4.modelo.MetodoGuardar;
import punto4.modelo.Post;

import java.util.ArrayList;
import java.util.List;

public class GuardarEnMemoria implements MetodoGuardar {
    private List<Post> posts;

    public GuardarEnMemoria() {
        posts = new ArrayList<Post>();
    }

    @Override
    public void guardar(Post post) {
        posts.add(post);
    }
    
}
