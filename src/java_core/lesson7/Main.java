package java_core.lesson7;

public class Main {
    public static void main(String[] args) {           //3a2x2dgfc3va
        StringCompressor sc1 = new StringCompressor("xaaaaaaassdzafsxdaffffz");
        StringGenerator stringGenerator = new StringGenerator();

        String data = "";
        long start = System.currentTimeMillis();
        data = stringGenerator.generateSTR(400, 900);
        long end = System.currentTimeMillis();
        System.out.println(data.length());
        System.out.println(" generateSTR: " + (end - start) + "ms.");

        start = System.currentTimeMillis();
        sc1.compress(data);
        end = System.currentTimeMillis();
        System.out.println("without SB: " + (end - start) + "ms.");

        start = System.currentTimeMillis();
        sc1.compressLevin(data);
        //System.out.println(sc1.compressedData);
        end = System.currentTimeMillis();
        System.out.println("Levin: " + (end - start) + "ms.");

        start = System.currentTimeMillis();
        sc1.compressSB(data);
        end = System.currentTimeMillis();
        System.out.println("with SB: " + (end - start) + "ms.");
    }
}
