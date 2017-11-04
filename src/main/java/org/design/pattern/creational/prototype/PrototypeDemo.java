package org.design.pattern.creational.prototype;

public class PrototypeDemo {

  public static String toString(Object o) {
    return o.getClass().getName() + "@" + Integer.toHexString(o.hashCode());
  }

  public static void main(String[] args) {
    Registry registry = new Registry();

    Movie movie = (Movie) registry.createItem("Movie");
    movie.setTile("Creational Pattern in Java");

    System.out.println(toString(movie));
    System.out.println(movie.toString());

    Movie anotherMovie = (Movie) registry.createItem("Movie");
    anotherMovie.setTile("Gang of Four");

    System.out.println(toString(anotherMovie));
    System.out.println(anotherMovie);

  }

}
