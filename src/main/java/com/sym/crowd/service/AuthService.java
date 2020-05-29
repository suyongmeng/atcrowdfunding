package com.sym.crowd.service;

import com.sym.crowd.entity.Auth;

import java.util.List;
import java.util.Map;

public interface AuthService {

    List<Auth> getAll();

    List<Integer> getAssignedAuthIdByRoleId(Integer roleId);

    void saveRoleAuthRelathinship(Map<String, List<Integer>> map);

    List<String> getAssignedAuthNameByAdminId(Integer adminId);

}

