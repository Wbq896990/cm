package cn.josh.cm.mapper;

import cn.josh.cm.po.GuestCustom;
import cn.josh.cm.po.GuestQueryVo;

import java.util.List;


public interface GuestMapperCustom {
    List<GuestCustom> findGuestList(GuestQueryVo guestQueryVo) throws Exception;
}
