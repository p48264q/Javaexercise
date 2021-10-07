package File211005;
//实现内存操作流的测试，戏剧性的产生了字符串拼接的效果

//将写入数据内存的部分以.toByteArray()转成字节数组，再通过String构造方法转字符串输出
//或者将写入内存的内存操作流对象直接.toString(),针对放的是字符串的字节数据的情况
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
* 内存操作流，不会关联文件，在内存进行数据的读写，会自己在内存中维护一个缓存，将数据维护在缓存中
*   a:
        操作字节数组
        ByteArrayOutputStream
        ByteArrayInputStream
        此流关闭无效，所以无需关闭
    b:
        操作字符数组
        CharArrayWrite
        CharArrayReader
    c:
        操作字符串
        StringWriter
        StringReader
* */
public class IODemo2 {
    public static void main(String[] args) throws IOException {
        //自己维护一个字节数组充当缓存
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write("阿里巴巴与四十大盗".getBytes());
        byteArrayOutputStream.write("安徒生童话之丑小鸭".getBytes());
        byteArrayOutputStream.write("abcdabcdabc".getBytes());
        byteArrayOutputStream.write("ccddccddefg".getBytes());

        //取出ByteArrayOutputStream维护的字节数组
        byte[] bytes = byteArrayOutputStream.toByteArray();
        String s = byteArrayOutputStream.toString();
        //String s = new String(bytes);
        System.out.println(s);
    }
}
