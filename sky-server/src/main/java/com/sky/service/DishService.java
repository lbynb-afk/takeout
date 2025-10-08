package com.sky.service;

import com.sky.dto.DishDTO;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

/**
 * @author 32035
 * @date 2025/10/8
 */
public interface DishService {

    /**
     * 新增菜品和对应的口味
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
