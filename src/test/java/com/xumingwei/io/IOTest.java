package com.xumingwei.io;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Description:
 * @author: xumingwei
 * @date: 2020—05—12 11:33
 */
public class IOTest {

    @Test
    public void testFileInputStream() throws IOException {
        FileInOutputStream inOutputStream = new FileInOutputStream();
        inOutputStream.fileInputStream();
    }

    @Test
    public void testFileOutputStream() throws IOException {
        FileInOutputStream inOutputStream = new FileInOutputStream();
        inOutputStream.fileOutputStream();
    }

    @Test
    public void testBufferedInputStream() throws IOException {
        BufferedInOutputStream inOutputStream = new BufferedInOutputStream();
        inOutputStream.bufferedInputStream();
    }

    @Test
    public void testBufferedOutputStream() throws IOException {
        BufferedInOutputStream inOutputStream = new BufferedInOutputStream();
        inOutputStream.bufferedOutputStream();
    }

    @Test
    public void testInputStreamReader() throws IOException {
        MyInputStreamReader reader = new MyInputStreamReader();
        reader.inputStreamReader();
    }

    @Test
    public void testOutputStreamWriter() throws IOException {
        MyOutputStreamWriter writer = new MyOutputStreamWriter();
        writer.outtputStreamWriter();
    }

    @Test
    public void testMyBufferedReader() throws IOException {
        MyBufferedReader reader = new MyBufferedReader();
        reader.bufferedReader();
    }

    @Test
    public void testMyBufferedWriter() throws IOException {
        MyBufferedWriter writer = new MyBufferedWriter();
        writer.bufferedWriter();
    }
}
