package com.xumingwei.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @Description:
 * @author: xumingwei
 * @date: 2020—05—12 15:53
 */
public class MyOutputStreamWriter extends BaseIO {

    public void outtputStreamWriter() throws IOException {
        //一次输出
        FileOutputStream out = new FileOutputStream(getOutputFile());
        OutputStreamWriter writer = new OutputStreamWriter(out);
        String content = "4341";
        char [] contentArr = new char[content.length()];
        content.getChars(0, content.length(), contentArr, 0);
        writer.write(contentArr);
        writer.flush();
        writer.close();

        //多次追加输出
        out = new FileOutputStream(getOutputFile(), true);
        writer = new OutputStreamWriter(out);
        content.getChars(0, content.length(), contentArr, 0);
        writer.write(contentArr);
        writer.write(contentArr);
        writer.write(contentArr);
        writer.flush();
        writer.close();
    }
}
