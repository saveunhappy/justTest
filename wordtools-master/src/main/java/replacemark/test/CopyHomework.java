package replacemark.test;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import replacemark.ReplaceUtil;

import java.io.*;
import java.util.*;

public class CopyHomework {
    public static void main(String[] args) {
        String model = "E:/copy/dataStructure/2020012314z计科203侯江涛";
        File src = new File(model);
        File dest = null;
        for (int i = 0; i < getAllClassName().size(); i++) {
            dest = new File(getAllClassName().get(i));
            try (FileInputStream fis = new FileInputStream(src);// 输入流
                 FileOutputStream fos = new FileOutputStream(dest);)// 输出流
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
            } catch (IOException e) {
                e.printStackTrace();

            }

        }
    }


    public static List<String> getAllClassName(){
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
        return list;
    }
    public static List<Map<String,String>> getAllReplace(){
        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();
        Map<String,String> map3 = new HashMap<>();
        Map<String,String> map4 = new HashMap<>();
        Map<String,String> map5 = new HashMap<>();
        Map<String,String> map6 = new HashMap<>();
        Map<String,String> map7 = new HashMap<>();
        Map<String,String> map8 = new HashMap<>();
        Map<String,String> map9 = new HashMap<>();
        Map<String,String> map10 = new HashMap<>();
        Map<String,String> map11 = new HashMap<>();
        Map<String,String> map12 = new HashMap<>();
        Map<String,String> map13 = new HashMap<>();
        Map<String,String> map15 = new HashMap<>();
        Map<String,String> map16 = new HashMap<>();
        Map<String,String> map17 = new HashMap<>();
        Map<String,String> map18 = new HashMap<>();
        Map<String,String> map19 = new HashMap<>();
        Map<String,String> map20 = new HashMap<>();
        Map<String,String> map21 = new HashMap<>();
        Map<String,String> map22 = new HashMap<>();
        Map<String,String> map23 = new HashMap<>();
        Map<String,String> map24 = new HashMap<>();
        Map<String,String> map25 = new HashMap<>();
        Map<String,String> map26 = new HashMap<>();
        Map<String,String> map27 = new HashMap<>();
        Map<String,String> map28 = new HashMap<>();

        map1.put("name","秦冲");
        map1.put("sno","2020012301");

        map2.put("name","刘威");
        map2.put("sno","2020012302");

        map3.put("name","李承豫");
        map3.put("sno","2020012303");

        map4.put("name","刘有福");
        map4.put("sno","2020012304");

        map5.put("name","党金柱");
        map5.put("sno","2020012305");

        map6.put("name","马晓磊");
        map6.put("sno","2020012306");

        map7.put("name","宋旭辉");
        map7.put("sno","2020012307");

        map8.put("name","李政辉");
        map8.put("sno","2020012308");

        map9.put("name","吕雪银");
        map9.put("sno","2020012309");

        map10.put("name","王永朋");
        map10.put("sno","2020012310");

        map11.put("name","薛永奇");
        map11.put("sno","2020012311");

        map12.put("name","宋江泉");
        map12.put("sno","2020012312");

        map13.put("name","欧阳威");
        map13.put("sno","2020012313");

        map15.put("name","张迪");
        map15.put("sno","2020012315");

        map16.put("name","张哲");
        map16.put("sno","2020012316");

        map17.put("name","杨海霞");
        map17.put("sno","2020012317");

        map18.put("name","侯乐霄");
        map18.put("sno","2020012318");

        map19.put("name","刘珂");
        map19.put("sno","2020012319");

        map20.put("name","武郑娟");
        map20.put("sno","2020012320");

        map21.put("name","孙曼曼");
        map21.put("sno","2020012321");

        map22.put("name","赵小云");
        map22.put("sno","2020012322");

        map23.put("name","彭洁");
        map23.put("sno","2020012323");

        map24.put("name","刘晓宇");
        map24.put("sno","2020012324");

        map25.put("name","罗琦月");
        map25.put("sno","2020012325");

        map26.put("name","邬赟");
        map26.put("sno","2020012326");

        map27.put("name","武艳秋");
        map27.put("sno","2020012327");

        map28.put("name","王梦珂");
        map28.put("sno","2020012328");

        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        list.add(map5);
        list.add(map6);
        list.add(map7);
        list.add(map8);
        list.add(map9);
        list.add(map10);
        list.add(map11);
        list.add(map12);
        list.add(map13);
        list.add(map15);
        list.add(map16);
        list.add(map17);
        list.add(map18);
        list.add(map19);
        list.add(map20);
        list.add(map21);
        list.add(map22);
        list.add(map23);
        list.add(map24);
        list.add(map25);
        list.add(map26);
        list.add(map27);
        list.add(map28);

        return list;
    }
//
//    public static void main(String[] args) throws Exception {
//        //获取所有的班级姓名学号
//        for (int i = 0; i < getAllClassName().size(); i++) {
//            Map<String, String> map = getAllReplace().get(i);
//            CreatWordByModel("E:\\STS3\\2020012314z计科203侯江涛.doc",map,getAllClassName().get(i));
//        }
//    }

    public static void CreatWordByModel(String  tmpFile, Map<String, String> contentMap, String exportFile) throws Exception{

        InputStream in = null;
        in = new FileInputStream(new File(tmpFile));

        HWPFDocument document = null;
        document = new HWPFDocument(in);
        // 读取文本内容
        Range bodyRange = document.getRange();
        System.out.println(bodyRange.toString());
        System.out.println(bodyRange.text());
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

}
