public class main {
    public static void main(String[] args) {
       // MegaBytesConverter.printMegaBytesAndKiloBytes(5000);

        printMegaBytesAndKiloBytes(1024);

    }
    public static void printMegaBytesAndKiloBytes (int kiloBytes)
    {
        if (kiloBytes < 0)
        {
            System.out.println("Invalid Value");

        }
        else
        {
            int a = (kiloBytes / 1024);
            int b = (kiloBytes % 1024 );
            System.out.println(kiloBytes + " KB = " + a + " MB and "  + b + " KB");




        }
    }
}
