package it.Develhope.ApiPrimiPassi.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/string")
public class StringController {

    @GetMapping(value = "/getString")
    public String getString(@RequestParam String mandatory, @RequestParam(required = false)  String optional){
        String concat= mandatory + optional;
        if(optional == null){
            concat= mandatory;
        }
        return "La Stringa concatenata e': " + concat;
    }
}
