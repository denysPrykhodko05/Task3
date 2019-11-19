package json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.Messages;
import entity.Accountant;
import entity.Employee;
import org.apache.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JsonReader {
    private static final Logger log = Logger.getLogger(JsonReader.class);

    public static List<Employee> reader() {
        ObjectMapper mapper = new ObjectMapper();
        String json;
        List<Employee> employees = null;
        Accountant.jsonWriter();
        try (FileReader reader = new FileReader(Messages.FILE_NAME)) {
            Scanner scanner = new Scanner(reader);
            if (scanner.hasNextLine()) {
                json = scanner.nextLine();
                employees = Arrays.asList(mapper.readValue(json, Employee[].class));
            }
        } catch (FileNotFoundException e) {
            log.error(Messages.ERROR_FILE_NOT_FOUND + Messages.FILE_NAME);
        } catch (IOException e) {
            log.error(Messages.ERROR_CANNOT_READ_FILE);
        }
        return employees;
    }
}
