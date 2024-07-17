package org.example;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;



@Mapper(uses = CustomizeField.class)
public interface SourceTargetMapper {
    SourceTargetMapper INSTANCE = Mappers.getMapper(SourceTargetMapper.class);

    @Mapping(source = "dateTime", target = "rocDate", qualifiedByName = "formatRocDate")
    Target sourceToTarget(Source source);
}