package cn.josh.cm.po;

/**
 * @Author: Josh.Wang
 * @Description:客户包装对象
 * @Date: Created in 15:47 2018/6/5
 * @Modified By:
 */
public class GuestQueryVo {

    //客户信息
    private Guest guest;

    //为了系统的可扩展性，我们一般对原始生成的po扩展
    private GuestCustom guestCustom;

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public GuestCustom getGuestCustom() {
        return guestCustom;
    }

    public void setGuestCustom(GuestCustom guestCustom) {
        this.guestCustom = guestCustom;
    }
}
