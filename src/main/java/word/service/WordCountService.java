package word.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import word.model.WordCount;
import word.controller.WordCountResponse;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

@Service
public class WordCountService {

    WordCountCheck wordCountCheck;
    WordRead wordRead;

    public WordCountService(WordCountCheck wordCountCheck, WordRead wordRead) {
        this.wordCountCheck = wordCountCheck;
        this.wordRead = wordRead;
    }


    public List<WordCountResponse> check(List<String> list){

        return wordCountCheck.check(list);
    }

    public List<String> read (Path path) throws IOException {

        return wordRead.read(path);
    }


}
