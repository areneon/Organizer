package com.ptak.Organizer.Moonshine.Api;

import com.ptak.Organizer.Moonshine.Model.Production;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/production")
public class ProductionController {



    @RequestMapping("/all")
    public List<Production> getProductions(){
        RestTemplate restTemplate = new RestTemplate();
       List<Production> allProductions = Arrays.asList( restTemplate.getForObject("http://localhost:8082/production/all", Production[].class));
        return allProductions;
    }
}
