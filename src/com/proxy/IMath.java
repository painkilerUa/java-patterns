package com.proxy;

import java.rmi.RemoteException;

public interface IMath {
    int add(int a, int b) throws RemoteException;
}
