package vn.com.viettel.core.dto;

import lombok.Data;

import java.util.List;

@Data
public class BaseResultSelect {
    List<? extends Object> listData;
    Object count;
}
