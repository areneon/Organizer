package com.ptak.Moonshiner.Production.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Production {
    private int id;
    private double liters;
    private Date date;

    public Production() {
    }
}
