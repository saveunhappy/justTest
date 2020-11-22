package test;

import src.com.supremind.arraylist.ArrayList;
import src.com.supremind.list.List;

import java.io.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestLinkedList {
    public static void main(String[] args) {
        String model = "E:\\STS3\\2020012314z计科203侯江涛.doc";

        File src = new File(model);
        File dest = null;
        List<String> list = new ArrayList<>();
        list.add("E:\\STS3\\2020012301z计科203秦冲.doc");
        list.add("E:\\STS3\\2020012302z计科203刘威.doc");
        list.add("E:\\STS3\\2020012303z计科203李承豫.doc");
        list.add("E:\\STS3\\2020012304z计科203刘有福.doc");
        list.add("E:\\STS3\\2020012305z计科203党金柱.doc");
        list.add("E:\\STS3\\2020012306Z计科203马晓磊.doc");
        list.add("E:\\STS3\\2020012307Z计科203宋旭辉.doc");
        list.add("E:\\STS3\\2020012308Z计科203李政辉.doc");
        list.add("E:\\STS3\\2020012309Z计科203吕雪银.doc");
        list.add("E:\\STS3\\2020012310Z计科203王永朋.doc");
        list.add("E:\\STS3\\2020012311Z计科203薛永奇.doc");
        list.add("E:\\STS3\\2020012313z计科203欧阳威.doc");
        list.add("E:\\STS3\\2020012312z计科203宋江泉.doc");
        list.add("E:\\STS3\\2020012313z计科203欧阳威.doc");
        list.add("E:\\STS3\\2020012315z计科203张迪.doc");
        list.add("E:\\STS3\\2020012316z计科203张哲.doc");
        list.add("E:\\STS3\\2020012317z计科203杨海霞.doc");
        list.add("E:\\STS3\\2020012319z计科203刘珂.doc");
        list.add("E:\\STS3\\2020012320z计科203武郑娟.doc");
        list.add("E:\\STS3\\2020012321z计科203孙曼曼.doc");
        list.add("E:\\STS3\\2020012322z计科203赵小云.doc");
        list.add("E:\\STS3\\2020012323Z计科203彭洁.doc");
        list.add("E:\\STS3\\2020012324z计科203刘晓宇.doc");
        list.add("E:\\STS3\\2020012325z计科203罗琦月.doc");
        list.add("E:\\STS3\\2020012326Z计科203邬赟.doc");
        list.add("E:\\STS3\\2020012327z计科203武艳秋.doc");
        list.add("E:\\STS3\\2020012328Z计科203王梦珂.doc");
        for (int i = 0; i < list.size(); i++) {
            dest = new File(list.get(i));
        try (FileInputStream fis = new FileInputStream(src);// 输入流
             FileOutputStream fos = new FileOutputStream(dest))// 输出流
              {

             //boolean newFile = dest.createNewFile();
            if(!dest.exists()){
                boolean newFile = dest.createNewFile();
                System.out.println("创建成功");

            }else {
                System.out.println("文件已经存在   "+dest.getName());
            }
            byte[] bs = new byte[1024];
                  while (true) {
                      int len = fis.read(bs, 0, bs.length);
                      if (len == -1) {
                          break;
                      } else {
                          fos.write(bs, 0, len);
                      }
                  }
             System.out.println("复制文件成功");
             InputStream in = new FileInputStream(dest);
            // OPCPackage srcPackage = OPCPackage.open(in);
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
    }
}
