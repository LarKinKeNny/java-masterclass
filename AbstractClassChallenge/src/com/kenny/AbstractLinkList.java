package com.kenny;


public abstract class AbstractLinkList {
    AbstractLinkList previousEntry = null;
    AbstractLinkList nextEntry = null;
    Object nodeValue;


    public AbstractLinkList(Object nodeValue) {
        this.nodeValue = nodeValue;
    }

    abstract int compareTo(AbstractLinkList nodeValue);
    abstract AbstractLinkList getNextEntry();
    abstract AbstractLinkList getPreviousEntry();
    abstract AbstractLinkList setNextEntry(AbstractLinkList list);
    abstract AbstractLinkList setPreviousEntry(AbstractLinkList list);

    public Object getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(Object nodeValue) {
        this.nodeValue = nodeValue;
    }
}
