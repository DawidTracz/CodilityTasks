/**
 * Created by User on 28.03.2017.
 */
public class run {







    public static void main (String[] args) {
        for(long l=4946144450195624l; l>0; l>>=5)
            System.out.print((char) (((l & 31 | 64) % 95) + 32));
    }
}




