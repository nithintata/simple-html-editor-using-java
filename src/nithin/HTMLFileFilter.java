package nithin;
import javax.swing.filechooser.FileFilter;
import java.io.File;


public class HTMLFileFilter extends FileFilter {
    @Override
    public boolean accept(File f) {
        String name  = f.getName();
        return f.isDirectory() || name.endsWith(".htm") || name.endsWith(".HTM") || name.endsWith(".html") || name.endsWith(".HTML");
    }

    @Override
    public String getDescription() {
        return "HTML and HTM files";
    }
}

