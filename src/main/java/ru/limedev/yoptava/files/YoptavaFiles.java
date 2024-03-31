package files;

import java.util.ArrayList;
import java.util.List;

public class YoptavaFiles {

    public static final String FILE_EXTENSION = ".yoptava";

    public static final List<String> files = new ArrayList<String>() {
        {
            add("Hello" + FILE_EXTENSION);
        }
    };
}
