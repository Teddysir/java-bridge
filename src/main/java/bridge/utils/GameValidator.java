package bridge.utils;

import bridge.constants.ErrorMessageType;

public class GameValidator {

    public static void checkedBridgeLength(int bridgeLength) {
        if (bridgeLength < 3 || bridgeLength > 20) {
            throw new IllegalArgumentException(ErrorMessageType.ERROR_BRIDGE_LENGTH.getMessage());
        }
    }

}
