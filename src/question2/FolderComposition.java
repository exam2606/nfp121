package question2;

public class FolderComposition {
    Component componentList;

    public FolderComposition(Component componentList) {
        this.componentList = componentList;
    }

    public String getComponentList() {
        return componentList.displayComponentInfo();
    }
}
