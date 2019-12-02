import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Collectors;

public class Java11Features {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="    aa     ";
		
		//isBlank() method
		System.out.println(s.isBlank());
		
		//strip(), stripTrailing(), stripLeading() method
		System.out.println(s.strip());
		System.out.println(s.stripTrailing());
		System.out.println(s.stripLeading());
		
		//Lines() method
		String str = "JD\nJD\nJD"; 
        System.out.println(str);
        System.out.println(str.lines().collect(Collectors.toList()));
        
        //repeat(n) method
        String ss="Ankush";
        System.out.println(ss.repeat(2));
        
        //File new methods
        Path filePath = Paths.get("C:\\Users\\ankush.dhingra\\", "Desktop", "test.txt");
        
        try
        {
            //Write content to file
            Files.writeString(filePath, "Hello World !!", StandardOpenOption.APPEND); //StandardOpenOption.APPEND is used to append each time code runs
 
            //Verify file content
            String content = Files.readString(filePath);
 
            System.out.println(content);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
        //var types
        
	}

}
