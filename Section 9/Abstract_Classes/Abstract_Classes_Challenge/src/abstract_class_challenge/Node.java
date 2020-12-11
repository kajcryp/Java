package abstract_class_challenge;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem nextItem() {
        return this.rightLink;
    }

    @Override
    ListItem previousItem() {
        return this.leftLink;
    }

    @Override
    ListItem setNextItem(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem setPreviousItem(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem selectedListItem) {
        if(selectedListItem != null){
            String NodeValue = (String) super.getValue();
            String SelectListValue = (String) selectedListItem.getValue();

            return NodeValue.compareTo(SelectListValue);
            //return ((String) super.getValue()).compareTo((String) selectedListItem.getValue());
        } else {
            return -1; // it's negative as usually any value is greater than null effectively
        }

    }
}
