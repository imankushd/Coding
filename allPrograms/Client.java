import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	private Socket socket=null;
	private DataInputStream input=null;
	private DataOutputStream out=null;
		
	
	public Client(String address, int port)
	{
		System.out.println(address+" >>>>>>> "+port);
	     try
	     {
	    	 socket=new Socket(address,port);
	    	 
	    	 System.out.print("Client connected:\n\n");
	    	 
	    	 input=new DataInputStream(System.in);
	    	 out=new DataOutputStream(socket.getOutputStream());
	     }
	     catch(UnknownHostException e)
	     {
	    	 e.printStackTrace();
	     }
	     catch (IOException e) {
			e.printStackTrace();
		}
	     String line="";
	     
	     while(!line.equals("Over"))
	     {
	    	 try
	            { 
	                line = input.readLine(); 
	                out.writeUTF(line); 
	            } 
	            catch(IOException i) 
	            { 
	                System.out.println(i); 
	            } 
	     }
	     
	     try
	        { 
	            input.close(); 
	            out.close(); 
	            socket.close(); 
	        } 
	        catch(IOException i) 
	        { 
	            System.out.println(i); 
	        } 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Client c=new Client("127.0.0.1",5000);
	}

}
