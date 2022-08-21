public class Worker {
    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }
    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError (String result);
    }

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallBack;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallBack) {
        this.errorCallBack = errorCallBack;
        this.callback = callback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallBack.onError("Task " + i + " is failed");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }

}
