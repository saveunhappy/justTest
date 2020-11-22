package com.arithmetic;

import java.util.Map;

public class CopyHomework {
    public static void main(String[] args) throws Exception {
        String mainFilePathThree = "E:/copy/arithmetic/2020012314z计科203侯江涛.doc";
        String mainFilePathTwo = "E:/copy/arithmetic/2020012314z计科203侯江涛2.doc";
        String suffix = ".doc";
        CopyPrepared prepared = new CopyPrepared();
        //学号的长度，28个人，除了自己，27的长度
        for (int i = 0; i < prepared.getAllNo().size(); i++) {
            //获取所有要替换的字段
            Map<String, String> map = prepared.getAllReplace().get(i);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if(entry.getValue().length() == 2){
                    prepared.CreatWordByModel(mainFilePathTwo,map,prepared.getFullName().get(i)+suffix);
                }else {
                    prepared.CreatWordByModel(mainFilePathThree,map,prepared.getFullName().get(i)+suffix);
                }
            }
                                      //源文件          //目标文件
           // prepared.CreatWordByModel(mainFilePath,map,prepared.getFullName().get(i)+suffix);
           // System.out.println(prepared.getFullName().get(i)+"复制成功");
        }
    }
}
