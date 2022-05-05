package Activities;

    //Declaration using abstract keyword
    abstract class Book {
        String title;

        //This is abstract method
        abstract void setTitle(String S);

        //This is concrete method with body
        String getTitle() {
            return title;
        }

        //Extends Book
        static class MyBook extends Book {
            //Function definition for sound()
            public void setTitle(String s) {
                title = s;
            }
        }
    }

