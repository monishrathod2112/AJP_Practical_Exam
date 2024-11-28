import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
 
public class Practical_15_ClientSide
{
    public static void main(String[] args) throws IOException 
	{     
        Socket s = new Socket("localhost",2024);
 
        System.out.println("Client Started, waiting for server response..");
         
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
 
        OutputStream os = s.getOutputStream();
 
 
        BufferedReader br1 = new BufferedReader(
            new InputStreamReader(s.getInputStream())
            );
 
        PrintStream ps = new PrintStream(os);
 
        do{
            System.out.print("Client: ");
            String msg = br.readLine();
 
            ps.println(msg);
 
            String res = br1.readLine();
 
            System.out.println("Server Send:"+res+"\n\n");
        }
        while(true);
         
    }
}