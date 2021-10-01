package File211001;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
//实现对指定文件夹最后修改日期的查询
public class FileDemo2 {
    public static void main(String args[]){
        File file = new File("D:\\IDEA\\IDEAData");
        long l = file.lastModified();
        Date date = new Date(l);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String s = sdf.format(date);
        System.out.println(s);
    }
}
