package com.example.climatemonitoring.models.observers;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String mensagem);
}