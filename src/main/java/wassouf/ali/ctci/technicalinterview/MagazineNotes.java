package wassouf.ali.ctci.technicalinterview;

public class MagazineNotes
{
    public boolean canBeFormedFromMagazine(String magazine, String note)
    {
        int[] frequencyOfCharsInNote = new int[26];
        int[] frequencyOfCharsInMagazine = new int[26];
        for (int i = 0; i < note.length(); i++)
        {
            frequencyOfCharsInNote[note.charAt(i) - 'a']++;
        }
        for (int i = 0; i < magazine.length(); i++)
        {
            frequencyOfCharsInMagazine[magazine.charAt(i) - 'a']++;
        }
        for (char c : note.toCharArray())
        {
            if (frequencyOfCharsInMagazine[c - 'a'] != frequencyOfCharsInNote[c - 'a'])
            {
                return false;
            }
        }
        return true;
    }
}
