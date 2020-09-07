package word.service;

import org.springframework.stereotype.Service;
import word.controller.WordCountResponse;
import word.model.WordCount;

import java.nio.file.Files;
import java.util.*;

@Service
public class WordCountCheck {


    public List<WordCountResponse> check(List<String> list) {

        Set<String> uniqueWords = new HashSet<>(list);
        List<WordCountResponse> response = new ArrayList<>();

        for (String uniqueWord : uniqueWords) {
            int quantity = Collections.frequency(list, uniqueWord);
            WordCountResponse array = new WordCountResponse(uniqueWord, quantity);
            response.add(array);

        }

        return response;
    }

}
