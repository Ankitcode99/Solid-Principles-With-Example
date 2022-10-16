package org.example.AnkitCode99.DependencyInversion.BadDesign;

public class Shelf {

    void addBook(Book book){

    }

    void customizeShelf(){

    }

}
/**
 * The high-level Shelf class depends on the low-level Book, the above code violates the Dependency Inversion Principle
 *
 * Now if we want to add DVDs on the shelf, we'll be creating a DVD model class and also an addDvd method in the Shelf class. But doing so will violate the Open Close Principle.
 * */