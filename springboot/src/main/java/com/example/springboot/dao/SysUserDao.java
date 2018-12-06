package com.example.springboot.dao;

import com.example.springboot.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserDao extends JpaRepository<SysUser,Long> {
    SysUser findByUsername(String username);
}
