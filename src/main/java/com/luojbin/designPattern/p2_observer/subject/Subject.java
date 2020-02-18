package com.luojbin.designPattern.p2_observer.subject;

import com.luojbin.designPattern.p2_observer.observer.Observer;

public interface Subject {
    void registObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
