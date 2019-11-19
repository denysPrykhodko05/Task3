package json;

import entity.Employee;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class JsonReaderTest {

    @Test
    public void reader() {
        List<Employee> employees= JsonReader.reader();
        int actual = employees.size();
        int expected=5;
        assertEquals(expected,actual);
    }
}