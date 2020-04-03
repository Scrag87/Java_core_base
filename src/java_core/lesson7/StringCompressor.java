package java_core.lesson7;

public class StringCompressor {

    String data, compressedData, decompressedData;

    public StringCompressor(String data) {
        this.decompressedData = data;
        compress(data);
    }

    public String getCompressedData() {
        return compressedData;
    }

    public String getDecompressedData() {
        return decompressedData;
    }

    public void compress(String data) {
        String result = "";
        String compressedResult = "";

        if (data.charAt(0) != data.charAt(1)) {
            result = data.charAt(0) + "," + data.charAt(1);
        } else result = "" + data.charAt(0);

        for (int i = 2; i < data.toCharArray().length; i++) {
            if (data.charAt(i) != data.charAt(i - 1)) {
                result += "," + data.charAt(i);
            } else result += data.charAt(i);
        }

        // System.out.println("Result " + result);

        String[] arr = result.split(",");
        for (int i1 = 0; i1 < arr.length; i1++) {
            if (arr[i1].length() == 1) compressedResult += String.valueOf(arr[i1].charAt(0));
            else compressedResult += (arr[i1].length() + String.valueOf(arr[i1].charAt(0)));

        }
        this.compressedData = compressedResult;
        // System.out.println("compressedResult " + compressedResult);
    }

    public void compressSB(String data) {

        StringBuilder stringBuilder = new StringBuilder();

        String result = "";
        String compressedResult = "";

        if (data.charAt(0) != data.charAt(1)) {
            result = data.charAt(0) + "," + data.charAt(1);
        } else result = "" + data.charAt(0);

        if (data.charAt(0) != data.charAt(1)) {
            stringBuilder.append(data.charAt(0))
                    .append(",")
                    .append(data.charAt(1));
        } else stringBuilder.append(data.charAt(0));


        for (int i = 2; i < data.toCharArray().length; i++) {
            if (data.charAt(i) != data.charAt(i - 1)) {
                result += "," + data.charAt(i);
            } else result += data.charAt(i);
        }

        for (int i = 2; i < data.toCharArray().length; i++) {
            if (data.charAt(i) != data.charAt(i - 1)) {
                stringBuilder.append(",")
                        .append(data.charAt(i));
            } else stringBuilder.append(data.charAt(i));
        }

        String[] arr = stringBuilder.toString().split(",");
        stringBuilder.delete(0, stringBuilder.capacity());
        for (int i1 = 0; i1 < arr.length; i1++) {
            if (arr[i1].length() == 1) stringBuilder.append(arr[i1].charAt(0));
            else stringBuilder.append(arr[i1].length()).append(arr[i1].charAt(0));

        }
/*
        for (int i1 = 0; i1 < arr.length; i1++) {
            if (arr[i1].length() == 1) compressedResult += String.valueOf(arr[i1].charAt(0));
            else compressedResult += (arr[i1].length() + String.valueOf(arr[i1].charAt(0)));

        }
        */

        // this.compressedData = compressedResult;
        this.compressedData = stringBuilder.toString();

        // System.out.println("compressedResult " + compressedResult);
    }

    public void decompressData(String compressedString) {
        String decompressedData = "";
        for (int i = 0; i < compressedString.length(); i++) {
            if (Character.isDigit(compressedString.charAt(i))) {
                decompressedData += String.valueOf(compressedString.charAt(i + 1)).repeat(Integer.parseInt(String.valueOf(compressedString.charAt(i))));
            } else {
                decompressedData += String.valueOf(compressedString.charAt(i));
            }
        }
        System.out.println();
        this.decompressedData = decompressedData;
        System.out.println(decompressedData);
    }

    public void decompressDataSB(String compressedString) {
        String decompressedData = "";
        for (int i = 0; i < compressedString.length(); i++) {
            if (Character.isDigit(compressedString.charAt(i))) {
                decompressedData += String.valueOf(compressedString.charAt(i + 1)).repeat(Integer.parseInt(String.valueOf(compressedString.charAt(i))));
            } else {
                decompressedData += String.valueOf(compressedString.charAt(i));
            }
        }
        System.out.println();
        this.decompressedData = decompressedData;
        System.out.println(decompressedData);
    }

    public void compressSB() {
        System.out.println(decompressedData);
        String result = "";

        if (decompressedData.charAt(0) != decompressedData.charAt(1)) {
            result = decompressedData.charAt(0) + "," + decompressedData.charAt(1);
        } else result = "" + decompressedData.charAt(0);

        for (int i = 2; i < decompressedData.toCharArray().length; i++) {
            if (decompressedData.charAt(i) != decompressedData.charAt(i - 1)) {
                result += "," + decompressedData.charAt(i);
            } else result += decompressedData.charAt(i);
        }
        System.out.println();
        System.out.print("Result: ");

        String[] arr = result.split(",");
        for (int i1 = 0; i1 < arr.length; i1++) {
            if (arr[i1].length() == 1) System.out.print(arr[i1].charAt(0));
            else System.out.print(arr[i1].length() + String.valueOf(arr[i1].charAt(0)));

        }
        System.out.println();

    }

    public void compressLevin(String data) {
        // abc -> 1(a)2(b)3(c), abbc -> a2(b)c
        // посчитаем подряд идущие одинаковые буквы
        char[] chars = data.toCharArray();
        int cnt = 1;
        char sym = ' ';
        StringBuilder cD = new StringBuilder();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) { // ArrayIndexOut
                sym = chars[i];
                cnt++;
                if (i == chars.length - 2) {
                    cD.append(cnt)
                            .append('(')
                            .append(sym)
                            .append(')');
                }
            } else {
                if (cnt > 1) {
                    // cnt(sym)
                    cD.append(cnt)
                            .append('(')
                            .append(sym)
                            .append(')');
                    cnt = 1;
                } else {
                    // chars[i]
                    cD.append(chars[i]);
                    cnt = 1;
                }
            }
        }
        if (chars.length <= 1) {
            this.compressedData = cD.toString();
        } else if (chars[chars.length - 1] != chars[chars.length - 2]) {
            cD.append(chars[chars.length - 1]);
        }
        this.compressedData = cD.toString();
    }

    public void compressMy() {
        System.out.println(decompressedData);
        String result = "";

        if (decompressedData.charAt(0) != decompressedData.charAt(1)) {
            result = decompressedData.charAt(0) + "," + decompressedData.charAt(1);
        } else result = "" + decompressedData.charAt(0);

        for (int i = 2; i < decompressedData.toCharArray().length; i++) {
            if (decompressedData.charAt(i) != decompressedData.charAt(i - 1)) {
                result += "," + decompressedData.charAt(i);
            } else result += decompressedData.charAt(i);
        }
        System.out.println();
        System.out.print("Result: ");

        String[] arr = result.split(",");
        for (int i1 = 0; i1 < arr.length; i1++) {
            if (arr[i1].length() == 1) System.out.print(arr[i1].charAt(0));
            else System.out.print(arr[i1].length() + String.valueOf(arr[i1].charAt(0)));

        }
        System.out.println();

    }

    public boolean isEffective(StringCompressor obj) {
        return this.compressedData.length() < this.decompressedData.length();
    }


}