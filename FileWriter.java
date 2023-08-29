import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter
{
    public String reader(String inputFile) throws IOException
    {
        File file = new File(inputFile);
        StringBuilder str = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(file));
        while (br.ready())
        {
            str.append(br.read());
        }
        br.close();
        return str.toString();
    }
    public void writer(String str) throws IOException
    {
        PrintWriter pw = new PrintWriter("fileOut.txt");
        pw.println(str);
        pw.close();
    }
}