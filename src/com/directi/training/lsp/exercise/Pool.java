package com.directi.training.lsp.exercise;

public class Pool
{
    public void run() throws IDuck.IDuckException
    {
        IDuck donaldDuck = new Duck();
        IDuck electricDuck = new ElectronicDuck();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(IDuck... ducks) throws IDuck.IDuckException {
        for (IDuck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(IDuck... ducks) throws IDuck.IDuckException {
        for (IDuck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args) throws IDuck.IDuckException
    {
        Pool pool = new Pool();
        pool.run();
    }
}
