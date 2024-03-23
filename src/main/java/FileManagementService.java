import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileManagementService {

    public List<String> listAllFilesInDir(String dir) {
        Log.printLog("List all files in dir");
        List<String> filenames = new ArrayList<>();
        File directory = new File(dir);

        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    filenames.add(file.getName());
                }
            }
        }

        return filenames;
    }
}
