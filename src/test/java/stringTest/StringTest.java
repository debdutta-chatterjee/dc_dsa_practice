package stringTest;

import com.dsa.strings.EncodeTheMessage;
import com.dsa.strings.ReverseStringWordWise;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringTest
{
    @Test
    public void reverseStringWordWise()
    {
        Assert.assertEquals(ReverseStringWordWise.reverseStringWordWise(
                "Hello I am Shreyashish Sengupta"),
                "Sengupta Shreyashish am I Hello");

        Assert.assertEquals(ReverseStringWordWise.reverseStringWordWise(
                        "emocleW ot gnidoC sajniN"),
                "sajniN gnidoC ot emocleW");

        Assert.assertEquals(ReverseStringWordWise.reverseStringWordWise(
                        "The moon shines brightly at night"),
                "night at brightly shines moon The");

        Assert.assertEquals(ReverseStringWordWise.reverseStringWordWise(
                        "eye of the tiger"),
                "tiger the of eye");
    }

    @Test
    public void encodeTheMessage()
    {
        Assert.assertEquals(EncodeTheMessage.encode(
                        "aabbc"),
                "a2b2c1");

        Assert.assertEquals(EncodeTheMessage.encode(
                        "abbdcaas"),
                "a1b2d1c1a2s1");
    }
}
