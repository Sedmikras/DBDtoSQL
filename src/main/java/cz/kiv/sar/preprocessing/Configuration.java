package cz.kiv.sar.preprocessing;

import cz.kiv.sar.preprocessing.exceptions.ArgumentsException;

import java.io.File;
import java.io.FileNotFoundException;

public class Configuration {
    private String fileName;

    public Configuration(String[] args) throws Exception {
        if(args.length != 1) {
            throw new ArgumentsException();
        } else {
            fileName = args[0];
            File f = new File(fileName);
            if(!f.exists() && f.isDirectory()) {
                throw new FileNotFoundException();
            }
        }
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
