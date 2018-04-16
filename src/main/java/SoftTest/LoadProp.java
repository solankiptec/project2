package SoftTest;

import jdk.nashorn.internal.runtime.regexp.joni.Config;

import javax.annotation.Resources;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static org.testng.reporters.jq.BasePanel.C;

/**
 * Created by Welcome on 07/08/2017.
 */
public class LoadProp extends BasePage
{
    static Properties prop;
    static String fielName="Config.properties";
    static String filelocation="src\\test\\Resources\\";
    static FileInputStream input;

    public String getProperty(String key)
    {
        prop=new Properties();
        try
        {
            input=new FileInputStream(filelocation+fielName);
            prop.load(input);
            input.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }

}
