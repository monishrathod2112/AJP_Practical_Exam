import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

public class Practical_15_ServerSide 
{
    public static void main(String[] args) throws Exception 
	{
        Socket s = new Socket("localhost", 2024);
        
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        OutputStream out = s.getOutputStream();
        PrintStream ps = new PrintStream(out);
        
        BufferedReader br1 = new BufferedReader(
            new InputStreamReader(s.getInputStream())
        );
        
        do {
            System.out.print("Client: ");
            String msg = br.readLine();
            ps.println(msg); 
            
            String res = br1.readLine(); 
            System.out.println("Server Sent: " + res);
        } while (true);
    }
}
