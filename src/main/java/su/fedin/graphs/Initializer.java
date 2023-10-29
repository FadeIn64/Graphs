package su.fedin.graphs;

import su.fedin.graphs.graph.FileExtractor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class Initializer {

    @SneakyThrows
    public Initializer() {
        File test = new File("C:\\Users\\User\\Desktop\\Test.txt");
        FileExtractor fileExtractor = new FileExtractor(test);
        System.out.println(fileExtractor.getLines());
    }
}
