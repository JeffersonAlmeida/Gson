package com.gson;

import com.google.gson.Gson;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by jefferson on 18/06/15.
 */
public class CompanyInstaceCreator implements JsonDeserializer<Company> {

    Gson gson;

    {
        gson = new Gson();
    }

    @Override
    public Company deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject json = jsonElement.getAsJsonObject();
        Company company = new Company();
        for (Map.Entry<String, JsonElement> entry : json.entrySet()) {
            Employee e = gson.fromJson(entry.getValue(), Employee.class);
            company.getCompany().add(e);
        }
        return company;
    }
}
