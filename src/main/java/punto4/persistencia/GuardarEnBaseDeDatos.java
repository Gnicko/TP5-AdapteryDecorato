package punto4.persistencia;

import punto4.modelo.MetodoGuardar;
import punto4.modelo.Post;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GuardarEnBaseDeDatos implements MetodoGuardar {
    private String url;
    private MetodoGuardar metodoGuardar;

    public GuardarEnBaseDeDatos(String url, MetodoGuardar metodoGuardar) {
        this.url = url;
        this.metodoGuardar = metodoGuardar;
    }

    @Override
    public void guardar(Post post) {
        this.metodoGuardar.guardar(post);
        try (Connection connection = DriverManager.getConnection(url, "root", "")) {
            PreparedStatement pt = connection.prepareStatement("insert into post(userId,id,title,body)value(?,?,?,?)");
            pt.setInt(1, post.getUserId());
            pt.setInt(2, post.getId());
            pt.setString(3, post.getTitle());
            pt.setString(4, post.getBody());
            pt.executeUpdate();
            pt.close();
        } catch (SQLException e) {
          
            throw new RuntimeException("Error en la base de datos", e);

        }
    }
}
