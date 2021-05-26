package punto2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Report implements Exportar {
    private String reporte;
    public Report(String reporte) {
        this.reporte = reporte;
    }
   public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }
      try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
          bw.write(this.reporte);
      } catch (IOException e) {
          e.printStackTrace();
      }

   }


}
