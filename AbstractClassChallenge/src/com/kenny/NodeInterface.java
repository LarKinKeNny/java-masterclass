package com.kenny;

public interface NodeInterface {
    AbstractLinkList getRoot();
    boolean addObject(AbstractLinkList nodeValue);
    boolean removeObject(AbstractLinkList nodeValue);
    void step(AbstractLinkList nodeValue);
}
