package io.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Kontroler obsługujący podstawowe zapytania powitalne.
 */
@RestController
public final class HelloController {

    /**
     * Zwraca komunikat potwierdzający działanie serwera.
     *
     * @return ciąg znaków z informacją o statusie serwera.
     */
    @GetMapping("/api/hello")
    public String sayHello() {
        return "Serwer działa poprawnie! :)";
    }
}
