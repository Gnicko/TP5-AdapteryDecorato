import org.junit.jupiter.api.Test;
import punto2.Exportar;
import punto2.Report;
import punto2.ReportConVerificacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ReportTest {
    private File file = new File("archivo.txt");
    Report report = new Report("Mensaje");
    @Test
    public void exportar_archivo_sin_verificar_Test(){

        report.export(file);
        try
                (BufferedReader br = new BufferedReader(new FileReader(file))){
            assertEquals("Mensaje",br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void exportar_Archivo_Verificando_Test(){
        Exportar reportVerificador = new ReportConVerificacion(report);
        assertThrows(IllegalArgumentException.class,()->reportVerificador.export(file));

    }

}
