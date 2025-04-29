package exercise;

import java.util.HashMap;
import org.junit.jupiter.api.BeforeEach;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
// BEGIN

// END


class FileKVTest {

    private static Path filepath = Paths.get("src/test/resources/file").toAbsolutePath().normalize();

    @BeforeEach
    public void beforeEach() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String content = mapper.writeValueAsString(new HashMap<String, String>());
        Files.writeString(filepath, content, StandardOpenOption.TRUNCATE_EXISTING);
    }

    // BEGIN
    @Test
    void test1(){
        var a = new FileKV("src/test/resources/file", Map.of("key", "10"));

        assertThat(a.get("key", "default")).isEqualTo("10");
        assertThat(a.get("aboba", "default")).isEqualTo("default");

        a.set("meme", "fst");
        assertThat(a.toMap()).isEqualTo(Map.of("key", "10","meme", "fst"));

        a.unset("meme");
        assertThat(a.toMap()).isEqualTo(Map.of("key", "10"));
    }
    // END
}
