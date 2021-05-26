package punto2;

import java.io.File;

public class ReportConVerificacion implements Exportar{
    private Report report;
    public ReportConVerificacion(Report report){
        this.report = report;
    }
    @Override
    public void export(File file) {
        if (file.exists()) {
            throw new IllegalArgumentException(
                    "El archivo ya existe..."
            );
        }
        report.export(file);
    }
}