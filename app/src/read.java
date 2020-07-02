import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class read {
    public static void main(String[] args) {
        try (Stream<String> lines = Files.lines(Paths.get("filename.txt"),Charset.defaultCharset())) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}