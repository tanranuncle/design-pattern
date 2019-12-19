package com.xumingwei.algorithm.sort.base;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Description:
 * @author: xumingwei
 * @date: 2019—12—19 14:10
 */
public class BaseSort {

    /**
     * 默认数据加载路径
     */
    private static final String INPUT_PATH = "F:\\sort\\input.txt";

    /**
     * 默认结果输出路径
     */
    private static final String OUTPUT_PATH = "F:\\sort\\output.txt";

    /**
     * 加载数据
     * @return
     */
    private List<Integer> loadData(){
        return loadData(INPUT_PATH);
    }

    private List<Integer> loadData(String inputPath){
        List<Integer> dataList = new ArrayList<>();
        try {
            File fileB = new File(inputPath);
            if(fileB.isFile() && fileB.exists()) {
                InputStreamReader isr = new InputStreamReader(new FileInputStream(fileB), "utf-8");
                BufferedReader br = new BufferedReader(isr);
                String lineTxt;
                while ((lineTxt = br.readLine()) != null) {
                    dataList.add(Integer.valueOf(lineTxt));
                }
                br.close();
            } else {
                System.out.println("文件不存在!");
            }
        }catch (IOException e){
            throw new RuntimeException("加载数据失败! ", e);
        }
        return dataList;
    }

    /**
     * 输出结果
     */
    private void writeData(List<Integer> dataList){
        writeData(OUTPUT_PATH, dataList);
    }

    private void writeData(String outputPath, List<Integer> dataList){
        clear(outputPath);
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(outputPath, false)));
            for (Integer data : dataList) {
                out.println(data);
            }
            if(out != null){
                out.close();
            }
        }catch (IOException e){
            throw new RuntimeException("输出结果失败! ", e);
        }
    }

    public void sort(){
        List<Integer> sourceDataList = loadData();
        List<Integer> tagetDataList = new ArrayList<>(sourceDataList.size());
        long start = System.currentTimeMillis();
        algorithm(sourceDataList, tagetDataList);
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + " 毫秒");
        writeData(tagetDataList);
    }

    public void sort(String inputPath, String outputPath){
        List<Integer> sourceDataList = loadData(inputPath);
        List<Integer> targetDataList = new ArrayList<>(sourceDataList.size());
        algorithm(sourceDataList, targetDataList);
        writeData(outputPath, targetDataList);
    }

    public void algorithm(List<Integer> sourceDataList, List<Integer> targetDataList){
        targetDataList.addAll(sourceDataList);
    }

    /**
     * 初始化数据
     * @param max  最大值
     * @param num  数量
     */
    public void initData(int max, int num){
        List<Integer> initDataList = new ArrayList<>(num);
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            initDataList.add(random.nextInt(max+1));
        }
        writeData(INPUT_PATH,initDataList);
    }

    /**
     * 输出结果之前，清空并创建目标文件
     * @param path
     */
    private void clear(String path){
        try {
            File file = new File(path);
            if (file.exists()) {
                file.delete();
            }
            //目录不存在 则创建
            if (!file.getParentFile().exists()) {
                boolean mkdir = file.getParentFile().mkdirs();
                if (!mkdir) {
                    throw new RuntimeException("创建目标文件所在目录失败！");
                }
            }
            file.createNewFile();
        }catch (Exception e){
            throw new RuntimeException("清空文件失败！", e);
        }
    }
}
