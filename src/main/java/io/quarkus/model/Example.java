package io.quarkus.model;

public class Example {

    private int order;
    private String name;

    public Example(int order, String name) {
        this.order = order;
        this.name = name;
    }

    public Example() {

    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
