package composite.valid.boxes;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://sourcemaking.com/design_patterns/composite/java/2
 */
public class Box extends Entity {
    private List<Entity> children = new ArrayList();
    private int value;
    public Box(int val) {
        value = val;
    }

    public void add(Entity c) {
        children.add(c);
    }

    public void traverse(int[] levels) {
        if (printThisLevel(levels)) {
            System.out.println(indent.toString() + value);
            indent.append( "   " );
        }
        level++;
        for (Object child : children) {
            ((Entity)child).traverse(levels);
        }
        level--;
        if (printThisLevel(levels)) {
            indent.setLength(indent.length() - 3);
        }
    }
}

