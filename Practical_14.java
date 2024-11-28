import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class Practical_14 
{
    public static void main(String[] args) 
	{
        try {
            URI uri = new URI("https://www.example.com"); 
            URL url = uri.toURL(); 
            URLConnection urlConnection = url.openConnection();

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("File: " + url.getFile());

            urlConnection.connect();

            System.out.println("\n--- Header Information ---");
            System.out.println("Content-Type: " + urlConnection.getContentType());
            System.out.println("Content-Length: " + urlConnection.getContentLength());
            System.out.println("Date: " + urlConnection.getHeaderField("Date"));
            System.out.println("Server: " + urlConnection.getHeaderField("Server"));

            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            System.out.println("\n--- Content from URL ---");
            while ((line = reader.readLine()) != null) 
			{
                System.out.println(line);
            }

                reader.close();
            } 
		catch (Exception e) 
		{
            e.printStackTrace();
        }
    }
}
