package hash.table;


import java.util.ArrayList;
import java.util.List;


class Join<T> {

    // Join two table method

    public List<List<T>> leftJoinHashMaps(JoinHashTableImp<T , T> leftTable , JoinHashTableImp<T , T> rightTable){
        List<List<T>> joinedValues = new ArrayList<>();
        for (T key : leftTable.getKeys()){
            List<T> innerArray = new ArrayList<>();
            innerArray.add(key) ;
            innerArray.add(leftTable.get(key));
            innerArray.add(rightTable.get(key));
            joinedValues.add(innerArray);
        }
        return joinedValues ;
    }
}