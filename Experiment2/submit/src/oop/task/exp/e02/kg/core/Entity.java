package oop.task.exp.e02.kg.core;

public class Entity extends Node {
    private String type;
    private String name;
    private String attribute;
    public Entity(int id, String type, String name, String attribute){
        super(id);
        this.type = type;
        this.name = name;
        this.attribute = attribute;
    }
    public Entity(int id){
        super(id);
        this.type = "unknown";
        this.name = "unknown";
        this.attribute = "unknown";
    }
}
