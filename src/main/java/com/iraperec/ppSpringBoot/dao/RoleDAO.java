package com.iraperec.ppSpringBoot.dao;


import com.iraperec.ppSpringBoot.model.Role;

import java.util.List;

public interface RoleDAO{
    List<Role> getRoles();
    Role findByName(String name);
}
