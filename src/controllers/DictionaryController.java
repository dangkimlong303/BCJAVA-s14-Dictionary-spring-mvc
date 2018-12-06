package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/dictionary")
    public String translate(){
        return "dic";
    }

    @PostMapping("/dictionary")
    public String translate(@RequestParam String eng, Model model){
        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("hello","Xin Chao");
        dictionary.put("money","Tien");
        dictionary.put("thanks","Cam on");
        dictionary.put("bye","tam biet");
        String search = dictionary.get(eng);
        model.addAttribute("eng",eng);
        model.addAttribute("vn",search);
        return "dic";

    }
}
