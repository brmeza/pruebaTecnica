package org.bmsoft.pruebatecnica.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ErrorResponse {
    private String errorCode;
    private String errorMessage;
}