package File210930;

public class ByteDemo {
    public static void main(String args[]){
        byte[] bytes = "直".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        byte[] byte2 = new byte[]{-25,-120,-79};
        String s = new String(byte2);
        System.out.println(s);
        System.out.println(String.valueOf(byte2));
        System.out.println(byte2.toString());
    }


}
