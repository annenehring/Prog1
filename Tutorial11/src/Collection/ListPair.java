package Collection;

import java.util.List;

public class ListPair {

    List<Integer> first;
    List<Integer> second;

    ListPair(List<Integer> first, List<Integer> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "ListPair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
