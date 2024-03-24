import java.util.List;

public class FMSaveBackup {

    public static void main(String[] args) {
        Log.printLog("Start process");

        String fmDir = "C:\\Users\\Bartek\\Documents\\Sports Interactive\\Football Manager 2024\\games";
        String synologyDir = "//ds120//home/Download/FM24";

        // filters
        // games
        // tactics
        // views

        // get all files from disk
        // get all files from synology
        // compare if all disk exists on synology
        // compare if all synology exists on disk
        // copy non-exist
        // compare file dates

        FileManagementService fileManagementService = new FileManagementService();
        List<FileMetadata> gameSaves = fileManagementService.listAllFilesInDir(synologyDir);

        gameSaves.forEach(System.out::println);

    }

}
