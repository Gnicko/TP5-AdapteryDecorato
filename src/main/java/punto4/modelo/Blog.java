package punto4.modelo;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class Blog {
    private List<Post> posts;
    private MetodoGuardar metodoGuardar;
    private String url;

    public Blog(String urlWeb, MetodoGuardar metodoGuardar) {
        this.url = urlWeb;
        this.posts = cargarPost();
        this.metodoGuardar = metodoGuardar;

    }

    public List<Post> obtenerPosts() {
        return posts;
    }

    private List<Post> cargarPost() {
        System.out.println(url);
        RestCall restCall = new RestCall(url);
        String datos = restCall.run();

        return new Gson().fromJson(datos, new TypeToken<List<Post>>() {
        }.getType());
    }

    public void guardar() {
        for (Post p : posts) {
            metodoGuardar.guardar(p);
        }
    }
}
