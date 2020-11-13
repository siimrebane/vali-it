package ee.bcs.valiit.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExcptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<Object> handleApplicationException(Exception e){
        System.out.println("juhtus viga");
        return new ResponseEntity<>(new ErrorResponse(e.getMessage()),
                new HttpHeaders(),
                HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleError(Exception e){
        e.printStackTrace();
        return new ResponseEntity<>(new ErrorResponse("Server error"),
                new HttpHeaders(),
                HttpStatus.I_AM_A_TEAPOT);
    }
}
