package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Countries {

    @GetMapping("/")
        public String welcome() {
            return "Welcome to countries page!";
        }

}
