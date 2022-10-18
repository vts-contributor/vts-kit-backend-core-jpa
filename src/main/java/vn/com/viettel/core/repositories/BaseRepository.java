package vn.com.viettel.core.repositories;

import vn.com.viettel.core.dto.BaseResultSelect;

import java.util.HashMap;
import java.util.List;

public interface BaseRepository {

    BaseResultSelect getListDataAndCount(StringBuilder queryString, HashMap<String, Object> hmapParams, Integer startPage, Integer pageLoad, Class<?> classOfT);

    List<? extends Object> getListData(StringBuilder queryString, HashMap<String, Object> hmapParams, Integer startPage, Integer pageLoad, Class<?> classOfT);

    Object getFirstData(StringBuilder queryString, HashMap<String, Object> hmapParams, Class<?> classOfT);

    int getCountData(StringBuilder queryString, HashMap<String, Object> hmapParams);

    int getCountDataInSelect(StringBuilder queryString, HashMap<String, Object> hmapParams);

    Boolean executeSqlDatabase(StringBuilder queryString, HashMap<String, Object> hmapParams);
}
