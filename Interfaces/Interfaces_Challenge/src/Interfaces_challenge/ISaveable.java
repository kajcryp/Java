package Interfaces_challenge;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {

    List<String> StorageMedium();
    // Maximum flexibility using list instead of array list as in the future we can use any type of list
    void read(List<String> savedValues);



}
