package com.xumingwei.io;

import java.io.*;

/**
 * @Description:
 * @author: xumingwei
 * @date: 2020—05—12 14:39
 */
public class BufferedInOutputStream extends BaseIO {

    //输入
    public void bufferedInputStream() throws IOException {
        FileInputStream inputStream = new FileInputStream(getInputFile());
        BufferedInputStream buffered = new BufferedInputStream(inputStream);
        byte [] readArr = new byte[1024];
        int len = 0;
        while ((len = buffered.read(readArr)) != -1){
            System.out.println(new String(readArr, 0 ,1024));
        }
        buffered.close();
    }

    //输出
    public void bufferedOutputStream() throws IOException {
        //一次输出
        FileOutputStream outputStream = new FileOutputStream(getOutputFile());
        BufferedOutputStream buffered = new BufferedOutputStream(outputStream);
        String content = "123456";
        buffered.write(content.getBytes());
        buffered.flush();
        buffered.close();

        //多次追加输出
        outputStream = new FileOutputStream(getOutputFile(), true);
        buffered = new BufferedOutputStream(outputStream);
        buffered.write(content.getBytes());
        buffered.write("\r\n".getBytes());
        buffered.write(content.getBytes());
        buffered.flush();
        buffered.close();

    }

}
