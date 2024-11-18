package bridge.constants;

public enum ErrorMessageType {

    ERROR_BRIDGE_LENGTH("[ERROR] 다리 길이는 3~20 사이의 숫자만 가능합니다. 다시 입력 해주세요."),
    ERROR_INVALID_BRIDGE_LENGTH_FORMAT("[ERROR] 올바르지 않은 다리 길이 형식입니다. 다시 입력 해주세요.");

    private final String message;

    ErrorMessageType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
