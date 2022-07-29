package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People<E extends Person> implements Iterable<E> {
    public List<E> personList;

    public People(){
        this.personList = new ArrayList<E>();
    }

    public Boolean add(E person){
        return this.personList.add(person);
    }

    public E findById(long id){
        E tobeFound = null;
        for (E person: personList) {
            if(person.getId() == id) {
                tobeFound = person;
            }
        }
        if(tobeFound != null){return tobeFound;}
        else{return null;}
    }


    public Boolean contains(E person){
        return this.personList.contains(person);
    }

    public void remove(long id){
            if(findById(id) != null){
                remove(findById(id));
            }
    }

    public void remove(E person){
        this.personList.remove(person);
    }

    public void removeAll(){
         this.personList.clear();
    }

    public Integer count(){
       return this.personList.size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[0]);
    }

    public Iterator<E> iterator() {
        Iterator<E> it = personList.iterator();
        return it;
    }
}
