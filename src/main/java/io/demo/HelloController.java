package io.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Kontroler obsługujący zapytania HTTP dla strony głównej i API.
 */
@RestController
public final class HelloController {

    /**
     * Endpoint główny aplikacji.
     *
     * @return wiadomość powitalna na stronie głównej.
     */
    @GetMapping("/")
    public String index() {
        return "Witaj w mojej aplikacji Spring Boot! System CI/CD działa poprawnie.";
    }

    /**
     * Endpoint API do testów.
     *
     * @return komunikat o statusie serwera.
     */
    @GetMapping("/api/hello")
    public String sayHello() {
        return "Serwer działa poprawnie! :)";
    }
}
