package md.tekwillacademy.filemamanagementservice;

import java.io.File;
import java.io.IOException;

public class FilesManager {
    public static boolean createTheFileIfDoesNotExist(File file){
        try {
            return file.createNewFile();
        } catch (IOException e) {
         return false;
        }
    }

    public static void informIfTheFileExists( File file){
        if(file.exists()){
            System.out.println("File exists");
        }else {
            System.out.println("The file doesn't exist");
        }
    }

    public static  void printTheFileName(File file){
        System.out.println(file.getName());

    }

    public static  void printAbsolutePath(File fileInput){

        System.out.println(fileInput.getAbsolutePath());
    }

    public static void printIfTheFilesIsADirectory(File file){
        System.out.println("The file is a directory " + file.isDirectory());
    }
    public static  void deleteIfTheFileExists(File file){
        if (file.delete()){
            System.out.println("Fisierul a fost sters");
        }else{
            System.out.println("Nu sa reusit sa se stearga fisierul");
        }


    }

}
