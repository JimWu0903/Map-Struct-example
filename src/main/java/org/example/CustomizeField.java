package org.example;

import org.mapstruct.Mapper;
import org.mapstruct.Named;


@Mapper
public class CustomizeField {

    @Named("formatRocDate")
    public String formatRocDate(String dateTime) {
        return "Data: " + dateTime + " (ROC)";
    }

}
