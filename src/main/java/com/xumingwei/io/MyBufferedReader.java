package com.xumingwei.io;

import java.io.*;

/**
 * @Description:
 * @author: xumingwei
 * @date: 2020—05—12 15:52
 */
public class MyBufferedReader extends BaseIO {

    public void bufferedReader() throws IOException {
        FileInputStream in = new FileInputStream(getInputFile());
        InputStreamReader inputStreamReader = new InputStreamReader(in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String line = reader.readLine();
        System.out.println(line);
    }
}
