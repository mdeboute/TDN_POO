package course;

public class MaxSizeExceededException extends Exception {
    private static final long serialVersionUID = 1L;
    private final int size;

    public MaxSizeExceededException(int size){
        this.size = size;
    }

    @Override
    public String toString() {
        return "MaxSizeExceededException{" +
                "size=" + size +
                '}';
    }

    public int getSize(){
        return size;
    }
}
