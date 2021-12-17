package com.directi.training.lsp.exercise;

public class ElectronicDuck implements IDuck
{
    private boolean _on = true;

    @Override
    public void quack() throws TurnedOffException
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new TurnedOffException("Can't quack when off");
        }
    }

    @Override
    public void swim() throws TurnedOffException
    {
        if (_on) {
            System.out.println("Electronic duck swim...");
        } else {
            throw new TurnedOffException("Cant swim when off");
        }
    }

    public void turnOn()
    {
        this._on = true;
    }

    public void turnOff()
    {
        this._on = false;
    }


    public static class TurnedOffException extends IDuckException
    {
        public TurnedOffException(String message)
        {
            super(message);
        }
    }
}
