package com.example.springboot.Controller;

import com.example.springboot.Service.SysUserService;
import com.example.springboot.SysUser;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@RequestMapping(value = "/sysuser")

@RestController
public class SysUserController {
    @Autowired
    SysUserService sysUserService;

    @ApiOperation(value = "用户列表",notes = "用户列表")
    @RequestMapping(value = {""},method = RequestMethod.GET)
    public List<SysUser> getUsers(){
        List<SysUser> list=sysUserService.findAll();
        return list;
    }

    @ApiOperation(value = "保存用户",notes = "创建用户")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public SysUser postUser(@RequestBody SysUser user){
        return  sysUserService.saveUser(user);
    }

    @ApiOperation(value = "获取用户信息",notes = "根据url的id获取详细用户信息")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public SysUser getUser(@PathVariable Long id){
        return sysUserService.findById(id);
    }
    @ApiOperation(value = "更新信息",notes = "根据url的id来制定更新用户信息")
    @RequestMapping(value = "{id}",method = RequestMethod.PUT)
    public SysUser putUser(@PathVariable Long id,@RequestBody SysUser user){
        user.setId(id);
        return  sysUserService.updateUser(user);
    }
    @ApiOperation(value = "删除用户",notes = "根据url的id来制定删除用户")
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id){
        sysUserService.deleteUser(id);
        return "success";
    }
    @ApiIgnore//忽略这个api
    @GetMapping(value = "/{username}")
    public SysUser getSysUser(@PathVariable("username") String username){
        return sysUserService.findUserByUsername(username);
    }
}
