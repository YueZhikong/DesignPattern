package Adapter.homework;

import java.io.*;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {
    InputStream in;
    OutputStream out;
    @Override
    public void readFromFile(String filename) throws IOException {
        File f = new File(filename);
        System.out.println(f.getAbsoluteFile().toString());
        in = new FileInputStream(f);
        load(in);
        in.close();
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        File f = new File(filename);
        out = new FileOutputStream(f);
        this.store(out,null);
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) throws IOException {
        return getProperty(key);
    }
}
