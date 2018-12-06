package com.example.springboot.Service;

import com.example.springboot.SysUser;
import com.example.springboot.dao.SysUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SysUserService {
    @Autowired
    private SysUserDao sysUserDao;

    public SysUser findUserByUsername(String userName){
        return sysUserDao.findByUsername(userName);
    }
    public List<SysUser> findAll(){
        return sysUserDao.findAll();

    }
    public SysUser saveUser(SysUser sysUser){
        return sysUserDao.save(sysUser);
    }
    public SysUser findById(Long id){

        SysUser user=sysUserDao.findById(id).get();
        return user;
    }
    public SysUser updateUser(SysUser sysUser){
        return sysUserDao.saveAndFlush(sysUser);
    }
    public void  deleteUser(Long id){
        sysUserDao.deleteById(id);
    }




}
