package com.example.cotton.ui.home;

public class MyRentedBookListItem {
    private String list_my_rented_book_title;//내가 대여한 도서 제목
    private String list_my_rented_book_writer;//도서 작성자
    private String list_my_rented_book_status;//도서 상태

    public void setList_my_rented_book_title(String list_my_rented_book_title) {
        this.list_my_rented_book_title = list_my_rented_book_title;
    }

    public void setList_my_rented_book_writer(String list_my_rented_book_writer) {
        this.list_my_rented_book_writer = list_my_rented_book_writer;
    }

    public void setList_my_rented_book_status(String list_my_rented_book_status) {
        this.list_my_rented_book_status = list_my_rented_book_status;
    }

    public String getList_my_rented_book_title() {
        return list_my_rented_book_title;
    }

    public String getList_my_rented_book_status() {
        return list_my_rented_book_writer;
    }

    public String getList_my_rented_book_writer() {
        return list_my_rented_book_status;
    }
}
