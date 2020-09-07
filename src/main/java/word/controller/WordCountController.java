package word.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import word.model.WordCount;
import word.service.WordCountCheck;
import word.service.WordCountService;

import java.util.List;

@RestController
public class WordCountController {

    WordCountService wordCountService;


    @PostMapping
    public List<WordCountResponse> check(List<String> list) {
        return wordCountService.check(list);


    }
}
