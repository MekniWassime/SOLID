package com.directi.training.ocp.exercise_refactored;

public class TimeResource implements IResource{
    @Override
    public void markSlotFree(int resourceId) {

    };
    @Override
    public void markSlotBusy(int resourceId) {};
    @Override
    public int findFreeSlot(){
        return 0;
    };
}
