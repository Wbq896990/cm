package cn.josh.cm.service.impl;

import cn.josh.cm.mapper.GuestMapper;
import cn.josh.cm.mapper.GuestMapperCustom;
import cn.josh.cm.po.Guest;
import cn.josh.cm.po.GuestCustom;
import cn.josh.cm.po.GuestQueryVo;
import cn.josh.cm.service.GuestService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: Josh.Wang
 * @Description:客户接口实现类
 * @Date: Created in 13:41 2018/6/5
 * @Modified By:
 */
public class GuestServiceImpl implements GuestService {
    @Autowired
    private GuestMapperCustom guestMapperCustom;

    @Autowired
    private GuestMapper guestMapper;

    /**
     * @Author: Josh.Wang
     * @Param: guestQueryVo guest类包装对象
     * @Description:查询客户列表方法
     * @Date: Created in 16:57 2018/6/6
     * @Modified By:
    */
    public List<GuestCustom> findGuestList(GuestQueryVo guestQueryVo) throws Exception {
        return guestMapperCustom.findGuestList(guestQueryVo);
    }

    /**
     * @Author: Josh.Wang
     * @Param: id
     * @Description:根据id查询客户方法
     * @Date: Created in 16:58 2018/6/6
     * @Modified By:
    */
    @Override
    public GuestCustom findGuestById(Integer id) throws Exception {
        Guest guest = guestMapper.selectByPrimaryKey(id);
        GuestCustom guestCustom= new GuestCustom();
        //将guest中的属性拷贝到guestCustom中
        BeanUtils.copyProperties(guest,guestCustom);
        return guestCustom;
    }


    /**
     * @Author: Josh.Wang
     * @Param: * @param id *@param guestCustom
     * @Description:根据id更新客户信息方法
     * @Date: Created in 16:59 2018/6/6
     * @Modified By:
    */
    @Override
    public void updateGuestById(Integer id, GuestCustom guestCustom) throws Exception {
        //为避免guestCustom中没有id，这里我们将id设置进去
        guestCustom.setId(id);
        guestMapper.updateByPrimaryKey(guestCustom);
    }

    /**
     * @Author: Josh.Wang
     * @Param:id
     * @Description:根据id删除客户信息
     * @Date: Created in 16:24 2018/6/11
     * @Modified By:
    */
    @Override
    public void deleteGuestById(Integer id) throws Exception {
        guestMapper.deleteByPrimaryKey(id);
    }

    /**
     * @Author: Josh.Wang
     * @Param:guestCustom客户信息
     * @Description:添加新客户
     * @Date: Created in 13:22 2018/6/12
     * @Modified By:
    */
    @Override
    public void insertGuest(GuestCustom guestCustom) throws Exception {
        guestMapper.insert(guestCustom);
    }


}
