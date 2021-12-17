package com.directi.training.ocp.exercise;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:17:04 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Resource
{
    int findFreeSlot();
    void markSlotFree(int id);
    void markSlotBusy(int id);

}
