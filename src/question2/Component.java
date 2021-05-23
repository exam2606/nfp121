package question2;

import java.util.ArrayList;

public abstract class Component {
    int size;
    public void add(Component newComponent) {
        size++;
    }

    public void getComponentName() {
        throw new UnsupportedOperationException();
    }


    public String displayComponentInfo() {
        throw new UnsupportedOperationException();
    }
}
