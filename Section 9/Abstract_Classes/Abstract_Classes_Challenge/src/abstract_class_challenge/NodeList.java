package abstract_class_challenge;
//define an interface that any structure using our Node operator will implement


public interface NodeList {

    ListItem getRoot();
    boolean addItem(ListItem Item);
    boolean removeItem(ListItem Item);
    void traverse(ListItem root);

}
