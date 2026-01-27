package io.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

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
        return "Witamy Oficera Dyżurnego! System CI/CD działa poprawnie.";
    }

    /**
     * Endpoint API do testów tekstowych.
     *
     * @return komunikat o statusie serwera.
     */
    @GetMapping("/api/hello")
    public String sayHello() {
        return "Serwer is UP, Hello!";
    }

    /**
     * Endpoint dynamiczny zwracający aktualne informacje o serwerze.
     * Zwraca Mapę, którą Spring Boot automatycznie zamieni na JSON.
     *
     * @return mapa z danymi o statusie i czasie.
     */
    @GetMapping("/api/status")
    public Map<String, String> getStatus() {
        HashMap<String, String> status = new HashMap<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        status.put("status", "UP");
        status.put("serverTime", dtf.format(LocalDateTime.now()));
        status.put("environment", "Production (Render)");
        status.put("message", "Aplikacja przetwarza dane dynamicznie.");
        
        return status;
    }
}
