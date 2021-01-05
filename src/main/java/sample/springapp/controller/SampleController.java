package sample.springapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sample.springapp.service.SampleService;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(produces = "application/Text")
public class SampleController {

    @Autowired
    SampleService sampleService;

    @GetMapping(value = "/get")
    public ResponseEntity<?> routeController(HttpServletRequest request){
        return new ResponseEntity<String>(sampleService.routeParser(request), HttpStatus.ACCEPTED);
    }
}
