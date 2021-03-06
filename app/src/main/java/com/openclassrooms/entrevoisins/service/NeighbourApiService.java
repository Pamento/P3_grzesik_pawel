package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.List;


/**
 * Neighbour API client
 */
public interface NeighbourApiService {

    /**
     * Get all my Neighbours
     * @return {@link List}
     */
    List<Neighbour> getNeighbours();

    /**
     * Get only favorites Neighbours
     */
    List<Neighbour> getFavoritesNeighbours();

    /**
     * Change the state of neighbour if it's marque like favorite or not
     * @param neighbour the object which has be changed
     * @param isFavorite boolean which cause the change
     */
    void favoriteStateOfNeighbour(Neighbour neighbour, boolean isFavorite);

    /**
     * Deletes a neighbour
     * @param neighbour vehicle a object to delete
     */
    void deleteNeighbour(Neighbour neighbour);

    /**
     * Create a neighbour
     * @param neighbour according to model: 'Neighbour'
     */
    void createNeighbour(Neighbour neighbour);
}
