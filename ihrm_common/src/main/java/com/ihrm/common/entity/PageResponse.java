package com.ihrm.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 4/21/2019 11:04 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResponse<T> {
    /**
     * 总条数
     */
    private Long total;
    /**
     * 数据列表
     */
    private List<T> rows;
}
