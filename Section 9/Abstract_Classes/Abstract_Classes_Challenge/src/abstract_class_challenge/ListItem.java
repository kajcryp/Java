package abstract_class_challenge;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public abstract class ListItem {

    List ListItemList = new LinkedList<ListItem>();
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    abstract ListItem nextItem(); //Reference to the next item on the list
    abstract ListItem previousItem();
    abstract ListItem setNextItem(ListItem item); //Sets the reference of the next item to refer to on the list
    abstract ListItem setPreviousItem(ListItem item);

    abstract int compareTo(ListItem selectedListItem);

}
