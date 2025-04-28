public class OptimizedStringProcessing {
    static final int COUNT = 100_000;
    public static void main(String[] args) {
        long stringTime = testString();
        long builderTime = testStringBuilder();
        long bufferTime = testStringBuffer();

        System.out.println("Appending 100,000 times using String took: " + stringTime + "ms");
        System.out.println("Appending 100,000 times using StringBuilder took: " + builderTime + "ms");
        System.out.println("Appending 100,000 times using StringBuffer took: " + bufferTime + "ms");

        String fastest = (stringTime < builderTime && stringTime < bufferTime) ? "String"
                          : (builderTime < bufferTime) ? "StringBuilder"
                          : "StringBuffer";
        System.out.println("Fastest method: " + fastest);
    }

    static long testString() {
        long start = System.nanoTime();
        String str = "";
        for (int i = 0; i < COUNT; i++) {
            str += "Java";
        }
        long end = System.nanoTime();
        return (end - start) / 1_000_000;
    }

    static long testStringBuilder() {
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < COUNT; i++) {
            sb.append("Java");
        }
        long end = System.nanoTime();
        return (end - start) / 1_000_000;
    }

    static long testStringBuffer() {
        long start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < COUNT; i++) {
            sbf.append("Java");
        }
        long end = System.nanoTime();
        return (end - start) / 1_000_000;
    }
}
