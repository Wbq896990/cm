package cn.josh.cm.controller.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: Josh.Wang
 * @Description:
 * @Date: Created in 16:55 2018/6/14
 * @Modified By:
 */
public class CustomDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            //转换成功，直接返回
            return sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //参数绑定失败，返回空
        return null;
    }
}
