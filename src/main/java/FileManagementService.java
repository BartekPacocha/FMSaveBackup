import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class FileManagementService {

    public List<FileMetadata> listAllFilesInDir(String dir) {
        Log.printLog("List all files in dir");
        List<FileMetadata> fileMetadataList = new ArrayList<>();
        File directory = new File(dir);

        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    FileMetadata fileMetadata = new FileMetadata(file.getName(), getFileLastModified(file), 1);
                    fileMetadataList.add(fileMetadata);
                }
            }
        }

        return fileMetadataList;
    }

    private LocalDateTime getFileLastModified(File file) {
        return LocalDateTime.ofInstant(
                Instant.ofEpochMilli(file.lastModified()),
                ZoneId.systemDefault());
    }
}
