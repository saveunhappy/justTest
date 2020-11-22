package com.arithmetic;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Range;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CopyPrepared {
    public static final String CATALOG = "E:/copy/arithmetic/homework/";
    public static final String SNO_PREFIX = "20200123";
    public static final String CLASS_PREFIX = "z计科203";
    public List<String> getFullName(){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < getAllNo().size(); i++) {
            list.add(CATALOG+SNO_PREFIX+getAllNo().get(i)+CLASS_PREFIX+getAllRealName().get(i));
        }
        return list;
    }
    public List<Map<String,String>> getAllReplace(){
        List<Map<String,String>> list = new ArrayList<>();
        for (int i = 0; i < getAllNo().size(); i++) {
            Map<String,String> map = new HashMap<>();
            map.put("name",getAllRealName().get(i));
            map.put("sno",SNO_PREFIX+getAllNo().get(i));
            list.add(map);
        }
        return list;
    }

    public static void CreatWordByModel(String  tmpFile, Map<String, String> contentMap, String exportFile) throws Exception{

        InputStream in = null;
        in = new FileInputStream(new File(tmpFile));

        HWPFDocument document = null;
        document = new HWPFDocument(in);
        // 读取文本内容
        Range bodyRange = document.getRange();
//        System.out.println(bodyRange.toString());
//        System.out.println(bodyRange.text());
        // 替换内容
        for (Map.Entry<String, String> entry : contentMap.entrySet()) {
            bodyRange.replaceText("${" + entry.getKey() + "}", entry.getValue());
        }

        //导出到文件
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            document.write((OutputStream)byteArrayOutputStream);
            OutputStream outputStream = new FileOutputStream(exportFile);
            outputStream.write(byteArrayOutputStream.toByteArray());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<String> getAllNo(){
        List<String> list = new ArrayList<>();
        for (int i = 1; i <=28 ; i++) {
            if(i <= 9) {
                list.add("0" + i);
            }else {
                list.add(i+"");
            }

        }
        return list;
    }

    public List<String> getAllRealName(){
        List<String> list = new ArrayList<>();
        list.add("秦冲");
        list.add("刘威");
        list.add("李承豫");
        list.add("刘有福");
        list.add("党金柱");
        list.add("马晓磊");
        list.add("宋旭辉");
        list.add("李政辉");
        list.add("吕雪银");
        list.add("王永朋");
        list.add("薛永奇");
        list.add("宋江泉");
        list.add("欧阳威");
        list.add("侯江涛");
        list.add("张迪");
        list.add("张哲");
        list.add("杨海霞");
        list.add("侯乐霄");
        list.add("刘珂");
        list.add("武郑娟");
        list.add("孙曼曼");
        list.add("赵小云");
        list.add("彭洁");
        list.add("刘晓宇");
        list.add("罗琦月");
        list.add("邬赟");
        list.add("武艳秋");
        list.add("王梦珂");
        return list;
    }
}
