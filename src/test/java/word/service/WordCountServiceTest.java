package word.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import word.model.WordCount;
import word.controller.WordCountResponse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

@SpringBootTest
class WordCountServiceTest {

    @Autowired
    WordCountService wordCountService;

    @Test
    void check() {
        String str = "Grut! I am grut!";
        String[] arr = str.toLowerCase().trim().split("[,;:.!?*()\\s0-9]+");
        List<String> words = new ArrayList<>();

        for (String s : arr) {
            if (arr.length != 1) {
                words.add(s);
            }
        }
        List<WordCountResponse> tab = wordCountService.check(words);

        System.out.println(tab);
        Assertions.assertEquals(3, tab.size());

    }

    @Test
    void checkBook() throws IOException {
        Path path = Paths.get("src/test/resources/Толкиен Джон. Хоббит, или Туда и обратно.txt");
        List<String> read = wordCountService.read(path);
        List<WordCountResponse> check = wordCountService.check(read);

        for (int i = 0; i < 20; i++) {

            System.out.println(check.get(i));
        }

        Assertions.assertEquals("пусто", check.get(3).getNameWord());


    }
}