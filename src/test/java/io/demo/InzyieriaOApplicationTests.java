package io.demo;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Testy integracyjne sprawdzające poprawność działania kontrolera HelloController.
 */
@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerTest {

    /** Narzędzie do symulowania żądań HTTP. */
    @Autowired
    private MockMvc mockMvc;

    /**
     * Testuje, czy endpoint /api/hello zwraca komunikat zgodny z nowym kodem.
     *
     * @throws Exception w przypadku błędu komunikacji z mockMvc.
     */
    @Test
    void shouldReturnHelloMessage() throws Exception {
        this.mockMvc.perform(get("/api/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Serwer is UP, Hello!")));
    }

    /**
     * Testuje, czy strona główna zwraca poprawny tekst powitalny.
     *
     * @throws Exception w przypadku błędu komunikacji z mockMvc.
     */
    @Test
    void shouldReturnIndexMessage() throws Exception {
        this.mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Witamy Oficera Dyżurnego!")));
    }
}
