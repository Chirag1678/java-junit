package com.bridelabz.junittesting;

import java.util.List;

// Class to perform basic list operations
public class ListManager {
    // method to add element to list
    public boolean addElement(List<Integer> list, int element) {
        return list.add(element);
    }

    // method to remove element from list
    public int removeElement(List<Integer> list, int element) {
        if(list.contains(element)) {
            int index = list.indexOf(element);
            return list.remove(index);
        }

        return -1;
    }

    // method to get the size of the list
    public int getSize(List<Integer> list) {
        return list.size();
    }
}
