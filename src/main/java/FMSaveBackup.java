public class FMSaveBackup {

    public static void main(String[] args) {
        System.out.println("Start process");

        String dir = "C:\\Users\\Bartek\\Documents\\Sports Interactive\\Football Manager 2024";

        FileManagementService fileManagementService = new FileManagementService();
        fileManagementService.listAllFilesInDir(dir);

    }

}
