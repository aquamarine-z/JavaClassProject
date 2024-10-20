package e03.kg.editor;


import e03.kg.core.Relationship;

public class RelationshipEditor extends Editor<Relationship> {
    @Override
    public String[] values() {
        var r= getTarget();
        return new String[]{
                r.getAttribute(),
                r.getName(),
        };
    }

    @Override
    public String[] fieldNames() {
        return new String[]{
                "Attribute",
                "Name",
        };
    }

    @Override
    public void update(String[] values) {
        Relationship r = getTarget();
        r.setAttribute(values[0]);
        r.setName(values[1]);
        this.setTarget(r);
    }
}
