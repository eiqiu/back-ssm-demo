package com.sheng.vo.User;

public class UserLike {
    private String query;
    //每页显示数
    private int pageSize;
    //当前页码
    private int pageNum;
    //开始
    private int startIndex;

    public UserLike() {
    }

    public UserLike(String query,int pageNum ,int pageSize ) {
        this.query = query;
        this.pageSize = pageSize;
        this.pageNum = pageNum;
        if(pageNum==0)return;
        this.startIndex = (pageNum-1)*pageSize;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public void setStartIndex(int pageSize,int pageNum) {
        this.startIndex = (pageNum-1)*pageSize;
    }

    public int getStartIndex() {
        return startIndex;
    }
}
