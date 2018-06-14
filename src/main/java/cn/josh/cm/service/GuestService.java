package cn.josh.cm.service;

import cn.josh.cm.po.GuestCustom;
import cn.josh.cm.po.GuestQueryVo;

import java.util.List;


public interface GuestService {
    //查询客户列表
    List<GuestCustom> findGuestList(GuestQueryVo guestQueryVo) throws Exception;

    //根据id查询客户信息
    GuestCustom findGuestById(Integer id) throws Exception;

    //根据id修改客户信息
    void updateGuestById(Integer id, GuestCustom guestCustom) throws Exception;

    //根据id删除客户
    void deleteGuestById(Integer id)throws Exception;

    //添加新客户
    void insertGuest(GuestCustom guestCustom)throws Exception;
}
