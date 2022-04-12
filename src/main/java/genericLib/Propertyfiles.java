package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyfiles 
{
	public String getdata(String key) throws IOException
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(Autoconstant.propertyfilePath);
		p.load(fis);
		return p.getProperty(key);
	}
}
