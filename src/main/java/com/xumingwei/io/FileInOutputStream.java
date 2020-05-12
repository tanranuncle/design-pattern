package com.xumingwei.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description:
 * @author: xumingwei
 * @date: 2020—05—12 14:02
 */
public class FileInOutputStream extends BaseIO{

    //输入
    public void fileInputStream() throws IOException {
        FileInputStream inputStream = new FileInputStream(getInputFile());
        //读取单个字节
        int intRead = inputStream.read();
        int len = 0;
        while ((len = inputStream.read()) != -1){
            System.out.println((char) intRead);
        }

        //每次读取256个字节
        inputStream = new FileInputStream(getInputFile());
        byte [] readArr = new byte[256];
        len = 0;
        while ((len = inputStream.read(readArr)) != -1){
            System.out.println(new String(readArr));
        }

        inputStream.close();

    }

    //输出
    public void fileOutputStream() throws IOException {
        //一次性写入
        FileOutputStream outputStream = new FileOutputStream(getOutputFile());
        String output = "913331";
        outputStream.write(output.getBytes());
        outputStream.close();

        //多次追加写入
        outputStream = new FileOutputStream(getOutputFile(), true);
        outputStream.write(output.getBytes());
        outputStream.write("\r\n".getBytes());
        outputStream.write(output.getBytes());
        outputStream.close();
    }

}
