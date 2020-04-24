package wassouf.ali.ctci.technicalinterview;

import java.util.ArrayList;
import java.util.List;

public class FindPermutation
{
    public List<Integer> findPermutations(String small, String big)
    {
        List<Integer> result = new ArrayList<>();

        int smallLength = small.length();
        int bigLength = big.length();

        int[] frequencyOfCharsInSmall = new int[26];
        int[] frequencyOfCharsInWindow = new int[26];
        for (int i = 0; i < smallLength; i++)
        {
            frequencyOfCharsInSmall[small.charAt(i) - 'a']++;
            frequencyOfCharsInWindow[big.charAt(i) - 'a']++;
        }
        for (int j = smallLength; j < bigLength; j++)
        {
            if (areIdentical(frequencyOfCharsInSmall, frequencyOfCharsInWindow))
            {
                result.add(j - smallLength);
            }
            frequencyOfCharsInWindow[big.charAt(j) - 'a']++;
            frequencyOfCharsInWindow[big.charAt(j - smallLength) - 'a']--;
        }
        if(areIdentical(frequencyOfCharsInSmall, frequencyOfCharsInWindow)){
            result.add(bigLength -smallLength);
        }
        return result;
    }


    private boolean areIdentical(int[] frequencyOfCharsInSmall, int[] frequencyOfCharsInWindow)
    {
        for (int i = 0; i < 26; i++)
        {
            if (frequencyOfCharsInSmall[i] != frequencyOfCharsInWindow[i])
            {
                return false;
            }
        }
        return true;
    }


}
