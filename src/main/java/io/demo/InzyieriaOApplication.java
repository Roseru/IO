package io.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Główna klasa startowa aplikacji InzyieriaO.
 */
@SpringBootApplication
public class InzyieriaOApplication {

    /**
     * Domyślny konstruktor klasy (wymagany przez linter dla klas publicznych).
     */
    public InzyieriaOApplication() {
        // Konstruktor domyślny
    }

    /**
     * Główna metoda uruchamiająca aplikację Spring Boot.
     *
     * @param args argumenty wiersza poleceń.
     */
    public static void main(final String[] args) {
        SpringApplication.run(InzyieriaOApplication.class, args);
    }
}
