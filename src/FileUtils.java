import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    List<String> readAll(final String path) {
        ArrayList<String> lines = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((br.ready())) {
                lines.add(br.readLine());
            }
        } catch (FileNotFoundException noFile) {
            throw new IllegalArgumentException("Invalid path: no such file found");
        } catch (IOException ioEx) {
            throw new UncheckedIOException(ioEx);
        }
        return lines;
    }
}
