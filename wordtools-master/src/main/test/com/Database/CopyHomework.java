package com.Database;

import java.util.Map;

public class CopyHomework {
    public static void main(String[] args) throws Exception {
        String mainFilePathThree = "E:/copy/database/2020012314z计科203侯江涛.doc";
        String mainFilePathTwo = "E:/copy/database/2020012314z计科203侯江涛2.doc";
        String suffix = ".doc";
        String subject = "(数据库)";
        CopyDataBasePrepared prepared = new CopyDataBasePrepared();
        //学号的长度，28个人，除了自己，27的长度
        for (int i = 0; i < prepared.getAllNo().size(); i++) {
            //获取所有要替换的字段
            Map<String, String> map = prepared.getAllReplace().get(i);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if(entry.getValue().length() == 2){
                    prepared.CreatWordByModel(mainFilePathTwo,map,prepared.getFullName().get(i)+subject+suffix);
                }else {
                    prepared.CreatWordByModel(mainFilePathThree,map,prepared.getFullName().get(i)+subject+suffix);
                }
                System.out.println(prepared.getFullName().get(i)+subject+suffix+"复制成功");
            }
        }
    }
}
