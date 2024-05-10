package md.tekwillacademy.filemamanagementservice;

import java.io.File;

public class FileTaskExecution {
    public static void main(String[] args) {

        File fileObject01 = new File("src/main/java/md/tekwillacademy/filemamanagementservice/fisier.txt");
        System.out.println(fileObject01.isFile());


        System.out.println(FilesManager.createTheFileIfDoesNotExist(fileObject01));

        FilesManager.informIfTheFileExists(fileObject01);
       FilesManager.printTheFileName(fileObject01);
       FilesManager.printAbsolutePath(fileObject01);
       FilesManager.printIfTheFilesIsADirectory(fileObject01);
       FilesManager.deleteIfTheFileExists(fileObject01);

       String path = "src/main/java/md/tekwillacademy/filemamanagementservice/writedata.txt";
       OutputFilesWriterManager.writeDataIntoTheFileUsingFileWritter(path, "Content1");

        OutputFilesWriterManager.writeDataIntoTheFileUsingFileWritter(path, "Content2");

        OutputFilesWriterManager.writeDataIntoTheFileUsingBufferedWritter(path, "Content3");

        InputFilesReadManager.printTheDataFromAFile(path);
        InputFilesReadManager.printDataFromAFileByUsingFileReader(path);
        InputFilesReadManager.printDataFromAFileByUsingBufferReader(path);




    }
}
