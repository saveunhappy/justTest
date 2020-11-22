package com.datastructure;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Range;

import java.io.*;
import java.util.Map;

public class CopyHomework {

    /**
     * 首先肯定要复制目录，一次也只是复制一个，还是要循环(27)
     * 目录复制完，要改文件名，但是不需要用复制文件的那个，把内容换一下，
     * 直接用写好的复制word文档的那个
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        CopyDataPrepared prepared = new CopyDataPrepared();
        String mainFilePath = "E:/copy/dataStructure/2020012314z计科203侯江涛";

        for (int i = 0; i < prepared.getAllNo().size(); i++) {
            //获取所有要替换的字段
            Map<String, String> map = prepared.getAllReplace().get(i);
                       //主的目录      //需要替换的目录                  //获取所有的名字，括号后面要改的
            copyFolder(mainFilePath, map,prepared.getFullName().get(i),prepared.getAllRealName().get(i));
            }
    }
        public static void CreatWordByModel(String  tmpFile, Map<String, String> contentMap, String exportFile) throws Exception{

            InputStream in = null;
            in = new FileInputStream(new File(tmpFile));

            HWPFDocument document = null;
            document = new HWPFDocument(in);
            // 读取文本内容
            Range bodyRange = document.getRange();
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

    public static void copyFolder(String srcFolder,Map<String, String> map,String destFolder,String realName) throws Exception {
        CopyDataPrepared prepared = new CopyDataPrepared();
        String suffix = ".doc";
        File src = new File(srcFolder);
        File dest = new File(destFolder);
        if (!src.exists()) {
            return;
        }
        if (src.isFile()) {//是文件
            return;
        }
        if (dest.isFile()) {
            return;
        }
        if (!dest.exists()) {
            dest.mkdirs();
        }
        //遍历并复制

        File[] fs = src.listFiles();

            for (int i = 0; i < fs.length; i++) {
                if (fs[i].isFile()) {//如果是文件
                    String fileName = null;
                    if (fs[i].getName().contains("(侯江涛)")) {
                        fileName = fs[i].getName().replace("(侯江涛)", "("+realName+")");
                        System.out.println("fileName = " + fileName);
                    }
                    File newDest = new File(dest, fileName);//File(path,name)

                    System.out.println(fs[i].getAbsolutePath());
                    System.out.println(newDest.getAbsolutePath());
                   // Copy_File(fs[i].getAbsolutePath(),newDest.getAbsolutePath());
                    CreatWordByModel(fs[i].getAbsolutePath(), map,newDest.getAbsolutePath()+suffix);//复制文件
                    copyFolder(fs[i].getAbsolutePath(),map, newDest.getAbsolutePath(),realName);

                }
                if (fs[i].isDirectory()) {//如果是目录
                    File newDest = new File(dest, fs[i].getName());
                    System.out.println(newDest.getAbsolutePath());
                    copyFolder(fs[i].getAbsolutePath(), map,newDest.getAbsolutePath(),realName);
                }
            }
        }


}