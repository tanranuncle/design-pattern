package com.xumingwei.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @Description:
 * @author: xumingwei
 * @date: 2020—05—12 16:01
 */
public class MyBufferedWriter extends BaseIO {

    public void bufferedWriter() throws IOException {
        FileOutputStream out = new FileOutputStream(getOutputFile());
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(out);
        BufferedWriter writer = new BufferedWriter(outputStreamWriter);

        String content = "12342424";
        writer.write(content, 0, content.length());
        writer.flush();
        writer.close();
    }
}
