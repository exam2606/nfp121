package question2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComponentTest {

    FolderComposition folderComposition;

    @BeforeEach
    public void prepareData() {
        Component folder1 = new Folder("folder1");
        Component file1 = new File("file1");
        folder1.add(file1);

        Component folder2 = new Folder("folder2");
        Component folder3 = new Folder("folder3");
        Component file2 = new File("file2");
        Component file3 = new File("file3");
        folder3.add(file2);
        folder3.add(file3);
        folder2.add(folder3);
        folder1.add(folder2);
        folderComposition = new FolderComposition(folder1);
    }

    @Test
    public void testInstance() {
       Folder folder = new Folder("fo1");
       assertTrue(folder instanceof Component);

       File file = new File("fi1");
       assertTrue(file instanceof Component);
    }

    @Test
    public void testComposite() {
        assertEquals("Folder : folder1 contains => file : file1 Folder : folder2 contains => Folder : folder3 contains => file : file2 file : file3 ", folderComposition.getComponentList());
    }

}
