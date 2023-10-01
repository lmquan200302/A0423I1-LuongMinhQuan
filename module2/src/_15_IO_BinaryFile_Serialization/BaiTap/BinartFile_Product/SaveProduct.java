package _15_IO_BinaryFile_Serialization.BaiTap.BinartFile_Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveProduct {
    public static void saveProductoFile(String path, List<Product> products){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch (IOException e){
            System.err.println("File khong hop le");
        }

    }

    public static List<Product> readDataFromFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
}

