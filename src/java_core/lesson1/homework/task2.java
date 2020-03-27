package java_core.lesson1.homework;

public class task2 {
    public static void main(String[] args) {
        byte minByteValue = -128;                   //0x80
        byte maxByteValue = 127;                    //0x7f
        short minShortValue = -32768;               //0x8000
        short maxShortValue = 32767;                //0x7fff
        int minIntValue = 0x80000000;
        int maxIntValue = 0x7fffffff;               //Integer.MAX_VALUE;
        long minLongValue = 0x8000000000000000L;    //Long.MIN_VALUE;
        long maxLongValue = 0x7fffffffffffffffL;    //Long.MAX_VALUE;

        float floatValue = 1.12345678f;             //8
        double doubleValue = 1.1234567890123456;    //16

        char charValue = 'a';
        boolean booleanValue = true;
    }
}
