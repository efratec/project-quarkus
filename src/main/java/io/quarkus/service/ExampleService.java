package io.quarkus.service;

import io.quarkus.model.Example;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class ExampleService {

    @ConfigProperty(name = "hello")
    private String hello;

    public String hello(String name) {
        return String.format(hello, name);
    }

    public List<Example> list() {
        Example example1 = new Example(1,"Our first application");
        Example example2 = new Example(1,"Hot Reload");
        Example example3 = new Example(1,"Json no respons do Rest...");
        return Arrays.asList(example1, example2, example3);
    }

}
