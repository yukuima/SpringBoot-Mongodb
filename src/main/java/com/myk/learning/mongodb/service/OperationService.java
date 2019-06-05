package com.myk.learning.mongodb.service;

import com.myk.learning.mongodb.model.People;

import java.util.List;

/**
 * The interface Operation service.
 *
 * @author myk
 */
public interface OperationService {
    /**
     * Select all people list.
     *
     * @return the list
     */
    List<People> selectAllPeople();

    /**
     * Insert people boolean.
     *
     * @param people the people
     * @return the boolean
     */
    boolean insertPeople(People people);

    /**
     * Upload people boolean.
     *
     * @param people the people
     * @return the boolean
     */
    boolean uploadPeople(People people);

    /**
     * Delete people boolean.
     *
     * @param people the people
     * @return the boolean
     */
    boolean deletePeople(String name);

    /**
     * Select people people.
     *
     * @param people the people
     * @return the people
     */
    People selectPeople(People people);

}
