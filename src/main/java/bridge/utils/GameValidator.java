package bridge.utils;

import bridge.constants.ErrorMessageType;

import java.util.IllegalFormatException;

public class GameValidator {

    public static void checkedBridgeLength(int bridgeLength) {
        if (bridgeLength < 3 || bridgeLength > 20) {
            throw new IllegalArgumentException(ErrorMessageType.ERROR_BRIDGE_LENGTH.getMessage());
        }
    }

    public static int checkedBridgeLengthFormat(String rawBridgeLength) {
        try {
            return Integer.parseInt(rawBridgeLength);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessageType.ERROR_INVALID_BRIDGE_LENGTH_FORMAT.getMessage());
        }
    }

    public static void checkedInputMoveCommand(String clientInput) {
        if (!clientInput.equals("U") && !clientInput.equals("D")) {
            throw new IllegalArgumentException(ErrorMessageType.ERROR_INVALID_MOVE_COMMAND.getMessage());
        }
    }

    public static void checkedInputRestartCommand(String clientInput) {
        if (!clientInput.equals("R") && !clientInput.equals("Q")) {
            throw new IllegalArgumentException(ErrorMessageType.ERROR_INVALID_RESTART_COMMAND.getMessage());
        }
    }

}
