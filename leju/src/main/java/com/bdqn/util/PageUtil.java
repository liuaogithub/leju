package com.bdqn.util;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by cai on 2018/3/5.
 */
public class PageUtil<T> {
    private Long total;
    private List<T> rows;

    public PageUtil(PageInfo<T> pageInfo) {
        this.rows = pageInfo.getList();
        this.total=pageInfo.getTotal();
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
