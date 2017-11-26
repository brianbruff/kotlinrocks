package net.bk;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    void someInvalidJavaFuction() {
        /*
        List<String> strs = new ArrayList<String>();
        List<Object> objs = strs; // !!! The cause of the upcoming problem sits here. Java prohibits this!
        objs.add(1); // Here we put an Integer into a list of Strings
        String s = strs.get(0); // !!! ClassCastException: Cannot cast Integer to String
        */



        /*
        *
        * // naive
            interface Collection<E> ... {
                void addAll(Collection<E> items);
            }
        * */

        /* prefectly safe but disallowed with naive implementation
        // Java
        void copyAll(Collection<Object> to, Collection<String> from) {
            to.addAll(from); // !!! Would not compile with the naive declaration of addAll:
                             //       Collection<String> is not a subtype of Collection<Object>
        }

        (In Java, we learned this lesson the hard way, see Effective Java, Item 25: Prefer lists to arrays)
        That's why the actual signature of addAll() is the following:

        // Java
        interface Collection<E> ... {
          void addAll(Collection<? extends E> items);
        }


        AVOVE is COVARIENCE
         */

    }
}