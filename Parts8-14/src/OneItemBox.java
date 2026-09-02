public class OneItemBox extends Box{
    private Item oneItem;

    public OneItemBox() {
        oneItem = null;
    }


    @Override
    public void add(Item item) {
        if (oneItem == null) {
            oneItem = item;
        }
    }

    @Override
    public boolean isInBox(Item item) {

        return oneItem.equals(item);
    }
}
