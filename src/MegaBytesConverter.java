public class MegaBytesConverter
{
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
