package io.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //klasa obsługuje zapytania HTTP
public class HelloController {

    @GetMapping("/api/hello") //ścieżka URL
    public String sayHello() {
        return "Serwer działa poprawnie! :)";
    }
}