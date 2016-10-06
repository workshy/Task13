package ua.epam.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import ua.epam.model.Children;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.lang.Integer.max;
import static java.lang.Integer.valueOf;

/**
 * Created by Viktoriia_Marynchak on 10/5/2016.
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        CSVFormat format = CSVFormat.RFC4180.withHeader().withDelimiter(',');
        CSVParser parser = new CSVParser(new FileReader("src\\main\\resources\\Children.csv"), format);

        List<Children> children = new ArrayList<Children>();
        for(CSVRecord record : parser){
            Children child = new Children();
            child.setId(Integer.parseInt(record.get("id")));
            child.setFirstName(record.get("firstName"));
            child.setLastName(record.get("lastName"));
            child.setId(valueOf(record.get("age")));
            child.setIdGuest(valueOf(record.get("idGuest")));
            children.add(child);
        }
        parser.close();

        System.out.println(children);
    }
}
