import java.net.InetAddress;
import java.net.UnknownHostException;

public class Practical_13 
{
    public static void main(String[] args) 
	{
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host: " + localHost);
            System.out.println("Local Host Name: " + localHost.getHostName());
            System.out.println("Local IP Address: " + localHost.getHostAddress());

            InetAddress google = InetAddress.getByName("www.google.com");
            System.out.println("\nGoogle Host: " + google);
            System.out.println("Google Host Name: " + google.getHostName());
            System.out.println("Google IP Address: " + google.getHostAddress());

            InetAddress[] allGoogleAddresses = InetAddress.getAllByName("www.google.com");
            System.out.println("\nAll Google IP Addresses:");
			
            for (InetAddress address : allGoogleAddresses) 
			{
                System.out.println(address);
            }

            InetAddress ipAddress = InetAddress.getByName("8.8.8.8");
            System.out.println("\nAddress from IP: " + ipAddress);
            System.out.println("Host Name for IP 8.8.8.8: " + ipAddress.getHostName());
            } 
		
		catch (UnknownHostException e) 
		{
            System.out.println("Host not found: " + e.getMessage());
        }
    }
}
