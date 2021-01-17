package com.ark;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping(value ="/api/test", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK) //정상적으로 결과를 주겠다.
    public String getApiTest() {

        return "{\"result\" : \"배건호\"}";
    }

    @RequestMapping(value ="/api/test2", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK) //정상적으로 결과를 주겠다.
    public String getApiTest2() {

        return "{\"result\" : \"이재현\"}";
    }

    //localhost:8080/api/test
}
