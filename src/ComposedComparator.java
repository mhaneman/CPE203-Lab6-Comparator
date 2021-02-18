import java.util.Comparator;

public class ComposedComparator implements Comparator<Song>
{
    private Comparator<Song> c1;
    private Comparator<Song> c2;
    public ComposedComparator(Comparator<Song> c1, Comparator<Song> c2)
    {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(Song o1, Song o2)
    {
        if (c1.compare(o1, o2) == 0)
            return c2.compare(o1, o2);
        return c1.compare(o1, o2);
    }
}
