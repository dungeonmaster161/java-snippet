public class TypeCasting {
    public static void main(String[] args) {
        int a = 5;
        byte b = (byte) a; //Type Casting
        System.out.println(b);
        byte c = 10;
        int f = c;

        float fl = 5.6f;
        int temp = (int)fl; // type casting

        int x = 266;
        byte m = (byte)x; // this will make 256%266 because byte only supports value till 256 so it will reduce it
    }
}
