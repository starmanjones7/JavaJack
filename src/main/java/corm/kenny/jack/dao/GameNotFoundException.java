package corm.kenny.jack.dao;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Board does not exist")  // 404
public class GameNotFoundException extends RuntimeException {

}
