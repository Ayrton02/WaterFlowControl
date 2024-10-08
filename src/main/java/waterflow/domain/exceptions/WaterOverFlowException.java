package waterflow.domain.exceptions;

import core.exception.BaseException;

public class WaterOverFlowException extends BaseException {
    public WaterOverFlowException(String message) {
        super(message, ExceptionCodes.WATER_OVERFLOW.name(), 400);
    }
}
