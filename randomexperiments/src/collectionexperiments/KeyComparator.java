package collectionexperiments;

import java.util.Comparator;

public class KeyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer key1, Integer key2) {
       int compare=key1.intValue()-key2.intValue();
       return compare;
    }
}
