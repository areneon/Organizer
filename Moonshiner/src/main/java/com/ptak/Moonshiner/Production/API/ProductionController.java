package com.ptak.Moonshiner.Production.API;

import com.ptak.Moonshiner.Production.Model.Production;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/production")
public class ProductionController {

    @RequestMapping("/{productionId}")
    public Production getProduction(@PathVariable("productionId") int productionId) {
        return new Production(productionId, 3.0, new Date());
    }

    @RequestMapping("/all")
    public List<Production> getAll() {
        return Arrays.asList(new Production(1, 2.0, new Date()),
                new Production(2, 4.0, new Date()),
                new Production(3, 5.0, new Date()));
    }
}
