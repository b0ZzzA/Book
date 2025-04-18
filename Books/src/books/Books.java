/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package books;

/**
 *
 * @author User
 */
public class Books {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book book1 = new Book();
        book1.setTitle("Learning Java");
        book1.setAuthor("Ahmed");
        book1.setPrice(50);

        String Title = book1.getTitle();
        String Author = book1.getAuthor();
        double Price = book1.getPrice();

        System.out.println("Ttile of book 1 : " + Title);
        System.out.println("Author of book 1 : " + Author);
        System.out.println("Price of book 1 :" + Price);
    }

}
