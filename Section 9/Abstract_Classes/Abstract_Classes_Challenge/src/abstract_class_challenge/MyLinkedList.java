package abstract_class_challenge;

public class MyLinkedList implements NodeList{

    private ListItem root = null; // Our head record

    public MyLinkedList(ListItem root) {

        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            //The list was empty, so this item becomes the head
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0){
                //newItem is greater, move right if possible
                if(currentItem.nextItem() != null){
                    currentItem = currentItem.nextItem();
                } else {
                    // there is no next as we received a null so put the item to the next
                    currentItem.setNextItem(newItem);
                    newItem.setPreviousItem(newItem);
                    return true;
                }
            } else if(comparison >0){
                //newItem is less, insert before
                if(currentItem.previousItem() != null){
                    currentItem.previousItem().setNextItem(newItem);
                    newItem.setPreviousItem(currentItem.previousItem());
                    newItem.setNextItem(currentItem);
                    currentItem.setPreviousItem(newItem);

                    //if current item.previous returns a record
                    //
                }
            } else{
                // equal
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }

        return false;

    }

    @Override
    public boolean removeItem(ListItem Item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
