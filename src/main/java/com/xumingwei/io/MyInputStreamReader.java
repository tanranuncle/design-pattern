package com.xumingwei.io;

import java.io.*;

/**
 * @Description:
 * @author: xumingwei
 * @date: 2020—05—12 15:38
 */
public class MyInputStreamReader extends BaseIO{

    public void inputStreamReader() throws IOException {
        //读取一个字符
        FileInputStream in = new FileInputStream(getInputFile());
        InputStreamReader reader = new InputStreamReader(in);
        int intRead = reader.read();
        System.out.println((char) intRead);
        reader.close();

        //读取一个字符数组
        in = new FileInputStream(getInputFile());
        reader = new InputStreamReader(in);
        int len = 0;
        char [] readArr = new char [1024];
        while ((len = reader.read(readArr)) != -1){
            System.out.println(new String(readArr, 0 , 1024));
        }
        reader.close();
    }
}
