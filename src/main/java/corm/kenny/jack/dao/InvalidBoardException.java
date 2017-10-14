package corm.kenny.jack.dao;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="Invalid Board")  // 400
public class InvalidBoardException extends RuntimeException {

}
