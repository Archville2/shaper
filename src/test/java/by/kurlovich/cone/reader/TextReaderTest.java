package by.kurlovich.cone.reader;

import by.kurlovich.cone.exception.FileProblemException;
import by.kurlovich.cone.reader.TextReader;
import org.testng.annotations.*;

import static org.testng.AssertJUnit.assertEquals;

public class TextReaderTest {
    TextReader textReader;

    @BeforeClass
    public void setUp() {
        textReader = new TextReader();
    }

    @AfterClass
    public void tearDown() {
        textReader = null;
    }

    @Test(expectedExceptions = FileProblemException.class)
    public void noFileTest() throws FileProblemException {
        textReader.readFile("./files/point.txt");
    }

    @Test
    public void readLinesTest() throws FileProblemException {
        int expected = 3;
        int actual = textReader.readFile("./files/points.txt").size();
        assertEquals ("mismatch lines quantity" ,expected, actual);
    }

}
