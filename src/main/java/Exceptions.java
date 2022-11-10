import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

@SuppressWarnings("all")
public class Exceptions {
    public static void main(String[] args) throws IOException {
//        int[] numbers = {3, 14};

        //stacktrace
//        System.out.println(numbers[100]);

        //checked - java makes us handles them, unchecked - java doesnt care

        //2 ways to handle: catch, rethrow
        System.out.println("Before");
//        try {
            Files.delete(Path.of("...."));// IOException
            System.out.println("After delete");
//        } catch (NoSuchFileException err) {
//            System.out.println("Caught NOSUCHFILE");
//        } catch (DirectoryNotEmptyException err) {
//            System.out.println("The dir isnt empty");
//        }
        System.out.println("After all");

    }
}
