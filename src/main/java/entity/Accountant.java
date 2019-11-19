package entity;

import com.fasterxml.jackson.databind.ObjectMapper;
import constants.Messages;
import org.apache.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Accountant {
    private static final Logger log = Logger.getLogger(Accountant.class);

    public static boolean jsonWriter() {
        ObjectMapper mapper = new ObjectMapper();
        int maxWorkRate = 40000;
        int minWorkRate = 20000;
        int maxWorkedHours = 160;
        int minWorkedHours = 80;
        Random random = new Random();
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Programmer());
        employees.add(new Manager());
        employees.add(new Programmer());
        employees.add(new Programmer());
        employees.add(new Manager());
        for (Employee employee : employees) {
            employee.setWorkRate(random.nextInt(maxWorkRate - minWorkRate) + minWorkRate);
            employee.setWorkedHours(random.nextInt(maxWorkedHours - minWorkedHours) + minWorkedHours);
        }

        try (FileWriter writer = new FileWriter(Messages.FILE_NAME, false)) {
            String json = mapper.writeValueAsString(employees);
            writer.write(json);
            log.trace(Messages.TRACE_WRITE_TO_FILE + json);
        } catch (IOException e) {
            log.error(Messages.ERROR_CANNOT_WRITE_TO_FILE);
            return false;
        }
        return true;
    }
}
