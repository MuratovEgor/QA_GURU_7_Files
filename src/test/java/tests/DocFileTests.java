package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.getDoc;
import static utils.Files.readTextFromPath;

public class DocFileTests {
    @Test
    void docTest() throws IOException {
        String docFilePath = "./src/test/resources/1.doc";
        String expectedData = "Hello world!";
        String actualData = readTextFromPath(docFilePath);

        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void docxTest() throws IOException {
        String docxFilePath = "./src/test/resources/1.docx";
        String expectedData = "Hello world!";
        String actualData = getDoc(docxFilePath);

        assertThat(actualData, containsString(expectedData));
    }
}
