package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromPath;

public class TxtFileTests {
    @Test
    void txtTest() throws IOException {
        String txtFilePath = "./src/test/resources/1.txt";
        String expectedData = "Привет Мир!";

        String actualData = readTextFromPath(txtFilePath);

        assertThat(actualData, containsString(expectedData));
    }
}
