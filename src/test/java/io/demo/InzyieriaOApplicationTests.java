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
 * Testy integracyjne dla kontrolera HelloController.
 */
@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerTest {

    /** Narzędzie do symulowania żądań HTTP. */
    @Autowired
    private MockMvc mockMvc;

    /**
     * Testuje czy endpoint /api/hello zwraca poprawny komunikat.
     *
     * @throws Exception w przypadku błędu wykonania żądania.
     */
    @Test
    void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/api/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Serwer działa")));
    }
}
