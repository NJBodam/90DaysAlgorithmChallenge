package sub.comparable;

class Rating implements Comparable<Rating> {
    private int upVotes;
    private int downVotes;

    public int getUpVotes() {
        return upVotes;
    }

    public void setUpVotes(int upVotes) {
        this.upVotes = upVotes;
    }

    public int getDownVotes() {
        return downVotes;
    }

    public void setDownVotes(int downVotes) {
        this.downVotes = downVotes;
    }

    @Override
    public int compareTo(Rating rating) {
        // write your code here
        if (upVotes - downVotes == rating.upVotes - rating.downVotes) {
            return 0;
         } else if (upVotes - downVotes < rating.upVotes - rating.downVotes) {
            return -1;
         } else {
            return 1;
         }

//        if (nominalValue == other.nominalValue) {
//            return 0;
//        } else if (nominalValue < other.nominalValue) {
//            return -1;
//        } else {
//            return 1;
//        }

    }
}