package wassouf.ali.ctci.technicalinterview;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutationOfString
{
    public List<String> print(String string)
    {
        if (string.isEmpty())
        {
            return null;
        }
        List<String> result = new ArrayList<>();
        print(string, "", result);
        return result;
    }


    private void print(String string, String prefix, List<String> result)
    {
        if(string.isEmpty()){
            result.add(prefix);
        }
        for(int i = 0; i< string.length(); i++){
            String remainingString = string.substring(0,i)+string.substring(i+1);
            print(remainingString, prefix+string.charAt(i),result);
        }
    }

}
