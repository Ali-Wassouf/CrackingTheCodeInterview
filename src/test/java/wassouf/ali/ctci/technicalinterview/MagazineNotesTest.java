package wassouf.ali.ctci.technicalinterview;

import org.junit.Assert;
import org.junit.Test;

public class MagazineNotesTest
{
    MagazineNotes magazineNotes = new MagazineNotes();

    @Test
    public void whenFindingNoteReturnTrue(){
        Assert.assertTrue(magazineNotes.canBeFormedFromMagazine("agfjguyjhfgdhtasdfgrdsgdbdrtgdhtb","aabb"));
    }

    @Test
    public void whenFindingNoteReturnFalse(){
        Assert.assertFalse(magazineNotes.canBeFormedFromMagazine("adbfghjkmlahjhdajjdlkeonanbdjbnejnaljdskmn","qqq"));

    }
}