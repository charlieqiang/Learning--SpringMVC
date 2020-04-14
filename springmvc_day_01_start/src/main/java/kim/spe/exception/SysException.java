package kim.spe.exception;

import org.springframework.stereotype.Controller;

/**
 * @author charlie
 * @date 2020/4/14 - 17:39
 * @description
 */

public class SysException extends Exception{
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SysException(String message) {
        this.message = message;
    }
}
