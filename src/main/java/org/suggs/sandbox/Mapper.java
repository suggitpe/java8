package org.suggs.sandbox;

import java.util.ArrayList;
import java.util.List;

public class Mapper {

    public List<String> toUpperCase(List<String> friends) {
        return doTransformation(friends, name -> name.toUpperCase());
    }

    public List<String> toLowerCase(List<String> friends) {
        return doTransformation(friends, String::toLowerCase);
    }

    public List<String> doTransformation(List<String> friends, MyTransformer transformer) {
        List<String> ret = new ArrayList<>();
        for (String name : friends) {
            ret.add(transformer.transform(name));
        }
        return ret;
    }

    @FunctionalInterface
    private interface MyTransformer {
        String transform(String name);
    }
}
