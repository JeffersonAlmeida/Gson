package com.gson;

import com.google.gson.InstanceCreator;

import java.lang.reflect.Type;

/**
 * Created by jefferson on 18/06/15.
 */
public class DepartmentInstanceCreator implements InstanceCreator {

    @Override
    public Object createInstance(Type type) {
        return new Department();
    }
}
