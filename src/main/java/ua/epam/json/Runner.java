package ua.epam.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;
import ua.epam.model.Children;

import java.io.IOException;

/**
 * Created by Viktoriia_Marynchak on 10/5/2016.
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        Children child = new Children(5, "Emmy", "Cooper", 16, 2);
        JSONObject json =  new JSONObject();

        json.put("id", child.getId());
        json.put("firstName", child.getFirstName());
        json.put("lastName", child.getLastName());
        json.put("age", child.getAge());
        json.put("idGuest", child.getIdGuest());

        System.out.println(json.toJSONString());

        String jString = json.toJSONString();
        ObjectMapper mapper = new ObjectMapper();
        Children children = mapper.readValue(jString, Children.class);
        System.out.println(children);
    }
}
