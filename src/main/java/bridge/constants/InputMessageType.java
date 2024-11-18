package bridge.constants;

public enum InputMessageType {

    INPUT_BRIDGE_LENGTH("다리의 길이를 입력해주세요.");

    private final String message;

    InputMessageType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}