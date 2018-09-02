package com.kenny;

public class ConcreteLinkList extends AbstractLinkList {

    public ConcreteLinkList(Object nodeValue) {
        super(nodeValue);
    }

    @Override
    AbstractLinkList getNextEntry() {
        return this.nextEntry;
    }

    @Override
    AbstractLinkList getPreviousEntry() {
        return this.previousEntry;
    }

    @Override
    AbstractLinkList setNextEntry(AbstractLinkList list) {
        this.nextEntry = list;
        return this.nextEntry;
    }

    @Override
    AbstractLinkList setPreviousEntry(AbstractLinkList list) {
        this.previousEntry = list;
        return this.previousEntry;
    }

    @Override
    public int compareTo(AbstractLinkList nodeValue){
        char[] charArray1 = ((String) nodeValue.getNodeValue()).toLowerCase().toCharArray();
        char[] charArray2 = ((String) super.getNodeValue()).toLowerCase().toCharArray();
        int size;
        if(charArray1.length >= charArray2.length) {
            size = charArray2.length ;
        }else{
            size = charArray1.length ;
        }

        char one, two;
        for(int i = 0 ; i < size; i++){
            one = charArray1[i];
            two = charArray2[i];
            if(Character.getNumericValue(one) > Character.getNumericValue(two)){
                return -(i + 1);
            }else if(Character.getNumericValue(one) < Character.getNumericValue(two)){
                return i+1;
            }
        }
        return 0;
    }


}
