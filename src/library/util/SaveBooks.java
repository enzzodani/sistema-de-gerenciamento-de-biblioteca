package library.util;

import library.model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveBooks {
    public static void saveData(List<Book> books) {
        String path = "data/collection.obj";

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path))) {
            out.writeObject(books);
            System.out.println("Livros salvos com sucesso");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
