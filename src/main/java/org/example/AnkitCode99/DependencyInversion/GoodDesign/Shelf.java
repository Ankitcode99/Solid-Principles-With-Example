package org.example.AnkitCode99.DependencyInversion.GoodDesign;

public class Shelf {

    Product product;

    void addProduct(Product product){
        // logic of adding product
    }

    void customizeShelf(){

    }
}

/**
 * Here the Product interface is used to refer both Book and DVD items hence allowing code extensibility.
 * */
