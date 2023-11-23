package com.jogi.book;

public class Page {
    private int pageNo;
    private String pageContent;

    public Page(int pageNo, String pageContent) {
        this.pageNo = pageNo;
        this.pageContent = pageContent;
    }

    public int getPageNo() {
        return pageNo;
    }

    public String getPageContent() {
        return pageContent;
    }
}
