import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.rules.Timeout;
import static org.junit.Assert.assertEquals;
import static sun.nio.cs.Surrogate.is;

public class Aufgabe3Test {
    
    @Rule
    public Timeout globalTimeout = Timeout.millis(1000);
    
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();
    //private static int number = (int) (Math.random() * 1000) + 10;
    private static String[] fill = new String[]{"Kiste", "Telefon", "Tafel", "Blume", "Blase", "Umgebung", "Adler", "Block", "Umwelt"};

    @Test
    public void testHeight() throws Exception {
        StringTree test = new StringTree();
        for (String i : fill) {
            test.add(i);
        }
        assertEquals(test.height(), 4);
    }
    
    @Test
    public void testPrintLeaves() throws Exception {
        StringTree test = new StringTree();
        for (String i : fill) {
            test.add(i);
        }
        String[] testValues = new String[]{"Adler", "Block", "Tafel", "Umwelt"};
        StringBuilder testString = new StringBuilder();
        for(String i: testValues) {
            testString.append(i).append(System.lineSeparator());
        }
        test.printLeaves();
        assertEquals(testString.toString(), log.getLog());
    }
    
    @Test
    public void testPrintPostOrder() throws Exception {
        StringTree test = new StringTree();
        for (String i : fill) {
            test.add(i);
        }
        String[] testValues = new String[]{"Adler", "Block", "Blase", "Blume", "Tafel", "Umwelt", "Umgebung", "Telefon", "Kiste"};
        StringBuilder testString = new StringBuilder();
        for(String i: testValues) {
            testString.append(i).append(System.lineSeparator());
        }
        test.printPostOrder();
        assertEquals(testString.toString(), log.getLog());
    }

    @Test
    public void testPrintPreOrder() throws Exception {
        StringTree test = new StringTree();
        for (String i : fill) {
            test.add(i);
        }
        String[] testValues = new String[]{"Kiste", "Blume", "Blase", "Adler", "Block", "Telefon", "Tafel", "Umgebung", "Umwelt"};
        StringBuilder testString = new StringBuilder();
        for(String i: testValues) {
            testString.append(i).append(System.lineSeparator());
        }
        test.printPreOrder();
        assertEquals(testString.toString(), log.getLog());
    }
    
    @Test
    public void testPrintLevelOrder() throws Exception {
        StringTree test = new StringTree();
        for (String i : fill) {
            test.add(i);
        }
        String[] testValues = new String[]{"#Kiste#", "#Blume#Telefon#", "#Blase#Tafel#Umgebung#", "#Adler#Block#Umwelt#"};
        StringBuilder testString = new StringBuilder();
        for(String i: testValues) {
            testString.append(i).append(System.lineSeparator());
        }
        test.printLevelOrder();
        assertEquals(testString.toString(), log.getLog());
    }
    
    @Test
    public void testPrintStartingWith() throws Exception {
        StringTree test = new StringTree();
        for (String i : fill) {
            test.add(i);
        }
        String[] testValues = new String[]{"Kiste", "Blase", "Block", "Blume", "Tafel", "Telefon", "Umgebung", "Umwelt"};
        StringBuilder testString = new StringBuilder();
        for(String i: testValues) {
            testString.append(i).append(System.lineSeparator());
        }
        test.printNodesStartingWith('k');
        test.printNodesStartingWith('B');
        test.printNodesStartingWith('T');
        test.printNodesStartingWith('u');
        test.printNodesStartingWith('G');
        assertEquals(testString.toString(), log.getLog());
    }
    
    @Test
    public void testToString() throws Exception {
        StringTree test = new StringTree();
        for (String i : fill) {
            test.add(i);
        }
        assertEquals(test.toString().replaceAll("\\s", "").replaceAll("\\.", ""),"[Umwelt->Umgebung->Telefon->Tafel->Kiste->Blume->Block->Blase->Adler]");
    }

    @Test
    public void testToStringEmpty() throws Exception {
        StringTree test = new StringTree();
        assertEquals(test.toString().replaceAll("\\s", "").replaceAll("\\.",""), "[+]");
    }
}

