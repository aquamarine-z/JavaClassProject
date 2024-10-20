package oop.task.exp.e02.kg.core;

public class Relationship extends Edge{
    private String name;
    private String attribute;
    public Relationship(Node from, Node to, String name, String attribute){
        super(from,to);
        this.name = name;
        this.attribute = attribute;
    }
    public Relationship(Node from, Node to){
        super(from,to);
    }
}
