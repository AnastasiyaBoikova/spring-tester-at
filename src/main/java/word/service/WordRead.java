package word.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service
public class WordRead {



    public List<String> read (Path path) throws IOException {

        Stream<String> lines = Files.lines(path);
        List<String> words = new ArrayList<>();
        lines.forEach((str) -> {

            String[] arr = str.toLowerCase().trim().split("[,;:.!?*()\\s0-9]+");
            for (String s : arr) {
                if (arr.length != 1) {
                    words.add(s);
                }
            }
        });
        return words;

    }
}
