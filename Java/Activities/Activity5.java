package Activities;

import javax.swing.border.TitledBorder;



               public class Activity5 {
                public static void main(String args[]) {
                    //Providing book title
                    String title = "Harry Potter";
                    Book newNovel = new Book.MyBook();

                    newNovel.setTitle(title);
                    //Print result
                    System.out.println("The title is: " + newNovel.getTitle());
                }
            }
