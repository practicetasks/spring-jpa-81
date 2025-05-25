package com.practice.springjpa81.dto;

import com.practice.springjpa81.model.Category;
import com.practice.springjpa81.model.Option;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static com.practice.springjpa81.dto.CategoryFullDto.OptionDto;

@Component
public class CategoryMapper {
    public CategoryFullDto toFullDto(Category category) {
        CategoryFullDto dto = new CategoryFullDto();
        dto.setId(category.getId());
        dto.setName(category.getName());

        List<OptionDto> list = new ArrayList<>();
        for (Option option : category.getOptions()) {
            OptionDto optionDto = new OptionDto();
            optionDto.setId(option.getId());
            optionDto.setName(option.getName());
            list.add(optionDto);
        }
        dto.setOptions(list);

        return dto;
    }

    public CategoryShortDto toShortDto(Category category) {
        CategoryShortDto dto = new CategoryShortDto();
        dto.setId(category.getId());
        dto.setName(category.getName());
        return dto;
    }
}
