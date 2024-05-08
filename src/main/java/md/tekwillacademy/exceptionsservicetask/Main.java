package md.tekwillacademy.exceptionsservicetask;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(TextManager.getTheTextLenght("mama"));
        System.out.println(TextManager.getTheTextLenghtWithTryAndCatch(null));
        System.out.println(TextManager.getTheTextLenght("tata"));
        System.out.println(TextManager.getTheTextLenghtWithTryAndCatch("Dominican"));

        TextManager.readDataWithTryCatch("file.txt");

        try {
            TextManager.readWithoutTryAndCatch("text.txt");
        }catch(FileNotFoundException exception){
            exception.printStackTrace();

        }

        TextManager.readWithoutTryAndCatch("txt.txt");
        System.out.println("Last line");

        System.out.println(ArithmeticOperationService.divideWithExceptionHandling(10, 0));
        System.out.println("The show must go on");


    }
}
