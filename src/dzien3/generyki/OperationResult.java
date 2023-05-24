package dzien3.generyki;

public class OperationResult<T> {

    private final boolean success;
    private final T result;
    private String errorMessage;

    public OperationResult(boolean success, String errorMessage, T result) {
        this.success = success;
        this.result = result;
        this.errorMessage = errorMessage;
    }

    public OperationResult(boolean success, T result) {
        this.success = success;
        this.result = result;
    }

    public OperationResult(T result) {
        this.success = true;
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public T getResult() {
        return result;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
