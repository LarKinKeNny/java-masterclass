package com.kenny;

public class MyLinkList implements NodeInterface {

    private AbstractLinkList root;

    public MyLinkList(AbstractLinkList root) {
        this.root = root;
    }

    @Override
    public AbstractLinkList getRoot() {
        return this.root;
    }

    @Override
    public boolean addObject(AbstractLinkList nodeValue) {

        if(this.root == null){
            this.root = nodeValue;
            return true;
        }
        AbstractLinkList currentValue = this.root;
        while(currentValue != null){
            int comparison = currentValue.compareTo(nodeValue);
            if(comparison < 0){
                if(currentValue.getNextEntry() != null){
                    currentValue = currentValue.getNextEntry();
                }else{
                    currentValue.setNextEntry(nodeValue).setPreviousEntry(currentValue);
                    return true;
                }
            }else if(comparison > 0){
                if(currentValue.getPreviousEntry() != null){
                    currentValue.getPreviousEntry().setNextEntry(nodeValue).setPreviousEntry(currentValue.getPreviousEntry());
                    nodeValue.setNextEntry(currentValue).setPreviousEntry(nodeValue);
                }else{
                    nodeValue.setNextEntry(this.root).setPreviousEntry(nodeValue);
                    this.root = nodeValue;
                }
                return true;
            }else{
                System.out.println(nodeValue.getNodeValue() + " is already in the list");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeObject(AbstractLinkList nodeValue) {
        if(nodeValue != null){
            System.out.println("Deleting item " + nodeValue.getNodeValue());
        }
        AbstractLinkList currentValue = this.root;
        while(currentValue != null){
            int comparison = currentValue.compareTo(nodeValue);
            if(comparison == 0){
                if(currentValue == this.root){
                    this.root = currentValue.getNextEntry();
                }else{
                   currentValue.getPreviousEntry().setNextEntry(currentValue.getNextEntry());
                   if(currentValue.getNextEntry() != null){
                       currentValue.getNextEntry().setPreviousEntry(currentValue.getPreviousEntry());
                   }
                }
                return true;
            }else if(comparison < 0){
                currentValue = currentValue.getNextEntry();
            }else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void step(AbstractLinkList nodeValue) {
        if(nodeValue == null){
            System.out.println("The list is empty");
        }else {
            while(nodeValue != null){
                System.out.print(nodeValue.getNodeValue() + ", ");
                nodeValue = nodeValue.getNextEntry();
            }
            System.out.println();
        }
    }
}