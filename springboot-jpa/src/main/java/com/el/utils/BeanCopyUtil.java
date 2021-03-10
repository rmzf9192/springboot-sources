package com.el.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * 功能说明
 * </p >
 *
 * @author Roman.Zhang
 * @date 2020/7/9
 */
public class BeanCopyUtil {
    //source中的非空属性复制到target中
    public static <T> void beanCopy(T source, T target) {
        BeanUtils.copyProperties(source, target, getNullPropertyNames(source));
    }

    //source中的非空属性复制到target中，但是忽略指定的属性，也就是说有些属性是不可修改的（个人业务需要）
    public static <T> void beanCopyWithIngore(T source, T target, String... ignoreProperties) {
        String[] pns = getNullAndIgnorePropertyNames(source, ignoreProperties);
        BeanUtils.copyProperties(source, target, pns);
    }

    public static String[] getNullAndIgnorePropertyNames(Object source, String... ignoreProperties) {
        Set<String> emptyNames = getNullPropertyNameSet(source);
        for (String s : ignoreProperties) {
            emptyNames.add(s);
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }

    public static String[] getNullPropertyNames(Object source) {
        Set<String> emptyNames = getNullPropertyNameSet(source);
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }

    public static Set<String> getNullPropertyNameSet(Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();
        Set<String> emptyNames = new HashSet<>();
        for (java.beans.PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null){ emptyNames.add(pd.getName());}
        }
        return emptyNames;
    }

    /**
     * 深度复制list对象,先序列化对象，再反序列化对象
     *
     * @param src 需要复制的对象列表
     * @return 返回新的对象列表
     * @throws IOException            读取Object流信息失败
     * @throws ClassNotFoundException 泛型类不存在
     */
    public static  <T> List<T> deepCopy(List<T> src) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(byteOut);
        out.writeObject(src);
        ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
        ObjectInputStream in = new ObjectInputStream(byteIn);
        return (List<T>) in.readObject();
    }
}
