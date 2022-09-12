package algorithm.binary_search;

import java.util.List;

public class BinarySearch {

    public List<Integer> inputList;

    public Integer low;

    public Integer high;

    public BinarySearch(List<Integer> inputList) {
        this.inputList = inputList;
        this.low = 0;
        this.high = inputList.size() - 1;
    }

    public Integer search(Integer item) {
        int mid;
        int guess;

        while (this.low <= this.high) {
            mid = Math.floorDiv(this.low + this.high, 2);
            guess = this.inputList.get(mid);

            if (guess == item) {
                return mid;
            }

            if (guess > item) {
                this.high = mid - 1;
            } else {
                this.low = mid + 1;
            }
        }
        return null;
    }


}
