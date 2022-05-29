package harjoitus2;

import java.util.Objects;

public class Range {
    private final Integer between;
    private final Integer first;
    private final Integer second;

    public Range(Integer between, Integer first, Integer second) {
        this.between = between;
        this.first = first;
        this.second = second;
    }

    public Integer getBetween() {
        return between;
    }

    public Integer getFirst() {
        return first;
    }

    public Integer getSecond() {
        return second;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hash(between, first, second);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Range other = (Range) obj;
        return Objects.equals(between, other.between) && Objects.equals(first, other.first)
                && Objects.equals(second, other.second);
    }

}