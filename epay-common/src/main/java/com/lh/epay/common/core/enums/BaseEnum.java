package com.lh.epay.common.core.enums;

/**
 * 所有枚举的实现类
 *
 * @param <E>
 * @param <T>
 * @author lhui
 * @date 2018-04-17
 */
public interface BaseEnum<E extends Enum<?>, T> {
    /**
     * 获取显示的值
     * @return
     */
    T getValue();

    /**
     * 获取显示的名称
     * @return
     */
    String getDisplayName();
}
