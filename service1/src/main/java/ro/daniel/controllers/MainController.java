package ro.daniel.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by root on 29.07.2017.
 */
@RestController
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<String> main() {

        return Arrays.asList("BMW", "Mercedes",
                "Opel", "Ferrari");
    }
}
