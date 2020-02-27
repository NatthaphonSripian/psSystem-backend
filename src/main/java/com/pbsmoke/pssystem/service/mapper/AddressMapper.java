package com.pbsmoke.pssystem.service.mapper;

import com.pbsmoke.pssystem.data.entity.Address;
import com.pbsmoke.pssystem.data.entity.dto.AddressDto;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {

    public AddressDto maperAddressToDto(Address address){
        AddressDto  dto = new AddressDto();
        if(address != null) {
            dto.setId(address.getId());
        }
        return dto;
    }
}
