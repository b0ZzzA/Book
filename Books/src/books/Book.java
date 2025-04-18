/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package books;

/**
 *
 * @author User
 */
public class Book {

    private String sTitle;
    private String sAuthor;
    private double dPrice;

    public void book(String sTitle, String sAuthor, double dPrice) {
        this.sTitle = sTitle;
        this.sAuthor = sAuthor;
        this.dPrice = dPrice;

    }

    public void setTitle(String sTitle) {
        this.sTitle = sTitle;
    }

    public String getTitle() {
        return sTitle;
    }

    public void setAuthor(String sAuthor) {
        this.sAuthor = sAuthor;
    }

    public String getAuthor() {
        return sAuthor;
    }

    public void setPrice(double dPrice) {
        this.dPrice = dPrice;
    }

    public double getPrice() {
        return dPrice;
    }
}
