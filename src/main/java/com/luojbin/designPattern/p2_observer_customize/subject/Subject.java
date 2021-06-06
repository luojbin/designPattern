package com.luojbin.designPattern.p2_observer_customize.subject;

import com.luojbin.designPattern.p2_observer_customize.observer.Observer;

public interface Subject {
    void registObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
