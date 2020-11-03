package course;

public class MaxSizeExceededException extends Exception {
    private static final long serialVersionUID = 1L;
    private int size;

    public MaxSizeExceededException(int size){
        this.size = size;
    }
    public int getSize(){
        return size;
    }
}
