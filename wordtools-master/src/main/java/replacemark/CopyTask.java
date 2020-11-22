package replacemark;

import replacemark.test.CopyHomework;

import java.util.Map;

public class CopyTask {

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < CopyHomework.getAllClassName().size(); i++) {
            Map<String, String> map = CopyHomework.getAllReplace().get(i);
            CopyHomework.CreatWordByModel("E:\\STS3\\2020012314z计科203侯江涛.doc",map,CopyHomework.getAllClassName().get(i));
            System.out.println("复制成功"+CopyHomework.getAllClassName().get(i));
        }
    }
}
