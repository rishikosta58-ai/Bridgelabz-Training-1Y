package com.gla.assignment7.Part2.Level3;

class EBook extends Book {
    public void display() {
        System.out.println(ISBN + " | " + title);
    }

    public static void main(String[] args) {
        EBook e = new EBook();
        e.ISBN = "12345";
        e.title = "Java Programming";
        e.setAuthor("James Gosling");
        e.display();
        System.out.println("Author: " + e.getAuthor());
    }
}

