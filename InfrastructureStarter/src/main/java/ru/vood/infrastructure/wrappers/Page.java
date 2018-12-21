package ru.vood.infrastructure.wrappers;

public class Page {

    public static Page NULL_PAGE = new Page();

    private int totalRecords;

    public Page() {
    }


    public Page(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    /*
     */
    /*Номер страницы.*//*

    private int numPage;
    */
    /*Размер страницы.*//*

    private int count;
    */
    /*Количество страниц в результате.*//*

    private int total;
    */
    /*Признак последней страницы.*//*

    private int isLast;
*/

}
