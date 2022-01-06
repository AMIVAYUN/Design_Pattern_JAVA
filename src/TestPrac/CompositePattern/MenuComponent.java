package TestPrac.CompositePattern;

public interface MenuComponent {
    public default void add(MenuComponent comp){
        throw new UnsupportedOperationException();
    }
    public default void remove(MenuComponent comp){
        throw new UnsupportedOperationException();
    }
    public default Menu ComponentgetChild(int i) {
        throw new UnsupportedOperationException();
    }
    public default String getName() {
        throw new UnsupportedOperationException();
    }
    public default String getDescription() {
        throw new UnsupportedOperationException();
    }
    public default double getPrice() {
        throw new UnsupportedOperationException();
    }
    public default boolean isVegeterian() {
        throw new UnsupportedOperationException();
    }
    public default void print() {
        throw new UnsupportedOperationException();
    }
}
