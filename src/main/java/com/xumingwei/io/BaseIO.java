package com.xumingwei.io;

import java.io.File;

/**
 * @Description:
 * @author: xumingwei
 * @date: 2020—05—12 13:55
 */
public class BaseIO {

    public String getInputPath(){
        String inputPath = this.getClass().getClassLoader().getResource("input.txt").getPath();
        return inputPath;
    }

    public String getOutputPath(){
        String outputPath = this.getClass().getClassLoader().getResource("output.txt").getPath();
        return outputPath;
    }

    public File getInputFile(){
        File inputFile = new File(getInputPath());
        return inputFile;
    }

    public File getOutputFile(){
        File outputFile = new File(getOutputPath());
        return outputFile;
    }
}
