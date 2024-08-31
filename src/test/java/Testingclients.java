import AppAuth.login;
import AppAuth.logout;
import clientmanagment.Addclient;
import clientmanagment.Clientactions;
import clientmanagment.Searchclient;
import org.testng.annotations.*;

public class Testingclients {
    @BeforeMethod
    public static void login()
    {
        login.login1();

    }

    @Test(priority = 1, dataProvider ="test_data")
    public static void Addclientvaliddata(String clientname, String updateName)
    //this method runs for the first test
    {
        //Adding test data to test
        String Clientname =clientname;
        String updatename=updateName;
        //run test
       Addclient.addClient(clientname);
       Searchclient.search(Clientname);
        Clientactions.edit(updateName);
    }

    @Test (priority = 2)
    public static void Addclientvaliddata2()
    {
        String Clientname ="Ahmed";
        String updatename=" Ahmed Mohamed";
        Addclient.addClient(Clientname);
        Searchclient.search(Clientname);
        Clientactions.edit(updatename);
    }

    @DataProvider
    public String[][] test_data()
    {
        return new String[][] //return table
                {
                        //username updatename
                        {"Alaa" , "Alaa Abdellatif"}
                };
    }
    @AfterMethod
    public static void logout()
    {
        logout.logout1();
    }
}
