package bridge.constants;

public enum InputMessageType {

    INPUT_GAME_START("다리 건너기 게임을 시작합니다.\n"),
    INPUT_BRIDGE_LENGTH("다리의 길이를 입력해주세요."),
    INPUT_MOVE_COMMAND("\n이동할 칸을 선택해주세요. (위: U, 아래: D)");

    private final String message;

    InputMessageType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}