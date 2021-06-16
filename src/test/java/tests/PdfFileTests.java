package tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.getPdf;

public class PdfFileTests {
    @Test
    void pdfTest() throws IOException {
        String pdfFilePath = "./src/test/resources/1.pdf";
        String expectedData = "7. Работаем с файлами";

        PDF pdf = getPdf(pdfFilePath);

        assertThat(pdf, PDF.containsExactText(expectedData));
    }
}
