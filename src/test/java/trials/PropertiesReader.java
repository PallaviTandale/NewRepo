package trials;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	
	public void LoadProperties() throws IOException
	{
		FileReader reader=new FileReader("extent.properties");
		Properties p= new Properties();
		p.load(reader);
	}

}
