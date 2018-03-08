package com.luojbin.designPattern.observer.subject;

import com.luojbin.designPattern.observer.observer.Observer;

public interface Subject {
    void registObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
