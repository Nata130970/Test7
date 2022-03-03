
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;

import java.lang.annotation.Inherited;

public class SettingTest {

    @BeforeTest
    @BeforeGroups("food")
    public void startSetting(){
        Fauna.faunaInit();
    }

}