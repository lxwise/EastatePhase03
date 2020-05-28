package com.cn.wanxi.util;

import java.io.*;

/**
 * @author l-xin
 * @create 2020-05-26 8:43
 */
public class WriteNote {
    /**
     * 读取记事本
     * IO流字符流读取记事本
     *
     * @return
     */
    public static String getReadModelString(String filePath) {
        File file = new File(filePath);//给记事本提供一个文件路径
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Reader reader = new FileReader(file);
            int in = 0;//这里只会读取一个参数，我们需要将所有的字符读取出来
//           因为我们不知道要读取多少次，所以这里用while循环

            while ((in = reader.read()) != -1) {
                stringBuilder.append((char) in);
//
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringBuilder.toString();
    }

}
