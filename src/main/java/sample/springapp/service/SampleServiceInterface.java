package sample.springapp.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public interface SampleServiceInterface {
    String routeParser(HttpServletRequest request);
}
