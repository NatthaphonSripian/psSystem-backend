package com.pbsmoke.pssystem.service.mapper;

import com.pbsmoke.pssystem.data.entity.Address;
import com.pbsmoke.pssystem.data.entity.dto.AddressDto;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {

    public AddressDto maperAddressToDto(Address address) {
        AddressDto dto = new AddressDto();
        if (address != null) {
            dto.setId(address.getId());
            dto.setAddressType(address.getAddressType());
            dto.setAddressName(address.getAddressName());
            dto.setAddressNo(address.getAddressNo());
            dto.setGroupNo(address.getGroupNo());
            dto.setBuilding(address.getBuilding());
            dto.setRoomNo(address.getRoomNo());
            dto.setFloorNo(address.getFloorNo());
            dto.setVillage(address.getVillage());
            dto.setLane(address.getLane());
            dto.setStreet(address.getStreet());
            dto.setDistrict(address.getDistrict());
            dto.setAmphur(address.getAmphur());
            dto.setProvince(address.getProvince());
            dto.setPostalCode(address.getPostalCode());
            dto.setCountry(address.getCountry());
            dto.setContactName(address.getContactName());
            dto.setMobilePhone(address.getMobilePhone());
            dto.setPhone1(address.getPhone1());
            dto.setPhone2(address.getPhone2());
            dto.setPhone3(address.getPhone3());
            dto.setFax(address.getFax());
            dto.setEmail1(address.getEmail1());
            dto.setEmail2(address.getEmail2());
            dto.setRemark(address.getRemark());
//            dto.setCreatedBy(address.getCreatedBy());
//            dto.setCreatedDate(address.getCreatedDate());
//            dto.setEditBy(address.getEditBy());
//            dto.setEditDate(address.getEditDate());
        }
        return dto;
    }
}
